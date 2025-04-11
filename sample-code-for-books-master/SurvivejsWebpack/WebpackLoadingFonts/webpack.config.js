const merge = require("webpack-merge");
const HtmlWebpackPlugin = require("html-webpack-plugin");

const path = require("path");
const glob = require("glob");

const parts = require("./webpack.parts");

const PATHS = {
  app: path.join(__dirname, "src"),
};

const commonConfig = merge([
  {
    plugins: [
      new HtmlWebpackPlugin({
        title: "Webpack-Loading Fonts demo",
      }),
    ],
  },
]);

const productionConfig = merge([
  parts.extractCSS({
    use: "css-loader",
  }),
  parts.purifyCSS({
    paths: glob.sync(`${PATHS.app}/**/*.js`, { nodir: true }),
  }),
  parts.loadImages({
    options: {
      limit: 15000,
      name: "images/[name].[ext]",
      publicPath: "../", // Take the directory into account
    },
  }),
  parts.loadFonts({
    options: {
      limit: 10000,
      mimetype: "application/font-woff",
      name: "fonts/[name].[ext]",
      publicPath: "../", // Take the directory into account
    },
  }),
]);

const developmentConfig = merge([
  parts.devServer({
    // Customize host/port here if needed
    host: process.env.HOST,
    port: process.env.PORT,
  }),
  parts.loadCSS(),  
  parts.loadImages(),  
  parts.loadFonts(),  
]);

module.exports = mode => {
  if (mode === "production") {
    return merge(commonConfig, productionConfig, { mode });
  }

  return merge(commonConfig, developmentConfig, { mode });
};

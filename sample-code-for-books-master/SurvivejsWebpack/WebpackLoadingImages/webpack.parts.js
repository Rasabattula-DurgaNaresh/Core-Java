exports.devServer = ({ host, port } = {}) => ({
  devServer: {
    stats: "errors-only",
    host, // Defaults to `localhost`
    port, // Defaults to 8080
    open: true,
    overlay: true,
  },
});

exports.loadCSS = ({ include, exclude } = {}) => ({
  module: {
    rules: [
      {
        test: /\.css$/,
        include,
        exclude,

        use: ["style-loader", "css-loader"],
      },
    ],
  },
});

const MiniCssExtractPlugin = require("mini-css-extract-plugin");

exports.extractCSS = ({ include, exclude, use }) => {
  // Output extracted CSS to a file
  const plugin = new MiniCssExtractPlugin({
    filename: "./styles/[name].css",
  });

  return {
    module: {
      rules: [
        {
          test: /\.css$/,
          include,
          exclude,

          use: [
            {
              loader: MiniCssExtractPlugin.loader,
              options: {
                publicPath: '../'
              },
            },
          ].concat(use),
        },
      ],
    },
    plugins: [plugin],
  };
};

const PurifyCSSPlugin = require("purifycss-webpack");

exports.purifyCSS = ({ paths }) => ({
  plugins: [new PurifyCSSPlugin({ paths })],
});

exports.loadImages = ({ include, exclude, options } = {}) => ({
  module: {
    rules: [
      {
        test: /\.(png|jpg)$/,
        include,
        exclude,
        use: {
          loader: "url-loader",
          options,
        },
      },
    ],
  },
});

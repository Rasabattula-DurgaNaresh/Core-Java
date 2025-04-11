export default (text = "Hello world, Loading Styles!") => {
  const element = document.createElement("div");

  element.innerHTML = text;

  return element;
};

export default (text = "Hello world, Composing Configuration!") => {
  const element = document.createElement("div");

  element.innerHTML = text;

  return element;
};

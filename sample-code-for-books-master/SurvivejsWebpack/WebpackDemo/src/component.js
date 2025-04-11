export default (text = "Hello world, dev server!") => {
  const element = document.createElement("div");

  element.innerHTML = text;

  return element;
};

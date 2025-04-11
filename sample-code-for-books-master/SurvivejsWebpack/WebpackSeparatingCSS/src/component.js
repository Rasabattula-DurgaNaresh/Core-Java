export default (text = "Hello world, Separating CSS!") => {
  const element = document.createElement("div");

  element.innerHTML = text;

  return element;
};

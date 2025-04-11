export default (text = "Hello world, Unused CSS!") => {
  const element = document.createElement("div");
  
  element.className = "pure-button";  
  element.innerHTML = text;

  return element;
};

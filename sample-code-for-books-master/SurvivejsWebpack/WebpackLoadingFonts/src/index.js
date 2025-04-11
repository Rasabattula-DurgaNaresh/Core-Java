import component from "./component";
import "./main.css";
import "purecss";

document.body.appendChild(component());

//<p>Testing @ new font.</p>
var p = document.createElement("P");                        // Create a <p> node
var t = document.createTextNode("Testing @ new font.");     // Create a text node
p.appendChild(t);                                           // Append the text to <p>
document.body.appendChild(p);

//<p><b>Testing @ new font.</b></p>
var p2 = document.createElement("P");                       // Create a <p> node
var b = document.createElement("B");                        // Create a <b> node
var t2 = document.createTextNode("Testing @ bond font.");   // Create a text node
b.appendChild(t2);                                          // Append the text to <b>
p2.appendChild(b);                                          // Append the <b> to <p>
document.body.appendChild(p2);  
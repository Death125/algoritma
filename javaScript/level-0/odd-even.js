const prompt = require("prompt-sync")();
const input = prompt("Input a number : ");

function oddEven() {
  if (input % 2 == 0) {
    console.log("EVEN");
  } else {
    console.log("ODD");
  }
}

oddEven();

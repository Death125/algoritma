/*
 * Guess the odd or even number
 */
const prompt = require("prompt-sync")();
const input = prompt("Input a number : ");

function guessOddOrEvenNumber() {
  if (input % 2 == 0) {
    console.log("EVEN");
  } else {
    console.log("ODD");
  }
}

guessOddOrEvenNumber();

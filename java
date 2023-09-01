// Generate a random number between 1 and 100
const secretNumber = Math.floor(Math.random() * 100) + 1;

let attempts = 0;
let guess;

while (guess !== secretNumber) {
  guess = parseInt(prompt("Guess the secret number (between 1 and 100):"));

  if (isNaN(guess)) {
    alert("Please enter a valid number.");
  } else {
    attempts++;

    if (guess < secretNumber) {
      alert("Too low! Try again.");
    } else if (guess > secretNumber) {
      alert("Too high! Try again.");
    } else {
      alert(`Congratulations! You guessed the number in ${attempts} attempts.`);
    }
  }
}

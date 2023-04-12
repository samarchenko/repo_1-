// Define variables
const rockButton = document.querySelector('.rock');
const paperButton = document.querySelector('.paper');
const scissorsButton = document.querySelector('.scissors');
const resultText = document.querySelector('.result');

// Add event listeners
rockButton.addEventListener('click', playGame);
paperButton.addEventListener('click', playGame);
scissorsButton.addEventListener('click', playGame);

// Define playGame function
function playGame(event) {
  // Get user's choice
  const userChoice = event.target.textContent.toLowerCase();
  
  // Generate computer's choice
  const computerChoice = Math.random() < 0.33 ? 'rock' : Math.random() < 0.66 ? 'paper' : 'scissors';
  
  // Determine winner
  if (userChoice === computerChoice) {
    resultText.textContent = "It's a tie!";
  } else if ((userChoice === 'rock' && computerChoice === 'scissors') ||
             (userChoice === 'paper' && computerChoice === 'rock') ||
             (userChoice === 'scissors' && computerChoice === 'paper')) {
    resultText.textContent = "You win!";
  } else {
    resultText.textContent = "Computer wins!";
  }
}
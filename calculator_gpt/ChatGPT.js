let firstNumber = "";
let secondNumber = "";
let operation = "";

function calculate(value) {
  const result = document.getElementById("result");
  if (value >= "0" && value <= "9") {
    if (operation) {
      secondNumber += value;
      result.value = secondNumber;
    } else {
      firstNumber += value;
      result.value = firstNumber;
    }
  } else if (value === ".") {
    if (operation) {
      if (!secondNumber.includes(".")) {
        secondNumber += value;
        result.value = secondNumber;
      }
    } else {
      if (!firstNumber.includes(".")) {
        firstNumber += value;
        result.value = firstNumber;
      }
    }
  } else if (value === "+" || value === "-" || value === "*" || value === "/") {
    operation = value;
  } else if (value === "=") {
    let resultValue;
    switch (operation) {
      case "+":
        resultValue = parseFloat(firstNumber) + parseFloat(secondNumber);
        break;
      case "-":
        resultValue = parseFloat(firstNumber) - parseFloat(secondNumber);
        break;
      case "*":
        resultValue = parseFloat(firstNumber) * parseFloat(secondNumber);
        break;
      case "/":
        resultValue = parseFloat(firstNumber) / parseFloat(secondNumber);
        break;
    }
    result.value = resultValue;
    firstNumber = resultValue.toString();
    secondNumber = "";
    operation = "";
  }
}

function clearResult() {
  const result = document.getElementById("result");
  firstNumber = "";
  secondNumber = "";
  operation = "";
  result.value = "";
}
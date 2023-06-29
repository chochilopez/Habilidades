/*
Explanation:
We can pass values into a function with arguments. You can use a return statement to send a value back out of a function.

Example

function plusThree(num) {
  return num + 3;
}

const answer = plusThree(5);
answer has the value 8.

plusThree takes an argument for num and returns a value equal to num + 3.

Exercise:
Create a function timesFive that accepts one argument, multiplies it by 5, and returns the new value.

Tests:
Waiting:timesFive should be a function
Waiting:timesFive(5) should return 25
Waiting:timesFive(2) should return 10
Waiting:timesFive(0) should return 0

*/
function timesFive(param1) {
    return param1 * 5;
}

console.log(timesFive(1));
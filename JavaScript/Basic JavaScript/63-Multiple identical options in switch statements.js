/*
Explanation:
If the break statement is omitted from a switch statement's case, the following case statement(s) are executed until a break is encountered. If you have multiple inputs with the same output, you can represent them in a switch statement like this:

let result = "";
switch (val) {
  case 1:
  case 2:
  case 3:
    result = "1, 2, or 3";
    break;
  case 4:
    result = "4 alone";
}
Cases for 1, 2, and 3 will all produce the same result.

Exercise:
Write a switch statement to set answer for the following ranges:
1-3 - Low
4-6 - Mid
7-9 - High

Note: You will need to have a case statement for each number in the range.

Tests:
Waiting:sequentialSizes(1) should return the string Low
Waiting:sequentialSizes(2) should return the string Low
Waiting:sequentialSizes(3) should return the string Low
Waiting:sequentialSizes(4) should return the string Mid
Waiting:sequentialSizes(5) should return the string Mid
Waiting:sequentialSizes(6) should return the string Mid
Waiting:sequentialSizes(7) should return the string High
Waiting:sequentialSizes(8) should return the string High
Waiting:sequentialSizes(9) should return the string High
Waiting:You should not use any if or else statements
Waiting:You should have nine case statements

function sequentialSizes(val) {
  let answer = "";
  // Only change code below this line



  // Only change code above this line
  return answer;
}

sequentialSizes(1);
*/
function sequentialSizes(val) {
  let answer = "";
  switch (val) {
    case 1:
      answer = "Low";
      break;
    case 2:
      answer = "Low";
      break;
    case 3:
      answer = "Low";
      break;
    case 4:
      answer = "Mid";
      break;
    case 5:
      answer = "Mid";
      break;
    case 6:
      answer = "Mid";
      break;
    case 7:
      answer = "High";
      break;
    case 8:
      answer = "High";
      break;
    case 9:
      answer = "High";
      break;
  }
  return answer;
}

console.log(sequentialSizes(1));
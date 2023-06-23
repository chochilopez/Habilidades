/*
Explanation:
There are operator wich do both, a mathematical operation and assignment in one step. Operator +=
let aVar= 5;
aVar = aVar + 5;
aVar += 5;

Exercise:
Convert the assignments for a, b and c to use the += operator.

let a = 3;
let b = 17;
let c = 12;

a = a + 12;
b = 9 + b;
c = c + 7;
*/
let a = 3;
let b = 17;
let c = 12;

a += 12;
b += 9;
c += 7;

console.log(a + " " + b + " " + c);
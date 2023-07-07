/*
Explanation:
A for loop can also count backwards, so long as we can define the right conditions.

In order to decrement by two each iteration, we'll need to change our initialization, condition, and final expression.

We'll start at i = 10 and loop while i > 0. We'll decrement i by 2 each loop with i -= 2.

const ourArray = [];

for (let i = 10; i > 0; i -= 2) {
  ourArray.push(i);
}
ourArray will now contain [10, 8, 6, 4, 2]. Let's change our initialization and final expression so we can count backwards by twos to create an array of descending odd numbers.

Exercise:
Push the odd numbers from 9 through 1 to myArray using a for loop.

Tests:
Waiting:You should be using a for loop for this.
Waiting:You should be using the array method push.
Waiting:myArray should equal [9, 7, 5, 3, 1].
*/
const myArray = [];

for (let a = 9; a > 0; a -=2) {
  myArray.push(a);
}

console.log(myArray);
const arr1 = ['one', 'two', 3, 4, 5, 6, 7, 8, 9];
const arr2 = ['three', 'four'];

const combined1 = arr1.concat(arr2);
const combined2 = [].concat(arr1, arr2);

const combined = [...arr1, ...arr2];
console.log(combined1);
console.log(combined2);
console.log(combined);

const [first, second, third, ...other] = arr1;
console.log(first);
console.log(second);
console.log(third);
console.log(other);

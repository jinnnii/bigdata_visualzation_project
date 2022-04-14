var x = 0;
var y = 0;
var obj = { x, y };

console.log(obj);

var randomKeyString = 'other';
var combined = { ['one' + randomKeyString]: 'some value' };
console.log(combined);

var obj2 = {
    x,
    methodA() {
        console.log('method A');
    },
    methodB() {
        return 0;
    },
};

console.log(obj2);

var list = [0, 1];
var item1 = list[0];
var item2 = list[1];
var item3 = list[2] || -1;

var temp = item2;

item2 = item1;
item1 = temp;
var obj = {
    key1: 'one',
    key2: 'two',
    key3: 'three',
};

var key1 = obj.key1;
var key2 = obj.key2;
var key3 = obj.key3 || 'default key3 value';
var newKey1 = obj.key1;

console.log('ES6 버전의 구조분해할당');

//배열을 사용한 구조분해 할당
var list = [0, 1]; //배열 리스트 선언 및 데이터 할당
var [item1, item2, item3 = -1] = list; // 전개 연산 방식을 사용하여 변수를 한번에 선언

var [item2, item1] = [item1, item2];

//object 타입을 사용한 구조분해 할당
var obj = {
    key1: 'one',
    key2: 'two',
};

console.log(obj);

var { key1: newKey1, key2, key3 = 'default key3 value' } = obj;

console.log(newKey1);
console.log(key2);
console.log(key3);

const arr = [1, 2, 3, 4, 5];

function some(numbers) {
    return numbers.reduce((total, num) => {
        console.log(`total : ${total}, num :${num}`);
        return total + num;
    }, 0);
}

console.log(some(arr));

const query = '?banana=100&apple=20&orange=30';

function parse1(qs) {
    const queryString = qs.substr(1);
    const chunks = queryString.split('&');
    return chunks
        .map((chunk) => {
            const [key, value] = chunk.split('=');
            return { key, value };
        })
        .reduce((result, item) => {
            // console.log(result);
            result[item.key] = item.value;
            return result;
        }, {});
}

// console.log(parse1(query));

let obj = parse1(query);
console.log('obj : ', obj);
console.log('obj.banana :', obj.banana);

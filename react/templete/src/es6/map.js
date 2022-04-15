var query = '?banana=100&apple=20&orange=30';

function parse1(qs) {
    const queryString = qs.substr(1);
    const chunks = queryString.split('&');
    const result = chunks.map((chunk) => {
        const [key, value] = chunk.split('=');
        return { [key]: value };
        // return { key, value };
    });
    return result;
}

console.log(parse1(query));

const arr = [1, 2, 3, 4, 5];
const targetArr = arr.map((item, idx, arr) => {
    console.log(item, idx, arr);
    return item * 2;
});

console.log(targetArr);

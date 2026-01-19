const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');

const [N, K] = input[0].split(' ');
const [arrN] = input[1]

arrN.sort((a, b)=> a-b)
console.log(arrN)
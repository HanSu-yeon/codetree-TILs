const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');

const str1 = input[0];
const str2 = input[1];

// Please Write your code here.
let sortedStr1 = str1.split("").sort().join("")
let sortedStr2 = str2.split("").sort().join("")

if (sortedStr1 === sortedStr2) {
    console.log('Yes')
} else {
    console.log('No')
}

const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');
const n = Number(input[0]);
const numbers = input[1].split(" ").map(Number);
// Please Write your code here.


// 최대공약수 (재귀)
function gcd(a, b) {
    if (b === 0) return a;
    return gcd(b, a % b);
}
// 최소공배수
function lcm(a, b) {
    return a / gcd(a, b) * b;
}

// 배열의 최소공배수 (재귀)
function lcmArray(arr, idx) {
    if (idx === arr.length - 1) return arr[idx];
    const rest = lcmArray(arr, idx + 1);
    return lcm(arr[idx], rest);
}

console.log(lcmArray(numbers, 0));
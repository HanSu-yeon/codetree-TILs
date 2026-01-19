const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');

const [N, K] = input[0].split(' ');
const nums = input[1].trim().split(' ').map(Number)

nums.sort((a, b)=> a-b)
console.log(nums[K-1])
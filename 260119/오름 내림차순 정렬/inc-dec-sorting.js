const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');
const n = parseInt(input[0]);
const nums = input[1].split(' ').map(Number);

// Please Write your code here.
//오름차순 정렬
nums.sort((a, b)=> a-b)
console.log(nums.join(' '))

//내림차순 정렬
nums.sort((a, b)=>b-a)
console.log(nums.join(' '))
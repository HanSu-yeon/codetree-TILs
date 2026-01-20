const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');

const n = Number(input[0]);
const nums = input[1].trim().split(' ').map(Number);

// Please Write your code here.

nums.sort((a, b )=> a -b)

let maxNum = 0;
for(let i =0; i< n ; i++){
    // i번째와 2n -1 -i 번쨰 원소를 매칭
    const groupSum = nums[i] + nums[2*n-1-i]
    if(groupSum > maxNum){
        maxNum = groupSum
    }
}

console.log(maxNum)
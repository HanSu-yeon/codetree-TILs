const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');

const n = Number(input[0]);

let wordList = [];

for(let i=1; i<=n; i++){
    wordList.push(input[i]);
}

wordList.sort();

wordList.forEach(word =>{
    console.log(word);
});

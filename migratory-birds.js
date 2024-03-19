/*
 * Complete the 'migratoryBirds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function migratoryBirds(arr) {
    // Write your code here
    
    let count = new Map();
   
    // initiating the cou
    for(let i = 0; i < arr.length; i++) {
        if(isNaN (count.get(arr[i])) ) {
            count.set(arr[i], 1);
        }
        else {
            let cnt = count.get(arr[i]);
            count.set(arr[i], (cnt + 1));
        }
    }
    
    let maxCount = -1;
    let maxCountArr = [];
    
    for(let x of count.keys()) {
        if(maxCount <= count.get(x)) {
            maxCount = count.get(x);
        }
    }
    
    for (let x of count.keys()) {
        if(maxCount == count.get(x)) {
            maxCountArr.push(x);
        }
    }
    
    
    // Finding the minimum number in the array
    let minNum = maxCountArr[0];
    for(let x of maxCountArr) {
        if(x < minNum) {
            minNum = x;
        }
    }
    return minNum;
}

let arr = [1,4,4,5,3,4]
console.log(migratoryBirds(arr));
/**
 * Solution for https://www.hackerrank.com/challenges/drawing-book/problem
 * @param {number} n number of pages in the book
 * @param {number} p the page to reach to 
 * @returns {number} the minimum times to turn the sides if the we are starting from the beginning or the end.
 */
function pageCount(n, p) {
    let start = parseInt(Math.floor(p/2));
    let end = parseInt(Math.floor(n/2)) - parseInt(Math.floor(p/2));

    return (start < end) ? start : end;
}
/*
    The below code didn't help in solving the problem there is still some bug in it.
    TODO Using this code as part of debugging exercise in Level 5
*/

function pageCount2(n, p) {
    // Write your code here
    
    if (n == p || p == n - 1 ) {
        return 0;
    }
    
    if (p == 1) {
        return 0;
    }
    
    let forward_count = 0;
    let reverse_count = 0;

    let totalDoubleSidePage = parseInt(Math.floor(n/2));
    
    for(let i = 1; i <= totalDoubleSidePage; i++) {
        if ( p == (2*i) || p == (2*i) + 1) {
            forward_count = i;
            break;
        }
    }
    
    for (let i = totalDoubleSidePage; i >= 1; i-- ) {
        if(p==(2*i) || p == (2*i) + 1) {
            reverse_count = i;
            break;
        }
    }

    if(forward_count < reverse_count) {
        return forward_count;
    }
    else {
        return reverse_count;
    }
    
    
    
}


console.log(pageCount(5, 3));
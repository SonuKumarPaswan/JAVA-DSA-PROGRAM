/*
function reverseString(str){
    return str.split('').reverse().join('');
//     let rev='';
//     for(let i=0; i<str.length;i++){
//         rev=str.charAt(i)+rev;
//     }
// return rev;
}
let newStr=reverseString("abc");
console.log(newStr)
*//*
// 2 find the factorial of Number 
function factorial(n){
    let fac=1; 
    // if(n==1||n==0){
    //     return 1;
    //    return  n*factorial(n-1);
    for(let i=1; i<=n;i++){
        fac=fac*i;
    }
    
    return fac;
  }

let facNumber=factorial(5);
console.log(facNumber)
*/
// 3. find the palindrome Number
/*
function palindromeNumber(str){
    str=str.toLowerCase();  
    let first=0;
    let last=str.length-1;
    while(first<last){
        if(str.charAt(first)!==str.charAt(last)) return false;
        first++;
        last--;
        return true;
    }
}
let plind=palindromeNumber("Madam");
console.log(plind);
*/
// 4. Find the fibonacci ServiceWorkerRegistration

function fibonacciSeriese(n){
    let pre=0, curr=1;
    console.log(pre,curr);
    for(let i=2; i<=n;i++){
        let next=pre+curr;
        pre=curr;
        curr=next;
        console.log(curr)
    }
}
fibonacciSeriese(6);
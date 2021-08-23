var num = 100;
if(num < 200){
    var n = -num;
}
console.log(num,n);

if(num < 200){
    let t = -100;
    console.log(`let= ${t}`);
}

const pi = 3.1415;
console.log(`pi = ${pi}`);


const today = new Date();
today.setDate(20);
console.log(`${today}`);
console.log(today.toLocaleString());

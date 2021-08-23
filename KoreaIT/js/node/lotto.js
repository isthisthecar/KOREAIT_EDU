const fs = require('fs')


//로토번호 5셋트 파일 생성해서 저장
//lotto.txt에 저장
for (i = 0; i < 5; i++) {
    var arr = [];
    while (arr.length < 6) {
        var num = Math.floor(Math.random() * 45) + 1;
        if (arr.indexOf(num) == -1)//중복 체크, 중복 아니면 -1
            arr.push(num);
    }
    console.log(arr);
    fs.appendFile("lotto.txt",arr.join(",")+"\n","utf-8",function(err){
        if(err){
            console.log("에러 발생");
        }
    });
}
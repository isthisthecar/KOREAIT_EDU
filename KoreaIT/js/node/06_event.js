const event = require('events');

//이벤트 객체를 사용하기 위해서 EventEmitter 객체를 생성

const emitter = new event.EventEmitter();

const call = () => {
    console.log("call 이벤트 호출");
}
const printArray = (arr) => {
    for(i=0;i<arr.length;i++)
    console.log(arr[i]);
}

emitter.on("call",call);
emitter.on("array",printArray);

function runEvent(){
    console.log("runEvent excute");
    //이벤트 콜
    emitter.emit("call");
    emitter.emit("array",[132,156,23,64,8,263,4,26,6,4]);
}
// runEvent();
// 제거할 이벤트명, 함수
emitter.removeListener("array",function(err){
    //exception처리
});

runEvent();
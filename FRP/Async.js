function getData(callback)
{
    console.log('Get data executed');
    setTimeout(()=>{
        console.log('Async Executed ');
       callback(100);
    },2000);
}
console.log('GetData called');
function callBackHandler(value)
{
    console.log('Value got from aysnc ',value);
}
getData(callBackHandler);
console.log('End of line');
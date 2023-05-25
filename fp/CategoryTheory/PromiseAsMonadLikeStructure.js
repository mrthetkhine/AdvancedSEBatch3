const incOne = (x)=> x+1;
const double = (x) => x * 2;
const someThing = (x)=> Promise.resolve(x+20);
async function  demo()
{
    let counter = await Promise.resolve(1)
                    .then(incOne)
                    .then(double)
                    .then(someThing)
                    .then(x=>console.log(x),
                          err=>console.log(err))
                          
    //console.log('Counter ',counter);                
}
demo();


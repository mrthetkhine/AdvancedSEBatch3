function Pair(first,second)
{
    return function(destructor)
    {
        return destructor(first,second);
    }
}
function First(pair)
{
    return pair((first,second)=> first);
}
function Second(pair)
{
    return pair((first,second)=> second);
}

let pair = Pair('A','B');
console.log('Pair ',pair);
console.log('First ',First(pair));
console.log('Second ',Second(pair));
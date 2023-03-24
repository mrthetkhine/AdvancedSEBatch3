  function Base()
 {
    this.baseData = [];
    this.display = function()
    {
        console.log("Base display");
    }
 }
 function Child()
 {
    this.childData = "childata";
    this.add = function(ele)
    {
        this.baseData.push(ele);
    }
 }
 Child.prototype = new Base();

 let obj = new Child();
 obj.display();

 let obj2 = new Child();
 obj.add("one");
 obj2.add("two");
 
 console.log("Obj ",obj.baseData);
 console.log("Obj2 ",obj2.baseData);
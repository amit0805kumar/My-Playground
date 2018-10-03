/*var x = {
    "NAME": "Amit Kumar",
    "AGE": "19",
    "NUM": [{
        "num1": "12"
    }, {
        "num2": 33
    }]

}
var y = { "name" : [ { "name1" : "value1" }, { "name2" : "value2" }] }
// document.querySelector(".cont").innerHTML =x.NAME;

var z=  {"name": {"name1": 1,"name2": 1}}*/

var obj = {
  fname: "Amit",
    lname: "Kumar",
    age:20,
    cal: function(){
        alert(this.age);
    }
};

document.getElementById("this").onmouseover = obj.cal;
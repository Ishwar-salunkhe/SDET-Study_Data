//=====JS Basics ==========X=======================X=======================
//Data Types-> 
//Premitive Data types 
//-> String, Number, Boolean, Undefined, Null
//JavaScript is a single Threaded language

//Non Premetive -> Array, Object, Function, date, regex

/*
Q-What is JavaScript?
-> Javascript is a scripting language and it is used to convert static web page into
 dynamic ad intercative web pages

Q- Types of Functions
-> 1.Named/Generic Function
   2.Anonymous function
   3.Arrow Function
   4.Call Back function

 Q- What is Promises?
 -> It is the way to handle the asynchronous operations and those are- Pending, Rejection and Fullfilled

 Q- Diff between Null and Undefined?
 -> Undefined-> We have declare the variable but does not assigned any value. Data type will be Undefied
 For undefined, we can assigned value later.
 Null-> we have declare the variable and assigned the value as Null. Data type for null is Object
 Null also we can reassigned later
 



*/

//Q- Diff between VAR, CONST and LET
var — can redeclare and reassign
Example:
var name = "Ishwar";
var name = "Rahul";
name = "Amit";
console.log(name); // Amit

let — can reassign, but cannot redeclare in the same scope
let age = 25;
age = 30; // Allowed
// let age = 35; // Error in the same scope
console.log(age); // 30

const — cannot be reassigned
const browser = "Chrome";
// browser = "Firefox"; // TypeError
console.log(browser); // Chrome
*/

//STring Methods
charAt();
concat();
includes();
length;  //No Bracket here
replace();
replaceAll();

//For Loop Pattern
for (let i = 0; i < 5; i++) {
    console.log(i);
}

//Print statement
console.log(`even number count is ${even}`);

//Arrays
const fruits = ["Apple", "Mango", "Banana"];
console.log(fruits[1]);
console.log(fruits.length);
fruits.push("Watermelon"); //To Add New Value In Array
fruites.pop();  //To remove the last element
fruites[0]="Pineapple"; //to Replace the Value with other value    
const fruits = ["Apple", 10, true, {name: "John"}];  //we can store any type of data in the javascript array

//JavaScript String data methods
//Split
const str="test@RahulSheety.com";
const array = str.split("@");
console.log(array[1]);
//length;
console.log(str.length);
//charAt(i);
console.log(data.charAt(3));

//Objects-> Object stores data as key-value pairs.
   const employee={
    name:"Ishwar",
    age:20,
    Address: "Pune"
   }

   console.log(employee.name);

//typeof -> Used to find the data type.

 //Data Types methods    
 str.includes("Auto")    

//Function Declaration
function Demo(){
    console.log("testing");
}
Demo(); //function calling

//Anonymous function
const greet=function(name){
    return "Hello i am "+name;
}
console.log(greet);

//CallBack Function
//callback function is a function which is pass as an argument/parameter to the another function
//Example
function greet(name) {
    console.log("Hello " + name);
}
function display(callback) {
    callback("Ishwar");
}
display(greet);

//Try Catch Block
try {
    console.log("Inside try block");
} catch (error) {
    console.log("Error occurred");
} finally {
    console.log("Finally block executed");
}

/*Q- Diff between == and === ? (== loose equality and === strict equaliy)
//  == Compare value only and === compare value and data type as well

Q-What is NaN?
-> Not a Number -> it indicate that value is not valid number

Q- What is Hoisting in Javascript?
-> Hoisting is a Javascript behaviour of moving variable and function declaration to the top of there scope before the executions

Q- What is the diff between the map(), filter(), find() and forEach()?
-> All are the Arrays methods
map()-> It transform the element and return new array
filter()-> It return the new array which contains the elements that satisfy the conditions
find()-> it return the firts mathcing element
forEach()-> It will iterate through the each element .Not returing new aray
Example: 
const numbers = [10, 20, 30, 40, 50];
const result = numbers.map(n => n * 2);
console.log(result);
// [20, 40, 60, 80, 100]

const result = numbers.filter(n => n > 25);
console.log(result);
// [30, 40, 50]

*/






//==========================x==========================================================


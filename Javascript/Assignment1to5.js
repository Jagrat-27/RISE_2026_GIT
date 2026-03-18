// Assignment 1: Smart Discount Calculator
let name="Jagrat"
let age=17
let purchaseAmount=1000
let discount=0
if(age<18){
    discount=10
}
if(age>=60){
    discount=20
}
if(purchaseAmount>5000){
    discount+=5;
}

console.log('Hello '+name+'!'+' Your discount is: '+discount+'%.'+'Final amount: '+(purchaseAmount-(purchaseAmount*discount/100)))



// Assignment 2: Login Validation System
let username="admin"
let password="password23"
if(username==="admin"){
    console.log("username successful!")
}else{
    console.log("Invalid username.")
}

if(password==="password123"){
    console.log("password successful!")
}else{
    console.log("Invalid password.")
}


// Assignment 3: Number Analyzer Tool
let num=10
if(num>0){
    if(num%2===0){
        console.log(num+" is a positive even number.")
    }
    else{
        console.log(num+" is a positive odd number.")
    }
}
else if(num<0){
    if(num%2===0){
        console.log(num+" is a negative even number.")
    }
    else{
        console.log(num+" is a negative odd number.")
    }
}
else{
    console.log(num+" is zero.")
}


// Assignment 4: Shopping Eligibility Checker
let isMember=true
let cartValue=1000

if(isMember && cartValue>=1000){
    console.log("You are eligible for free delivery!")
}

else if(cartValue>2000){
    console.log("You are eligible for free delivery!")
}
else{
    console.log("You are not eligible for free delivery.")
}


// Assignment 5: Grade Evaluation System
let marks=85
if(marks>100 || marks<0){
    console.log("Invalid marks entered.")
}
else if(marks>90){
    console.log("Your grade is A.")
}
else if(marks>=75 && marks<=89){
    console.log("Your grade is B.")
}
else if(marks>=54 && marks<=74){
    console.log("Your grade is C.")
}
else{
    console.log("Your grade is F.")
}

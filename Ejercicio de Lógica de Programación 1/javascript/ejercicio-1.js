let newNum1 = Number(num1)
let newNum2 = Number(num2)
let newNum3 = Number(num3)


    if (newNum1>=newNum2 && newNum1>=newNum3 && newNum2>=newNum3){
        console.log("orden mayor a menor "+ num1 +", " + num2 +", " + num3)
        console.log("orden menor a mayor "+ num3 +", "+ num2 + ", "+num1)
    }else if (newNum1>=newNum2 && newNum1>=newNum3 && newNum2<=newNum3){
        console.log("orden mayor a menor "+ num1 +", "+ num3 +", "+ num2)
        console.log("orden menor a mayor "+ num2 +", "+ num3 +", "+ num1)
    }else if (newNum2>=newNum1 && newNum2>=newNum3 && newNum1>=newNum3){
        console.log("orden mayor a menor "+ num2 +", "+ num1 +", "+ num3)
        console.log("orden menor a mayor "+ num3 +", "+ num1 +", "+ num2)
    }else if(newNum2>=newNum1 && newNum2>=newNum3 && newNum1<=newNum3){
        console.log("orden mayor a menor "+ num2 +", "+ num3 +", "+ num1)
        console.log("orden menor a mayor "+ num1 +", "+ num3 +", "+ num2)
    }else if (newNum3>= newNum1 && newNum3>= newNum2 && newNum1>=newNum2){
        console.log("orden mayor a menor "+ num3 +", "+ num1 +", "+ num2)
        console.log("orden menor a mayor "+ num1 +", "+ num1 +", "+ num3)
    }else if(newNum3>=newNum1 && newNum3>=newNum2 && newNum1<=newNum2){
        console.log("orden mayor a menor "+ num3 +", "+ num2 +", "+ num1)
        console.log("orden menor a mayor "+ num1 +", "+ num2 +", "+ num3)
    }


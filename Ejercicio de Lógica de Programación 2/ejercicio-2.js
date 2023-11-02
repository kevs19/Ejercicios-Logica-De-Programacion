let gradosCelcius = prompt("por favor ingrese los grados celcius")
let newGradosCelcius = Number(gradosCelcius)
let farenheit=0
let kelvin=0

if (isNaN(newGradosCelcius)){
    alert("Error, Por farvor introduzca un numero");
    gradosCelcius = prompt("por favor ingresa los grados celcius")
    newGradosCelcius = Number(gradosCelcius)
    farenheit = (newGradosCelcius*1.8)+32
    kelvin = newGradosCelcius+273.15
    console.log("La temperatura en Farenheit es: " + farenheit)
    console.log("La temperatura en Kelvin es " + kelvin)
}else {
    farenheit = (newGradosCelcius*1.8)+32
    kelvin = newGradosCelcius+273.15
    console.log("La temperatura en Farenheit es: " + farenheit)
    console.log("La temperatura en Kelvin es " + kelvin)
}
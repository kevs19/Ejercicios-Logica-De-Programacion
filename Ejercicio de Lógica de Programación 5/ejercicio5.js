let numeroAleatorio = parseInt(Math.random()* 100)+1;
console.log("Número obtenido", numeroAleatorio);
let num, intentos = 10;
/* Saldremos del bucle si agotamos intentos o acertamos número */
do {
  num = prompt(
    `Ingrese un número (quedan ${intentos} intentos):`
  );
} while(numeroAleatorio != num && --intentos > 0);
/* Detectamos si salimos del bucle por agotar intentos o acertar número */
if (numeroAleatorio == num){
  alert("¡Ha acertado el número!");
} else {
  alert("No lo ha conseguido en 10 intentos, sigue intentando");
} 


var numero=prompt("por favor introduzca un numer")

if (isNaN(numero)){
    do {
    var numero = Number (prompt ("No es un numero, por favor introduzca un numero"));
} while (isNaN(numero));
}
var total = 1;
for (i=1; i<=numero; i++) {
            total = total * i; 
        }
        console.log("el factorial es "+ total); 



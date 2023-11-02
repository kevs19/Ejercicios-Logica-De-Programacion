var fib = prompt("ingrese un numero por favor")

if (isNaN(fib)){
    do {
    var fib = Number (prompt ("No es un numero, por favor introduzca un numero"));
} while (isNaN(fib));
}

function fiboniacci(fib) {
    let a = 1;
    let b = 1;
    for (let i = 3; i <= n; i++) {
      let c = a + b;
      a = b;
      b = c;
    }
    return b;
  }
  console.log(fiboniacci(fib));
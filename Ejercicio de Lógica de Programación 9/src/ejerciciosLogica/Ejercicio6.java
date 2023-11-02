package ejerciciosLogica;

import java.util.Scanner;

public class Ejercicio6{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("introduzaca una palabra o frase");
		String frase = scanner.next();
		
		String fraseInvertida = "";
		for (int indice = frase.length() - 1; indice >= 0; indice--) {
			// Y vamos concatenando cada carácter a la nueva cadena
			fraseInvertida += frase.charAt(indice);
		}
		System.out.println("Cadena original: " + frase);
		System.out.println("Cadena invertida: " + fraseInvertida);
		scanner.close();
	}
}



/**
 * # Ejercicio 6

## Instrucciones

- Crear un programa en `Java` que realice lo siguiente:

- Input
  - Solicitar por consola una palabra o frase

- Output
  - Mostrar por consola el texto ingresado de forma invertida.

--- 

Input:
```
Hola Generation
```
Output:
``` 
noitareneG aloH
```

## Consideraciones

- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`.
- Puedes desarrollar el algoritmo y su pseudocódigo*/
 
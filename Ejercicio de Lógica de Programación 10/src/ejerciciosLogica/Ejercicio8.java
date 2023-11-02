package ejerciciosLogica;

import java.util.Scanner;

public class Ejercicio8 {

	private static boolean isNumeroPrimo(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numerosTotales = 10;
        int numeros[] = new int[numerosTotales];

        System.out.print("ingrese " + numerosTotales + " números: ");
        for (int i = 0; i < numerosTotales; i++) {
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        int numerosPrimos[] = new int[numerosTotales];
        int numerosPrimosIndex = 0;
        int numerosPares[] = new int[numerosTotales];
        int numerosParesIndex = 0;

        for (int i = 0; i < numerosTotales; i++) {
            int numeroActual = numeros[i];
            if (isNumeroPrimo(numeroActual)) {
                numerosPrimos[numerosPrimosIndex] = numeros[i];
                numerosPrimosIndex++;
            } else {
                numerosPares[numerosParesIndex] = numeros[i];
                numerosParesIndex++;
            }
        }

        int primosOrdenados[] = new int[numerosTotales];

        for (int i = 0; i < numerosPrimosIndex; i++) {
            primosOrdenados[i] = numerosPrimos[i];
        }

        for (int i = 0; i < numerosParesIndex; i++) {
            primosOrdenados[numerosPrimosIndex + i] = numerosPares[i];
        }

        // Imprimir
        System.out.println("Array mostrando la posicion del array y el valor correspondiente ");
        for (int i = 0; i < numerosTotales; i++) {
            System.out.println(" " + i + " - " + numeros[i]);
        }
        
        System.out.println("Array ordenado ");
        for (int i = 0; i < numerosTotales; i++) {
            System.out.println("pos[" + i+ "]" + " = " + primosOrdenados[i]);
        }
        scanner.close();
    }
}      
 



/*
 * # Ejercicio 8

## Instrucciones

- Crear un programa en `Java` que realice lo siguiente:
- Input
  - Solicitar al usuario 10 números por consola y almacenarlos en un *array*
- Colocar todos los números primos a las primeras posiciones, desplazando el resto al final de forma que ningún número se pierda.
- Output
  - Mostrar por consola el array que contiene los números primos al inicio, mostrando el índice seguido del valor de la posición.
- El orden de los números **no importa** siempre y cuando los números primos se encuentren al inicio del array.

--- 

Input: 
``` Java
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
```

Output: Array mostrando la posicion del array y el valor correspondiente
```Java
pos[0] = 1
pos[1] = 2
pos[2] = 3
pos[3] = 4
pos[4] = 5
pos[5] = 6
pos[6] = 7
pos[7] = 8
pos[8] = 9
pos[9] = 10

// Array ordenado

pos[0] = 2
pos[1] = 3
pos[2] = 5
pos[3] = 7
pos[4] = 1
pos[5] = 4
pos[6] = 6
pos[7] = 8
pos[8] = 9
pos[9] = 10

```

## Consideraciones:

- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`
- Hacer diferentes pruebas con numeros de input diferentes
- Puedes desarrollar el algoritmo y su pseudocódigo*/
 
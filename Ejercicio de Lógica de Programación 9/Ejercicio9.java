package ejerciciosLogica;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {
	
	
	public static void main (String[]args) {

	Scanner scanner = new Scanner(System.in);

	HashMap<String, String> diccionarioIngles = new HashMap<String, String>();

	diccionarioIngles.put("aire","air");
	diccionarioIngles.put("banco","bank");
	diccionarioIngles.put("caja","box");
	diccionarioIngles.put("juguete","toy");
	diccionarioIngles.put("gato","cat");
	diccionarioIngles.put("perro","dog");
	diccionarioIngles.put("ave","bird");
	diccionarioIngles.put("oido","ear");
	diccionarioIngles.put("ojo","eye");
	diccionarioIngles.put("maiz","corn");
	diccionarioIngles.put("ciudad","city");
	diccionarioIngles.put("nube","cloud");
	diccionarioIngles.put("iglesia","church");
	diccionarioIngles.put("pais","country");
	diccionarioIngles.put("huevo","egg");
	diccionarioIngles.put("silla","chair");
	diccionarioIngles.put("puerta","door");
	diccionarioIngles.put("ventana","windows");
	diccionarioIngles.put("hueso","bone");
	diccionarioIngles.put("cama","bed");
	
	
	
	String español = "";
	
	do {
		  System.out.print("Escribe la palabra en español y te dire su significado en ingles: ");
		  español = scanner.nextLine();
    
			if (!español.equals("salir")) {
				if (diccionarioIngles.containsKey(español)) {
				  System.out.print("La traduccion de " + español);
				  System.out.println(" es " + diccionarioIngles.get(español));
				} else {
				  System.out.print("No conozco la respuesta ");
				  System.out.print("¿cuál es la traduccion de " + español + "?: ");
				  String newingles = scanner.nextLine();
				  diccionarioIngles.put(español, newingles);
				  System.out.println("Gracias por enseñarme nuevas palabras");
				}
			}
		} while (!español.equals("salir"));
		scanner.close();
}

}
/*
 * # Ejercicio 9

## Instrucciones

- Crear un programa en `Java` que realice lo siguiente
  
- Crear un diccionario Español-Inglés, que contenga al menos *20* palabras con su respectiva traducción
- Utiliza un *objeto* `HashMap` para almacenar pares de palabras
- Input 
  - Solicitar a usuario una palbra en español
- Output
  - Mostrar por consola la palabra en inglés
  - En caso de no encontrar su traducción en el diccionario, debe imprimir un mensaje indicándolo

---

Input:
```Java
"gato"
```

Output:
```Java
"cat"
```

Output alternativo:
```Java
"La palabra no se encuentra en el diccionario"
```

## Consideraciones

- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`
- Prueba con diferentes input validos y no validos
- Se puede agregar validación de input
-  Puedes desarrollar el algoritmo y su pseudocódigo*/
 
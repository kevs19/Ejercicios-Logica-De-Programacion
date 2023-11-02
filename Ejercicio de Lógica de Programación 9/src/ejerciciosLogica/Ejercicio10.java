package ejerciciosLogica;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	
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
		
		
		
		Random random = new Random();
		String[] español = diccionarioIngles.keySet().toArray(new String[0]);
		int aciertos= 0;
		int errores= 0;
		
		for(int i = 0; i<5; i++) {
		int aleatorio = random.nextInt(español.length);
		String palabraEspañol = español[aleatorio];
		String palabraIngles = diccionarioIngles.get(palabraEspañol);
		System.out.println("¿cual es la traduccion de "+ palabraEspañol + " en ingles");
		String respuesta = scanner.nextLine();
		
		if (respuesta.equalsIgnoreCase(palabraIngles)){
			System.out.println("acertaste");
			aciertos++;
		}else {
			System.out.println("respuesta incorrecta, la respuesta es "+ palabraIngles);
			errores++;
				}
			}
		System.out.println("tuviste "+ aciertos +" respuestas correctas");
		System.out.println("tuviste "+ errores + " respuestas equivocadas");
		scanner.close();
		
	}
}



/*
 * # Ejercicio 10

## Instrucciones

- Crear un programa en `Java` que realice lo siguiente:
- Crear un diccionario Español-Inglés, que contenga al menos 20 palabras su respectiva traducción
- Utilizar un *objeto* `HashMap` para almacenar los pares de palabras
- Escoger al azar 5 palabars en español del mini diccionario

- Input
  - Pedir al usuario que teclee la traducción al inglés de cada una de las palabras
- Comprobar si el input es correcto
- Output
  - Mostrar cuántas respuestas correctas e incorrectas tiene el usuario

--- 

## Consideraciones

- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`
- Prueba con diferentes input validos y no validos
- Se puede agregar validación de input
-  Puedes desarrollar el algoritmo y su pseudocódigo
-  Por ser el ejercicio final, se evaluarán *todos los aspectos* de un buen código
   -  Limpieza, legibilidad, simplicidad, documentación, etc...*/
 
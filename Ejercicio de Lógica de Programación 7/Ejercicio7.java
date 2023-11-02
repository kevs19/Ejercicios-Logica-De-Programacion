package ejerciciosLogica;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio7 {
	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
   
		System.out.println("introduzca el dia");
		        String dia= scanner.next();
		        int hora;
		        int minutos;
		        int diaP=0;
		        
		        switch (dia.toLowerCase()){
	            case "lunes":{
	                diaP = 0;
	                break;
	            }
	            case "martes":{
	                diaP = 1;
	                break;
	            }
	            case "miercoles":{
	                diaP = 2;
	                break;
	            }
	            case "jueves":{
	                diaP = 3;
	                break;
	            }
	            case "viernes":{
	                diaP = 4;
	                break;
	            }
	            default: {
	                System.out.println("Opcion incorrecta");
	            }
	      }
		        	
		        do {
		        	System.out.println("introduzca la hora ");
		        	hora = scanner.nextInt();
				} while (hora <0 && hora > 23 );

		        do {
			        System.out.println("introduzca los minutos ");
		        	minutos = scanner.nextInt();
				} while (minutos <0 && minutos > 60 );
		scanner.close();

		int entrada = (diaP*1440)+(hora*60)+minutos;
		int finDeSemana = 6630;
		int falta = finDeSemana-entrada;
		System.out.println("faltan "+ falta + " minutos para el fin de semana");
	
		scanner.close();
	}
}


/*
 * # Ejercicio 7

## Instrucciones

- Crear un programa en `Java` que realice lo siguiente:
- Input
  - Solicitar al usuario un dia de la semana (Lunes - Viernes)
  - Solicitar al usuario una hora (horas y minutos)
- Calcular cuántos minutos faltan para el fin de semana.
  - Considerando el inicio para el fin de semana **Viernes a las 15:00 hrs**
- Output
  - Mostrar el resultado por un mensaje en consola.

--- 

Input: Lunes, 14:30 hrs
``` Java
lunes
14
30
```

Output:
```Java
"Faltan 5730 minutos para el fin de semana"
```

## Observaciones adicionales:

- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`
- El programa debe verificar que los datos de entreada sean válidos para continuar su función.
- En caso de que no lo sean, detener el programa y volver a solicitar los datos.*/
 
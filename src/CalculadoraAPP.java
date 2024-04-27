import java.util.Scanner;

public class CalculadoraAPP {
 public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    while (true) {
        System.out.println("**** Aplicación Calculadora ****");
        //Mostrar el menú
        mostrarMenu();
        try {
            var operacion = Integer.parseInt(consola.nextLine());
            //Validar dato
            if (operacion >= 1 && operacion <= 4){
                ejecutarOperación(operacion, consola);
            }
            else if (operacion == 5) {
                System.out.println("Hasta pronto...");
                break;
            }
            else {
                System.out.println("Selección no válida: " + operacion);
            }
            System.out.println();
        }
        catch(Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    } // Fin while
 } // Fin main
 
 private static void mostrarMenu() {
    System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir\n");
    System.out.print("Qué operación deseas realizar? ");
 }

 private static void ejecutarOperación(int operacion, Scanner consola) {
    System.out.print("Proporciona el valor del operando 1: ");
    var operando1 = Double.parseDouble(consola.nextLine());
    System.out.print("Proporciona el valor del operando 2: ");
    var operando2 = Double.parseDouble(consola.nextLine());
    Double resultado;
    switch (operacion) {
        case 1 -> {
            resultado = operando1 + operando2;
            System.out.println("Resultado Suma: " + resultado);
        }
        case 2 -> {
            resultado = operando1 - operando2;
            System.out.println("Resultado Resta: " + resultado);
        }
        case 3 -> {
            resultado = operando1 * operando2;
            System.out.println("Resultado Multiplicación: " + resultado);
        }
        case 4 -> {
            resultado = operando1 / operando2;
            System.out.println("Resultado División: " + resultado);
        }
        default -> {
            System.out.println("Selección no válida: " + operacion);
        }
    }
 }
} // Fin clase

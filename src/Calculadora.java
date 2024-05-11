import java.util.Scanner;

/**
 * Realizar una calculadora utilizando funciones, ciclos, excepciones y el método swicht
 * el menú y las operaciones se realizarán a través de consola
 **/

public class Calculadora {
    private static boolean isExit = false;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (!isExit) {
            mostrarMenu();
            realizarOperaciones(sc);
        }
        sc.close();
    }//fin del main

    private static void mostrarMenu() {
        System.out.print("""
                                
                **** CALCULADORA ****
                1.Suma
                2.Resta
                3.Multiplicación
                4.División
                5.Salir
                """);
        System.out.print("¿Operación a realizar?: ");
    }

    private static void realizarOperaciones(Scanner sc) {
        try {
            double operandoUno, operandoDos, resultado;
            int operacion = sc.nextInt();
            if (operacion > 0 && operacion < 5) {
                System.out.print("Ingrese el primer operando: ");
                operandoUno = sc.nextDouble();
                System.out.print("Ingrese el segundo operando: ");
                operandoDos = sc.nextDouble();
                switch (operacion) {
                    case 1:
                        resultado = operandoUno + operandoDos;
                        System.out.println("El resultado de su suma es: " + resultado);
                        break;
                    case 2:
                        resultado = operandoUno - operandoDos;
                        System.out.println("El resultado de su resta es: " + resultado);
                        break;
                    case 3:
                        resultado = operandoUno * operandoDos;
                        System.out.println("El resultado de su multiplicación es: " + resultado);
                        break;
                    case 4:
                        resultado = operandoUno / operandoDos;
                        System.out.println("El resultado de su división es: " + resultado);
                        break;
                }
            } else if (operacion == 5) {
                System.out.println("¡Hasta pronto! \uD83D\uDC4B");
                isExit = true;
            } else {
                System.err.println("Elija una opción correcta entre 1-5\n");
            }
        } catch (Exception e) {
            System.err.println("Usted debe proporcionar un número\n");
            sc.nextLine();
        }
    }
}

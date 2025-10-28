import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            double num1, num2, resultado = 0;
            do {
                System.out.println("\n=== Calculadora ===");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                
                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Introduce el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = sc.nextDouble();
                    
                    switch (opcion) {
                        case 1 -> resultado = new suma().operar(num1, num2);
                        case 2 -> resultado = new resta().operar(num1, num2);
                        case 3 -> resultado = new multiplicacion().operar(num1, num2);
                        case 4 -> resultado = new division().operar(num1, num2);
                    }
                    
                    System.out.println("Resultado: " + resultado);
                }
                
            } while (opcion != 5);
            System.out.println("Saliendo de la calculadora...");
        }
    }
}

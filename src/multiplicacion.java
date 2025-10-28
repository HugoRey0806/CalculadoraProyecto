public class multiplicacion {
    public static double multiplicar(double a, double b) {
        System.out.println("Programador B: Ejecutando multiplicación mejorada");
        return a * b;
    }
    
    public static double multiplicarMultiple(double... numeros) {
        double resultado = 1;
        for (double num : numeros) {
            resultado *= num;
        }
        return resultado;
    }
    
    public static double elevarAlCuadrado(double a) {
        return a * a;
    }
}
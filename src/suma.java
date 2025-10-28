public class suma {
    public static double sumar(double a, double b) {
        System.out.println("Programador A: Ejecutando suma mejorada");
        return a + b;
    }
    
    public static double sumarMultiple(double... numeros) {
        double resultado = 0;
        for (double num : numeros) {
            resultado += num;
        }
        return resultado;
    }
}
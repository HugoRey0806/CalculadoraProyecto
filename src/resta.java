public class resta {
    public static double restar(double a, double b) {
        System.out.println("Programador A: Ejecutando resta mejorada");
        return a - b;
    }
    
    public static double restarMultiple(double... numeros) {
        if (numeros.length == 0) return 0;
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }
}
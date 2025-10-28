public class division {
    public static double dividir(double a, double b) throws ArithmeticException {
        System.out.println("Programador C: Ejecutando división mejorada");
        if (b == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero");
        }
        return a / b;
    }
    
    public static double divisionSegura(double a, double b) {
        if (b == 0) {
            System.out.println("Advertencia: División entre cero. Retornando 0.");
            return 0;
        }
        return a / b;
    }
}
public class division {
public static double dividir(double a, double b) {
    if (b == 0) {
        throw new ArithmeticException("Error: No se puede dividir entre 0");
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

// Modificado por Programador A - Mejora en la división
// Modificado por Programador B - Optimización de división
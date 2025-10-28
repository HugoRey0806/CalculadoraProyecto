public class division {
    public double operar(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre 0");
            return 0;
        }
        return a / b;
    }
}
// Modificado por Programador B - Optimización de división
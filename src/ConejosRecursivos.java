public class ConejosRecursivos {
    public static void main(String[] args) throws Exception {
        System.out.println("El granjero vendera '" + conejoRecursivo(12)
                + " pares' de conejos al cabo de un anio. - Metodo Recursivo");
        System.out.println("El granjero vendera '" + conejoIterativo(12)
                + " pares' de conejos al cabo de un anio. - Metodo Iterativo");
    }

    // Forma Recursiva
    public static int conejoRecursivo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return conejoRecursivo(n - 1) + conejoRecursivo(n - 2);
        }
    }

    // Forma Iterativa
    public static int conejoIterativo(int n) {
        int x = 1, y = 0, z = 0, i;
        for (i = 1; i <= n; i += 1) {
            z = y;
            y = x;
            x += z;
        }
        return y;
    }
}

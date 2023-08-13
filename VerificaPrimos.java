public class VerificaPrimos {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: java VerificaNumerosPrimos <lista-de-numeros>");
            return;
        }

        for (String arg : args) {
            int numero = Integer.parseInt(arg);
            new Thread(() -> verificarPrimo(numero)).start();
        }
    }

    private static void verificarPrimo(int num) {
        String Verificar = verifirPrimo(num) ? "é primo." : "não é primo.";
        System.out.println("O número " + num + " " + Verificar);
    }

    private static boolean verifirPrimo(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
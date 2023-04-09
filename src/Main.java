public class Main {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i > 0; i--) {
            String hashes = "#".repeat(i);
            System.out.println(i + " " + hashes);
        }

        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}

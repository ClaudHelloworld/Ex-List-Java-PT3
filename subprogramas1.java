import java.util.Scanner;
 
class subprogramas1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insira um numero inteiro: ");
        int n = in.nextInt();
        if (parOuImpar(n))
            System.out.printf("%d e par",n);
        else{
            System.out.printf("%d e impar",n);
        }
        in.close();
    }

    private static boolean parOuImpar(int n) {
        return n % 2 == 0;
    }
}
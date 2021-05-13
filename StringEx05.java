import java.util.Scanner;

public class StringEx05 {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe o numero de strings: ");
		int n = in.nextInt();
		in.nextLine();
		System.out.print("Informe um caractere: ");
		char ch = in.nextLine().charAt(0);
		if (ch >= 'A' && ch <= 'Z') {
			ch += 32;
		}
		String[] array = new String[n];
		System.out.println("Informe " + n + " strings que comecam com a letra " + ch + ":");
		for (int i = 0; i < n; i++) {
			array[i] = in.nextLine();
			if (array[i].charAt(0) != ch && array[i].charAt(0) != (ch - 32)) {
				System.out.println("Voce nao informou uma string que comeca com a letra " + ch);
				i--;
			}
		}
		System.out.println("\n" + n + " string que comecam a letra " + ch + ":");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
		in.close();
	}
}

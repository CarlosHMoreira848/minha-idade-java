import java.util.Scanner;
public class MinhaIdade {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		System.out.println("Bem vindo ao programa!!! Para começar digite sua idade: ");
		idade = leia.nextInt();
		System.out.println("Muito bem! Sua idade é " + idade + "!");
	}
}

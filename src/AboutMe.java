import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Qual seu sobrenome:");
        String sobrenome = scanner.next();
    
        System.out.println("Qual a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Olá, eu meu chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("MInha altura é "+ altura);

    }
    
}
package atv91;
import java.util.Scanner;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public long dataDeNascimento;
    public String email;
    public int telefone;

    public static final String CPF = "123.456.789-00";
    public static final String PAIS = "Brasil";
    public Pessoa(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;

    }

    public void Andar() {
        System.out.printf("%s andou\n", nome, sobrenome);
    }

    public void Comer() {
    	System.out.printf("%s comeu\n", nome, sobrenome);
    }
    public void Correr() {
    	System.out.printf("%s correu\n", nome, sobrenome);
    }
 
    public void Dormir() {
    	System.out.printf("%s dormiu\n", nome + sobrenome);
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome e sobrenome: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String email = scanner.next();

        System.out.print("Digite sua data de nascimento (DD-MM-AAAA): ");
        String dataNascimento = scanner.next();

        System.out.print("Digite seu telefone: ");
        String telefone = scanner.next();

        System.out.print("Digite seu país: ");
        String pais = scanner.next();
        
        System.out.print("Diga a sua nacionalidade: ");
        String nacionalidade = scanner.next();

        System.out.println("\nInformações:");
        System.out.println("Nome completo: " + nomeCompleto.replace(" ", "-"));
        System.out.println("Email: " + email);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Telefone: " + telefone);
        System.out.println("País: " + pais);
        System.out.println("Nacionalidade: " + nacionalidade);

        scanner.close();
    }
    

}

package joao.projetos.geradordesenhasjavafx;

import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorDeSenhas {

    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";

    public static String gerarSenha(int comprimento) {
        StringBuilder senha = new StringBuilder();
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(CARACTERES.length());
            senha.append(CARACTERES.charAt(index));
        }
        return senha.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho desejado para a senha: ");
        int tamanho = scanner.nextInt();

        String novaSenha = gerarSenha(tamanho);
        System.out.println("Sua senha é: ");
        System.out.println(novaSenha);
        
        scanner.close();
    }
}

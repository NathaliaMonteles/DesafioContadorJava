import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        int parametroUm = 0;
        int parametroDois = 0;

        System.out.println("Por favor, digite o primeiro número: ");
        parametroUm = leia.nextInt();

        System.out.println("Por favor, digite o segundo número: ");
        parametroDois = leia.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        System.out.println("Contagem realizada com sucesso! Resultado: " + contagem);
    }
}
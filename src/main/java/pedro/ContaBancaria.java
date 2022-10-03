package pedro;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        //primeira parte do sistema
        System.out.print("Informe o numero da sua conta: ");
        int numero = sc.nextInt();
        System.out.print("Informe o nome da sua conta: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Você quer iniciar com um deposito?(y/n) ");
        char inicial = sc.next().charAt(0);
        if(inicial == 'y'){
            System.out.printf("Entre com um valor inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(nome, numero, depositoInicial);
        } else {
            conta = new Conta(nome, numero);
        }
        

        System.out.println(); //pulo de linha
        System.out.println("Dados da conta: ");
        System.out.println(conta);


        System.out.println(); //pulo de linha
        System.out.printf("Entre com um valor de acrescimo: ");
        double dinheiro = sc.nextDouble();
        conta.deposito(dinheiro);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);

        System.out.println(); //pulo de linha
        System.out.printf("Entre com um valor de redução: ");
        dinheiro = sc.nextDouble();
        conta.saque(dinheiro);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);

        sc.close();
    }
}

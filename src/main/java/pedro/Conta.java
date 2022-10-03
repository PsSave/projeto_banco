package pedro;

public class Conta {
    private static final double taxa = 5;
    private String nome;
    private int numero;
    private double dinheiro;

    public Conta(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Conta(String nome, int numero, double depositoInicial) {
        this.nome = nome;
        this.numero = numero;
        deposito(depositoInicial);;
    }
    
    public static double getTaxa() {
        return taxa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void deposito(double dinheiro){
        this.dinheiro += dinheiro;
    }

    public void saque(double dinheiro){
        this.dinheiro = (this.dinheiro - dinheiro) - taxa ;
    }

    public String toString(){
        return "Conta: " + numero + ", Titular: " + nome + String.format(", Saldo: $ %.2f", dinheiro);
    }

}

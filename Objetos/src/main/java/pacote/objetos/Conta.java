package pacote.objetos;

public class Conta {
    public int numero;
    public String nome;
    public double saldo;
    
    public void saque(double valor){
        saldo -= valor;
    }
    
    public void deposito(double valor){
        saldo += valor;
    }
    
    public void emprestimo(double valor){
        saldo += valor - 10;
    }
}

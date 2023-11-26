package pacote.objetos;

public class ContaPessoaJuridica extends Conta{
    @Override
    public void emprestimo(double valor){
        saldo += valor - 20;
    }
}

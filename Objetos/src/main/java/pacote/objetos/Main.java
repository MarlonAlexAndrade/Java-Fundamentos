package pacote.objetos;

public class Main {

    public static void main(String[] args) {
//       Pessoa p = new Pessoa();
//       Pessoa p2 = new Pessoa();
//       
//       p.setNome("Marlon Andrade");
//       String nome = p.getNome();
//       
//       p2.setNome("Amanda Lima");
//       String nome2 = p2.getNome();
//       
//       System.out.println("Nome pessoa: "+ nome);
//       System.out.println("Nome pessoa: "+ nome2);

        Conta c = new Conta();
        
        c.numero = 123;
        c.nome = "Rodrigo";
        c.saldo = 5000;
        
        c.saque(3000);
        
        System.out.print("Valor saldo: " + c.saldo);
        
        ContaPessoaFisica cf = new ContaPessoaFisica();
        
        cf.numero = 222;
        cd.nome = "Fatima";
        c.saldo = 2000;
        
        c.saque()
                
        System.out.print("Saldo de férias: " );
        
    }
}

package calculadora.metodo01;

public class Main {

    public static void main(String[] args) {
       OperacoesMatematicas operacoesMatematicas = new OperacoesMatematicas();
       
       operacoesMatematicas.n1 = 5;
       operacoesMatematicas.n2 = 4;
         
       
       operacoesMatematicas.imprimeMsg(("Número somado: " + operacoesMatematicas.somaNumeros()));
    }
    
    
     
}

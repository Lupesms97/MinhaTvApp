package Banco;
public class Banco {

    public static void main(String[] args) {
        FuncaoBanco funcaoBanco = new FuncaoBanco();

        funcaoBanco.imprimirSaldo();

        funcaoBanco.sacar(100.00);

        funcaoBanco.depositar(350.00);




    }
    
}

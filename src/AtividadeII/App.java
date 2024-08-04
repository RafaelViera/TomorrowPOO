package AtividadeSemanaII;

public class App {

    public static void main(String[] args){

        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        ContaCorrente c3 = new ContaCorrente();

        Banco banco = new Banco("pessoa1", c1, "pessoa2", c2,
                "pessoa3", c3);

        banco.creditar("pessoa1", 2500.00);
        banco.debitar("pessoa2", 2500.00);
        banco.transferir("pessoa1", "pessoa3", 2499.00);

        System.out.println("\nCorrentistas | Saldo" +
                "\npessoa1: " + banco.getSaldo("pessoa1") +
                "\npessoa2: " + banco.getSaldo("pessoa2") +
                "\npessoa3: " + banco.getSaldo("pessoa3"));
    }


}

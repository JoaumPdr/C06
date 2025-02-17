public class Main {
    public static void main(String[] args) {

        //criando uma nova instancia de conta!
        //E atribuindo a uma variavel do tipo conta!

        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Conta c3 = new Conta();

        c1.saldo = 10000.00;
        c2.saldo = 5000.00;
        c3.saldo = 12500.00;

        c1.sacar(1000.00);

    }
}
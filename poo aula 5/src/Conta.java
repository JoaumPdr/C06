public class Conta {

    //atributos

    float saldo;
    float limite;
    float numerdaconta;
    string nomedodono;

    //metodos

    public void sacar(float quantidade){

        saldo -= quantidade;
    }

    public void depositar(float quantidade){

        saldo += quantidade;
    }


}

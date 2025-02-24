public class Kart {

    //atributos

    String nome;
    Piloto piloto;
    Motor motor;
    //metodos

    public Kart() {

        motor = new Motor();
    }

        void pular(){
        System.out.println(nome + " esta pulando!!");
    }

    void soltarturbo(){
        System.out.println(nome + " esta soltando turbo!!");
    }

    void fazerdrift(){
        System.out.println(nome + " esta fazendo drift!!");
    }
}

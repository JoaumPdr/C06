public class Main {
    public static void main(String[] args) {

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();
        Piloto p3 = new Piloto();
        Piloto p4 = new Piloto();

        p1.nome = "Mario";
        p2.nome = "luigi";
        p3.nome = "Wario";
        p4.nome = "Bowser";

        p1.vilao = false;
        p2.vilao = false;
        p3.vilao = true;
        p4.vilao = true;

        Kart k1 = new Kart();
        Kart k2 = new Kart();
        Kart k3 = new Kart();
        Kart k4 = new Kart();

        k1.piloto = p1;
        k2.piloto = p2;
        k3.piloto = p3;
        k4.piloto = p4;

        k1.motor.cc = "150";
        k2.motor.cc = "150";
        k3.motor.cc = "150";
        k4.motor.cc = "150";

        k1.motor.vmax = 9.0;
        k2.motor.vmax = 4.5;
        k3.motor.vmax = 5.0;
        k4.motor.vmax = 7.0;

        k1.nome = "Biddybuggy";
        k2.nome = "Inkstriker";
        k3.nome = "Mr. Scooty";
        k4.nome = "Ford Ka";

        p1.soltasuperpoder();

        k1.soltarturbo();
        k2.pular();
        k3.fazerdrift();
        k4.pular();

        k1.motor.mostrarInfo();
        k2.motor.mostrarInfo();
        k3.motor.mostrarInfo();
        k4.motor.mostrarInfo();








    }
}
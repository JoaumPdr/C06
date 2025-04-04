package projeto.cliente.pc;
import projeto.cliente.pc.spec.HardwareBasico;
import projeto.cliente.pc.spec.SistemaOperacional;
import projeto.cliente.pc.spec.MemoriaUSB;

public class Computador {

    private String marca;
    private float preco;
    private HardwareBasico hardware;
    private SistemaOperacional so;
    private MemoriaUSB memoriaUSB;

    // Construtor da classe Computador
    public Computador(String marca, float preco, HardwareBasico hardware, SistemaOperacional so) {
        this.marca = marca;
        this.preco = preco;
        this.hardware = hardware;
        this.so = so;
    }

    // Adiciona uma memória USB ao computador
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public float getPreco() {
        return preco;
    }

    // Exibe a configuração do computador
    public void mostrarPCConfig() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Hardware: " + hardware.getNome() + " " + hardware.getCapacidade());
        System.out.println("SO: " + so.getNome() + " " + so.getTipo() + " bits");
        if (memoriaUSB != null) {
            System.out.println("Memória USB: " + memoriaUSB.getNome() + " " + memoriaUSB.getCapacidade() + "GB");
        }
    }
}

package projeto.cliente.pc.spec;

public class HardwareBasico {

    private String nome;
    private Float capacidade;

    public HardwareBasico(String nome, Float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public Float getCapacidade() {
        return capacidade;
    }
}

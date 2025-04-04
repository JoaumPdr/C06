package projeto.cliente;

public class Cliente {

    private final String nome;
    private long cpf;
    private float totalCompra = 0;

    // Construtor da classe Cliente
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Método que adiciona um valor ao total da compra, verificando se é válido
    public void calcularTotalCompra(float valor) {
        if (valor > 0) {
            totalCompra += valor;
        } else {
            System.out.println("Erro: O valor da compra não pode ser negativo ou zero.");
        }
    }

    public float getTotalCompra() {
        return totalCompra;
    }

}

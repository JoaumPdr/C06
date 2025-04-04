package projeto;
import java.util.Scanner;
import projeto.cliente.Cliente;
import projeto.cliente.pc.Computador;
import projeto.cliente.pc.spec.HardwareBasico;
import projeto.cliente.pc.spec.SistemaOperacional;
import projeto.cliente.pc.spec.MemoriaUSB;

public class PCMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando os computadores conforme especificação
        Computador promo1 = new Computador("Apple", 6199, new HardwareBasico("Pentium Core i3", 2200F), new SistemaOperacional("Linux Ubuntu", 32));
        Computador promo2 = new Computador("Samsung", 1755, new HardwareBasico("Pentium Core i5", 3370F), new SistemaOperacional("Windows", 64));
        Computador promo3 = new Computador("Dell", 5678, new HardwareBasico("Pentium Core i7", 4500F), new SistemaOperacional("Windows 10", 64));

        // Adicionando memória USB aos computadores
        promo1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));
        promo2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));
        promo3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        // Cadastro do cliente
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu CPF: ");
        long cpf = scanner.nextLong();
        Cliente cliente = new Cliente(nome, cpf);

        // Exibe as promoções antes da compra
        System.out.println("--- Promoções Disponíveis ---");
        promo1.mostrarPCConfig();
        System.out.println();
        promo2.mostrarPCConfig();
        System.out.println();
        promo3.mostrarPCConfig();
        System.out.println("-----------------------------");

        // Processo de compra
        int escolha;
        do {
            System.out.println("Escolha um computador para comprar (1, 2 ou 3). Digite 0 para sair:");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    cliente.calcularTotalCompra(promo1.getPreco());
                    promo1.mostrarPCConfig();
                    break;
                case 2:
                    cliente.calcularTotalCompra(promo2.getPreco());
                    promo2.mostrarPCConfig();
                    break;
                case 3:
                    cliente.calcularTotalCompra(promo3.getPreco());
                    promo3.mostrarPCConfig();
                    break;
                case 0:
                    System.out.println("Compra finalizada.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);

        // Exibe o total da compra do cliente
        System.out.println("Total da compra: R$" + cliente.getTotalCompra());
        scanner.close();
        }
    }

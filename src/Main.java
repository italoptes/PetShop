import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventarioPetShop inventario = new InventarioPetShop();
        Scanner sc = new Scanner(System.in);

        menu();

        int entrada = sc.nextInt();
        while (entrada != 2){
            servicos();
            int servico = sc.nextInt();
            switch (servico){
                case 1:
                    System.out.println("Código do Banho: ");
                    int codBanho = sc.nextInt();
                    tamanhoPet();
                    int tamPetInput = sc.nextInt();
                    Tamanho tamPet = converteParaEnum1(tamPetInput);
                    tamanhoPeloPet();
                    int tamPeloInput = sc.nextInt();
                    TamanhoPelo tamPelo = convertePAraEnum2(tamPeloInput);
                    ServicosPetShop banho = new Banho(codBanho, tamPet, tamPelo);
                    inventario.adicionaServico(banho);
                    System.out.println(inventario.descricaoServico(banho));
                    break;
                case 2:
                    System.out.println("Código do Hotelzinho: ");
                    int codHotel = sc.nextInt();
                    tamanhoPet();
                    tamPetInput = sc.nextInt();
                    tamPet = converteParaEnum1(tamPetInput);
                    System.out.println("Informe o a quantidade de horas ocupadas pelo pet:");
                    int quantHoras = sc.nextInt();
                    ServicosPetShop hotelzinho = new Hotelzinho(codHotel, tamPet, quantHoras);
                    inventario.adicionaServico(hotelzinho);
                    System.out.println(inventario.descricaoServico(hotelzinho));
                    break;
                case 3:
                    System.out.println("Código da Tosa: ");
                    int codTosa = sc.nextInt();
                    tamanhoPet();
                    tamPetInput = sc.nextInt();
                    tamPet = converteParaEnum1(tamPetInput);
                    ServicosPetShop tosa = new Tosa(codTosa, tamPet);
                    inventario.adicionaServico(tosa);
                    System.out.println(inventario.descricaoServico(tosa));
                    break;
            }

            menu();
            entrada = sc.nextInt();
        }
        System.out.println("📋 Exibindo inventário de serviços---------");
        System.out.println(inventario.listaServicos());
    }

    private static void tamanhoPeloPet() {
        System.out.println("Informe o tamanho do pelo de seu pet:");
        System.out.println("1 - Curto");
        System.out.println("2 - Médio");
        System.out.println("3 - Longo");
    }

    private static void tamanhoPet() {
        System.out.println("Informe o tamanho de seu pet:");
        System.out.println("1 - Pequeno");
        System.out.println("2 - Médio");
        System.out.println("3 - Grande");
    }

    private static TamanhoPelo convertePAraEnum2(int tamPeloInput) {
        TamanhoPelo tamPelo = switch (tamPeloInput){
            case 1 -> TamanhoPelo.CURTO;
            case 2 -> TamanhoPelo.MEDIO;
            case 3 -> TamanhoPelo.LONGO;
            default -> throw new IllegalStateException("Unexpected value: " + tamPeloInput);
        };
        return tamPelo;
    }

    private static Tamanho converteParaEnum1(int tamPetInput) {
        Tamanho tamPet = switch (tamPetInput) {
            case 1 -> Tamanho.PEQUENO;
            case 2 -> Tamanho.MEDIO;
            case 3 -> Tamanho.GRANDE;
            default -> throw new IllegalStateException("Unexpected value: " + tamPetInput);
        };
        return tamPet;
    }

    private static void servicos() {
        System.out.println("➡ Registrar novo pedido---------");
        System.out.println("1 - Banho");
        System.out.println("2 - Hotelzinho");
        System.out.println("3 - Tosa");
        System.out.println("Insira um dígito para o que você deseja: ");
    }

    private static void menu() {
        System.out.println("\n🐾 Bem-vindo ao Petshop 🐾");
        System.out.println("1 - Registrar novo pedido");
        System.out.println("2 - Fechar a loja e exibir inventário");
        System.out.print("Escolha uma opção: ");
    }
}

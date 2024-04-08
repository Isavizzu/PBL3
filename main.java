import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main (String[] args){
        int resp = 0;
        ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
        ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
        ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
        imprimir();
        System.out.println("  Seja Bem-Vindo ao Uber  ");
        while (resp != 7){
            //Mostrando o menu
            imprimir();
            System.out.println("           Menu           ");
            imprimir();
            System.out.println("1- Cadastrar Passageiro");
            System.out.println("2- Cadastrar Motorista");
            System.out.println("3- Cadastrar endereço");
            System.out.println("4- Correlacionar endereço com Passageiro");
            System.out.println("5- Listar motoristas já cadastrados");
            System.out.println("6- Listar passageiros já cadastrados");
            System.out.println("7- Sair");

            //Pedindo a opção desejada com scanner
            System.out.print("Digite a opção desejada: ");
            Scanner scanner = new Scanner(System.in);
            resp = scanner.nextInt();

            //Verifica a opção escolhida
            switch(resp){
                case 1:
                    cadastroPassageiro(passageiros);
                    break;
                case 2:
                    cadastroMotorista(motoristas);
                    break;
                case 3:
                    cadastroEndereco(enderecos);
                    break;
                case 4:
                    associarEndereco(passageiros, enderecos);
                    break;
                case 5:
                    listarMotorista(motoristas);
                    break;
                case 6:
                    listarPassageiro(passageiros);
                    break;
                case 7:
                    imprimir();
                    System.out.println("Obrigada por usar o Uber!");
                    imprimir();
                    break;
                default:
                    break;
            }


        }

    }

    public static void imprimir(){
        System.out.println("--------------------------");
    }

    public static void listarPassageiro(ArrayList<Passageiro> passageiros){
        imprimir();
        int i = 0;
        for(Passageiro passageiro:passageiros){
            i++;
            String nome = passageiro.getNome();
            System.out.println(i + "- " + nome);
        }
    }

    public static void listarMotorista(ArrayList<Motorista> motoristas){
        imprimir();
        int i = 0;
        for(Motorista motorista:motoristas){
            i++;
            String nome = motorista.getNome();
            System.out.println(i + "- " + nome);
        }
    }
    public static void cadastroPassageiro(ArrayList<Passageiro> passageiros){
        //Solicitando dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n");
        imprimir();
        System.out.println("  Cadastro de Passageiro  ");
        imprimir();
        System.out.print("Digite o nome do Passageiro: ");
        String nome = scanner.nextLine();
        System.out.print("\nDigite o gênero do Passageiro: ");
        String genero = scanner.nextLine();
        System.out.print("\nDigite a data de nascimento do Passageiro: ");
        String data = scanner.nextLine();
        System.out.print("\nDigite o CPF do Passageiro: ");
        String cpf = scanner.nextLine();
        System.out.print("\nDigite o endereço de cobrança do Passageiro: ");
        String endereco = scanner.nextLine();

        //Criando passageiro
        passageiros.add(new Passageiro(nome, genero, data, cpf, endereco));
        System.out.print("\n");
        imprimir();
        System.out.println("Passsageiro " + nome + " cadastrado com sucesso!");
    }

    public static void cadastroMotorista(ArrayList<Motorista> motoristas){
        //Solicitando dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n");
        imprimir();
        System.out.println("  Cadastro de Motorista  ");
        imprimir();
        System.out.print("Digite o nome do Motorista: ");
        String nome = scanner.nextLine();
        System.out.print("\nDigite o gênero do Motorista: ");
        String genero = scanner.nextLine();
        System.out.print("\nDigite a data de nascimento do Motorista: ");
        String data = scanner.nextLine();
        System.out.print("\nDigite o CPF do Motorista: ");
        String cpf = scanner.nextLine();
        System.out.print("\nDigite a cnh do Motorista: ");
        String cnh = scanner.nextLine();
        System.out.print("\nDigite o número da conta bancária do Motorista: ");
        String conta = scanner.nextLine();
        System.out.print("\nDigite o tipo de Habilitação do Motorista (tipo: A, B, C, D ou E): ");
        String tipo = scanner.nextLine();

    public static void cadastroEndereco(ArrayList<Endereco> Enderecos){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n");
        imprimir();
        Sytem.out.println("Cadastro do Endereço");
        imprimir();
        System.out.print("Digite o nome do país: ");
        String pais = scanner.nextLine();
        System.out.print("\nDigite o nome do Estado: ");
        String estado = scanner.nextLine();
        System.out.print("\nDigite o nome da cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("\nDigite o nome do bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("\nDigite o nome da rua: ");
        String rua = scanner.nextLine();
        System.out.print("\nDigite o número do endereço: ");
        int numero = scanner.nextLine();

        Endereco endereco = new Endereco(pais, estado, cidade, bairro, rua, numero);
        enderecos.add(endereco);
        System.out.println("Endereço cadastrado com sucesso!");

    }

    public static void associarEndereco(ArrayList<Passageiro> passageiros, ArrayList<Endereco> enderecos) {
        // Listar passageiros disponíveis para associação
        System.out.println("Passageiros disponíveis:");
        for (int i = 0; i < passageiros.size(); i++) {
            System.out.println((i + 1) + ". " + passageiros.get(i).getNome());
        }

        // Solicitar o passageiro para associar o endereço
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha o número do passageiro: ");
        int escolhaPassageiro = scanner.nextInt();
        
        Passageiro passageiroEscolhido = passageiros.get(escolhaPassageiro - 1);
        
        // Listar endereços disponíveis para associação
        System.out.println("Endereços disponíveis:");
        for (int i = 0; i < enderecos.size(); i++) {
            System.out.println((i + 1) + ". " + enderecos.get(i).getPais()); // Supondo que o endereço tenha um método getPais()
        }

        // Solicitar o endereço para associação
        System.out.print("Escolha o número do endereço: ");
        int escolhaEndereco = scanner.nextInt();
        
        Endereco enderecoEscolhido = enderecos.get(escolhaEndereco - 1);
        
        // Associar o endereço ao passageiro
        passageiroEscolhido.adicionarEndereco(enderecoEscolhido);
        
        System.out.println("Endereço associado ao passageiro com sucesso!");
    }

        //Criando Motorista
        motoristas.add(new Motorista(nome, genero, data, cpf, cnh, conta, tipo));
        System.out.print("\n");
        imprimir();
        System.out.println("Motorista " + nome + " cadastrado com sucesso!");

    }
}

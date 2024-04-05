import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main (String[] args){
        int resp = 0;
        ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
        ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
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
            int opcao = scanner.nextInt();

            //Verifica a opção escolhida
            switch(opcao){
                case 1:
                    cadastroPassageiro(passageiros);
                    break;
                case 2:
                    cadastroMotorista(motoristas);
                    break;
                case 3:
                    listarPassageiro(passageiros);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    break;
            }


        }

    }

    public static void imprimir(){
        System.out.println("--------------------------");
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

        //Criando Motorista
        motoristas.add(new Motorista(nome, genero, data, cpf, cnh, conta, tipo));
        System.out.print("\n");
        imprimir();
        System.out.println("Motorista " + nome + " cadastrado com sucesso!");

    }
}

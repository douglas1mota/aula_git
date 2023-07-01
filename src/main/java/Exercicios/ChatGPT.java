package Exercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChatGPT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int indiceAtual = 0;
        String[] telefone = new String[4];
        String[] nomes = new String[telefone.length];
        /*String entradaString = validarEntradaString(input, "Digite uma string: ");
        System.out.println("String digitada: " + entradaString);

        int entradaInteiro = validarEntradaInt(input, "Digite um número inteiro: ");
        System.out.println("Número inteiro digitado: " + entradaInteiro);*/

        exibirMenu(indiceAtual, telefone, nomes);
        input.close();
    }

    public static void exibirMenu(int indiceAtual, String[] telefone, String[] nomes) {
        Scanner input = new Scanner(System.in);

        System.out.println("+----------------------------------------------------------+");
        System.out.println("| Menu Principal                                           |");
        System.out.println("| Informe a opção desejada e tecle Enter                   |");
        System.out.println("+----------------------------------------------------------+");
        System.out.println("|  1 = Cadastrar novo Contato na Agenda                    |");
        System.out.println("|  2 = Excluir Contato da Agenda                           |");
        System.out.println("|  3 = Listar contatos da Agenda                           |");
        System.out.println("|  4 = Limpar todos os Contatos                            |");
        System.out.println("| 99 = Sair do Programa                                    |");
        System.out.println("+----------------------------------------------------------+");

        String escolha = input.nextLine();
        if (escolha.equals("1")) { //estudar sobre switch, case, default
            cadastrarNome(indiceAtual, telefone, nomes);
        } else if (escolha.equals("2")) {
            excluirContato(indiceAtual, telefone, nomes);
        } else if (escolha.equals("3")) {
            listarContatos(indiceAtual, telefone, nomes);
        } else if (escolha.equals("4")) {
            limparMemoria(indiceAtual, telefone, nomes);
        } else if (escolha.equals("99")) {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("| OBRIGADO. ATÉ LOGO.                                      |");
            System.out.println("+----------------------------------------------------------+");

        } else {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("|                      Opção INVÁLIDA!                     |");
            System.out.println("| Escolha uma das opções abaixo                            |");
            exibirMenu(indiceAtual, telefone, nomes);

        }
    }

    public static void cadastrarNome(int indiceAtual, String[] telefone, String[] nomes) {
        Scanner input = new Scanner(System.in);
        if (indiceAtual == telefone.length) {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("| Memória cheia! Exclua um registro ou limpe a memória     |");
            System.out.println("| Tecle Enter para o Menu Principal                        |");
            System.out.println("+----------------------------------------------------------+");
            input.nextLine();
            exibirMenu(indiceAtual, telefone, nomes);
        } else {


            do {
                System.out.println("+----------------------------------------------------------+");
                System.out.println("| Informe o nome e tecle Enter  (máximo 27 letras)         |");
                System.out.println("+----------------------------------------------------------+");
                String nome = input.nextLine();
                if (nome.matches("^[a-zA-Z ãÃõÕéÉáÁóÓíÍúÚçÇ.]{1,35}$")) {
                    nomes[indiceAtual] = nome;
                } else {
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("| Caracteres inválidos ou tamanho excedido                 |");

                }
            } while (nomes[indiceAtual] == null);

            do {
                System.out.println("+----------------------------------------------------------+");
                System.out.println("| Informe o número do telefone e tecle Enter               |");
                System.out.println("| (exatos 5 dígitos)                                       |");
                System.out.println("+----------------------------------------------------------+");
                String numero = input.nextLine();
                if (numero.matches("[0-9, ]{5}")) {
                    telefone[indiceAtual] = numero;
                } else {
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("| Caracteres inválidos                                     |");
                }
            } while (telefone[indiceAtual] == null);

        }
        indiceAtual++;

        System.out.println("+----------------------------------------------------------+");
        System.out.println("| CONTATO CADASTRADO COM SUCESSO NA POSIÇÃO "+ indiceAtual + "              |");
        System.out.println("+----------------------------------------------------------+");
        System.out.println("| Cadastrar outro usuário, digite 1                        |");
        System.out.println("| Voltar ao menu principal, tecle Enter                    |");
        System.out.println("+----------------------------------------------------------+");
        String escolha = input.nextLine();
        if (escolha.equals("1")) {
            cadastrarNome(indiceAtual, telefone, nomes);
        } else {
            exibirMenu(indiceAtual, telefone, nomes);
        }
        input.close();
    }

    public static void excluirContato(int indiceAtual, String[] telefone, String[] nomes) {
        Scanner input = new Scanner(System.in);
        if (telefone[0] == null) {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("| A AGENDA ESTÁ VAZIA                                      |");
            System.out.println("+----------------------------------------------------------+");
            System.out.println("| Para voltar ao menu principal, aperte Enter              |");
            System.out.println("+----------------------------------------------------------+");
            input.nextLine();
            exibirMenu(indiceAtual, telefone, nomes);
        } else {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("| Informe o número do cadastro que deseja apagar           |");
            System.out.println("+----------------------------------------------------------+");

            int nCadastro = validarEntradaInt(input, "", indiceAtual);


           /* do {
                try {
                    nCadastro = input.nextInt();
                    if (nCadastro >= 1 && nCadastro < (telefone.length + 1)) {
                        break;
                    } else {
                        throw new InputMismatchException("Índice fora dos limites do array.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("+------------------------------------------------+");
                    System.out.println("| Valor inválido. Informe o número corretamente  |");
                    System.out.println("+------------------------------------------------+");
                    input.nextLine();
                }
            } while (true);
            input.nextLine(); */

            if (telefone[nCadastro - 1] == null) {
                System.out.println("+----------------------------------------------------------+");
                System.out.println("| CADASTRO NÃO EXISTE                                      |");
                System.out.println("+----------------------------------------------------------+");
                System.out.println("| Para nova tentativa, tecle Enter                         |");
                System.out.println("+----------------------------------------------------------+");
                input.nextLine();
// esse bloco if do cadastro nao existe vai sumir depois da funcao validarEntradaInt
                //acabei de observar que está chamando a propria funcao excluir na funçao excluir
                //a melhor opção seria um do while?
                excluirContato(indiceAtual, telefone, nomes);
            } else {
                telefone[nCadastro - 1] = null;
                nomes[nCadastro - 1] = null;
                indiceAtual--;
            }

            for (int i = 0; i < (telefone.length - 1); i++) {
                for (int j = 0; j < (telefone.length - 1); j++) {
                    if (telefone[i] == null) {
                        telefone[i] = telefone[i + 1];
                        telefone[i + 1] = null;
                    }
                    if (nomes[i] == null) {
                        nomes[i] = nomes[i + 1];
                        nomes[i + 1] = null;
                    }

                }
            }

            System.out.println("+----------------------------------------------------------+");
            System.out.println("| CADASTRO APAGADO COM SUCESSO                             |");
            System.out.println("+----------------------------------------------------------+");
            System.out.println("| Para voltar ao menu principal, tecle Enter               |");
            System.out.println("+----------------------------------------------------------+");
            input.nextLine();
            input.nextLine();
            exibirMenu(indiceAtual, telefone, nomes);
        }

        input.close();
    }

    public static void listarContatos(int indiceAtual, String[] telefone, String[] nomes) {
        Scanner input = new Scanner(System.in);
        System.out.println("+----------------------------------------------------------+");
        System.out.println("| Posição | Nome                        | Telefone         |");
        System.out.println("+----------------------------------------------------------+");

        for (int i = 0; i < telefone.length; i++) {
            System.out.printf("|    %-5s| %-27s | %-16s |\n", (i+1), nomes[i], telefone[i]);
        }

        System.out.println("+----------------------------------------------------------+");
        System.out.println("| Para voltar ao menu principal, tecle Enter               |");
        System.out.println("+----------------------------------------------------------+");
        input.nextLine();
        exibirMenu(indiceAtual, telefone, nomes);
    }

    public static void limparMemoria(int indiceAtual, String[] telefone, String[] nomes) {
        Scanner input = new Scanner(System.in);
        if (telefone[0] == null) {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("| A AGENDA ESTÁ VAZIA                                      |");
            System.out.println("+----------------------------------------------------------+");
            System.out.println("| Para voltar ao menu principal, tecle Enter               |");
            System.out.println("+----------------------------------------------------------+");
            input.nextLine();
            exibirMenu(indiceAtual, telefone, nomes);
        } else {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("| Apagar todos os contatos?                                |");
            System.out.println("| 1 - SIM ou 2 - Voltar ao menu principal                  |");
            System.out.println("+----------------------------------------------------------+");
            int decisao = validarEntradaInt(input, "", indiceAtual);
            if (decisao == 1) {
                for (int i = 0; i < telefone.length; i++) {
                    nomes[i] = null;
                    telefone[i] = null;
                }
            indiceAtual = 0;
                System.out.println("+----------------------------------------------------------+");
                System.out.println("| AGENDA RESETADA COM SUCESSO                              |");
                System.out.println("+----------------------------------------------------------+");
                System.out.println("| Para voltar ao menu principal, tecle Enter               |");
                System.out.println("+----------------------------------------------------------+");
                input.nextLine();
                input.nextLine();
                exibirMenu(indiceAtual, telefone, nomes);
            } else {
                exibirMenu(indiceAtual, telefone, nomes);
            }
        }

    }

    public static int validarEntradaInt(Scanner input, String mensagem, int indiceAtual) {
        int entrada = 0;
        boolean valido = false;
        do {
            try {
                entrada = input.nextInt();
                if (entrada >= (indiceAtual + 1)) {
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("| INVÁLIDO. Valor informado excede o n° de registros (" + (indiceAtual + 1) + ")   |");
                    System.out.println("+----------------------------------------------------------+");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("+----------------------------------------------------------+");
                System.out.println("| Valor inválido. Informe o número corretamente            |");
                System.out.println("+----------------------------------------------------------+");
                input.nextLine();
            }
        } while (!valido);

        return entrada;
    }

}
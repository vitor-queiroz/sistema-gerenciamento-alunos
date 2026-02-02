import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome, nome1;
        int senha, senha1, contagem = 2, chave = 0;


        System.out.println(" === CADASTRO DO USUÁRIO ===");
        System.out.println("Digite um nome de usuário: ");
        nome = ler.nextLine();
        nome1 = nome;
        System.out.println("Digite uma senha: ");
        senha = ler.nextInt();
        senha1 = senha;
        System.out.println("Usuário cadastrado com sucesso!");


        while (contagem >= 0 && contagem <= 3) {

            System.out.println("=== LOGIN ===");
            System.out.println("Usuário: ");
            nome = ler.nextLine();
            nome = ler.nextLine();
            System.out.println("Senha: ");
            senha = ler.nextInt();


            if (!nome.equals(nome1) || senha != senha1) {

                System.out.println("Você errou e tem mais " + contagem + " tentativas");
                contagem--;
            } else {
                System.out.println("Login realizado com sucesso!");
                chave = 1;
                break;
            }

        }

        String turma3 = "";
        String nome3 = "";
        int opcao1;
        int opcao2;
        int opcao3;
        double nota3 = 0;


        switch (chave) {
            case 1:
                while (true) {

                    System.out.println(" ==== MENU PRINCIPAL ==== ");
                    System.out.println("1 - Cadastrar aluno ");
                    System.out.println("2 - Editar aluno ");
                    System.out.println("3 - Mostrar aluno ");
                    System.out.println("4 - Sair");

                    System.out.println("Escolha uma opção: ");
                    opcao1 = ler.nextInt();


                    switch (opcao1) {
                        case 1:
                            System.out.println("Nome: ");
                            nome3 = ler.nextLine();
                            nome3 = ler.nextLine();
                            System.out.println("Turma: ");
                            turma3 = ler.nextLine();
                            System.out.println("Nota: ");
                            nota3 = ler.nextDouble();
                            System.out.print("Cadastro realizado com sucesso!");
                            break;


                        case 2:
                            if (nome3.equals("")){
                                System.out.println("Nenhum aluno cadastrado ainda.");
                                break;}

                            System.out.println("1 - Nome");
                            System.out.println("2 - Turma");
                            System.out.println("3 - Nota");
                            System.out.println("Escolha: ");
                            opcao2 = ler.nextInt();

                            switch (opcao2) {
                                case 1:
                                    System.out.println("Nome:");
                                    nome3 = ler.nextLine();
                                    nome3 = ler.nextLine();
                                    System.out.println("Nome alterado com sucesso!");
                                    break;

                                case 2:


                                    System.out.println("Turma: ");
                                    turma3 = ler.nextLine();
                                    turma3 = ler.nextLine();
                                    System.out.println("Turma alterada com sucesso!");
                                    break;

                                case 3:
                                    System.out.println("Nota: ");
                                    nota3 = ler.nextDouble();
                                    System.out.println("Nota alterada com sucesso");
                                    break;
                                default:
                                    System.out.println("Opcão Inválida");


                            }
                            break;

                        case 3:
                            if (nome3.equals("")){
                                System.out.println("Nenhum aluno cadastrado ainda.");
                                break;
                            }
                            System.out.println("Aluno cadastrado: " + nome3);
                            System.out.println("Turma: " + turma3);
                            System.out.println("Nota: " + nota3);
                            break;
                        case 4:
                            System.out.println("Programa encerrado.Até Logo");
                            break;
                    }


                    if (opcao1 == 4) {
                        break;

                    }
                }
                }
                }
                }
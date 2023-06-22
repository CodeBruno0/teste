package App;

import java.util.Scanner;
import Contatos.Contato;

public class App {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Lista de Contatos Virtual.");
        System.out.println("==========================");
        int qtd = 0; int opcao;
        
        Contato[] pessoa = new Contato[5];
        //Contato p = new Contato(null, null, null);

        // mensagem de boas vindas

        System.out.println("Bem-vindo a sua Agenda Virtual. O que deseja fazer?");

       
        // switch
        do {
             // menu
        System.out.println("1 - Adicionar contato:");
        System.out.println("2 - Ver lista de contatos:");
        System.out.println("9 - Para voltar ao menu:");
        System.out.println("0 - Para encerar App.");
        opcao = dados.nextInt();
        dados.nextLine();

            switch (opcao) {
                case 1:
                    if (qtd < 5) {

                        Contato p = new Contato(null, null, null);
                        
                        System.out.print("Nome do contato: ");
                        String nome = dados.nextLine();
                        p.setNome(nome);
                        
                        System.out.print("Sobrenome: ");
                        String sobrenome = dados.nextLine();
                        p.setSobrenome(sobrenome);

                        System.out.print("Telefone: ");
                        String telefone = dados.nextLine();
                        p.setTelefone(telefone);

                        pessoa[qtd] = p;
                        qtd = qtd + 1;

                        System.out.println("Para voltar ao menu, digite 9. ");
                        opcao = dados.nextInt();
                        // dados.nextLine();
                        
                    } else {
                        System.out.println("Agenda lotada!!");
                    }
                    break;
                case 2:
                    if (qtd == 0) {
                        System.out.print("Não temos nenhum contato a exibir!!\n");
                        System.out.println("Deseja cadastrar um contato? Digite 9 para acessar o menu.");
                        opcao = dados.nextInt();
                        // dados.nextLine();
                    } else {
                        for (int i = 0; i < qtd; i++) {
                            
                            
                            System.out.printf("Nome do contato: %s\n", pessoa[i].getNome());
                            System.out.printf("Sobrenome: %s\n", pessoa[i].getSobrenome());
                            System.out.printf("Telefone: %s\n", pessoa[i].getTelefone());
                        }
                        System.out.printf("Para acessar o menu, digite 9. ");
                        opcao = dados.nextInt();
                        dados.nextLine();

                    }
                    break;

                case 9:
                    System.out.println("1 - Adicionar contato:");
                    System.out.println("2 - Ver lista de contatos:");
                    System.out.println("9 - Para voltar ao menu:");
                    System.out.println("0 - Para encerar App.");
                    opcao = dados.nextInt();
                    dados.nextLine();

                default:
                    break;
            }

        } while (opcao !=0);

    }

    
}
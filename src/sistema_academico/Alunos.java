package sistema_academico;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Alunos extends Pessoas {

    public String serie_atual;
    public String coeficiente_aluno;
    public String condicao_aluno;
    public String numero_matricula;

    Scanner input = new Scanner(System.in);

    public Alunos(String nome, String idade, String email, String telefone, String serie_atual, String coeficiente_aluno, String condicao_aluno, String numero_matricula) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.serie_atual = serie_atual;
        this.coeficiente_aluno = coeficiente_aluno;
        this.condicao_aluno = condicao_aluno;
        this.telefone = telefone;
        this.numero_matricula = numero_matricula;
        //Professor.add(professor);
    }


    public Alunos() {

    }

    public int search_aluno(java.util.ArrayList<Alunos> Aluno, String numero_matricula) {
        int z, local = -1;
        for (z = 0; z < Aluno.size(); z++) {
            if (Aluno.get(z).getNumero_matricula().equals(numero_matricula)) {
                local = z;
            }
        }
        return local;
    }

    public void printaalunos(java.util.ArrayList<Alunos> Aluno) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da matricula do aluno:");
        String numero_matricula;
        Alunos aluno = new Alunos();
        numero_matricula = input.nextLine();
        System.out.println();
        int local = aluno.search_aluno(Aluno, numero_matricula);
        if (local != -1) {
            System.out.println("Nome: " + Aluno.get(local).getNome());
            System.out.println("Série atual / Perido atual: " + Aluno.get(local).getSerie_atual());
            System.out.println("Idade: " + Aluno.get(local).getIdade());
            System.out.println("Email: " + Aluno.get(local).getEmail());
            System.out.println("Condição: " + Aluno.get(local).getCondicao_aluno());
            System.out.println("Coeficiente: " + Aluno.get(local).getCoeficiente_aluno());
            System.out.println("Matricula: " + Aluno.get(local).getNumero_matricula());
            System.out.println("Telefone: " + Aluno.get(local).getTelefone());
        } else {
            System.out.println("Aluno não cadastrado ou número da matricula não encontrado");
        }
    }

    public void menu_editaaluno(java.util.ArrayList<Alunos> Aluno) {
        Scanner input = new Scanner(System.in);
        String num_matricula;
        Alunos aluno = new Alunos();
        System.out.println("Digite o número da matricula do aluno que você deseja editar:");
        num_matricula = input.nextLine();
        input.nextLine();
        System.out.println();
        int local = aluno.search_aluno(Aluno, num_matricula);

        int opcao = 1;

        if(local == -1)
        {
            System.out.println("Aluno com o número de matricula desejado não existe!");
        }
        else
        {
            while (opcao != 0)
            {
                System.out.println("Digite a opção que você deseja editar:");
                System.out.println("[0] - Sair");
                System.out.println("[1] - Idade");
                System.out.println("[2] - Telefone");
                System.out.println("[3] - E-mail");
                System.out.println("[4] - Serie atual");
                System.out.println("[5] - Coeficiente do aluno");
                System.out.println("[6] - Condicao do aluno");
                System.out.println("[7] - Número da matricula");
                opcao = input.nextInt();
                input.nextLine();

                if (opcao == 1) {
                    System.out.println("Digite a idade do aluno:");
                    System.out.println(local);
                    Aluno.get(local).setIdade(input.nextLine());
                } else if (opcao == 2) {
                    System.out.println("Digite o telefone do aluno:");
                    Aluno.get(local).setTelefone(input.nextLine());
                } else if (opcao == 3) {
                    System.out.println("Digite o e-mail do aluno:");
                    Aluno.get(local).setEmail(input.nextLine());
                } else if (opcao == 4) {
                    System.out.println("Digite a serie atual do aluno:");
                    Aluno.get(local).setSerie_atual(input.nextLine());
                } else if (opcao == 5) {
                    System.out.println("Digite o coeficiente do aluno:");
                    Aluno.get(local).setCoeficiente_aluno(input.nextLine());
                } else if (opcao == 6) {
                    System.out.println("Digite a condicao do aluno:");
                    Aluno.get(local).setCondicao_aluno(input.nextLine());
                } else if (opcao == 7) {
                    System.out.println("Digite o número da matrícula:");
                    Aluno.get(local).setNumero_matricula(input.nextLine());
                }
            }
        }

    }
    public void excluir_aluno(java.util.ArrayList<Alunos> Aluno)
    {
        Scanner input = new Scanner(System.in);
        String num_matricula;
        Alunos aluno = new Alunos();
        System.out.println("Digite o número da matricula do aluno que você deseja excluir:");
        num_matricula = input.nextLine();
        input.nextLine();
        System.out.println();
        int local = aluno.search_aluno(Aluno, num_matricula);

        if(local == -1)
        {
            System.out.println("Aluno não existe!");
        }
        else
        {
            System.out.println("Aluno excluído com sucesso!");
            Aluno.remove(local);
        }
        System.out.println();
    }

    public String getSerie_atual() {
        return serie_atual;
    }

    public void setSerie_atual(String serie_atual) {
        this.serie_atual = serie_atual;
    }

    public String getCoeficiente_aluno() {
        return coeficiente_aluno;
    }

    public void setCoeficiente_aluno(String coeficiente_aluno) {
        this.coeficiente_aluno = coeficiente_aluno;
    }

    public String getCondicao_aluno() {
        return condicao_aluno;
    }

    public void setCondicao_aluno(String condicao_aluno) {
        this.condicao_aluno = condicao_aluno;
    }

    public String getNumero_matricula() {
        return numero_matricula;
    }

    public void setNumero_matricula(String numero_matricula) {
        this.numero_matricula = numero_matricula;
    }

    private void printa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

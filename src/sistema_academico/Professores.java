
package sistema_academico;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Professores extends Pessoas
{
    public String cpf;
    public String salario;
    public String graduacao;

    Scanner input = new Scanner(System.in);

    public Professores(String nome, String cpf,String idade,String email,String salario,String graduacao,String telefone)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
        this.salario = salario;
        this.graduacao = graduacao;
        this.telefone = telefone;
        //Professor.add(professor);

    }
    public Professores()
    {

    }

    public int search_professor(java.util.ArrayList<Professores> Professor, String cpf)
    {
        int z, local = -1;
        for (z = 0; z < Professor.size(); z++) {
            if (Professor.get(z).getCpf().equals(cpf)) {
                local = z;
            }
        }
        return local;
    }

    public void printaprofessores(java.util.ArrayList<Professores> Professor)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o cpf do professor que você deseja ver os dados:");
        String cpf;
        Professores professor = new Professores();
        cpf = input.nextLine();
        System.out.println();
        int local = professor.search_professor(Professor, cpf);
        if (local != -1)
        {
            System.out.println("Nome: " + Professor.get(local).getNome());
            System.out.println("Idade: " + Professor.get(local).getIdade());
            System.out.println("Email: " + Professor.get(local).getEmail());
            System.out.println("Telefone: " + Professor.get(local).getTelefone());
            System.out.println("Cpf: " + Professor.get(local).getCpf());
            System.out.println("Salario: " + Professor.get(local).getSalario());
            System.out.println("Graducao: " + Professor.get(local).getGraduacao());
        }
        else
        {
            System.out.println("Professor não cadastrado ou número do CPF não encontrado");
        }
    }

    public void menu_editaprofessor(java.util.ArrayList<Professores> Professor)
    {
        Scanner input = new Scanner(System.in);
        String num_cpf;
        Professores professor = new Professores();
        System.out.println("Digite o numero do CPF do professor que você deseja editar:");
        num_cpf = input.nextLine();
        System.out.println();
        int local = professor.search_professor(Professor, num_cpf);
        System.out.println("Digite a opção que você deseja editar:");
        System.out.println("[1] - Idade");
        System.out.println("[2] - Telefone");
        System.out.println("[3] - E-mail");
        System.out.println("[4] - Salário");
        System.out.println("[5] - Graduação");
        int opcao = input.nextInt();
        System.out.println();
        input.nextLine();

        while (opcao != 0)
        {
            if (opcao == 1) {
                System.out.println("Digite a idade do professor:");
                Professor.get(local).setIdade(input.nextLine());
            } else if (opcao == 2) {
                System.out.println("Digite o telefone do professor:");
                Professor.get(local).setTelefone(input.nextLine());
            } else if (opcao == 3) {
                System.out.println("Digite o e-mail do professor:");
                Professor.get(local).setEmail(input.nextLine());
            } else if (opcao == 4) {
                System.out.println("Digite o salario do funcionario:");
                Professor.get(local).setSalario(input.nextLine());
            }else if (opcao == 5) {
                System.out.println("Digite a graduação do professor:");
                Professor.get(local).setGraduacao(input.nextLine());
            }
            System.out.println("Digite a opção que você deseja editar:");
            System.out.println("[0] - Sair");
            System.out.println("[1] - Idade");
            System.out.println("[2] - Telefone");
            System.out.println("[3] - E-mail");
            System.out.println("[4] - Salário");
            System.out.println("[5] - Graduação");
            opcao = input.nextInt();
            System.out.println();
        }
    }

    public void excluir_professor(java.util.ArrayList<Professores> Professor)
    {
        Scanner input = new Scanner(System.in);
        String num_cpf;
        Professores professor = new Professores();
        System.out.println("Digite o numero do CPF do professor que você deseja excluir:");
        num_cpf = input.nextLine();
        System.out.println();
        int local = professor.search_professor(Professor, num_cpf);

        if(local == -1)
        {
            System.out.println("professor não existe!");
        }
        else
        {
            System.out.println("Professor excluído com sucesso!");
            Professor.remove(local);
        }
        System.out.println();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

}

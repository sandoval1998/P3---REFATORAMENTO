package sistema_academico;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Funcionarios extends Pessoas {

    private String cpf;
    private String salario;
    private String profissao;

    Scanner input = new Scanner(System.in);

    public Funcionarios(String nome, String idade, String email, String telefone, String salario, String profissao, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.salario = salario;
        this.profissao = profissao;
        this.cpf = cpf;
        this.telefone = telefone;

    }

    public Funcionarios()
    {

    }

    public int search_funcionario(java.util.ArrayList<Funcionarios> Funcionario, String cpf) {
        int z, local = -1;
        for (z = 0; z < Funcionario.size(); z++) {
            if (Funcionario.get(z).getCpf().equals(cpf)) {
                local = z;
            }
        }
        return local;
    }

    public void printafuncionarios(java.util.ArrayList<Funcionarios> Funcionario)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero do CPF do funcionário:");
        String cpf;
        Funcionarios funcionario = new Funcionarios();
        cpf = input.nextLine();
        System.out.println();
        int local = funcionario.search_funcionario(Funcionario, cpf);
        if (local != -1)
        {
            System.out.println("Nome: " + Funcionario.get(local).getNome());
            System.out.println("Idade: " + Funcionario.get(local).getIdade());
            System.out.println("Email: " + Funcionario.get(local).getEmail());
            System.out.println("Telefone: " + Funcionario.get(local).getTelefone());
            System.out.println("CPF: " + Funcionario.get(local).getCpf());
            System.out.println("Salário: " + Funcionario.get(local).getSalario());
            System.out.println("Profissão: " + Funcionario.get(local).getProfissao());
        }
        else
        {
            System.out.println("Funcionário não cadastrado ou número de CPF não encontrado");
        }
    }



    public void menu_editafuncionario(java.util.ArrayList<Funcionarios> Funcionario)
    {
        Scanner input = new Scanner(System.in);
        String num_cpf;
        Funcionarios funcionario = new Funcionarios();
        System.out.println("Digite o numero do CPF do funcionário que você deseja editar:");
        num_cpf = input.nextLine();
        System.out.println();
        int local = funcionario.search_funcionario(Funcionario, num_cpf);

        if(local == -1)
        {
            System.out.println("Funcionário não cadastrado!");
        }
        else
            {
            System.out.println("Digite a opção que você deseja editar:");
            System.out.println("[1] - Idade");
            System.out.println("[2] - Telefone");
            System.out.println("[3] - E-mail");
            System.out.println("[4] - Salário");
            int opcao = input.nextInt();
            System.out.println();
            input.nextLine();

            while (opcao != 0) {
                if (opcao == 1) {
                    System.out.println("Digite a idade do funcionário:");
                    Funcionario.get(local).setIdade(input.nextLine());
                } else if (opcao == 2) {
                    System.out.println("Digite o telefone do funcionário:");
                    Funcionario.get(local).setTelefone(input.nextLine());
                } else if (opcao == 3) {
                    System.out.println("Digite o e-mail do funcionário:");
                    Funcionario.get(local).setEmail(input.nextLine());
                } else if (opcao == 4) {
                    System.out.println("Digite o salario do funcionario:");
                    Funcionario.get(local).setSalario(input.nextLine());
                }
                System.out.println("Digite a opção que você deseja editar:");
                System.out.println("[0] - Sair");
                System.out.println("[1] - Idade");
                System.out.println("[2] - Telefone");
                System.out.println("[3] - E-mail");
                System.out.println("[4] - Salário");
                opcao = input.nextInt();
                System.out.println();
            }
        }
    }

    public void excluir_funcionario(java.util.ArrayList<Funcionarios> Funcionario) {
        Scanner input = new Scanner(System.in);
        String num_cpf;
        Funcionarios funcionario = new Funcionarios();
        System.out.println("Digite o numero do CPF do funcionário que você deseja editar:");
        num_cpf = input.nextLine();
        System.out.println();
        int local = funcionario.search_funcionario(Funcionario, num_cpf);

        if(local == -1)
        {
            System.out.println("Funcionario não existe!");
        }
        else
        {
            System.out.println("Funcionario excluído com sucesso!");
            Funcionario.remove(local);
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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}

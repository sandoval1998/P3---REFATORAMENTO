package cadastros;

import sistema_academico.Funcionarios;
import sistema_academico.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroFuncionarios implements Cadastro {
    public static ArrayList<Funcionarios> Funcionario = new ArrayList();
    public void adicionar()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = TryCatch.readString();
        System.out.println();
        System.out.println("Digite a idade do funcionário:");
        String idade = TryCatch.readString();
        System.out.println("Digite o E-mail do funcionário:");
        String email = TryCatch.readString();
        System.out.println();
        System.out.println("Digite o salário do funcionário:");
        String salario = Double.toString(TryCatch.getSalario());
        System.out.println();
        System.out.println("Digite a profissão do funcionário:"); // **
        String profissao = TryCatch.readString();
        System.out.println();
        System.out.println("Digite o telefone do funcionário:");
        String telefone = TryCatch.readString();
        System.out.println();
        System.out.println("Digite o cpf do funcionário:");
        String cpf = TryCatch.readString();
        System.out.println();
        Funcionarios funcionario = new Funcionarios(nome,idade,email,telefone,salario,profissao,cpf);
        if (funcionario.search_funcionario(Funcionario, cpf) == -1) {
            Funcionario.add(funcionario);
        } else {
            System.out.println("O funcionário com os dados informados já está cadastrado! \n Por favor, tente novamente;\n");
        }
    }
}

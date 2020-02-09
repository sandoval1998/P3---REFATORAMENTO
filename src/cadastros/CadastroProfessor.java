package cadastros;

import sistema_academico.Professores;
import sistema_academico.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProfessor implements Cadastro {
    public static ArrayList<Professores> Professor = new ArrayList();
    public void adicionar()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do professor:");
        String nome = TryCatch.readString();
        System.out.println();
        System.out.println("Digite o CPF do professor:");
        String cpf = TryCatch.readString();
        System.out.println();
        System.out.println("Digite a idade do professor:");
        String idade = TryCatch.readString();
        System.out.println("Digite o E-mail do professor:");
        String email = TryCatch.readString();
        System.out.println();
        System.out.println("Digite o salário do professor:");
        String salario = Double.toString(TryCatch.getSalario());
        System.out.println();
        System.out.println("Digite a graduação do professor:"); // delimitar no try catch
        String graduacao = TryCatch.readString();
        System.out.println();
        System.out.println("Digite o telefone do professor:");
        String telefone = TryCatch.readString();
        System.out.println();
        Professores professor = new Professores(nome,cpf,idade,email,salario,graduacao,telefone);
        if (professor.search_professor(Professor, cpf) == -1) {
            Professor.add(professor);
        } else {
            System.out.println("O professor com os dados informados já está cadastrado! \n Por favor, tente novamente;\n");
        }
    }
}

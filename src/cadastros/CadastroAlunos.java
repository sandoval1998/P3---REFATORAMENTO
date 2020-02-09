package cadastros;

import sistema_academico.Alunos;
import java.util.*;
import java.util.ArrayList;
import sistema_academico.*;
public class CadastroAlunos implements Cadastro{
    public static ArrayList<Alunos> Aluno = new ArrayList();

    public void adicionar()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        //String nome = input.nextLine();
        String nome = TryCatch.readString();
        System.out.println();
        System.out.println("Digite o número de matricula do aluno:");
        String numero_matricula = TryCatch.readString();
        System.out.println();
        System.out.println("Digite a série do aluno:"); //colocar restricao de try/catch para min e max
        String serie_atual =TryCatch.readString();
        System.out.println();
        System.out.println("Digite a idade do aluno:");
        String idade = TryCatch.readString();
        System.out.println("Digite o E-mail do aluno:");
        String email = TryCatch.readString();
        System.out.println();
        System.out.println("Digite o coeficiente do aluno:"); //limitado de 0 a 10
        String coeficiente_aluno = Double.toString(TryCatch.getCoeficienteAluno()); //foi convertido o double para String.
        System.out.println();
        System.out.println("Digite a condição do aluno(aprovado ou reprovado):");
        String condicao_aluno = TryCatch.situacaoAluno().toLowerCase();
        System.out.println();
        System.out.println("Digite o telefone do aluno:");
        String telefone = TryCatch.readString();
        System.out.println();
        Alunos aluno = new Alunos(nome,idade,email, telefone,serie_atual,coeficiente_aluno, condicao_aluno,numero_matricula);
        if (aluno.search_aluno(Aluno, numero_matricula) == -1) {
            Aluno.add(aluno);
        } else {
            System.out.println("O aluno com os dados informados ja está cadastrado! \n Por favor, tente novamente;");
        }
    }
}

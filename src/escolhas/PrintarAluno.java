package escolhas;
import cadastros.CadastroAlunos;
import sistema_academico.*;

public class PrintarAluno  implements Escolha {

    public void executar()
    {
        Alunos aluno = new Alunos();
        aluno.printaalunos(CadastroAlunos.Aluno);
    }
}

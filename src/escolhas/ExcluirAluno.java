package escolhas;

import sistema_academico.Alunos;
import cadastros.*;

public class ExcluirAluno implements Escolha
{
    public void executar()
    {
        Alunos aluno = new Alunos();
        aluno.excluir_aluno(CadastroAlunos.Aluno);
    }
}

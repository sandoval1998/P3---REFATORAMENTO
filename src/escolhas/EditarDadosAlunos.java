package escolhas;

import sistema_academico.Alunos;
import cadastros.*;
public class EditarDadosAlunos implements Escolha  {
    public void executar()
    {
        Alunos aluno = new Alunos();
        aluno.menu_editaaluno(CadastroAlunos.Aluno);
    }
}

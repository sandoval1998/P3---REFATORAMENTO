package escolhas;

import cadastros.CadastroProfessor;
import sistema_academico.Professores;

public class ExcluirProfessor implements Escolha
{
    public void executar()
    {
        Professores professor = new Professores();
        professor.excluir_professor(CadastroProfessor.Professor);
    }
}

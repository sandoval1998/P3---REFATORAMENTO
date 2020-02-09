package escolhas;

import sistema_academico.Professores;
import cadastros.*;

public class EditarDadosProfessor implements Escolha {

    public void executar()
    {
        Professores professor = new Professores();
        professor.menu_editaprofessor(CadastroProfessor.Professor);
    }
}

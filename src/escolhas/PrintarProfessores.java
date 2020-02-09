package escolhas;

import cadastros.CadastroProfessor;
import sistema_academico.Professores;

public class PrintarProfessores implements Escolha{
    public void executar()
    {
        Professores professor = new Professores();
        professor.printaprofessores(CadastroProfessor.Professor);
    }
}

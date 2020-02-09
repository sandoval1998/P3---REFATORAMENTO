package escolhas;

import cadastros.CadastroRecursoFisico;
import sistema_academico.Recursos_fisicos;

public class PrintarRecursosFisicos implements Escolha {
    public void executar()
    {
        Recursos_fisicos recurso = new Recursos_fisicos();
        recurso.printarecursos(CadastroRecursoFisico.Recurso_fisico);
    }
}

package escolhas;

import cadastros.CadastroRecursoFisico;
import sistema_academico.Recursos_fisicos;

public class EditarDadosRF implements Escolha{
    public void executar()
    {
        Recursos_fisicos recurso_fisico = new Recursos_fisicos();
        recurso_fisico.menu_editarecurso(CadastroRecursoFisico.Recurso_fisico);
    }
}

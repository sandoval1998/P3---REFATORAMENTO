package cadastros;

import cadastros.Singleton.*;

public class SetCadastro{

    private static Cadastro slot;


    public static void setCadastro(int Command)
    {
        if(Command==1)
            slot = new CadastroAlunos();
        else if(Command==2)
            slot = new CadastroFuncionarios();
        else if(Command==3)
            slot = new CadastroProfessor();
        else if(Command==4)
            slot = new CadastroRecursoFisico();

        slot.adicionar();
    }
}


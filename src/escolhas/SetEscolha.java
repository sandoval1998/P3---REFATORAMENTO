package escolhas;

public class SetEscolha{

    private static Escolha slot;

    public static void setEscolha(int Command)
    {
        if(Command==5)
            slot = new Despesas();
        else if(Command==6)
            slot = new Eventos();
        else if(Command==7)
            slot = new PrintarProfessores();
        else if(Command==8)
            slot = new PrintarRecursosFisicos();
        else if(Command==9)
            slot =  new PrintarAluno();
        else if(Command==10)
            slot = new PrintarFuncionarios();
        else if(Command==11)
            slot = new PrintarDespesas();
        else if(Command==12)
            slot = new PrintarEventos();
        else if(Command==13)
            slot = new EditarDadosAlunos();
        else if(Command==14)
            slot = new EditarDadosFuncionarios();
        else if(Command==15)
            slot = new EditarDadosProfessor();
        else if(Command==16)
            slot = new EditarDadosRF();
        else if(Command==17)
            slot = new ExcluirEvento();
        else if(Command==18)
            slot = new ExcluirAluno();
        else if(Command==19)
            slot = new ExcluirFuncionario();
        else if(Command==20)
            slot = new ExcluirProfessor();

        slot.executar();
    }
}
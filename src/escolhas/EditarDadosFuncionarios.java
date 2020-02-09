package escolhas;

import cadastros.CadastroFuncionarios;
import sistema_academico.Funcionarios;

public class EditarDadosFuncionarios implements Escolha {
    public void executar()
    {
        Funcionarios funcionario = new Funcionarios();
        funcionario.menu_editafuncionario(CadastroFuncionarios.Funcionario);
    }
}

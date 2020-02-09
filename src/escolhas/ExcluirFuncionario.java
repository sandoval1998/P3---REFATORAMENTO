package escolhas;

import cadastros.CadastroFuncionarios;
import sistema_academico.Funcionarios;

public class ExcluirFuncionario implements Escolha
{
    public void executar()
    {
        Funcionarios funcionario = new Funcionarios();
        funcionario.excluir_funcionario(CadastroFuncionarios.Funcionario);
    }
}

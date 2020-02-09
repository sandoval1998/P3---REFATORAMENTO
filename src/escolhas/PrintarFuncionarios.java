package escolhas;

import cadastros.*;
import sistema_academico.Funcionarios;

public class PrintarFuncionarios implements Escolha{
    public void executar()
    {
        Funcionarios funcionario = new Funcionarios();
        funcionario.printafuncionarios(CadastroFuncionarios.Funcionario);
    }
}

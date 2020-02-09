package escolhas;

import sistema_academico.Despesas;

public class PrintarDespesas implements Escolha {
    public void executar()
    {
        sistema_academico.Despesas despesa = new Despesas();
        despesa.printadespesas(Despesas.Despesa);
    }
}

package escolhas;

import java.util.*;

public class Despesas implements Escolha{
    public void executar()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os valores das despesas correspondentes:");
        System.out.println("Digite a conta de energia:");
        float energia = input.nextFloat();
        System.out.println();
        System.out.println("Digite a conta de água:");
        float agua = input.nextFloat();
        System.out.println();
        System.out.println("Digite a conta de despesas de materiais escolares:");
        System.out.println();
        System.out.println("Materiais esportivos:");
        float mat_esportivos = input.nextFloat();
        System.out.println();
        System.out.println("Materiais didáticos");
        float mat_didaticos = input.nextFloat();
        System.out.println();
        System.out.println("Materiais de limpeza");
        float mat_limpeza = input.nextFloat();
        System.out.println();
        sistema_academico.Despesas despesa = new sistema_academico.Despesas(energia,agua,mat_esportivos,mat_didaticos,mat_limpeza);
        sistema_academico.Despesas.Despesa.add(despesa);
    }
}

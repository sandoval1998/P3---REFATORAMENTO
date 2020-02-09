package sistema_academico;

import java.util.Scanner;

import cadastros.*;

public class Menu_principal
{
    public static void main(String[] args)
    {


        sistema_academico.Texts.initial_text();
        Scanner input = new Scanner(System.in);
        int opcao = sistema_academico.TryCatch.initialInt();
        while(opcao != 0)
        {

            if(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 )
                SetCadastro.setCadastro(opcao);
            else if(opcao == 5 || opcao == 6 || opcao == 7 || opcao == 8 || opcao == 9 ||
                    opcao == 10 || opcao == 11 || opcao == 12 || opcao == 13 || opcao == 14||
                    opcao == 15 || opcao == 16 || opcao == 17 || opcao == 18 || opcao == 19 || opcao == 20)
            {

                escolhas.SetEscolha.setEscolha(opcao);
            }
            sistema_academico.Texts.initial_text();
            opcao = sistema_academico.TryCatch.initialInt();
        }
    }
}

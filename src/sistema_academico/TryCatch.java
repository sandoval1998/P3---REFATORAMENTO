package sistema_academico;

import java.util.*;
import java.lang.*;
public class TryCatch {

    public static int initialInt()
    {
        int intTry = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                intTry=0;
                flag = true;
                intTry = input.nextInt();
                if (intTry < 0 || intTry > 20)
                    throw new Exception();

            } catch (Exception e) {
                System.out.println("Por favor, coloque um valor inteiro válido dentro do intervalo");
                input.nextLine();
                flag = false;
            }
        }
        return intTry;
    }

    public static int initialInt_2()
    {
        int intTry = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                intTry=0;
                flag = true;
                intTry = input.nextInt();
                if (intTry < 0 || intTry > 100000)
                    throw new Exception();

            } catch (Exception e) {
                System.out.println("Por favor, coloque um valor inteiro válido dentro do intervalo");
                input.nextLine();
                flag = false;
            }
        }
        return intTry;
    }

    public static String readString()
    {
        String readTry = "";
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                readTry= "";
                flag = true;
                readTry = input.nextLine();
                if (readTry.equals(""))
                    throw new Exception();

            } catch (Exception e) {
                System.out.println("Campo vazio ! Digite novamente: ");
                flag = false;
            }
        }
        return readTry;
    }

    public static String situacaoAluno()
    {
        String readTry = "";
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                readTry= "";
                flag = true;
                readTry = input.nextLine();
                if (!readTry.equalsIgnoreCase("aprovado") && !readTry.equalsIgnoreCase(("reprovado")))
                    throw new Exception();

            } catch (Exception e) {
                System.out.println("Opção inválida ! Digite novamente: ");
                flag = false;
            }
        }
        return readTry;
    }

    public static double getCoeficienteAluno()
    {
        double doubleTry = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                doubleTry=0.0;
                flag = true;
                doubleTry = input.nextDouble();
                if (doubleTry < 0 || doubleTry > 10)
                    throw new Exception();

            } catch (Exception e) {

                System.out.println("Por favor, coloque um valor real válido dentro do intervalo de 0 a 10");
                input.nextLine();
                flag = false;
            }
        }
        return doubleTry;
    }

    public static double getSalario()
    {
        double doubleTry = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = false;

        while(!flag) {

            try {
                doubleTry=0.0;
                flag = true;
                doubleTry = input.nextDouble();
                if (doubleTry < 0)
                    throw new Exception();

            } catch (Exception e) {
                System.out.println("Por favor, coloque um valor real válido maior que zero! Digite novamente.");
                input.nextLine();
                flag = false;
            }
        }
        return doubleTry;
    }

}

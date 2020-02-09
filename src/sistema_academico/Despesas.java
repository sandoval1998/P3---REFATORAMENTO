package sistema_academico;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class Despesas
{
    public static ArrayList<Despesas> Despesa = new ArrayList<Despesas>();
    Scanner input = new Scanner(System.in);
    float energia;
    float agua;
    float mat_esportivos;
    float mat_didaticos;
    float mat_limpeza;

    public Despesas(float energia,float agua,float mat_esportivos,float mat_didaticos,float mat_limpeza)
    {
        this.energia = energia;
        this.agua = agua;
        this.mat_didaticos = mat_didaticos;
        this.mat_esportivos = mat_esportivos;
        this.mat_limpeza = mat_limpeza;

    }
    public Despesas()
    {

    }

    public int search_despesa(java.util.ArrayList<Despesas> Despesa)
    {
        int z, cont = 0;
        for (z = 1; z <= Despesa.size(); z++)
        {
            cont++;
        }
        return cont;
    }

    public void printadespesas(java.util.ArrayList<Despesas> Despesa)
    {
        Despesas despesa = new Despesas();
        int local = despesa.search_despesa(Despesa);

        if(!Despesa.isEmpty()) {
            System.out.println("Energia: " + Despesa.get(local - 1).getEnergia());
            System.out.println("Água: " + Despesa.get(local - 1).getAgua());
            System.out.println("Materiais esportivos: " + Despesa.get(local - 1).getMat_esportivos());
            System.out.println("Materiais didáticos: " + Despesa.get(local - 1).getMat_didaticos());
            System.out.println("Materiais limpeza: " + Despesa.get(local - 1).getMat_limpeza());
        }
        else
        {
            System.out.println("Ainda não existe dados sobre despesas!");
        }

    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public float getAgua() {
        return agua;
    }

    public void setAgua(float agua) {
        this.agua = agua;
    }

    public float getMat_esportivos() {
        return mat_esportivos;
    }

    public void setMat_esportivos(float mat_esportivos) {
        this.mat_esportivos = mat_esportivos;
    }

    public float getMat_didaticos() {
        return mat_didaticos;
    }

    public void setMat_didaticos(float mat_didaticos) {
        this.mat_didaticos = mat_didaticos;
    }

    public float getMat_limpeza() {
        return mat_limpeza;
    }

    public void setMat_limpeza(float mat_limpeza) {
        this.mat_limpeza = mat_limpeza;
    }


}

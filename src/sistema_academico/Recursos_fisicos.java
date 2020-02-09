package sistema_academico;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Recursos_fisicos
{
    public static ArrayList<Recursos_fisicos> Recurso_fisico = new ArrayList<Recursos_fisicos>();
    public String onibus;
    public int quan_onibus;
    public String quadra;
    public int quan_quadra;
    public String piscina;
    public int quan_piscina;
    public String sala_musica;
    public int quan_sala_musica;
    public String teatro;
    public int quan_teatro;
    public String biblioteca;
    public int quan_biblioteca;
    public String lanchonete;
    public int quan_lanchonete;

    Scanner input = new Scanner(System.in);

    private Recursos_fisicos(String onibus, int quan_onibus, String quadra, int quan_quadra, String piscina, int quan_piscina,
                            String sala_musica, int quan_sala_musica, String teatro, int quan_teatro, String biblioteca, int quan_biblioteca,
                            String lanchonete, int quan_lanchonete)
    {
        this.onibus = onibus;
        this.quan_onibus = quan_onibus;
        this.quadra = quadra;
        this.quan_quadra = quan_quadra;
        this.piscina = piscina;
        this.quan_piscina = quan_piscina;
        this.sala_musica = sala_musica;
        this.quan_sala_musica = quan_sala_musica;
        this.teatro = teatro;
        this.quan_teatro = quan_teatro;
        this.biblioteca = biblioteca;
        this.quan_biblioteca = quan_biblioteca;
        this.lanchonete = lanchonete;
        this.quan_lanchonete = quan_lanchonete;

    }

    public static class RecursosBuilder{
        public String onibus;
        public int quan_onibus;
        public String quadra;
        public int quan_quadra;
        public String piscina;
        public int quan_piscina;
        public String sala_musica;
        public int quan_sala_musica;
        public String teatro;
        public int quan_teatro;
        public String biblioteca;
        public int quan_biblioteca;
        public String lanchonete;
        public int quan_lanchonete;

        public RecursosBuilder(){

        }
        public RecursosBuilder onibus(String onibus)
        {
            this.onibus = onibus;
            return this;
        }
        public RecursosBuilder quan_onibus(int quan_onibus)
        {
            this.quan_onibus = quan_onibus;
            return this;
        }
        public RecursosBuilder quadra(String quadra)
        {
            this.quadra = quadra;
            return this;
        }
        public RecursosBuilder quan_quadra(int quan_quadra)
        {
            this.quan_quadra = quan_quadra;
            return this;
        }
        public RecursosBuilder piscina(String piscina)
        {
            this.piscina = piscina;
            return this;
        }
        public RecursosBuilder quan_piscina(int quan_piscina)
        {
            this.quan_piscina = quan_piscina;
            return this;
        }
        public RecursosBuilder sala_musica(String sala_musica)
        {
            this.sala_musica = sala_musica;
            return this;
        }
        public RecursosBuilder quan_sala_musica(int quan_sala_musica)
        {
            this.quan_sala_musica = quan_sala_musica;
            return this;
        }
        public RecursosBuilder teatro(String teatro)
        {
            this.teatro = teatro;
            return this;
        }
        public RecursosBuilder quan_teatro(int quan_teatro)
        {
            this.quan_teatro = quan_teatro;
            return this;
        }
        public RecursosBuilder biblioteca(String biblioteca)
        {
            this.biblioteca = biblioteca;
            return this;
        }
        public RecursosBuilder quan_biblioteca(int quan_biblioteca)
        {
            this.quan_biblioteca = quan_biblioteca;
            return this;
        }
        public RecursosBuilder lanchonete(String lanchonete)
        {
            this.lanchonete =lanchonete;
            return this;
        }
        public RecursosBuilder quan_lanchonete(int quan_lanchonete)
        {
            this.quan_lanchonete = quan_lanchonete;
            return this;
        }

        public Recursos_fisicos criarRecursos(){
            return new Recursos_fisicos(onibus,quan_onibus,quadra,quan_quadra, piscina,quan_piscina,sala_musica,quan_sala_musica,teatro,quan_teatro,biblioteca,quan_biblioteca,lanchonete,quan_lanchonete);

        }
    }

    public Recursos_fisicos()
    {

    }

    public int search_recurso(java.util.ArrayList<Recursos_fisicos> Recurso_fisico)
    {
        int z, local = -1;
        for (z = 0; z < Recurso_fisico.size(); z++) {
            if (Recurso_fisico.get(z).getOnibus().equals( "sim" ) || Recurso_fisico.get(z).getOnibus().equals( "SIM" ) ||
                    Recurso_fisico.get(z).getOnibus().equals( "nao" ) || Recurso_fisico.get(z).getOnibus().equals( "NAO" ))
            {
                local = z;
            }
        }
        //System.out.println(local);
        return local;
    }

    public int search_recurso_tam(java.util.ArrayList<Recursos_fisicos> Recurso_fisico)
    {
        int z, local = 0;
        for (z = 0; z < Recurso_fisico.size(); z++)
        {
            local++;
        }
        //System.out.println(local);
        return local;
    }

    public void printarecursos(java.util.ArrayList<Recursos_fisicos> Recurso_fisico)
    {
        //Recursos_fisicos recurso = new Recursos_fisicos();
        int local = 0; //= recurso.search_recurso(Recurso_fisico);

        if(!Recurso_fisico.isEmpty()) {
            System.out.println("Onibus: " + Recurso_fisico.get(local).getOnibus());
            System.out.println("quantidade ônibus: " + Recurso_fisico.get(local).getQuan_onibus());
            System.out.println("quadra: " + Recurso_fisico.get(local).getQuadra());
            System.out.println("quantidade quadra: " + Recurso_fisico.get(local).getQuan_quadra());
            System.out.println("piscina: " + Recurso_fisico.get(local).getPiscina());
            System.out.println("quantidade piscina: " + Recurso_fisico.get(local).getQuan_piscina());
            System.out.println("Sala de música: " + Recurso_fisico.get(local).getSala_musica());
            System.out.println("quantidade sala de música: " + Recurso_fisico.get(local).getQuan_sala_musica());
            System.out.println("teatro: " + Recurso_fisico.get(local).getTeatro());
            System.out.println("quantidade teatro: " + Recurso_fisico.get(local).getQuan_teatro());
            System.out.println("biblioteca: " + Recurso_fisico.get(local).getBiblioteca());
            System.out.println("quantidade biblioteca: " + Recurso_fisico.get(local).getQuan_biblioteca());
            System.out.println("lanchonete: " + Recurso_fisico.get(local).getLanchonete());
            System.out.println("Quantidade lanchonete: " + Recurso_fisico.get(local).getQuan_lanchonete());
        }
        else
        {
            System.out.println("Dados sobre recursos físicos inexistente!");
        }

    }
    public void menu_editarecurso(java.util.ArrayList<Recursos_fisicos> Recurso_fisico)
    {
        Scanner input = new Scanner(System.in);
        //Recursos_fisicos recurso_fisico = new Recursos_fisicos();
        sistema_academico.Texts.recursoTexto();

        int opcao = input.nextInt();
        input.nextLine();
        System.out.println();
        int local =0;


        while (opcao != 0)
        {
            if (opcao == 1)
            {
                System.out.println("Sim ou não");
                Recurso_fisico.get(local).setOnibus(input.nextLine());
            }
            else if(opcao == 2)
            {
                System.out.println("Digite a quantidade:");
                Recurso_fisico.get(local).setQuan_onibus(input.nextInt());
            }
            else if(opcao == 3)
            {
                System.out.println("Sim ou não");
                Recurso_fisico.get(local).setQuadra(input.nextLine());
            }
            else if(opcao == 4)
            {
                System.out.println("Digite a quantidade:");
                Recurso_fisico.get(local).setQuan_quadra(input.nextInt());
            }
            else if(opcao == 5)
            {
                System.out.println("Sim ou não");
                Recurso_fisico.get(local).setPiscina(input.nextLine());
            }
            else if(opcao == 6)
            {
                System.out.println("Digite a quantidade:");
                Recurso_fisico.get(local).setQuan_piscina(input.nextInt());
            }
            else if(opcao == 7)
            {
                System.out.println("Sim ou não");
                Recurso_fisico.get(local).setSala_musica(input.nextLine());
            }
            else if(opcao == 8)
            {
                System.out.println("Digite a quantidade:");
                Recurso_fisico.get(local).setQuan_sala_musica(input.nextInt());
            }
            else if(opcao == 9)
            {
                System.out.println("Sim ou não");
                Recurso_fisico.get(local).setTeatro(input.nextLine());
            }
            else if(opcao == 10)
            {
                System.out.println("Digite a quantidade:");
                Recurso_fisico.get(local).setQuan_teatro(input.nextInt());
            }
            else if(opcao == 11)
            {
                System.out.println("Sim ou não");
                Recurso_fisico.get(local).setBiblioteca(input.nextLine());
            }
            else if(opcao == 12)
            {
                System.out.println("Digite a quantidade:");
                Recurso_fisico.get(local).setQuan_biblioteca(input.nextInt());
            }
            else if(opcao == 13)
            {
                System.out.println("Sim ou não");
                Recurso_fisico.get(local).setLanchonete(input.nextLine());
            }
            else if(opcao == 14)
            {
                System.out.println("Digite a quantidade:");
                Recurso_fisico.get(local).setQuan_lanchonete(input.nextInt());
            }
            sistema_academico.Texts.recursoTexto();
            opcao = input.nextInt();
            System.out.println();
        }
    }
    public String getOnibus() {
        return onibus;
    }

    public void setOnibus(String onibus) {
        this.onibus = onibus;
    }

    public int getQuan_onibus() {
        return quan_onibus;
    }

    public void setQuan_onibus(int quan_onibus) {
        this.quan_onibus = quan_onibus;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public int getQuan_quadra() {
        return quan_quadra;
    }

    public void setQuan_quadra(int quan_quadra) {
        this.quan_quadra = quan_quadra;
    }

    public String getPiscina() {
        return piscina;
    }

    public void setPiscina(String piscina) {
        this.piscina = piscina;
    }

    public int getQuan_piscina() {
        return quan_piscina;
    }

    public void setQuan_piscina(int quan_piscina) {
        this.quan_piscina = quan_piscina;
    }

    public String getSala_musica() {
        return sala_musica;
    }

    public void setSala_musica(String sala_musica) {
        this.sala_musica = sala_musica;
    }

    public int getQuan_sala_musica() {
        return quan_sala_musica;
    }

    public void setQuan_sala_musica(int quan_sala_musica) {
        this.quan_sala_musica = quan_sala_musica;
    }

    public String getTeatro() {
        return teatro;
    }

    public void setTeatro(String teatro) {
        this.teatro = teatro;
    }

    public int getQuan_teatro() {
        return quan_teatro;
    }

    public void setQuan_teatro(int quan_teatro) {
        this.quan_teatro = quan_teatro;
    }

    public String getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(String biblioteca) {
        this.biblioteca = biblioteca;
    }

    public int getQuan_biblioteca() {
        return quan_biblioteca;
    }

    public void setQuan_biblioteca(int quan_biblioteca) {
        this.quan_biblioteca = quan_biblioteca;
    }

    public String getLanchonete() {
        return lanchonete;
    }

    public void setLanchonete(String lanchonete) {
        this.lanchonete = lanchonete;
    }

    public int getQuan_lanchonete() {
        return quan_lanchonete;
    }

    public void setQuan_lanchonete(int quan_lanchonete) {
        this.quan_lanchonete = quan_lanchonete;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    ArrayList<Recursos_fisicos> contruir_recursos_fisicos(Recursos_fisicos recurso, ArrayList<Recursos_fisicos> Recurso_fisico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

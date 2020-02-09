package sistema_academico;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Eventos
{
    public String nome;
    public String data;
    public static ArrayList<Eventos> Evento = new ArrayList<Eventos>();

    public Eventos(String nome, String data)
    {
        this.nome = nome;
        this.data = data;
    }

    public Eventos()
    {

    }

    public int search_evento(java.util.ArrayList<Eventos> Evento, String data_evento)
    {
        int z, local = -1;
        for (z = 0; z < Evento.size(); z++) {
            if (Evento.get(z).getData().equals(data_evento)) {
                local = z;
            }
        }
        return local;
    }

    public int search_evento_nome(java.util.ArrayList<Eventos> Evento, String nome_evento)
    {
        int z, local = -1;
        for (z = 0; z < Evento.size(); z++) {
            if (Evento.get(z).getNome().equals(nome_evento)) {
                local = z;
            }
        }
        return local;
    }

    public void printaeventos(java.util.ArrayList<Eventos> Evento)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Calendário de eventos:");

        Eventos evento = new Eventos();

        for (int z = 0; z < Evento.size(); z++)
        {
            System.out.println();
            System.out.println("Nome: " + Evento.get(z).getNome());
            System.out.println("Data: " + Evento.get(z).getData());
            System.out.println();
        }
    }
    public void apagarevento(java.util.ArrayList<Eventos> Evento)
    {
        Scanner input = new Scanner(System.in);
        Eventos evento = new Eventos();
        System.out.println("Digite o nome do evento que você quer excluir:");
        String nome_evento = input.nextLine();
        int local = evento.search_evento_nome(Evento, nome_evento);

        if(local == -1)
        {
            System.out.println("Evento não existe!");
        }
        else
        {
            System.out.println("Evento excluído com sucesso!");
            Evento.remove(local);
        }
        System.out.println();


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}

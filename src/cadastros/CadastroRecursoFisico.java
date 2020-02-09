package cadastros;

import sistema_academico.Recursos_fisicos;
import java.util.*;
import java.util.ArrayList;
import sistema_academico.*;

public class CadastroRecursoFisico implements Cadastro {
    public static ArrayList<Recursos_fisicos> Recurso_fisico = new ArrayList();

    public void adicionar()
    {
        int quan_onibus = 0;
        int quan_sala_musica = 0;
        int quan_quadra = 0;
        int quan_teatro = 0;
        int quan_piscina = 0;
        int quan_biblioteca = 0;
        int quan_lanchonete = 0;
        String onibus;
        Scanner input = new Scanner(System.in);

        System.out.println("       ------- Recursos fisicos -------");
        System.out.println(" -- Ônibus --");
        System.out.println("[sim] - EXISTE");
        System.out.println("[nao] - NÃO EXISTE");
        onibus = TryCatch.readString();
        if (onibus.equalsIgnoreCase("sim")) {
            System.out.println("Digite a quantidade de ônibus");
            quan_onibus = TryCatch.initialInt_2();
        }

        input.nextLine();
        System.out.println(" -- Quadras --");
        System.out.println("[sim] - EXISTE");
        System.out.println("[nao] - NÃO EXISTE");
        String quadra = TryCatch.readString();
        if (quadra.equalsIgnoreCase("sim")) {
            System.out.println("Digite a quantidade de Quadras");
            quan_quadra = TryCatch.initialInt_2();
        }

        input.nextLine();
        System.out.println(" -- Piscina --");
        System.out.println("[sim] - EXISTE");
        System.out.println("[nao] - NÃO EXISTE");
        String piscina = TryCatch.readString();
        if (piscina.equalsIgnoreCase("sim")) {
            System.out.println("Digite a quantidade de piscinas");
            quan_piscina = TryCatch.initialInt_2();
        }

        input.nextLine();
        System.out.println(" -- Sala de música --");
        System.out.println("[sim] - EXITE");
        System.out.println("[nao] - NÃO EXITE");
        String sala_musica = TryCatch.readString();
        if (sala_musica.equals("SIM") || sala_musica.equals("sim")) {
            System.out.println("Digite a quantidade de salas de músicas");
            quan_sala_musica = TryCatch.initialInt_2();
        }

        input.nextLine();
        System.out.println(" -- Teatro --");
        System.out.println("[sim] - EXITE");
        System.out.println("[nao] - NÃO EXITE");
        String teatro = TryCatch.readString();
        if (teatro.equals("SIM") || teatro.equals("sim")) {
            System.out.println("Digite a quantidade de teatros");
            quan_teatro = TryCatch.initialInt_2();
        }

        input.nextLine();
        System.out.println(" -- Biblioteca --");
        System.out.println("[sim] - EXITE");
        System.out.println("[nao] - NÃO EXITE");
        String biblioteca = TryCatch.readString();
        if (biblioteca.equals("SIM") || biblioteca.equals("sim")) {
            System.out.println("Digite a quantidade de bibliotecas");
            quan_biblioteca = TryCatch.initialInt_2();
        }

        input.nextLine();
        System.out.println(" -- Lanchonete --");
        System.out.println("[sim] - EXITE");
        System.out.println("[nao] - NÃO EXITE");
        String lanchonete = TryCatch.readString();
        if (lanchonete.equals("SIM") || lanchonete.equals("sim")) {
            System.out.println("Digite a quantidade de lanchonetes");
            quan_lanchonete = TryCatch.initialInt_2();
        }

        //Recursos_fisicos recurso = new Recursos_fisicos(onibus, quan_onibus, quadra, quan_quadra, piscina, quan_piscina, sala_musica, quan_sala_musica, teatro, quan_teatro, biblioteca, quan_biblioteca, lanchonete, quan_lanchonete);
        Recursos_fisicos recurso = new Recursos_fisicos.RecursosBuilder()
                .onibus(onibus)
                .quan_onibus(quan_onibus)
                .quadra(quadra)
                .quan_quadra(quan_quadra)
                .piscina(piscina)
                .quan_piscina(quan_piscina)
                .sala_musica(sala_musica)
                .quan_sala_musica(quan_sala_musica)
                .teatro(teatro)
                .quan_teatro(quan_teatro)
                .biblioteca(biblioteca)
                .quan_biblioteca(quan_biblioteca)
                .lanchonete(lanchonete)
                .quan_lanchonete(quan_lanchonete).criarRecursos();
        Recurso_fisico.add(recurso);
    }
}

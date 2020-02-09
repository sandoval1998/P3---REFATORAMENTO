package escolhas;

import java.util.*;

public class Eventos implements Escolha {
    public void executar()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos eventos estão previstos:");
        int quant_eventos = input.nextInt();
        input.nextLine();
        for(int i = 0; i < quant_eventos ; i++)
        {
            System.out.println();
            System.out.println("Digite o nome do evento:");
            String nome = input.nextLine();
            System.out.println("Digite a data do evento:");
            String data = input.nextLine();
            sistema_academico.Eventos evento = new sistema_academico.Eventos(nome,data);
            sistema_academico.Eventos.Evento.add(evento);
        }
    }
}

package escolhas;

import sistema_academico.Eventos;

public class PrintarEventos implements Escolha
{
    public void executar()
    {
        sistema_academico.Eventos evento = new Eventos();
        evento.printaeventos(Eventos.Evento);
    }
}

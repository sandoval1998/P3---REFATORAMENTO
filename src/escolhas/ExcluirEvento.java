package escolhas;

import sistema_academico.Eventos;

public class ExcluirEvento implements Escolha
{
    public void executar()
    {
        sistema_academico.Eventos evento = new Eventos();
        evento.apagarevento(Eventos.Evento);
    }
}

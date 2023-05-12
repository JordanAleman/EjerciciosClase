package Tema4InteraccionObjeto.Ejercicio1RelojDigital;


/**
 * La clase VisorReloj implementa un panel de un reloj digital para un reloj
 * estilo 24 horas europeo. El reloj muestra horas y minutos. El rango del reloj es
 * 00:00 (medianoche) a 23:59 (un minuto antes de medianoche)
 * 
 * El reloj recibe "ticks" (via método emitirTicReloj) cada minuto y recciona 
 * incrementando el visor. Esto se hace de la manera habitual: la hora se incrementa 
 * cuando los minutos alcanzan de nuevo el valor cero.
 */

public class VisorReloj  
{
    private VisorNumero horas;
    private VisorNumero minutos;
    private String visorString;    // simula el visor actual
    
    /* ------------------------------- Constructor ------------------------------ */
    public VisorReloj()
    {
        horas = new VisorNumero(24);
        minutos = new VisorNumero(60);
        actualizarReloj();
    }
     
    public VisorReloj(int hora, int minuto)
    {
        horas = new VisorNumero(24);
        minutos = new VisorNumero(60);
        ponerEnHora(hora, minuto);
    }

    
    public void emitirTic()
    {
        minutos.incrementar();
        if (minutos.getValor() == 0) 
		{  // se da la vuelta
            horas.incrementar();
        }
        actualizarReloj();
        printReloj();
    }

    /**
     * Pone la hora en el visor a un deternminado valor de hora y minuto
     */
    
    public void ponerEnHora(int hora, int minuto)
    {
        horas.setValor(hora);
        minutos.setValor(minuto);
        actualizarReloj();
    }

    /**
     * Devuelve la hora actual en el formato HH:MM.
     */
    public String getHora()
    {
        return visorString;
    }
    
    /**
     * Actualiza la cadena interna que representa el visor
     */
    private void actualizarReloj()
    {
        visorString = horas.getValorVisor() + ":" + 
                        minutos.getValorVisor();
    }
    
    public void printReloj()
    {
        System.out.print('\u000C');
        System.out.println(visorString);
    }
}

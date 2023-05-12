package Tema4InteraccionObjeto.EjerciciosTema4.Ejercicios1ºModular;

public class Dado {
    private int cara;

    /* ------------------------------- Constructor ------------------------------ */
    public Dado() {
        this.cara = 6;
    }
    
    /* --------------------------------- Getters -------------------------------- */
    public int getCara() {
        return cara;
    }
    
    /* --------------------------------- Setters -------------------------------- */
    public void setCara(int cara) {
        if (cara >= 1 && cara <= 6) {
            this.cara = cara;
        }
    }


    public int resultadoTiradaDado() {
        return (int)(Math.random() * cara) + 1;
    } 

    public void tirarDado() {
        System.out.println("El dado ha salido: " + resultadoTiradaDado());
    }

    public void tirarDadosXVeces(int cantidadVeces){
        int auxCont = 0;

        while (auxCont < cantidadVeces) {
            tirarDado();
            auxCont++;
        }
    }
    

    public void sumarXDados() {

    }

}

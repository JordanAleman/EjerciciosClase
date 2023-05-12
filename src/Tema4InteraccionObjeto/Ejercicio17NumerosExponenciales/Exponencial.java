package Tema4InteraccionObjeto.Ejercicio17NumerosExponenciales;

public class Exponencial {
    private int base;
    private int exponente;

    /* ------------------------------- Constructor ------------------------------ */
    public Exponencial(int base, int exponente) {
        this.base = base;
        this.exponente = exponente;
    }

    public Exponencial(Exponencial otroExponencial) {
        this.base = otroExponencial.getBase();
        this.exponente = otroExponencial.getExponente();
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getBase() {
        return base;
    }

    public int getExponente() {
        return exponente;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setBase(int base) {
        this.base = base;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return "Base: " + getBase()
        +"\nExponente: " + getExponente()
        +"\nValor exponencial: " + valorExponencial();
    }

    /* ---------------------------- ValorExponencial ---------------------------- */
    public double valorExponencial() {
        return potencia(base, exponente);
    }

    private double potencia(int base, int exponente) {
        double aux = 1.0;

        if (exponente == 0)
            return 1;

        if (exponente > 0) {
            for (int i = 0; i < exponente; i++)
                aux *= base;
        } else {
            for (int i = 0; i > exponente; i--)
                aux *= 1.0 / base;
        }

        return aux;
    }

    /* ------------------------- ExponencialMultiplicar ------------------------- */
    public Exponencial multiplicar(Exponencial otroExponencial) {
        if (base != otroExponencial.getBase())
            return null;
        return new Exponencial(base, exponente + otroExponencial.getExponente());
    }
    
    /* --------------------------- ExponencialDividir --------------------------- */
    public Exponencial dividir(Exponencial otroExponencial) {
        if (base != otroExponencial.getBase())
            return null;
        return new Exponencial(base, exponente - otroExponencial.getExponente());
    }

    /* ---------------------------- ExponencialElevar --------------------------- */
    public Exponencial elevar(int otroExponente) {
        return new Exponencial(base, exponente * otroExponente);
    }





}


public class Cartas {
    private int id;  //numero de carta 1-52
    private int numero; //numero de carata
    private int tipo;  //tipo de carta corazones etc

    public Cartas(int id, int numero, int tipo) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int     id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "C" + id + "1N1" + numero + "T" + tipo;
    }
   
    public static void main(String[] args) {
        Cartas  carta = new Cartas(1, 1, 1);
        System.out.println(carta.toString());
    }
    
}

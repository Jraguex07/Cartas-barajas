
import java.util.ArrayList;


public class Baraja {
    
    ArrayList<Cartas> baraja;

    public Baraja() {
        baraja = new ArrayList<>();
    }

    public ArrayList<Cartas> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Cartas> baraja) {
        this.baraja = baraja;
    }
    
    public void generarCarta(){
        int contador = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                baraja.add(new Cartas(contador++,i,j));              
            }           
        }
    }
    public void revolver(){
        Cartas cartas = null;
        for (int i = 0; i < baraja.size(); i++) {
            int ramdom =(int)( Math.random()*baraja.size());
            
            cartas= baraja.get(i);
            baraja.set(i, baraja.get(ramdom));
            baraja.set(ramdom, cartas);          
        } 
    }
    public static void main(String[] args) {
        Baraja b = new Baraja();
        b.generarCarta();
        b.revolver();
        System.out.println(b.getBaraja().toString());  
    }
}
  

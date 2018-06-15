

package lab08_angelt;

import java.util.ArrayList;


public class Carro {
    
    private ArrayList<Pieza> piezas = new ArrayList();

    public Carro() {
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
    }
    
    public void setPieza(Pieza pie){
        this.piezas.add(pie);
    }

    @Override
    public String toString() {
        return "Carro{" + "piezas=" + piezas + '}';
    }
    
    

}

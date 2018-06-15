

package lab08_angelt;

import java.util.ArrayList;


public class Parte {
    
    private String nombre;
    private ArrayList<Pieza> piezas = new ArrayList();

    public Parte() {
    }
    
    public Parte(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Pieza> getPieza() {
        return piezas;
    }

    public void setPieza(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
    }
    
    public void setPieza(Pieza pie){
        this.piezas.add(pie);
    }

    @Override
    public String toString() {
        return "Parte{" +" Nombre: "+nombre +" Piezas: " + piezas + '}';
    }
    
    

}

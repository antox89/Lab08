

package lab08_angelt;

import java.util.ArrayList;


public class Carro {
    
    private String nombre;
    private ArrayList<Pieza> piezas = new ArrayList();
    private ArrayList<Parte> partes = new ArrayList();

    public Carro() {
    }
    
    public Carro(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Parte> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Parte> partes) {
        this.partes = partes;
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
    
    public void setParte(Parte par){
        this.partes.add(par);
    }

    @Override
    public String toString() {
        return "Carro"+" nombre: "+nombre + "piezas=" + piezas + " partes: "+partes+'}';
    }
    
    

}

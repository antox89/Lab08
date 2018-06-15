

package lab08_angelt;


public class Pieza {
    
    private String nombre, material;
    private int tiempoElabo;

    public Pieza() {
    }

    public Pieza(String nombre, String material, int tiempoElabo) {
        this.nombre = nombre;
        this.material = material;
        this.tiempoElabo = tiempoElabo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTiempoElabo() {
        return tiempoElabo;
    }

    public void setTiempoElabo(int tiempoElabo) {
        this.tiempoElabo = tiempoElabo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

}

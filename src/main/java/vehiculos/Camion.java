package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;
    private static int cantidadCamiones = 0;

    public Camion(String placa, String nombre, double precio, double peso, Fabricante fabricante, int ejes) { 
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante); this.ejes = ejes; cantidadCamiones++; 
    }

    //Setters 

    public void setEjes(int ejes) { 
        this.ejes = ejes; 
    } 

    public static void setCantidadCamiones(int cantidad) {
        cantidadCamiones = cantidad; 
    }

    //Getters
    public int getEjes() { 
        return ejes; 
    } 
    
    public static int getCantidadCamiones() { 
        return cantidadCamiones; 
    }
}

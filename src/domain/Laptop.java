package domain;

public class Laptop {
    public final int idLaptops;
    public String marca;
    public String modelo;
    public int memoria;
    public double precio;
    public static int contadorLaptops;

    public Laptop() {
        this.idLaptops = ++Laptop.contadorLaptops;
    }

    public Laptop(String marca, String modelo, int memoria, double precio) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorLaptops() {
        return contadorLaptops;
    }

    @Override
    public String toString() {
        return "idLaptop=" + idLaptops + ", marca=" + marca + ", modelo=" + modelo + ", memoria=" + memoria + ", precio=" + precio;
    }

   
    
    
}

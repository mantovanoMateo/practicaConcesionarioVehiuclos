package Models;

public abstract class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private Double consumoCombustible;
    private Integer cantidadDeRuedas;
    private Double precio;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo, Double consumoCombustible, Integer cantidadDeRuedas, Double precio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.consumoCombustible = consumoCombustible;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getConsumoCombustible() {
        return consumoCombustible;
    }

    public Integer getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setConsumoCombustible(Double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public void setCantidadDeRuedas(Integer cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumoCombustible='" + consumoCombustible + '\'' +
                ", cantidadDeRuedas=" + cantidadDeRuedas +
                ", precio=" + precio +
                '}';
    }
}

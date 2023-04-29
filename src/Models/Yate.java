package Models;

public class Yate {
    private final Integer precio=100;
    private static Integer id=0;
    private Integer idYate;
    private Integer eslora;
    private Integer manga;
    private String modelo;

    public Yate() {
    }

    public Yate(Integer eslora, Integer manga, String modelo) {
        this.idYate = id;
        id++;
        this.eslora = eslora;
        this.manga = manga;
        this.modelo = modelo;
    }

    //region Getters
    public Integer getPrecio() {
        return precio;
    }

    public Integer getIdYate() {
        return idYate;
    }

    public Integer getEslora() {
        return eslora;
    }

    public Integer getManga() {
        return manga;
    }

    public String getModelo() {
        return modelo;
    }

    //endregion

    //region Setters
    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public void setManga(Integer manga) {
        this.manga = manga;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //endregion
}

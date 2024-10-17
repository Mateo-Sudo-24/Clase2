public class Zapato {
    String modelo;
    String marca;
    String tipo;
    String color;
    int talla;

    public Zapato(String modelo, String marca, String tipo, String color, int talla) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.talla = talla;
    }

    public Zapato() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
}

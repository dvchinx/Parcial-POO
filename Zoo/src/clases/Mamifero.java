package clases;

public class Mamifero extends Animal {
    protected String tipoPelo;

    // Constructor
    public Mamifero(int id, String nombre, String especie, int edad, String tipoPelo) {
        super(id, nombre, especie, edad);
        this.tipoPelo = tipoPelo;
    }

    // Método
    public void amamantar() {
        System.out.println(getNombre() + " esta amamantando.");
    }

    // Getter y Setter
    public String getTipoPelo() { return tipoPelo; }
    public void setTipoPelo(String tipoPelo) { this.tipoPelo = tipoPelo; }
}


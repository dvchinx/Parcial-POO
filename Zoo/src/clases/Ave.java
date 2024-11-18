package clases;

public class Ave extends Animal {
    protected String tipoPlumas;

    // Constructor
    public Ave(int id, String nombre, String especie, int edad, String tipoPlumas) {
        super(id, nombre, especie, edad);
        this.tipoPlumas = tipoPlumas;
    }

    // Método
    public void volar() {
        System.out.println(getNombre() + " esta volando.");
    }

    // Getter y Setter
    public String getTipoPlumas() { return tipoPlumas; }
    public void setTipoPlumas(String tipoPlumas) { this.tipoPlumas = tipoPlumas; }
}

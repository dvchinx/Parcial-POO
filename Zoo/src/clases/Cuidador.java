package clases;

public class Cuidador {
    private int id;
    private String nombre;
    private int experiencia;

    // Constructor
    public Cuidador(int id, String nombre, int experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.experiencia = experiencia;
    }

    // Métodos
    public void alimentar(Animal animal) {
        System.out.println(nombre + " esta alimentando a " + animal.getNombre());
    }

    public void asignarHabitat(Habitat habitat) {
        System.out.println(nombre + " esta asignado al habitat " + habitat.getNombre());
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getExperiencia() { return experiencia; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }
}


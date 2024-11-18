package clases;

public class Veterinario {
    private int id;
    private String nombre;
    private String especialidad;

    // Constructor
    public Veterinario(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Métodos
    public String revisarAnimal(Animal animal) {
        return "El veterinario " + nombre + " está revisando a " + animal.getNombre();
    }

    public void curarAnimal(Animal animal) {
        System.out.println("El veterinario " + nombre + " está curando a " + animal.getNombre());
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}

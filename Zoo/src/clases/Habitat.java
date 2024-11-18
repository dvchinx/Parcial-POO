package clases;

import java.util.ArrayList;
import java.util.List;

public class Habitat {
    private int id;
    private String nombre;
    private String tipoClima;
    private int capacidad;
    private List<Animal> animales;

    // Constructor
    public Habitat(int id, String nombre, String tipoClima, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.tipoClima = tipoClima;
        this.capacidad = capacidad;
        this.animales = new ArrayList<>();
    }

    // Métodos
    public void agregarAnimal(Animal animal) {
        if (animales.size() < capacidad) {
            animales.add(animal);
            System.out.println(animal.getNombre() + " ha sido agregado al habitat " + nombre);
        } else {
            System.out.println("El habitat está lleno.");
        }
    }

    public List<Animal> listarAnimales() {
        return animales;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipoClima() { return tipoClima; }
    public void setTipoClima(String tipoClima) { this.tipoClima = tipoClima; }
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
}

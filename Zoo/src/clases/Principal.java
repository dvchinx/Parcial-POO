package clases;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información del Zoológico
        System.out.println("Ingrese el nombre del zoologico: ");
        String nombreZoologico = scanner.nextLine();
        
        System.out.println("Ingrese la ubicacion del zoologico: ");
        String ubicacionZoologico = scanner.nextLine();

        Zoologico zoologico = new Zoologico(nombreZoologico, ubicacionZoologico);

        // Solicitar información de los Hábitats
        System.out.println("Ingrese el nombre del habitat: ");
        String nombreHabitat = scanner.nextLine();
        
        System.out.println("Ingrese el tipo de clima del habitat: ");
        String tipoClimaHabitat = scanner.nextLine();
        
        System.out.println("Ingrese la capacidad del habitat: ");
        int capacidadHabitat = Integer.parseInt(scanner.nextLine());
        
        Habitat habitat = new Habitat(1, nombreHabitat, tipoClimaHabitat, capacidadHabitat);
        zoologico.agregarHabitat(habitat);

        // Solicitar información de un Animal
        System.out.println("Ingrese el nombre del animal: ");
        String nombreAnimal = scanner.nextLine();
        
        System.out.println("Ingrese la especie del animal: ");
        String especieAnimal = scanner.nextLine();
        
        System.out.println("Ingrese la edad del animal: ");
        int edadAnimal = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el tipo de animal (1 - Mamifero, 2 - Ave): ");
        int tipoAnimal = Integer.parseInt(scanner.nextLine());

        Animal animal = null;
        if (tipoAnimal == 1) {
            System.out.println("Ingrese el tipo de pelo del mamifero: ");
            String tipoPelo = scanner.nextLine();
            animal = new Mamifero(1, nombreAnimal, especieAnimal, edadAnimal, tipoPelo);
        } else if (tipoAnimal == 2) {
            System.out.println("Ingrese el tipo de plumas del ave: ");
            String tipoPlumas = scanner.nextLine();
            animal = new Ave(1, nombreAnimal, especieAnimal, edadAnimal, tipoPlumas);
        }

        habitat.agregarAnimal(animal);

        // Solicitar información del Cuidador
        System.out.println("Ingrese el nombre del cuidador: ");
        String nombreCuidador = scanner.nextLine();
        
        System.out.println("Ingrese los anios de experiencia del cuidador: ");
        int experienciaCuidador = Integer.parseInt(scanner.nextLine());

        Cuidador cuidador = new Cuidador(1, nombreCuidador, experienciaCuidador);

        // Asignar el cuidador al hábitat
        cuidador.asignarHabitat(habitat);

        // Solicitar información del Veterinario
        System.out.println("Ingrese el nombre del veterinario: ");
        String nombreVeterinario = scanner.nextLine();
        
        System.out.println("Ingrese la especialidad del veterinario: ");
        String especialidadVeterinario = scanner.nextLine();

        Veterinario veterinario = new Veterinario(1, nombreVeterinario, especialidadVeterinario);

        // Mostrar la información ingresada
        System.out.println("\nInformacion del Zoologico:");
        System.out.println("Nombre: " + zoologico.getNombre());
        System.out.println("Ubicacion: " + zoologico.getUbicacion());

        System.out.println("\nHabitats del Zoologico:");
        System.out.println("Nombre: " + habitat.getNombre());
        System.out.println("Tipo de clima: " + habitat.getTipoClima());
        System.out.println("Capacidad: " + habitat.getCapacidad());
        System.out.println("Animales en el habitat:");
        
        for (Animal a : habitat.listarAnimales()) {
            System.out.println(" - " + a.getNombre() + " (" + a.getEspecie() + ")");
        }

        System.out.println("\nCuidador asignado al habitat:");
        System.out.println("Nombre: " + cuidador.getNombre());
        System.out.println("Anios de experiencia: " + cuidador.getExperiencia());

        System.out.println("\nVeterinario asignado:");
        System.out.println("Nombre: " + veterinario.getNombre());
        System.out.println("Especialidad: " + veterinario.getEspecialidad());

        scanner.close();
    }
}


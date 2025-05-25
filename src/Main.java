import Util.JsonUtiles;
import ejercicio1y2.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Lucas", 'M', "11223344", 30);

        // Guardar como JSON
        JsonUtiles.guardarComoJson("persona.json", persona);

        // Leer JSON y volver a objeto
        Persona personaLeida = JsonUtiles.leerDesdeJson("persona.json", Persona.class);
        System.out.println("Nombre: " + personaLeida.getNombre());
        System.out.println("Edad: " + personaLeida.getEdad());

    }

}
package ejercicio3;

import ejercicio1y2.Persona;
import Util.*;

public class MainEj3 {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso 1", "123456");
        Persona p1 = new Persona("Lucas", 'M', "11223344", 18);
        Persona p2 = new Persona("Julieta", 'F', "11313414", 20);

        curso.addPersona(p1);
        curso.addPersona(p2);

        JsonUtiles.guardarComoJson("personas.json", curso);

        Curso leerCurso = JsonUtiles.leerDesdeJson("personas.json", Curso.class);
        System.out.println(leerCurso);


    }
}

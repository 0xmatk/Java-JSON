package ejercicio3;

import ejercicio1y2.Persona;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombreCurso;
    private String codigo;
    private List<Persona> personas;


    public Curso(String nombreCurso, String codigo) {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
        this.personas = new ArrayList<Persona>();
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void addPersona(Persona persona) {
        this.personas.add(persona);
    }

    public void removePersona(Persona persona) {
        this.personas.remove(persona);
    }


    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", codigo='" + codigo + '\'' +
                ", personas=" + personas +
                '}';
    }
}

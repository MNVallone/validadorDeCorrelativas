package usuarios;

import lombok.Getter;
import lombok.Setter;
import materias.Inscripcion;
import materias.Materia;

import java.util.*;

public class Alumno {
    @Setter
    @Getter
    private String nombre;
    public List<Inscripcion> inscripciones;
    @Getter
    public Set<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.inscripciones = new ArrayList<>();
        this.materiasAprobadas = new HashSet<>();
    }

    public List<Inscripcion> getInscripciones(){
        return this.inscripciones;
    }

    public void agregarMaterias(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public void inscribirseA(List<Materia> materias){
        Inscripcion nuevaInscripcion = new Inscripcion();
        nuevaInscripcion.gestionarSolicitud(materias, this);
        this.inscripciones.add(nuevaInscripcion);
    }

}

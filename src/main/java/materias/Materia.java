package materias;

import usuarios.Alumno;

import java.util.HashSet;
import java.util.Set;

public class Materia {
    public String nombre;
    public Set<Materia> correlativasNecesarias;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativasNecesarias = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getCorrelativasNecesarias() {
        return correlativasNecesarias;
    }

    public void setCorrelativasNecesarias(Set<Materia> correlativasNecesarias) {
        this.correlativasNecesarias = correlativasNecesarias;
    }

    public Boolean puedeCursar(Alumno alumno){
        if (this.correlativasNecesarias == null){
            return true;
        }
        Set<Materia> materiasAprobadas = alumno.getMateriasAprobadas();
        return materiasAprobadas.containsAll(this.correlativasNecesarias);
    }
}

package materias;

import usuarios.Alumno;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Inscripcion {
    private Integer id;
    private Boolean estado;

    public Inscripcion() {
        Random random = new Random();
        this.id = random.nextInt(2000);
        this.estado = false;
    }

    public void gestionarSolicitud(List<Materia> materias, Alumno alumno){
        estado = !materias
                .stream()
                .map(materia -> materia.puedeCursar(alumno))
                .collect(Collectors.toSet()).contains(false);
    }

    public Boolean aprobada(){
        return estado;
    }

}

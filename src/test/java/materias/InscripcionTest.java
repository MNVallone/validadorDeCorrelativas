package materias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import usuarios.Alumno;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName("La solicitud se gestiona correctamente con una o más correlativas")
    void gestionarSolicitud() {
        Materia nuevaMateria = new Materia("Ingles 2");
        Materia primeraCorrelativa = new Materia("Ingles 1");
        Materia segundaCorrelativa = new Materia("Arquitectura de computadoras");
        nuevaMateria.correlativasNecesarias.add(primeraCorrelativa);
        nuevaMateria.correlativasNecesarias.add(segundaCorrelativa);

        Alumno unAlumno = new Alumno("jose");
        unAlumno.agregarMaterias(primeraCorrelativa);
        unAlumno.agregarMaterias(segundaCorrelativa);

        List<Materia> listaMaterias = new ArrayList<>();
        listaMaterias.add(nuevaMateria);

        unAlumno.inscribirseA(listaMaterias);

        Assertions.assertTrue(unAlumno.getInscripciones().get(0).aprobada());
    }

    @Test
    @DisplayName("La solicitud se gestiona correctamente sin correlativas")
    void gestionarSolicitudSinCorrelativas() {
        Materia nuevaMateria = new Materia("Ingles 2");

        Alumno unAlumno = new Alumno("jose");

        List<Materia> listaMaterias = new ArrayList<>();
        listaMaterias.add(nuevaMateria);

        unAlumno.inscribirseA(listaMaterias);

        Assertions.assertTrue(unAlumno.getInscripciones().get(0).aprobada());
    }
}
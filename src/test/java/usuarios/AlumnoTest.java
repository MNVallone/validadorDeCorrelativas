package usuarios;

import materias.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    @DisplayName("Las materias se actualizan correctamente")
    void agregarMaterias() {
        Alumno unAlumno = new Alumno("jose");

        Materia unaMateria = new Materia("Ingles 1");

        unAlumno.agregarMaterias(unaMateria);

        Assertions.assertTrue(unAlumno.getMateriasAprobadas().contains(unaMateria));
    }

    @Test
    @DisplayName("Las inscripciones se realizan correctamente")
    void inscribirseA() {
        Alumno unAlumno = new Alumno("jose");

        Materia unaMateria = new Materia("Ingles 1");

        List<Materia> listaMaterias = new ArrayList<>();
        listaMaterias.add(unaMateria);

        unAlumno.inscribirseA(listaMaterias);
        assertEquals(1,unAlumno.getInscripciones().size());
    }
}
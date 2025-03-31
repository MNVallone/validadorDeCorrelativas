package materias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import usuarios.Alumno;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {

    @Test
    @DisplayName("Las correlativas se actualizan correctamente")
    void getCorrelativasNecesarias() {
        Materia nuevaMateria = new Materia("Ingles 2");
        Materia otraMateria = new Materia("Ingles 1");
        nuevaMateria.correlativasNecesarias.add(otraMateria);

        Assertions.assertTrue(nuevaMateria.getCorrelativasNecesarias().contains(otraMateria));
    }

    @Test
    @DisplayName("El alumno puede cursar la materia sin correlativas")
    void puedeCursarSinCorrelativas() {
        Materia nuevaMateria = new Materia("Ingles 2");
        Materia otraMateria = new Materia("Ingles 1");

        Alumno unAlumno = new Alumno("jose");
        unAlumno.agregarMaterias(otraMateria);

        Assertions.assertTrue(nuevaMateria.puedeCursar(unAlumno));
    }

    @Test
    @DisplayName("El alumno puede cursar la materia con correlativas")
    void puedeCursarConCorrelativas() {
        Materia nuevaMateria = new Materia("Ingles 2");
        Materia otraMateria = new Materia("Ingles 1");
        nuevaMateria.correlativasNecesarias.add(otraMateria);

        Alumno unAlumno = new Alumno("jose");
        unAlumno.agregarMaterias(otraMateria);

        Assertions.assertTrue(nuevaMateria.puedeCursar(unAlumno));
    }
}
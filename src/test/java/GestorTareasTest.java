
// GestorTareasTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorTareasTest {

@Test
public void testAgregarTarea() {
GestorTareas gestor = new GestorTareas();
gestor.agregarTarea("Estudiar");
assertEquals(1, gestor.contarTareas()); // PASA: corregido en contarTareas()
}

@Test
public void testContarCompletadas() {
GestorTareas gestor = new GestorTareas();
gestor.agregarTarea("Tarea 1");
gestor.agregarTarea("Tarea 2");
gestor.completarTarea(0);
assertEquals(1, gestor.contarCompletadas()); // PASA
}

@Test
public void testCompletarTareaFueraDeRango() {
GestorTareas gestor = new GestorTareas();
// Verifica que un indice fuera de rango no lance excepcion
assertDoesNotThrow(() -> gestor.completarTarea(5));
}


@Test
public void testCompletarTareaFueraDeRangoNoAlteraCompletadas() {
    GestorTareas gestor = new GestorTareas();
    gestor.agregarTarea("Tarea 1");
    gestor.completarTarea(5);
    gestor.completarTarea(-1);
    assertEquals(0, gestor.contarCompletadas());
}
}

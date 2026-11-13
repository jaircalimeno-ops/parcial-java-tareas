
// GestorTareasTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorTareasTest {

@Test
public void testAgregarTarea() {
GestorTareas gestor = new GestorTareas();
gestor.agregarTarea("Estudiar");
assertEquals(1, gestor.contarTareas()); // FALLA: contarTareas retorna 2
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
    assertThrows(IndexOutOfBoundsException.class, () -> gestor.completarTarea(5));
}

@Test
public void testCompletarTareaIndiceNegativo() {
    GestorTareas gestor = new GestorTareas();
    gestor.agregarTarea("Tarea 1");
    assertThrows(IndexOutOfBoundsException.class, () -> gestor.completarTarea(-1));
}

@Test
public void testContarTareasVacio() {
    GestorTareas gestor = new GestorTareas();
    assertEquals(0, gestor.contarTareas());
}
}

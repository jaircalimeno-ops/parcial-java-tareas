
// GestorTareasTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorTareasTest {

@Test
public void testAgregarTarea() {
GestorTareas gestor = new GestorTareas();
gestor.agregarTarea("Estudiar");
assertEquals(1, gestor.contarTareas());
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
gestor.agregarTarea("Estudiar");
assertThrows(IndexOutOfBoundsException.class, () -> gestor.completarTarea(-1));
}

@Test
public void testContarTareasVacio() {
assertEquals(0, new GestorTareas().contarTareas());
}

@Test
public void testCompletarTareaMarcaSoloLaIndicada() {
GestorTareas gestor = new GestorTareas();
gestor.agregarTarea("A");
gestor.agregarTarea("B");
gestor.completarTarea(1);
assertFalse(gestor.getTareas().get(0).isCompletada());
assertTrue(gestor.getTareas().get(1).isCompletada());
}
}

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
// FALTA: prueba de índice fuera de rango
assertDoesNotThrow(() -> gestor.completarTarea(5));

@Test
public void testDescompletarTarea() {
    GestorTareas gestor = new GestorTareas();
    gestor.agregarTarea("Tarea de prueba");
    gestor.completarTarea(0);
    gestor.getTareas().get(0).descompletar();
    assertFalse(gestor.getTareas().get(0).isCompletada());
}


}
}

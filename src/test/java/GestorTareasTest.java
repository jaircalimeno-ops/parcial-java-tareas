
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
    gestor.agregarTarea("Estudiar");
    
    // Verificamos que al intentar completar un índice fuera de rango (ej. 5 o -1),
    // el sistema maneje el límite sin lanzar excepciones descontroladas
    assertDoesNotThrow(() -> gestor.completarTarea(5));
}
}
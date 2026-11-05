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
        assertEquals(1, gestor.contarCompletadas());
    }

    @Test
    public void testCompletarTareaFueraDeRango() {
        GestorTareas gestor = new GestorTareas();
        assertDoesNotThrow(() -> gestor.completarTarea(5));
    }

    @Test
    public void testCompletarTareaConIndiceNegativoNoCompletaNada() {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea("Tarea 1");
        gestor.completarTarea(-1);
        assertEquals(0, gestor.contarCompletadas());
    }
}
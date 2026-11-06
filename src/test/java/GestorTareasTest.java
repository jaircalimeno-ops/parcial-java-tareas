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
        gestor.agregarTarea("Tarea 1");
        assertDoesNotThrow(() -> gestor.completarTarea(5));
        assertEquals(0, gestor.contarCompletadas());
    }

    // ---- Pruebas nuevas ----

    @Test
    public void testCompletarTareaIndiceNegativo() {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea("Tarea 1");
        assertDoesNotThrow(() -> gestor.completarTarea(-1));
        assertEquals(0, gestor.contarCompletadas());
    }

    @Test
    public void testGestorVacio() {
        GestorTareas gestor = new GestorTareas();
        assertEquals(0, gestor.contarTareas());
        assertEquals(0, gestor.contarCompletadas());
    }

    @Test
    public void testDescompletarTarea() {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea("Tarea 1");
        gestor.completarTarea(0);
        gestor.getTareas().get(0).descompletar();
        assertFalse(gestor.getTareas().get(0).isCompletada());
        assertEquals(0, gestor.contarCompletadas());
    }

    @Test
    public void testTareaNuevaNoEstaCompletada() {
        Tarea t = new Tarea("Nueva");
        assertEquals("Nueva", t.getTitulo());
        assertFalse(t.isCompletada());
    }
}
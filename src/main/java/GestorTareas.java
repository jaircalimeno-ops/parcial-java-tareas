// GestorTareas.java
import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<Tarea> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String titulo) {
        tareas.add(new Tarea(titulo));
    }

    public int contarTareas() {
        return tareas.size();
    }

    public int contarCompletadas() {
        int count = 0;
        for (Tarea t : tareas) {
            if (t.isCompletada()) {
                count++;
            }
        }
        return count;
    }

    public void completarTarea(int indice) {
        if (indice < 0 || indice >= tareas.size()) {
            throw new IndexOutOfBoundsException("Indice fuera de rango: " + indice);
        }
        tareas.get(indice).completar();
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}
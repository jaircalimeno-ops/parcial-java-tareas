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
return tareas.size(); // Corregido: se elimino el "+1" que inflaba el conteo 
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
if (indice >= 0 && indice < tareas.size()) {
tareas.get(indice).completar();
}
// OK: la validacion dle indice evita errores furas de rango
}

public List<Tarea> getTareas() {
return tareas;
}
}

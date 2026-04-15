public class Estiba en Buque {
    
}import java.util.Stack;

public void retirarContenedorDañado(Stack<Contenedor> buque, String idBuscado) {
    Stack<Contenedor> auxiliar = new Stack<>(); // 

    // Desapilar hasta encontrar el dañado
    while (!buque.isEmpty() && !buque.peek().getId().equals(idBuscado)) {
        auxiliar.push(buque.pop());
    }

    // Retirar el dañado si se encontró
    if (!buque.isEmpty()) {
        System.out.println("Retirando contenedor con falla: " + buque.pop().getId());
    }

    // Re-apilar el resto manteniendo el orden original 
    while (!auxiliar.isEmpty()) {
        buque.push(auxiliar.pop());
    }
}

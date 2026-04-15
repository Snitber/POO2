public class PatiodeAlmacenamiento {
    
}
public void ubicarEnPatio(Contenedor[][] patio, Contenedor c) {
    boolean ubicado = false;
    for (int i = 0; i < patio.length; i++) {
        for (int j = 0; j < patio[i].length; j++) {
            if (patio[i][j] == null) { // 
                patio[i][j] = c;
                ubicado = true;
                break;
            }
        }
        if (ubicado) break;
    }
    if (!ubicado) System.out.println("¡Alerta: Puerto Saturado!"); // [cite: 21]
}

/**
 *
 * @author Steve
 */


import java.util.ArrayList;
import java.util.Scanner;

public class LogicaFiltro {

    public void ejecutar() {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<Integer> filtrados = new ArrayList<>();
        ArrayList<Integer> resultado = new ArrayList<>();
        // 1. Llenar IDs del 1 al 20
        for (int i = 1; i <= 20; i++) {
            ids.add(i);
        }
        // 2. Pedir datos
        System.out.print("Elige familia (PAR o IMPAR): ");
        String tipo = sc.nextLine().toUpperCase();

        System.out.print("Ingresa número para múltiplos: ");
        int multiplo = sc.nextInt();
        // 3. Filtrar por paridad
        for (int id : ids) {
            if (tipo.equals("PAR") && id % 2 == 0) {
                filtrados.add(id);
            } else if (tipo.equals("IMPAR") && id % 2 != 0) {
                filtrados.add(id);
            }
        }
        // 4. Filtrar por múltiplos
        for (int id : filtrados) {
            if (id % multiplo == 0) {
                resultado.add(id);
            }
        }
        // 5. Mostrar resultados
        System.out.println("\nIDs originales: " + ids);
        System.out.println("Filtrados por " + tipo + ": " + filtrados);
        System.out.println("Múltiplos de " + multiplo + ": " + resultado);
    }
}

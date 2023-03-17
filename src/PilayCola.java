import java.util.InputMismatchException;
import java.util.Scanner;

public class PilayCola {
    public static void main(String[] args) {

        System.out.println("Menu para crear pilas o colas");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese que TDA quiere crear, 1 pila o 2 cola: ");
        try {
            int opc = sc.nextInt();
            System.out.println();
            if(opc == 1){

                Pila pila = new Pila();
                System.out.println("Pila creada con exito!!");
                boolean cont = true;
                while (cont){
                    System.out.println("Ingrese la opcion que quiera realizar: \n" +
                            "0.-Salir\n" +
                            "1.-Agregar elemento\n" +
                            "2.-Eliminar elemento\n" +
                            "3.-Pila Vacia?\n" +
                            "4.-Cima de la pila\n" +
                            "5.-Eliminar pila\n" +
                            "6.-Imprimir pila");
                    int opcion = sc.nextInt();
                    switch (opcion) {
                        case 0:
                            cont = false;
                            break;
                        case 1:
                            System.out.println("Ingrese el elemento a agregar: ");
                            int elem = sc.nextInt();
                            pila.push(elem);
                            System.out.println("Elemento agregado con exito");
                            break;
                        case 2:
                            int deleted = (int)pila.pop();
                            System.out.println("El elemento " + deleted + "ha sido eliminado con exito");
                            break;
                        case 3:
                            System.out.println("La pila " + (pila.isEmpty() ? "esta vacia": "no esta vacia"));
                            break;
                        case 4:
                            System.out.println(pila.cima.elemento);
                            break;
                        case 5:
                            pila.cleanStack();
                            System.out.println("La pila ha sido eliminada exitosamente");
                        case 6:
                            System.out.println(pila);
                            break;
                        default:
                            System.out.println("Ingrese un valor valido del 1 al 6.");
                            break;
                    }
                    System.out.println();
                }
            } else if (opc == 2){
                Cola cola = new Cola();
                System.out.println("Cola creada con exito");
                boolean cont = true;
                while (cont){
                    System.out.println("Ingrese la opcion que quiera realizar: \n" +
                            "0.-Salir\n" +
                            "1.-Agregar elemento\n" +
                            "2.-Eliminar elemento\n" +
                            "3.-Cola Vacia?\n" +
                            "4.-Inicio de la cola\n" +
                            "5.-Eliminar cola\n" +
                            "6.Imprimir cola");
                    int opcion = sc.nextInt();
                    switch (opcion) {
                        case 0:
                            cont = false;
                            break;
                        case 1:
                            System.out.println("Ingrese el elemento a agregar: ");
                            int elem = sc.nextInt();
                            cola.push(elem);
                            System.out.println("Elemento agregado con exito");
                            break;
                        case 2:
                            int deleted = (int)cola.pop();
                            System.out.println("El elemento " + deleted + "ha sido eliminado con exito");
                            break;
                        case 3:
                            System.out.println("La cola " + (cola.isEmpty() ? "esta vacia": "no esta vacia"));
                            break;
                        case 4:
                            System.out.println(cola.inicio.elemento);
                            break;
                        case 5:
                            cola.cleanCola();
                            System.out.println("La pila ha sido eliminada exitosamente");
                        case 6:
                            System.out.println(cola);
                            break;
                        default:
                            System.out.println("Ingrese un valor valido del 1 al 6.");
                            break;
                    }
                    System.out.println();
                }
            } else { throw new Exception("Ingrese un numero valido, 1 o 2");}

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

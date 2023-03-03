import java.util.Scanner;
public class Main {

    public static Scanner dato = new Scanner(System.in);
    public static Scanner datoString = new Scanner(System.in);
    public static void main(String[] args) {
        int opc;
        do{
            opc=menu();
            switch(opc){
                case 1:
                    //agregarElemento();
                    break;
                case 2:
                    //eliminarElemento();
                    break;
                case 3:
                    //modificarElemento();
                    break;
                case 4:
                    //insertarElemento();
                    break;
                case 5:
                    //obtenerValor();
                    break;
                case 6:
                    //tamanoArreglo();
                    break;
                case 7:
                    //limpiarArreglo();
                    break;
                case 8:
                    //imprimirArreglo();
                    break;
                case 9:
                    System.out.println("...bye!");
                    break;
                default:
                    System.out.println("...opción no valida!");
                    break;
            }

        }while(opc!=9);
    }

    public static int menu(){
        System.out.println("MENU MI ARRAYLIST");
        System.out.println("1. Agregar 1 elemento");
        System.out.println("2. Eliminar elemento");
        System.out.println("3. Modificar elemento");
        System.out.println("4. Insertar elemento");
        System.out.println("5. Obtener un valor");
        System.out.println("6. Obtener el tamaño de la estructura");
        System.out.println("7. Limpiar MiArreglo");
        System.out.println("8. Imprimir MiArreglo");
        System.out.println("9. Salir");
        System.out.println("Teclee su opcion");
        return dato.nextInt();
    }
}

import java.util.Scanner;
public class Main {

    public static Scanner dato = new Scanner(System.in);
    public static Scanner datoString = new Scanner(System.in);
    public static ArrayListPersonalizada<Integer> miArrayList = new ArrayListPersonalizada<>();
    public static void main(String[] args) {
        int opc, pos, valor;
        do{
            opc=menu();
            switch(opc){
                case 1:
                    System.out.println("Introduce un nuevo elemento:");
                    valor = dato.nextInt();
                    miArrayList.agregarElemento(valor);
                    break;
                case 2:
                    System.out.println("Introduce la posicion:");
                    pos = dato.nextInt();
                    miArrayList.eliminarElemento(pos);
                    break;
                case 3:
                    System.out.println("Introduce la posicion:");
                    pos = dato.nextInt();
                    System.out.println("Introduce el nuevo valor:");
                    valor = dato.nextInt();
                    miArrayList.modificarElemento(pos, valor);
                    break;
                case 4:
                    System.out.println("Introduce la posicion:");
                    pos = dato.nextInt();
                    System.out.println("Introduce el nuevo valor:");
                    valor = dato.nextInt();
                    miArrayList.insertarElemento(pos,valor);
                    break;
                case 5:
                    System.out.println("Introduce la posicion:");
                    pos = dato.nextInt();
                    System.out.println(miArrayList.obtenerValor(pos));
                    break;
                case 6:
                    System.out.println("El tamaño del arreglo:");
                    System.out.println(miArrayList.tamanoArreglo());
                    break;
                case 7:
                    miArrayList.limpiarArreglo();
                    System.out.println("El arreglo ha sido limpiado");
                    System.out.println("Tamaño actual de "+miArrayList.tamanoArreglo());
                    break;
                case 8:
                    System.out.println("Arreglo:");
                    System.out.println(miArrayList);
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

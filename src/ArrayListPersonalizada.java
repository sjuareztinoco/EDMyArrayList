import java.util.Arrays;

public class ArrayListPersonalizada<T>{
    private static int CAPACIDAD_INICIAL = 5;
    private static final Object[] ARREGLO_VACIO = {};
    private Object[] arreglo;

    private int numeroElementos;

    public ArrayListPersonalizada() {
        this.arreglo = ARREGLO_VACIO;
    }

    /*
        Implementar los siguientes métodos:
        -Agregar elemento
        -Eliminar elemento a partir de un índice
        -Modificar el elemento de un índice
        -Insertar elemento en una posición dada
        -Obtener un valor mediante su índice
        -Obtener el "tamaño" del arreglo (número de elementos)
        -Método toString() para cuando se imprima la lista
        -Limpiar (eliminar todos los elementos)

        NOTA: Puede crear otros métodos para dividir
        el trabajo si así lo desea, pero no deben ser
        accesibles por los objetos de esta clase.
     */

    public void agregarElemento(T elemento) {
        if (this.arreglo.length == 0) {
            this.arreglo = new Object[CAPACIDAD_INICIAL];
        } else if (this.arreglo.length == this.numeroElementos) {
            this.crecer();
        }
        this.arreglo[this.numeroElementos] = elemento;
        this.numeroElementos++;
    }

    public void insertarElemento(int pos, T elemento) {
        if (this.esPosicionInvalida(pos)) {
            throw new IndexOutOfBoundsException("La posición se sale de la estructura");
        }
        if (this.numeroElementos == this.arreglo.length) {
            this.crecer();
        }
        recorrer(pos,this.numeroElementos - 1, elemento);
        this.numeroElementos++;
    }

    public T eliminarElemento(int pos) {
        T elementoEliminado;
        if(this.esPosicionInvalida(pos)) {
            throw new IndexOutOfBoundsException("La posición se sale de la estructura");
        }
        elementoEliminado = (T) this.arreglo[pos];
        this.retraer(pos, this.numeroElementos);
        this.numeroElementos--;
        if(this.esReducible()) {
            this.arreglo = Arrays.copyOf(this.arreglo, this.numeroElementos);
        }
        return elementoEliminado;
    }

    public void modificarElemento(int pos, T elemento) {
        if (this.esPosicionInvalida(pos)) {
            throw new IndexOutOfBoundsException("La posición se sale de la estructura");
        }
        this.arreglo[pos] = elemento;
    }

    public T obtenerValor(int pos) {
        if (this.esPosicionInvalida(pos)) {
            throw new IndexOutOfBoundsException("La posición se sale de la estructura");
        }
        return (T) this.arreglo[pos];
    }

    public int tamanoArreglo() {
        return numeroElementos;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(this.arreglo, this.numeroElementos))
                + " actualCapacity = " + this.arreglo.length;
    }

    public void limpiarArreglo() {
        this.arreglo = ARREGLO_VACIO;
        this.numeroElementos = 0;
    }

    private void crecer() {
        this.arreglo = Arrays.copyOf(this.arreglo, this.arreglo.length + CAPACIDAD_INICIAL);
    }

    private boolean esReducible() {
        return this.numeroElementos + CAPACIDAD_INICIAL <= this.arreglo.length;
    }

    private void recorrer(int inicio, int fin, T elemento) {
        for (int i = fin; i >= inicio; i--) {
            this.arreglo[i + 1] = this.arreglo[i];
        }
        this.arreglo[inicio] = elemento;
    }

    private void retraer(int inicio, int fin) {
        for (int i = inicio; i < fin - 1; i++) {
            this.arreglo[i] = this.arreglo[i + 1];
        }
    }

    private boolean esPosicionInvalida(int pos) {
        return pos >= this.numeroElementos || pos < 0;
    }
}

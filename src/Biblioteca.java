import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Biblioteca {
    private String nombre;
    //private List<Libro> libros;

    public Biblioteca(String nombre){
        this.nombre = nombre;
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public List<Libro> listarLibros(){
        return libros;
    }

    List<Libro> libros = new List<Libro>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Libro> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Libro libro) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Libro> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Libro> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Libro get(int index) {
            return null;
        }

        @Override
        public Libro set(int index, Libro element) {
            return null;
        }

        @Override
        public void add(int index, Libro element) {

        }

        @Override
        public Libro remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Libro> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Libro> listIterator(int index) {
            return null;
        }

        @Override
        public List<Libro> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

}

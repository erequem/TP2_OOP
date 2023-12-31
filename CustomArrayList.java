import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int initialCapacity) {
        elements = new Object[initialCapacity];
    }

    public void add(T item) {
        ensureCapacity();
        elements[size] = item;
        size++;
        System.out.println("Item added successfully");
    }

    public void add(int index, T item) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = item;
        size++;
        System.out.println("Item added successfully");
    }

    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return (T) elements[index];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T item) {
        return Arrays.asList(elements).contains(item);
    }

    public int indexOf(T item) {
        return Arrays.asList(elements).indexOf(item);
    }

    public void remove(T item) {
        int index = indexOf(item);
        if (index == -1) {
            throw new IllegalArgumentException("Item not found");
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        System.out.println("Item removed successfully");
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    public static void main(String[] args) {
        CustomArrayList<String> listA = new CustomArrayList<>();
        listA.add("apple");
        listA.add("banana");
        listA.add("cherry");

        CustomArrayList<Integer> listB = new CustomArrayList<>(20);
        listB.add(5);
        listB.add(6);

        System.out.println("Size of listA: " + listA.getSize());
        System.out.println("Size of listB: " + listB.getSize());
        System.out.println("'banana' in listA? " + listA.contains("banana"));
        System.out.println("'8' in listB? " + listB.contains(8));
        System.out.println("Index of 'banana' in listA: " + listA.indexOf("banana"));
        System.out.println("Index of '7' in listB: " + listB.indexOf(7));
        System.out.println("listB is empty? " + listB.isEmpty());
        listB.remove(6);
        listB.remove(5);
        System.out.println("listB is empty now? " + listB.isEmpty());
    }
}

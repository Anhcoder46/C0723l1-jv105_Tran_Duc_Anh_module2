package mylistt;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IndexOutOfBoundsException("index err "+ capacity);
        }
        elements = new Object[capacity];
    }
    //tăng kích thước mảng lên 2 lần
    private void ensureCapacity(int minCapacity) {
        int newSize = minCapacity * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //thêm 1 element vào list
    public boolean add(E e) {
        if (size == elements.length) {
            return false;
        }
        elements[size++] = e;
        return true;
    }
    // lấy ra phần tử element theo vị trí index
    public E get(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        return (E)elements[index];
    }

    // xoá tất cả các phần tử trong list
    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    // thêm e vào list ở vị trí index
    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(size);
        }
        if (index >= size) {
            elements[size++] = element;
        } else if (index <= 0) {
            size++;
            for (int i = size; i > 0; i--) {
                elements[i] = elements[i - 1];
            }
            elements[0] = element;
        }else {
            size++;
            for (int i = size; i >= index ; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
        }
    }
    // xoá phần tử ở vị trí index trong list
    public E remove (int index) {
        Object temp = elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E)temp;
    }
    // in tất cả các phần tử có trong list
    public void getAll() {
        System.out.println(elements[0] + " " + size);
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
    // lấy ra số lượng phần tử có trong list
    public int size() {
        return size;
    }
    // copy ra 1 mảng mới
    public E clone() {
        Object listNew = Arrays.copyOf(elements, size);
        return (E)listNew;
    }

    //kiểm tra element có tồn tại trong list không
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e == elements[i]) {
                return true;
            }
        }
        return false;
    }
    // lấy vị trí của e trong list
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    public void printList() {
    }
}
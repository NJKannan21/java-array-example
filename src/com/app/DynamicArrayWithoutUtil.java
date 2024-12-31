package com.app;

import java.util.Arrays;

class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    // Constructor
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        size = 0;
    }

    // Add element
    public void add(int element) {
        if (size == capacity) {
            resize();
        }
        array[size++] = element;
    }

    // Resize array
    private void resize() {
        capacity = capacity * 2; // Double the capacity
        array = Arrays.copyOf(array, capacity);
    }

    // Get element at index
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    // Get size
    public int size() {
        return size;
    }

    // Print array
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class DynamicArrayWithoutUtil {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(2);

        dynamicArray.add(5);
        dynamicArray.add(10);
        dynamicArray.add(15); // Triggers resize

        System.out.println("Element at index 1: " + dynamicArray.get(1));

        System.out.print("Array Elements: ");
        dynamicArray.printArray();

        System.out.println("Array Size: " + dynamicArray.size());
    }
}




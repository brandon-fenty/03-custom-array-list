import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @org.junit.jupiter.api.Test
    void add() {
        System.out.println("---- Tests for the add() method ----");

        MyArrayList arr = new MyArrayList();

        int val = 36;

        String result = (Arrays.toString(arr.add(val)));
        String expected = Arrays.toString(new int[] {36, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result) ;
    }

    // Tests for the add at index method

    @org.junit.jupiter.api.Test
    void addAtIndex() {
        System.out.println("---- Tests for the add() at index method ----");

        MyArrayList arr = new MyArrayList();

        int val = 36;
        int index = 4;

        String result = Arrays.toString(arr.addAtIndex(val, index));
        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 36, 0, 0, 0, 0, 0});
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    // Tests for the remove value method

    @org.junit.jupiter.api.Test
    void removeValue() {
        System.out.println("---- Tests for the removeValue() method ----");

        MyArrayList arr = new MyArrayList();
        arr.add(24);
        arr.add(15);
        System.out.println("Input: " + Arrays.toString(arr.add(36)));

        int val = 36;

        String result = (Arrays.toString(arr.removeValue(val)));
        String expected = Arrays.toString(new int[] {24, 15, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    // Tests for the remove at index method

    @org.junit.jupiter.api.Test
    void removeAtIndex() {
        System.out.println("---- Tests for the removeAtIndex() method ----");

        MyArrayList arr = new MyArrayList();

        int val = 36;
        int index = 8;
        arr.addAtIndex(val, index);

        String result = (Arrays.toString(arr.removeAtIndex(val, index)));
        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    // Tests for the size method

    @org.junit.jupiter.api.Test
    void emptySize() {
        System.out.println(" ---- Tests for the size() method ----");

        MyArrayList arr = new MyArrayList();

        int result = arr.size();
        int expected = 0;

        System.out.println("Expected: " + expected + " -- Actual: " + result);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void size() {
        System.out.println(" ---- Tests for the size() method ----");

        MyArrayList arr = new MyArrayList();
        System.out.println(Arrays.toString(arr.add(5)));

        int result = arr.size();
        int expected = 1;

        System.out.println("Expected: " + expected + " -- Actual: " + result);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void size2() {

        MyArrayList arr = new MyArrayList();
        arr.add(5);
        arr.add(10);
        System.out.println(Arrays.toString(arr.add(99)));

        int result = arr.size();
        int expected = 3;

        System.out.println("Expected: " + expected + " -- Actual: " + result);
        assertEquals(expected, result);
    }


    // Tests for the get method

    @org.junit.jupiter.api.Test
    void get() {
        System.out.println("---- Tests for the get() method ----");

        MyArrayList arr = new MyArrayList();
        int val = 69;
        arr.add(val);

        int result = arr.get(0);
        int expected = 69;
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result) ;
    }

    @org.junit.jupiter.api.Test
    void get2() {
        System.out.println("---- Tests for the get() method ----");

        MyArrayList arr = new MyArrayList();
        arr.addAtIndex(12, 3);

        int result = arr.get(3);
        int expected = 12;
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result) ;
    }
}
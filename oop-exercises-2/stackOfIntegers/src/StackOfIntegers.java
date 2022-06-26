public class StackOfIntegers {

    private int[] elements;
    private int size;
    public static int DEFAULT_CAPACITY = 16;


    public StackOfIntegers() {

        this(DEFAULT_CAPACITY); // referred constructor parametrized constructor because of this constructor has not parameter.

    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];

    }

    public void push(int value) {

        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length); // copying elements array to temp array
            // ( ** System.arraycopy() method ** )
            elements = temp;
        }
        elements[size++] = value;

    }

    // return and remove the top element from the stack
    public int pop() {
        return elements[--size];
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean empty() {

        return size == 0; // returns if size == 0

    }

    public int getSize() {
        return size;
    }

}

package generic.zadanie1;

public class MyIntegerStack {

    private static final int STACK_SIZE = 10;
    private int elementIndex;
    private Integer[] elements = new Integer[STACK_SIZE];

    public void push(Integer newElement) throws Exception {
        if (elementIndex < STACK_SIZE) {
            elements[elementIndex] = newElement;
            elementIndex++;
        } else {
            throw new Exception("Przepelniony stos");
        }
    }

    public Integer pop() throws Exception {
        if (elementIndex == 0) {
            throw new Exception();
        } else {
            elementIndex--;
        }
        return elements[elementIndex];
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }
}

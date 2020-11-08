package generic.zadanie1;

import generic.Employee;

public class MyEmployeeStack {

    private static final int STACK_SIZE = 10;
    private int elementIndex;
    private Employee[] elements = new Employee[STACK_SIZE];

    public void push(Employee newElement) throws Exception {
        if (elementIndex < STACK_SIZE) {
            elements[elementIndex] = newElement;
            elementIndex++;
        } else {
            throw new Exception("Przepelniony stos");
        }
    }

    public Employee pop() throws Exception {
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

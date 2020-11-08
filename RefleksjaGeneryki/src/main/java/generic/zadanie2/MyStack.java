package generic.zadanie2;

// Jak zwuważliście klasy MyEmployeeStack, MyIntegerStack i MyStringStack są praktycznie indentycznie, więc żeby nie powtarzeć kodu
// używamy typu ogólnego (generycznego)

// T to nazwa parametru który traktujemy jak dowolny typ
public class MyStack<T> {

    private static final int STACK_SIZE = 10;


    private int elementIndex;
    // typ parametryczny ma obraniczenia
    // pierwsze z nich to to że nie możeby tworzyć talibcy obiektów typu parametrycznego
    // zatem
    // T[] elements = new T[STACK_SIZE];
    // jest niedozwolone

    //dlatego stosumeny Object ponieważ wszystko w Javie jest obiektem (oprócz typów prostych) to zawsze możemy zrobić
    //Object ob = new DowolnyInnyObiekt();

    private Object[] elements = new Object[STACK_SIZE];

    //drugie ograniczenie to to nie że możemy tworzyć zmiennych statycznych tego tyou zatem
    // static T zmienna
    // również jest niedozwolone



    public void push(T newElement) throws Exception {
        if (elementIndex < STACK_SIZE) {
            elements[elementIndex] = newElement;
            elementIndex++;
        } else {
            throw new Exception("Przepelniony stos");
        }
    }

    public T pop() throws Exception {
        if (elementIndex == 0) {
            throw new Exception();
        } else {
            elementIndex--;
        }
        //Trzecie ograniczenie to brak możeliwości tworzenia obiektów klasy parametrycznego zatem nie możemy zrobić
        // T zmienna = new T();
        // ale !!! możeby rzutować i to wykorzystujemy
        // poniważ chcemy żeby nasza metoda zwracała (zwykle) coś innego niż object więc robimy rzutowanie
        //w pamięci w tablicy znajduje się to co tam włożyliśmy w metodzie push więc tam tak naprawdę jest String lub Employee lub Integer i tak dalej
        // więc możemy takie rzutowanie wykonać i nie będzie wyjątku
        return (T) elements[elementIndex];
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }
}

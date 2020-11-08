package generic.zadanie3;


//W zadaniu drugim za typ T mogliśmy podczas tworzenia obiektu Stosu podać dowolny typ
//Możemy dodać pewne ograniczenie które zawęzą nam tą możliwość np. mogę wszystko co spełnia dany interfejs
//Ogranicza mnie to z jednej strony ale z drugiej strony pozwala mi ożystac z metod interfejsu do którego jestem ograniczony
// tak jak w linijce 20  --->  int comparationResult = value1.compareTo(value2);
// mamy tu coś za coś, nie mogę podać dowolnego typu ale to oraniczenie daje mi pewność, że to co włożę spełnia ten interfejs więć mogę skorzystać z metody interfejsu
public class MinMax<T extends Comparable> {

    T value1;
    T value2;

    public MinMax(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getMin() {
        int comparationResult = value1.compareTo(value2);
        if(comparationResult >= 0) {
            return value2;
        }
        return value1;
    }

    public T getMax() {
        int comparationResult = value1.compareTo(value2);
        if(comparationResult >= 0) {
            return value1;
        }
        return value2;
    }
}

package reflection.zadanie1;

/*Zadanie 1
        Napisać dowolną klasę która ma dowlne 3-4 pola - proste i obiektowe.
        Stworzyć w tej klasie dowlne 3-4 metody jakies proste które coś tam obliczają.
        Stworzyć w tej klasie 2 konstruktory, bezargumentowy i argumentowy.
        W osobnym pliku zdefiniować adnotację która się nazywa "SuperMethod" która przyjmuje paramets "run" który jest true albo false.
        Dowolną metodę w wcześniej stworzonej klasie opatrzeć adnotacją SuperMethod i dać mu parameter "run" na true;
*/

// Klasa emplyee, nie na w niej nic szczegolnego: polace, konstruktory, genery i setery
public class Employee {

    private int age;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Dodana adnotacja którą stworzyliśmyrzyliśmy
    @SuperMethod(run = true)
    public void metoda() {

    }
}

package reflection.zadanie2;

import reflection.zadanie1.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*     ZADANIA 2
        Napisać kod może być w mainie, może być też w osobnej metodzie który:
        Wypiszę na podstawie poprzedniej klasy:
        - nazwkę klasy,
        - ile ma konstruktoryów,
        - ile ma metod
        - typy zsracame przez metody
        - nazwy wrzyskich metod.
        - nazwy wszystkich pół
        - typy dla poszczególnych pól.
        Oczywiście ma to robić w sposób dynamiczyny tj. jeśli zmienię którą z tych rzeczy w klasie to bez zamiany kod ma działać
        skorzystać z mechanizmu refleksji (np. klasa "Class" */

public class Main {

    public static void main(String[] args) {

        Class employeeClass = Employee.class;
        // - nazwkę klasy
        System.out.println("Naza klasy:");
        System.out.println(employeeClass.getSimpleName());

        Constructor[] constructors = employeeClass.getConstructors();
        //- ile ma konstruktoryów
        System.out.println("Liczba konstruktorow");
        System.out.println(constructors.length);

        //- ile ma metod
        Method[] methods = employeeClass.getDeclaredMethods();
        System.out.println("Liczba metod");
        System.out.println(methods.length);

        // - typy zsracame przez metody
        // - nazwy wrzyskich metod.
        System.out.println("Nazwa metody i zwracany typ");
        for (Method method : methods) {
            System.out.println("Nazwa: " + method.getName());
            System.out.println("Typ zwracany: " + method.getReturnType().getSimpleName());
        }

        Field[] declaredField = employeeClass.getDeclaredFields();
        for (Field field : declaredField) {
            System.out.println("Nazwa pola: " + field.getName());
            System.out.println("Typ pola: " + field.getType().getSimpleName());
        }
    }

}

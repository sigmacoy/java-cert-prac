package sample_problems.strings.custom_sort_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Jelian", 20),
                new Person("Macoy", 21),
                new Person("Cloudy", 5)
        };
        Arrays.sort(people); // SORTED BY AGE (implemented sa compareTo method)
        System.out.println(Arrays.toString(people));
//        [Cloudy(5), Jelian(20), Macoy(21)]
    }
}

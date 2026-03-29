package sample_problems.strings.custom_sort_1;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;  // Sort by age
    }

    public String toString() {
        return name + "(" + age + ")";
    }
}

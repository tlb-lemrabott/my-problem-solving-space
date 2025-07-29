public class Person implements Comparable<Person>{
    String name;
    int age;
    public Person(String name; int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p){
        return this.name.compareTo(p.name);
    }

}

public class Main {
    public static void main(String args[]){
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(p1);
        listPerson.add(p2);
        Collections.sort(listPerson);
    }
}
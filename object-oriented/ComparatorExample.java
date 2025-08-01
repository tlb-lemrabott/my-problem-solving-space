public class Person{
    String name;
    int age;
    public Person(String name; int age){
        this.name = name;
        this.age = age;
    }

    List<Person> listPerson = new ArrayList<>();
    listPerson.add(p1);
    listPerson.add(p2);

    Comparator<Person> byName = new Comparator<>(){
        @Override
        public int compare(Person p1, Person p2){
            return p1.name.compareTo(p2.name);
        }
    }
    Collections.sort(listPerson, byName);
    listPerson.sort(byName)
}
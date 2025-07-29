//creational design pattern used to construct complex objects step by step.
//Helps to ensure the immutability of the object’s state (Once the object is constructed, its internal state cannot be changed)

public class User(){
    private String name;
    priavte int age;
    priavte User(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
    }
    private static class Builder{
        private String name;
        private int age;
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age(String age){
            this.age = age;
            return this;
        }
        public User build(){
            return new User(this);
        }
    } 
}
//Usage
public static void main(String args[]){
    User user1 = new User.Builder()
        .name("Mrabott")
        .age(12)
        .build();
}



















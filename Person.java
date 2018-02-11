public class Person{

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // I'm a conflict
    public void printName(){
        System.out.println(firstName + " " + lastName);
    }
}

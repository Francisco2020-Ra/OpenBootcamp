package ExerciseItem8;

public class ExerciseItem8 {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(30);
        person.setFirstName("Lucas");
        person.setPhone("3704-123456");
        System.out.println(person);
    }
}
class Person{
    private int age;
    private String firstName;
    private String phone;

    public int getAge(){
        return this.age;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getPhone() {
        return phone;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "Name: " + this.firstName +'\n'+
                "Age: " + this.age +'\n'+
                "Phone: " + this.phone;
    }
}

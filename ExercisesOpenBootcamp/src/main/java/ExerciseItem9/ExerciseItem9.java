package ExerciseItem9;

public class ExerciseItem9 {
    public static void main(String[] args) {

        Client client = new Client();
        client.setFirstName("Lautaro");
        client.setAge(32);
        client.setNumberPhone(123456789);
        client.setCredit(1234.34);
        System.out.println(client);

        Employee employee = new Employee();
        employee.setFirstName("Kin");
        employee.setAge(23);
        employee.setNumberPhone(23456791);
        employee.setSalary(40000.32);
        System.out.println(employee);
    }
}

class Person{
    private int age;
    private String firstName;
    private int numberPhone;
    public void setAge(int age){
        this.age = age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setNumberPhone(int numberPhone){
        this.numberPhone = numberPhone;
    }

    public int getAge() {
        return age;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getNumberPhone() {
        return numberPhone;
    }
    @Override
    public String toString(){
        return "FirstName: " + this.firstName + '\n' +
                "Age: " + this.age + '\n' +
                "Number Phone: " + this.numberPhone;
    }
}

class Client extends Person{
    private double credit;
    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public String toString(){
        return super.toString() + '\n'+
        "Credit: $" + this.credit + '\n';
    }
}
class Employee extends Person{
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return super.toString() + '\n' +
                "Salary: $" + this.salary + '\n';
    }
}
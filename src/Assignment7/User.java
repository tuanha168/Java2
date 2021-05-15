package Assignment7;

public class User {
    private String name;
    private float salary;
    private int age;

    public User(String name, float salary, int age) {
        super();
        this.setName(name);
        this.setSalary(salary);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "User [name=" + name + ",salary=" + salary + ",age=" + age;
    }
}

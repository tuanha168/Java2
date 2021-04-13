package Assignment5.services;

/**
 * Save information of Person
 * 
 * @author NghiaNV1
 * @version 1.0
 */
public class Person {
    /**
     * Information of person
     */
    private String name, address;
    /**
     * Information of person
     */
    private double money;

    /**
     * Initial
     */
    public Person() {
    }

    /**
     * Initial
     * 
     * @param name    of person
     * @param address of person
     * @param money   of person
     */
    public Person(String name, String address, double money) {
        this.name = name;
        this.address = address;
        this.money = money;
    }

    /**
     * getter
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter
     * 
     * @param name of person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * setter
     * 
     * @param address of person
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * getter
     * 
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * setter
     * 
     * @param money of person
     */
    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return name.equals(person.getName()) && address.equals(person.getAddress()) && money == person.getMoney();
    }

}

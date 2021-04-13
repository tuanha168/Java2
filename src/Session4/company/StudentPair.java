package com.company;

public class StudentPair <Name,RollNumber>{
    private  Name name;
    private  RollNumber rollNumber;

    public StudentPair(Name name,RollNumber rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }

    public void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
    }
}

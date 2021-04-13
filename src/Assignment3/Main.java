package com.company;

import com.company.services.StudentManagement;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StudentManagement management=new StudentManagement();
        System.out.println("---------");
        management.addStudent();
        management.display();
    }
}

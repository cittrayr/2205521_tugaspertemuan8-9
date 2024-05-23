/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testprogram;

/**
 *
 * @author ctray
 */
public class TestProgram {

      public static void main(String[] args) {
        Person person = new Person("Rizki", "jl. Jamburea 01/01", "081212341234", "rizki@gmail.com");
        Student student = new Student("Pauzian", "Cijengkol Subang", "082312341234", "pzn@gmail.com", Student.JUNIOR);
        MyDate dateHired = new MyDate(2020, 5, 15);
        Employee employee = new Employee("Ayu", "jl. Cileuleuy 12/02", "082212341234", "ayu@gmail.com", "Deepneve store", 50000, dateHired);
        Faculty faculty = new Faculty("Rahma", "Jalancagak", "087712341234", "rahmaw@gmail.com", "Deepneve Pusat", 75000, dateHired, 10, "Professor");
        Staff staff = new Staff("Wati", "Serangpanjang", "081312341234", "watiwati@gmail.com", "Deepneve store", 60000, dateHired, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

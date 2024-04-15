/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.ficha7_exercicio2.publicSchool;

/**
 *
 * @author PAntunes
 */
public class SchoolManagement {

    private static final int MAX_PERSONS = 50;
    private static final int MAX_UNITS = 20;

    private Person[] persons = new Person[MAX_PERSONS];
    private CurricularUnit[] units = new CurricularUnit[MAX_UNITS];
    private int numberOfPersons = 0;

    public void addPerson(Person person) {
        if (numberOfPersons < MAX_PERSONS) {
            persons[numberOfPersons] = person;
            numberOfPersons++;
        }
    }

    public void removePerson(Person person) {
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (persons[i] == person) {
                for (int j = i; j < numberOfPersons - 1; j++) {
                    persons[j] = persons[j + 1];
                }
                persons[numberOfPersons - 1] = null;
                numberOfPersons--;
            }
        }
    }

    private String personToString(Person person) {
        if (person instanceof Student) {
            Student student = (Student) person;
            return student.studentToString();
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            return teacher.teacherToString();
        } else {
            SchoolEmployee employee = (SchoolEmployee) person;
            return employee.employeeToString();
        }
    }
    
    public void listPersons() {
        int personNumber = 1;
        
        System.out.println("List of persons");
        for (Person person : persons ) {
            if (person != null) {
                System.out.println(personNumber + "- " + personToString(person));
                personNumber++;
            }
        }
    }
    
    public void listAllStudents() {
        int studentNumber = 1;
        
        System.out.println("List of students");
        for (Person person : persons) {
            if (person != null && person instanceof Student) {
                System.out.println(studentNumber + "-" + personToString(person));
                studentNumber++;
            }
        }
    }

}

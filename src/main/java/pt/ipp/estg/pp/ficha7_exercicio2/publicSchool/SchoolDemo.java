/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.ficha7_exercicio2.publicSchool;

import pt.ipp.estg.pp.ficha7_exercicio2.publicSchool.enums.TypeOfContract;

public class SchoolDemo {

    public static void main(String[] args) {
        CurricularUnit lp = new CurricularUnit("Paradigmas da programação", "PP", 2024, 2);
        CurricularUnit[] lsirc = {lp};
        SchoolManagement estg = new SchoolManagement();

        Student joao = new Student("Joao", "10-2-2001", "Rua da s.joao", 123123123, 123123123, lp);
        Student hugo = new Student("Hugo", "10-9-2003", "Rua do hugo", 123123121, 123123123, lp);

        Teacher pedro = new Teacher("Pedro", "1997-03-06", "Rua Castelo de Pombal", 123123123, 123123123, TypeOfContract.FULL_TIME, lp);
        
        SchoolEmployee joana = new SchoolEmployee("Joana", "10-2-1990", "Rua da escola", 123123123, 123123123, TypeOfContract.PARTIAL);

        estg.addPerson(pedro);
        estg.addPerson(joao);
        estg.addPerson(hugo);
        estg.addPerson(joana);
        
        
        estg.listPersons();
        System.out.println();
        estg.listAllStudents();
        
    }

}

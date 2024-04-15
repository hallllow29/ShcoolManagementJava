/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.ficha7_exercicio2.publicSchool;

import pt.ipp.estg.pp.ficha7_exercicio2.publicSchool.enums.TypeOfContract;

public class Student extends Person {

    private static final String ACRONYM = "S";
    private static final int MAX_UNITS = 10;

    private CurricularUnit[] curricularUnits;
    private int numberOfUnits = 0;

    public Student(String name, String dateOfBirth, String address, int idNumber, int taxIdNumber, CurricularUnit curricularUnits) {
        super(name, dateOfBirth, address, idNumber, taxIdNumber);
        setCode();
        this.curricularUnits = new CurricularUnit[MAX_UNITS];
        setCurricularUnits(curricularUnits);
    }

    private void setCode() {
        String studentCode = ACRONYM + getNextId();

        super.setCode(studentCode);
    }

    private void setCurricularUnits(CurricularUnit newCurricularUnit) {
        if (numberOfUnits < MAX_UNITS) {
         curricularUnits[numberOfUnits] = newCurricularUnit;
         numberOfUnits++;
        } else {
            System.out.println("Number of units full");
        }

    }

    public String studentToString() {
        return "Nome estudante: " + getName() + "\nData de Nascimento: " + getDateOfBirth() + "\nEndereço: " + getAddres() + "\nCartão cidadão: " + getIdNumber() + "\nNIF: "
                + getIdNumber() + "\nCodigo: " + getCode();
    }

}

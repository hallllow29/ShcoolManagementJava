/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.ficha7_exercicio2.publicSchool;

import pt.ipp.estg.pp.ficha7_exercicio2.publicSchool.enums.TypeOfContract;

public class Teacher extends Person {

    private static final String ACRONYM = "T";
    private static final int MAX_UNITS = 20;

    private TypeOfContract contract;
    private CurricularUnit[] curricularUnits;
    private int numberOfUnits = 0;

    public Teacher(String name, String dateOfBirth, String address, int idNumber, int taxIdNumber, TypeOfContract contract, CurricularUnit curricularUnits) {
        super(name, dateOfBirth, address, idNumber, taxIdNumber);
        this.contract = contract;
        this.curricularUnits = new CurricularUnit[MAX_UNITS];
        setCode();
        setCurricularUnits(curricularUnits);
    }

    private void setCode() {
        String teacherCode = ACRONYM + getNextId();
        super.setCode(teacherCode);

    }

    private void setCurricularUnits(CurricularUnit newCurricularUnits) {
        if (numberOfUnits < MAX_UNITS) {
            curricularUnits[numberOfUnits] = newCurricularUnits;
            numberOfUnits++;

        } else {
            System.out.println("Number of units full");
        }
    }

    public String teacherToString() {
        return "Professor: " + getName() + "\nData de Nascimento: " + getDateOfBirth() + "\nEndereço: " + getAddres() + "\nCartão cidadão: " + getIdNumber() + "\nNIF: "
                + getIdNumber() + "\nCodigo: " + getCode() + "\nTipo de contrato: " + TypeOfContract.contractToString(contract);
    }

}

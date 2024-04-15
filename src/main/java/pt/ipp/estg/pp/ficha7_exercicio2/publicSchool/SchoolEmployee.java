/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.ficha7_exercicio2.publicSchool;

import pt.ipp.estg.pp.ficha7_exercicio2.publicSchool.enums.TypeOfContract;

public class SchoolEmployee extends Person {

    private static final String ACRONYM = "E";

    private TypeOfContract contract;

    public SchoolEmployee(String name, String dateOfBirth, String address, int idNumber, int taxIdNumber, TypeOfContract contract) {
        super(name, dateOfBirth, address, idNumber, taxIdNumber);
        this.contract = contract;
        setCode();
    }

    private void setCode() {
        String employeeCode = ACRONYM + getNextId();

        super.setCode(employeeCode);
    }

    public String employeeToString() {
        return "Empregado/a: " + getName() + "\nData de Nascimento: " + getDateOfBirth() + "\nEndereço: " + getAddres() + "\nCartão cidadão: " + getIdNumber() + "\nNIF: "
                + getIdNumber() + "\nCodigo: " + getCode() + "\nTipo de contrato: " + TypeOfContract.contractToString(contract);
    }
}

package pt.ipp.estg.pp.ficha7_exercicio2.publicSchool;

public class Person {
    
    private static int nextId = 0;

    private String code;
    private String name;
    private String dateOfBirth;
    private String address;
    private int idNumber;
    private int taxIdNumber;

    public Person(String name, String dateOfBirth, String address, int idNumber, int taxIdNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
        this.taxIdNumber = taxIdNumber;
        this.code = generateCode();
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddres() {
        return address;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getTaxIdNumber() {
        return taxIdNumber;
    }

    public String getCode() {
        return code;
    }

    public int getNextId() {
        return nextId;
    }

    public void setCode(String newValue) {
        this.code = newValue;
    }

    private String generateCode() {
        String generatedCode = String.format("%02d", nextId);
        nextId++;

        return generatedCode;
    }

}

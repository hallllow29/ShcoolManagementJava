/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.ficha7_exercicio2.publicSchool.enums;

/**
 *
 * @author PAntunes
 */
public enum TypeOfContract {
    PARTIAL, FULL_TIME;
    
    public static String contractToString(TypeOfContract contract) {
        switch(contract) {
            case PARTIAL :
                return "Partial contract";
            default:
                return "Full time contract";
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb10polimorfisme;

/**
 *
 * @author IQBAL
 */
public class Tester2 {
    public static void main(String[] args){
        permanenEmployee pemp = new permanenEmployee("Dedik", 500);
        Employee e;
        e = pemp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("--------------------");
        System.out.println(""+pemp.getEmployeeInfo());
    }
}

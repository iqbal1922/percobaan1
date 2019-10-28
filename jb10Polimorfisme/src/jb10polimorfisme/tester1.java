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
public class tester1 {

    public static void main(String[] args) {
        permanenEmployee pemp = new permanenEmployee("Dedik", 500);
        internshipEmployee imemp = new internshipEmployee("Sunarto", 5);
        electricityBill ebill = new electricityBill(5, "A-1");
        Employee e;
        Payable p;
        e = pemp;
        e = imemp;
        p = pemp;
        p = ebill;
    }
}

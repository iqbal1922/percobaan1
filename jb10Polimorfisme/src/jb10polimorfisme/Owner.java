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
public class Owner {

    public void pay(Payable p) {
        System.out.println("Total payment = " + p.getPaymentAmount());
        if (p instanceof electricityBill) {
            electricityBill eb = (electricityBill) p;
            System.out.println("" + eb.getBillInfo());
        } else if (p instanceof permanenEmployee) {
            permanenEmployee pe = (permanenEmployee) p;
            pe.getEmployeeInfo();
            System.out.println("" + pe.getEmployeeInfo());
        }
    }

    public void showMyEmployee(Employee e) {
        System.out.println("" + e.getEmployeeInfo());
        if (e instanceof permanenEmployee) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her :)");
        }
    }
}

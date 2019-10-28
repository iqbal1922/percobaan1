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
public class Tester4 {
   
    public static void main(String[] args) {
        Owner ow = new Owner();
        
        electricityBill ebill = new electricityBill(5, "R-1");
        ow.pay(ebill);
        System.out.println("-------------------------");
        
        permanenEmployee pEmp = new permanenEmployee("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("-------------------------");
        
        internshipEmployee iEmp = new internshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("-------------------------");
        ow.showMyEmployee(iEmp);
        
//        ow.pay(iEmp);
    }
}



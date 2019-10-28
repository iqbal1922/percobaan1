
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author IQBAL
 */
public class NewClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ipk = ");
        int x = sc.nextInt();
        System.out.println("to = ");
        int y = sc.nextInt();
        System.out.println("pipp = ");
        int z = sc.nextInt();
        if (x>3) {
            System.out.println("lulus");
        }else if(y>500){
            System.out.println("lulus");
        }else if(z>500){
            System.out.println("lulus");
        }else{
            System.out.println("tidak lulus");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star;
import java.util.Scanner;
/**
 *
 * @author IQBAL
 */
public class Star {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("RUWET");
        
        System.out.print("Masukkan nilai N = ");
       int N = sc.nextInt();
        
        for(int i=1; i<=N; i++){
            System.out.print(" A ");
        }
        
    }
    
}

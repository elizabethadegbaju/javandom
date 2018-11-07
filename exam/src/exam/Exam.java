/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Adeotun
 */
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Number 1b
        System.out.println("Input speed: ");
        Scanner scan = new Scanner(System.in);
        int speed = scan.nextInt();
        if(speed>60){
            System.out.println("Speed is abnormal");
        }else{
            if(speed>30){
                System.out.println("Speed is normal");
            }else{
                System.out.println("Speed is abnormal");
            }
        }
                */
        
        /* Number 4c
        String me = "My name is Elizabeth Adegbaju. I am a 300 level student at Covenant University. I am studying Computer Science and I like to write codes, it's fun.";
        final Formatter x;
        try{
            x = new Formatter("profile.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter("profile.txt"));
            bw.write(me);
            bw.close();
        }
        catch(Exception e){
            System.out.println("Error encountered");
        }
                */
        
        /* Number 3b
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        for(int i = 1; i < 11; i++){
            System.out.println(num+" x "+i+" = " +(num*i));
        }
                */
        
    }
    
}

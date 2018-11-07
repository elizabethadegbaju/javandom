package files;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author Adeotun
 */
public class Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File x = new File("C:\\fileExample\\classwork.txt");
        if(x.exists())
            System.out.println(x.getName()+" "+"exists.");
        else
            System.out.println(x.getName()+" does not exist.");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\fileExample\\classwork.txt"));
            bw.write("This is the part where I ditch the class and go to buttery");
            bw.newLine();
            bw.close();
        }
        catch(Exception e){
            System.out.println("Error!");
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\fileExample\\classwork.txt"));
            String isCurrentLine;
            while((isCurrentLine=br.readLine()) != null){
                System.out.println(isCurrentLine);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println("Error!");
        }
    }
    
}

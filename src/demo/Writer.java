/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author jehow
 */
import java.io.*; 
public class Writer {
    public static void main(String[] args){
        
        try{
            PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
            String name = "Fred Jones";
            double  score = 240.5;
            out.print(name);
            out.print(' ');
            out.println(score);
            out.close();

        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
}

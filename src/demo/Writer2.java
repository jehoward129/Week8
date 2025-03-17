/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jehow
 */
public class Writer2 {
    public static void main(String[] args){
        
        try{
            PrintWriter out = new PrintWriter(new FileWriter("out2.txt"));
            for(int i = 0; i < 1000; i++){
                int num = i + 1;
                out.print(i + '\n');
            }
            
            out.close();

        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
}

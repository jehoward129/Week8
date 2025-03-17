/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author jehow
 */
import java.util.Scanner;
import java.io.*;
public class ReadFile {
    public static void main(String[] args){
        File file = new File("demo.txt");
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizzApp;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Random;
/**
 *
 * @author jehow
 */
class QuizApp {
    ArrayList<question> questionArray = new ArrayList<>(); // Initialize the ArrayList

    public ArrayList<question> loadQuestions(String filename){
//        File quiz = new File("quizQuestions.txt");
        File quiz = new File(filename);
        try {
            Scanner scanner = new Scanner(quiz);
            while (scanner.hasNextLine()) {
                String thing = scanner.nextLine();
                String[] parts = thing.split(","); // Split into an array
                
                
                
                if (parts.length == 6) {
                    
                    question temp_question = new question(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
                    
                    questionArray.add(temp_question);
                } else {
                    System.out.println("Invalid line format: " + thing);
                }
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return questionArray;
    }

    public QuizApp() {
        
    }
    
    
}
    

    


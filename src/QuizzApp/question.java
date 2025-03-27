/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizzApp;

/**
 *
 * @author jehow
 */
public class question {
    String correctAnswer;
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    String userAnswer;
    

    public question(String question, String option1, String option2, String option3, String option4, String correctAnswer) {
        this.correctAnswer = correctAnswer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.question = question;
        this.userAnswer = null;
        
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }
    
    
    
    
}

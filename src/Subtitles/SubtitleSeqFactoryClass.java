/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subtitles;

import QuizzApp.question;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jehow
 */
public class SubtitleSeqFactoryClass{
    
        // Return an empty subtitles sequence 
    public static SubtitleSeqClass getSubtitleSeq(){
        return new SubtitleSeqClass(new ArrayList<>());
    } 


       // Load a subtitle sequence from an SRT file. If the file does not exist or // is corrupted (incorrect format), null is returned. 
    public static SubtitleSeqClass loadSubtitleSeq(String fileName){
        File file = new File(fileName);
        SubtitleSeqClass subSeq = getSubtitleSeq();
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                int num = Integer.parseInt(scanner.nextLine()); //Get number of subtitle
                String line = scanner.nextLine(); //Get line of times
                String[] times = line.split("-->"); //Split the line into start and end time
                String first[] = times[0].split(":"); //split start time
                String secs[] = first[2].split(","); //split seconds into ss ms
                
                TimeClass start = new TimeClass(Integer.parseInt(first[0]), Integer.parseInt(first[1]),
                        Integer.parseInt(secs[0]), Integer.parseInt(secs[1]));
                
                String second[] = times[1].split(":"); //split emd time
                String secs2[] = second[2].split(","); //split seconds into ss ms
                
                TimeClass end = new TimeClass(Integer.parseInt(second[0]),Integer.parseInt(second[1]),
                        Integer.parseInt(secs2[0]), Integer.parseInt(secs[1]));
                
                String text = scanner.nextLine();
                SubtitleClass sub1 = new SubtitleClass(num, start, end, text);
                subSeq.addSubtitle(sub1);
                if(scanner.nextLine().isBlank()){
                    continue;
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("File Error");
            e.printStackTrace();
            return null;
        }catch(NumberFormatException e){
            System.out.println("Format error");
            e.printStackTrace();
            return null;
        }
        return subSeq;
    } 
}

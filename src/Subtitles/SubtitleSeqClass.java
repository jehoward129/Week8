/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subtitles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jehow
 */
public class SubtitleSeqClass implements SubtitleSeq{
    List<SubtitleClass> subSeq = new ArrayList<>();

    public SubtitleSeqClass(List<SubtitleClass> subtitles) {
        this.subSeq = subtitles;
    }
    

    @Override
    public void addSubtitle(SubtitleClass st) {
        subSeq.add(st);
    }

    @Override
    public List<SubtitleClass> getSubtitles() {
        return subSeq;
    }

    @Override
    public SubtitleClass getSubtitle(TimeClass time) {
        for(SubtitleClass s: subSeq){
            if(s.getStartTime().equals(time)){
                SubtitleClass subby =  s;
                return subby;
            }
        }
        return null;
    }

    @Override
    public List<SubtitleClass> getSubtitles(TimeClass startTime, TimeClass endTime) {
        List<SubtitleClass> tempSeq = new ArrayList<>();
        TimeClass tempSTm;
        TimeClass tempETm;
        for(SubtitleClass s: subSeq){
            tempSTm = s.getStartTime();
            tempETm = s.getEndTime();
            
            if(tempSTm.isBefore(endTime) && tempSTm.isAfter(startTime)){
                tempSeq.add(s);
            }
            if(tempETm.isBefore(endTime) && tempETm.isAfter(startTime)){
                tempSeq.add(s);
            }
        }
        return tempSeq;
    }

    @Override
    public List<SubtitleClass> getSubtitles(String str) {
        List<SubtitleClass> tempSeq = new ArrayList<>();
        for(SubtitleClass s: subSeq){
            String text = s.getText();
            if(text.toUpperCase().contains(str.toUpperCase())){
                tempSeq.add(s);
            }
        }
        return tempSeq;
    }

    @Override
    public void remove(String str) {
        for(SubtitleClass s: subSeq){
            String text = s.getText();
            if(text.toUpperCase().contains(str.toUpperCase())){
                subSeq.remove(s);
            }
        }
    }

    @Override
    public void replace(String str1, String str2) {
        for(SubtitleClass s: subSeq){
            String text = s.getText();
            if(text.toUpperCase().contains(str1.toUpperCase())){
                String tempstr = s.getText().replace(str1, str2);
                s.setText(tempstr);
            }
        }
    }

    @Override
    public void shift(int offset) {
        for(SubtitleClass s: subSeq){
            s.setStartTime(s.getStartTime().shift(offset));
            s.setStartTime(s.getEndTime().shift(offset));
            
             
        }
    }

    @Override
    public void cut(TimeClass startTime, TimeClass endTime) {
        TimeClass tempSTm;
        TimeClass tempETm;
        for(SubtitleClass s: subSeq){
            tempSTm = s.getStartTime();
            tempETm = s.getEndTime();
            
            if(tempSTm.isBefore(endTime) && tempSTm.isAfter(startTime)){
                subSeq.remove(s);
            }
            if(tempETm.isBefore(endTime) && tempETm.isAfter(startTime)){
                subSeq.remove(s);
            }
        }
       
    }
    
    
}

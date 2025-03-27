/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subtitles;

/**
 *
 * @author jehow
 */
public class SubtitleClass implements Subtitle{
    TimeClass startTime;
    TimeClass endTime;
    String text;
    int subNum;

    public TimeClass getStartTime() {
        return startTime;
    }

    public void setStartTime(TimeClass startTime) {
        this.startTime = startTime;
    }

    public TimeClass getEndTime() {
        return endTime;
    }

    public void setEndTime(TimeClass endTime) {
        this.endTime = endTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getSubNum() {
        return subNum;
    }

    public void setSubNum(int subNum) {
        this.subNum = subNum;
    }

    public SubtitleClass(int subNum, TimeClass startTime, TimeClass endTime, String text) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.text = text;
        this.subNum = subNum;
    }
    
}

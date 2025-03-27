/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Subtitles;

/**
 *
 * @author jehow
 */
public interface Subtitle {
     
	// Return the start time of the Subtitle. 
    TimeClass getStartTime(); 
	 
        // Return the end time of the Subtitle.  
    TimeClass getEndTime(); 
 
	// Return the subtitle text.  
    String getText(); 
 
	// Set the start time of the Subtitle.  
    void setStartTime(TimeClass startTime); 
 
	// Set the end time of the Subtitle. 
    void setEndTime(TimeClass endTime); 
 
	// Set the subtitle text.  
    void setText(String text); 

}

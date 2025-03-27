/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Subtitles;

import java.util.List;

/**
 *
 * @author jehow
 */
public interface SubtitleSeq {
        // This interface represents a subtitle sequence.	
        // Add a subtitle. 
            void addSubtitle(SubtitleClass st); 

            // Return all subtitles in their chronological order. 
            List<SubtitleClass> getSubtitles(); 

            /** 
            * Return the subtitle displayed at the specified time, null if no  
            * subtitle is displayed. 
            * @param time 
            * @return 
            */ 
            SubtitleClass getSubtitle(TimeClass time); 

            /** 
            *   Return, in chronological order, all subtitles displayed between the 
            *   specified start and end times. The first element of this list is the 
            *   subtitle of which the display interval contains or otherwise comes 
            *   Immediately after startTime. The last element of this list is the 
            *   subtitle of which the display interval contains or otherwise comes 
            *   immediately before endTime. 
            * @param startTime 
            * @param endTime 
            * @return 
            */ 
            List<SubtitleClass> getSubtitles(TimeClass startTime, TimeClass endTime); 

            // Return, in chronological order, all subtitles containing str as a // sub-string in their text. 
            List<SubtitleClass> getSubtitles(String str); 

            // Remove all subtitles containing str as a sub-string in their text. 
            void remove(String str); 

            // Replace str1 with str2 in all subtitles. 
            void replace(String str1, String str2); 

            /** 
            *  Shift the subtitles by offseting their start/end times with the specified 
            *  offset (in milliseconds). The value offset can be positive or negative. 
            *  Negative time is not allowed and must be replaced with 0. If the end time 
            *  becomes 0, the subtitle must be removed. 
            * @param offset 
            */ 
            void shift(int offset); 

            /** 
            * Cut all subtitles between the specified start and end times. The first subtitle to be removed is the one for which the display interval contains or otherwise comes immediately after startTime. The last subtitle to be removed is the one for which the display interval contains or otherwise comes immediately before endTime. The start and end times of all subtitles must be adjusted to reflect the new time. */ 
            void cut(TimeClass startTime, TimeClass endTime); 
    }	




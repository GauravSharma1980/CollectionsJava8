package com.challenges;

public class TimeConversion {

    public static void main(String[] args) {
        String timeFormat = "7:00:00AM";

        changeTimeFormat(timeFormat);
        System.out.println("Time "+changeTimeFormatAMPM("12:45:00PM"));
    }

    private static void changeTimeFormat(String timeFormat) {
        if(timeFormat.contains("PM")){
            if(timeFormat.equals("12:00:00PM")){
                timeFormat ="12:00:00";
            }else {
                int hrs = Integer.parseInt(timeFormat.substring(0, timeFormat.indexOf(":")));
                int updatedHrs = (hrs >= 1) ? hrs + 12 : hrs;
                if (updatedHrs > 12) {
                    StringBuilder updatedTimeFormat = new StringBuilder();
                    updatedTimeFormat.append(updatedHrs).append(timeFormat.substring(timeFormat.indexOf(":"), timeFormat.length()));
                    timeFormat =updatedTimeFormat.toString();
                }
            }
        }else{
            System.out.println(timeFormat);
        }
    }
    private static String changeTimeFormatAMPM(String timeFormat){
        // Write your code here
        if(timeFormat.contains("PM")){
            {
                int hrs = Integer.parseInt(timeFormat.substring(0, timeFormat.indexOf(":")));
                int updatedHrs = (hrs >= 1 && hrs != 12) ? hrs + 12 : hrs;
                if (updatedHrs > 12) {
                    StringBuilder updatedTimeFormat = new StringBuilder();
                    updatedTimeFormat.append(updatedHrs).append(timeFormat.substring(timeFormat.indexOf(":"), timeFormat.length()));
                    timeFormat =updatedTimeFormat.toString();
                }
            }
            timeFormat = timeFormat.replace("PM","");
        }else {
            int hrs = Integer.parseInt(timeFormat.substring(0, timeFormat.indexOf(":")));
            int updatedHrs = (hrs == 12) ? 0 : hrs;
            if (updatedHrs == 0) {
                StringBuilder updatedTimeFormat = new StringBuilder();
                updatedTimeFormat.append("00").append(timeFormat.substring(timeFormat.indexOf(":"), timeFormat.length()));
                timeFormat =updatedTimeFormat.toString();
            }
            timeFormat = timeFormat.replace("AM","");
        }
        return timeFormat;
    }
}

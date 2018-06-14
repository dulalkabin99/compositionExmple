package com.company;


import java.util.ArrayList;

public class Education {
    private ArrayList<String > schl=new ArrayList<>();

    public Education() {

        schl.add("Maitidevi HS SChool");
        schl.add("HiHi HS SChool");
        schl.add("ByeBye HS SChool");
        schl.add("Towson University");
        schl.add("Montgomerry Colege");
        schl.add("No college");
        schl.add("Fun class");
        schl.add("What school");
        schl.add("Hello school");
        schl.add("No college");
        schl.add("kk college");
        schl.add("");

    }


@Override
    public String toString() {
       String display ="";
        for(String s:schl){
            display+= s+"\n";
        }
        return display;
    }
}

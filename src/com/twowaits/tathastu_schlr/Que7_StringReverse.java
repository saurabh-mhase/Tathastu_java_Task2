package com.twowaits.tathastu_schlr;

public class Que7_StringReverse {
    public static String reverseWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }

    public static void main(String[] args) {
        System.out.println(Que7_StringReverse.reverseWord("my name is saurabh"));
        System.out.println(Que7_StringReverse.reverseWord("I am salman khan"));
    }
}

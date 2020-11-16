package se.iths;

public class TextProcessor {

    public String notEmpty(String myStr){
        String myStrUpper = myStr.toUpperCase();
        if(myStrUpper.isEmpty()) {
            myStrUpper = "Please enter a string";
            System.out.println(myStrUpper);
        }
        return myStrUpper;
    }

    public String textToUpper(String myStr){
        String myStrUpper = myStr.toUpperCase();
        return myStrUpper;
    }

    public String textToLower(String myStr){
        String myStrLower = myStr.toLowerCase();
        return myStrLower;
    }

    public String textBackwards(String myStr){
        StringBuilder sb=new StringBuilder(myStr);
        sb.reverse();
        String str=sb.toString();
        return str;
    }

}

public class practiceDayFourth {

    //5. Given two strings, check if the second string is a rotation of the first string.
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        else{
        String newStr = s + s;
        return newStr.contains(goal);
        }
    }
    
}

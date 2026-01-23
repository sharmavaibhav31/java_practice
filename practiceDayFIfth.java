public class practiceDayFIfth {
    public static void hashedString(String s) {
        StringBuilder hashes = new StringBuilder();
        StringBuilder chars = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '#'){
                hashes.append(ch);
            } else {
                chars.append(ch);
            }
        }
        System.out.println(hashes.toString() + chars.toString());
    }

    public static void main(String[] args){
        hashedString("Move#From#Here#To#Start");
    }
}


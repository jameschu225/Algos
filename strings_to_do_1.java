import java.util.ArrayList;
import java.util.List;

public class strings_to_do_1{
    
    public String removeBlanks(String str){
        String newStr="";
        for(int i=0; i<str.length();i++){
            char letter= str.charAt(i);
            if (letter != ' '){
                newStr += letter;
            } else {
                continue;
            }
        }
        return newStr;
    }

    public String getDigit(String str){
        String newStr ="";
        for (int i =0; i<str.length(); i++){
            char char1= str.charAt(i);
            if (Character.isDigit(char1)){
                newStr += Character.toString(char1);
            }else {
                continue;                
            }
        }
            return newStr;
        }

    public String acronumy( String str){
        String newStr = "";
        String[] strAry = str.split(" ",0);
        for (String string: strAry){
            System.out.println(string);
            if (string != ""){
                char char1= string.charAt(0);
                if (char1!=' '){
                    newStr += Character.toString(Character.toUpperCase(char1));
                } else{
                    continue;
                }
            } else {
                continue;
            }
        }
        return newStr;
    }

    public int conutNonSapces( String str){
        int count=0;
        for(int i=0; i<str.length();i++){
            char letter= str.charAt(i);
            if(letter!=' '){
                count ++;
            } else {
                continue;
            }
        }
        return count;
    }

    public List<String> removeShorterStrings(String[] strAry, int numberOfString){
        List<String> newStr = new ArrayList<String>();
        for (String string: strAry){
            if (string.length() >= numberOfString){
                newStr.add(string);
                } else{
                    continue;
                }
        }
        return newStr;
    }
}
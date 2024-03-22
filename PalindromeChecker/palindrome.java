public class palindrome {

    static public boolean palindromes(String str){
        str = str.toLowerCase();
        
        if(str.length() == 0 || str.length()==1){
            return true;
        }
        else{
            if(str.charAt(0) == str.charAt(str.length()-1)){
                String newStr = str.substring(1, str.length()-1);
                return palindromes(newStr);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "kakak";
        boolean test = palindromes(str);
        System.out.println(test);
    }
}

public class caseDemo {
    public static void main(String[]args){
        System.out.println("Text processing demo");

        String str="HELLO";
        int len=str.length();
        System.out.println("The length of the string is "+len);
        for(int i=0;i<len;i++){
            char c=Character.toLowerCase(str.charAt(i));
            System.out.println(c);
        }
    }
}

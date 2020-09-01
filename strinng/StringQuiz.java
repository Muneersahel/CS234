public class StringQuiz {

    public static void main(String[] args){
        String S = new String("GOOD MORNING") ;
        String S1 = S.toLowerCase();
        System.out.println(S1);
        String S2 = S1.toUpperCase();
        System.out.println(S2);
        String S3,S4;
        S3 = "hello";
        S4 = "hey";

        for(int i = 0; i < S3.length(); i++) {
            char[] literal = S3.toCharArray();
            if (literal[i] == 'l') {
                System.out.println(i);
            }
        }
        if(S3.equals("HELLO")){
           System.out.println("Same");
        }else{
            System.out.println("Not Same.");
        }
        if(S3.equalsIgnoreCase("HELLO")){
            System.out.println("Same");
        }else{
            System.out.println("Not Same.");
        }
        String str = "bis";
        int validate = S4.compareTo(str);
        System.out.println(validate);

        String S5 = S.substring(5,11);
        System.out.println(S5);

        String S6 = S.replace('O', 'U');
        System.out.print(S6);
    }
}

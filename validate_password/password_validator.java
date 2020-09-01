import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class password_validator{
    String password;
    public static void main(String[] args){
        boolean check = false;
        Scanner input = new Scanner(System.in);

        System.out.println("THIS SYSTEM VALIDATE PASSWORD USING JAVA");

        System.out.print("Enter your password of choice: ");
        String pass = input.nextLine();
        input.close();

        if(pass.length() < 5 || pass.length() > 10){
            check = false;
        }else if(pass.indexOf(" ") >= 0 ){
            check = false;
        }else{
            Pattern p = Pattern.compile("[0-9]");
            Pattern pattern = Pattern.compile("[^A-Za-z0-9]");

            Matcher m = p.matcher(pass); 
            Matcher match = pattern.matcher(pass);

            if(m.find() ==true && match.find() == true){
                check = true;
            }else{
                check = false;
            }
        }
        
        System.out.println(check);
    }
}

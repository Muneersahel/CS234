package student;

public class Test extends Student {
    protected int sub1, sub2;

    public Test(String regNum, int sub1, int sub2){
        super(regNum);
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
    public void displayScore(){
        System.out.println("Registration number: " + regNum + "\nSubject 1: " + sub1 + " \nSubject 2: " + sub2);
    }
    
}
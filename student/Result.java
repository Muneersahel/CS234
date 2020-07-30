package student;

public class Result extends Test{
    public Result(String regNum, int sub1, int sub2){
        super(regNum, sub1, sub2);
    }

    public int totalMark(){
        return sub1 + sub2;
    }

    public void displayTotal(){
        System.out.println("Total mark: " + totalMark());
    }
}
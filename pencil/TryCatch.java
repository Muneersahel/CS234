package pencil;

public class TryCatch {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        sb.append("Munir");
        System.out.println(sb);
        try{
            String name = "abc";
            int i = Integer.parseInt(name);
            int f = 4 / 0;

        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("This block executed");
        }
    }
}

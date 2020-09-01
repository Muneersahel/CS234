public class ExepTest {
    public static void main(String[] args){
       int a=0,temp=0;
       int[] list = {79,43,93,2,99,3,2,50,23,23,53,23};

       for (int i = 0; i < list.length; i++){
           for(int j = 0; j < list.length; j++){
                if(list[i] < list[j]){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
           }
       }
       for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }

}

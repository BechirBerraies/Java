package loop;
public class Print {

    public static void Printer(int[] t){
        for(int i = 0 ; i <t.length; i++ ){
            System.out.println(t[i]+i);
        }
    }



 public static void main(String []args){

 

int[] intArray = {1, 2, 3, 4, 5,-1};
Printer(intArray);
 }
}



package loop;
public class Print2 {

    public static void Afficher2(int[] args){
    for (int i = 0 ; i< args.length ; i++){
        System.out.println(args[i]+ i);
        
    }
 }


 public static void Afficher3(int[] args){
    int i = 0;
    int VIDE = -1;
    while ( i<args.length && args[i]!=VIDE ){
            System.out.println(args[i]+ i);
            i ++ ;
    }
 }

public static boolean Afficher4(int[] args, int element){
    int i = 0;
    while(i<args.length && args[i] != element){
        i++;
    }
    if(i == args.length){
        
        return false;

    }else{
        System.out.println("La position est "+i);
        return true;
    }

}





public static void main(String[] args){
int[] intArray = {1, 2, 3, 4, 5,-1};

// Afficher2(intArray);
// Afficher4(intArray,5);
// System.out.println(Afficher4(intArray, 4));
System.out.println(Afficher4(intArray, 5));

 }

}

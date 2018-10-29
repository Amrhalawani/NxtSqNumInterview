package intet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Amr Halawani
 */
public class NxtSquereNumber {
    
   static int INPUT_NUMBER = 5; // Enter input here
final static int MAX = 10; 
static List list;  
public static void main(String[] args) {
        // TODO code application logic here
         list = new ArrayList();
        int j;
        for (int i = 1; i < MAX; i++) {
          j = i * i ;
          list.add(j);
        }    
       int result = getNextSquereNumber(INPUT_NUMBER);
    System.out.println( "result = " + result);    
}
    public static int getNextSquereNumber( int number ){
        for ( int i = 0; i <= MAX ; i++) {
            int n = (int) list.get(i);
            if ( n>number) {
                System.out.println(""+n+" true");
            return (int)list.get(i);
            }
            System.out.println(""+n+" false");
        }
        return 0;
    }
}

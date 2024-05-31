//percobaan 3


public class Exception2 {
    public static void main(String[] args) {
        int i=0;
        String greentings[]={
            "Hello World!",
            "No, I men it!",
            "HELLO WORLD"
        };
        while(i<4)
       {
           try
           {
               System.out.println(greentings[i]);
               i++;
           }
           catch(ArrayIndexOutOfBoundsException e)
           {
               System.out.println("Resseting index values");
               i=0;
           }
       }
    }
    
}

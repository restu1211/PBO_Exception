//percobaan 5

public class Exception5 {
    public static void main(String[] args) {
        int bil=10;
        try
        {
            System.out.println(bil/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Pesan eror :   ");
            System.out.println(e.getMessage());
            System.out.println("infi stack erase");
            e.printStackTrace();
            e.printStackTrace(System.out);
        }
        catch(Exception e)
        {
            System.out.println("ini menghandle eror yang terjadi");
        }
    }
    
}

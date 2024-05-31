//percobaan 3

public class Exception3 {
    public static void main(String[] args) {
        int bil=10;
        try
        {
        System.out.println("bil/0");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Terjadi aritmatika eror");
        }
        catch (Exception e)
        {
            System.out.println("Ini menghandle eror yang terjadi");
        }
    }
    
}

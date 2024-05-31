//percobaan 9


public class Propagate {
    public static void main(String[] args) {
    {
        try 
        {
            System.out.println(reverse("This is a string"));
        }
        catch(Exception e)
        {
            System.out.println("The string wa blank");
        }
        finally
        {
            System.out.println("All done");
        }
        }
    }

public static String reverse(String s) throws Exception
{
    if(s.lenght()==0)
    {
        throws new Exception();
    }
    String reverseStr="";
    for(int i=s.lenght()-1 ; i>=0 ; --i ){
        reverseStr+=s.charAt(i);
    }
    return reverseStr;

}
}
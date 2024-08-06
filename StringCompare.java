public class StringCompare {
    
    public static void main(String [] args)
    {
        String s1="Mahima";
        String s2="Mahima";
        int count=0;
        int c=0;
        if(s1.length()!=s2.length())
        {
         System.out.println("Not same");
        }
        while(c<s1.length())
        {
            if(s1.charAt(c)==s2.charAt(c))
            {
                count++;

            }
            c++;
        }
        if(count==s1.length())
        System.out.println("Both String are same");
        else{
            System.out.println("Both string are not same");
        }
    }
    
}

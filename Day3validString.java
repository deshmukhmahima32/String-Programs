public class Day3validString {
    public static void main(String[] args) {
        String s1="12356";
        int count=0;
        char ch;
        for(int i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            if(ch<='9')
            {
                count++;
            }

        }
        if(count==s1.length())
        System.out.println("it is a valid String");
        else{
            System.out.println("String is not valid");
        }
        
    }
    
}

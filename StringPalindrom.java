public class StringPalindrom {
    public static void main(String [] args)
    {
        String name ="naman";
        String rev="";
        char newchar;
        for(int i=0;i<name.length();i++)
        {
            newchar=name.charAt(i);
            rev=rev+newchar;
        }
        int n=name.length()-1;
        int r=0;
        int count=0;
        while(r<rev.length()&&name.charAt(n)==rev.charAt(r))
        {
            count++;
            n--;
            r++;

        }
        if(count==name.length())
        {
            System.out.println(name+" is a Pallindrom");
        }
        else{
            System.out.println(name+" is not a pallindrom");
        }
         
    }
    
}

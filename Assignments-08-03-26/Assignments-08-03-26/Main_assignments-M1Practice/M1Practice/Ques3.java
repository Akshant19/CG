package M1Practice;

public class Ques3 {
    public static void main(String[] args) {
        String str = "aA1_67";

        if(str.length() < 4)
        {
            System.out.println(0);
            return;
        }
        if(Character.isDigit(str.charAt(0)))
        {
            System.out.println(0);
            return;
        }

        boolean upper = false;
        boolean dig = false;
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c == ' ' || c == '/')
            {
                System.out.println(0);
                return;
            }
            if(Character.isDigit(c))
            {
                dig = true;
            }
            if(Character.isUpperCase(c))
            {
                upper = true;
            }
        }

        if(dig && upper)
        {
            System.out.println(1);    
        }
        else
        {
            System.out.println(0);
        }
        
    }
    
}

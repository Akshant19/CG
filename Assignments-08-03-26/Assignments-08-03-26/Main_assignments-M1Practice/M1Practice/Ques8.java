package M1Practice;

public class Ques8 {
    public static void main(String[] args) {
       int n = 12;
       int num = 718;
       
       String ans = "";

       while(num > 0)
       {
            int rem = num % n;

            if(rem < 10)
            {
                ans = rem + ans;
            }
            else
            {
                char c = (char)(rem - 10 + 'A');
                ans = c + ans;
            }

            num /= n;
       }

       System.out.println(ans);

    }
    
}

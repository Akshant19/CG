package M1Practice;

public class Ques9 {
    public static void main(String[] args) {
        String str = "Move-Hyphens-to-front";
        String ans1 = "";
        String ans2 = "";

        for(char c : str.toCharArray())
        {
            if(c == '-')
            {
                ans2 += c;
            }
            else
            {
                ans1 += c;
            }
        }

        System.out.println(ans2 + ans1);

    }
    
}

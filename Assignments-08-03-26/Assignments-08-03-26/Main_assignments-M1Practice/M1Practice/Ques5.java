package M1Practice;

public class Ques5 {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;

        int sum4 = 0;
        int noSum = 0;

        for(int i = 1;i<=m;i++)
        {
            if(i % n == 0)
            {
                sum4 += i;
            }
            else
            {
                noSum += i;
            }
        }

        int diff = noSum - sum4;
        System.out.println(diff);
    }
    
}

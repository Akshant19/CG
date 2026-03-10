package M1Practice;

public class Ques2 {
    public static void main(String[] args) {
        String str = "0C1A1B1C1C1B0A0";
        int res = str.charAt(0) - '0';

        for(int i=1;i<str.length();i+=2)
        {
            char op = str.charAt(i);
            int next  = str.charAt(i + 1) - '0';
            if(op == 'A')
            {
                res = res & next;
            }
            else if(op == 'B')
            {
                res = res | next;
            }
            else
            {
                res = res ^ next;
            }
        }
        System.out.println(res);
    }
}

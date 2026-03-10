package M1Practice;

public class Ques10 {
    public static void main(String[] args) {
        int num1 = 451;
        int num2 = 349;

        int count = 0;
        int carry = 0;
        while(num1 != 0 || num2!= 0)
        {
            int dig1 = num1 % 10;
            int dig2 = num2 % 10;

            int sum = dig1 + dig2 + carry;
            if(sum > 9)
            {
                count++;
                carry = 1;
            }
            else
            {
                carry = 0;
            }

            num1 /= 10;
            num2 /= 10;
        }

        System.out.println(count);
    }
    
}

package M1Practice;

public class Ques7 {
    public static void main(String[] args) {
        int arr[] = {9,8,3,7,3,9};
        int sum = 6;

        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        if(arr.length == 0 || arr.length <2)
        {
            System.out.println(-1);
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                secMin = min;
                min = arr[i];
            }
            else if(arr[i] < secMin)
            {
                secMin = arr[i];
            }
        }

        int sum1 = min + secMin;
        if(sum1 <= sum)
        {
            System.out.println(min * secMin);
        }
        else
        {
            System.out.println(0);
        }
        
    }
    
}

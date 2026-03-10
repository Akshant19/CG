package M1Practice;

public class Ques6 {
    public static void main(String[] args) {
        int arr[] = {1,8,0,2,3,5,6};

        if(arr.length == 0 || arr.length<=3)
        {
            System.out.println(0);
            return;
        }
        

        int max = arr[0];
        int secMax = 0;

        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++)
        {
            
            if(i%2==0)
            {
                if(arr[i] > max)
                {
                    secMax = max;
                    max = arr[i];
                }
                else if(arr[i] > secMax && arr[i]!= max)
                {
                    secMax = arr[i];
                }
            }
            else
            {
                if(arr[i] < min)
                {
                    secMin = min;
                    min = arr[i];
                }
                else if(arr[i] < secMin && arr[i] != min)
                {
                    secMin = arr[i];
                }
            }
        }

        int sum = secMax + secMin;
        System.out.println(secMax);
        System.out.println(secMin);
        System.out.println(sum);
    }
    
}

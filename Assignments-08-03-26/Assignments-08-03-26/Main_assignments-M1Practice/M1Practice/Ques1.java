package M1Practice;

public class Ques1 {

    public static void main(String[] args) {
        int arr[] = {2,8,3,5,7,4,1,2};
        int n = arr.length;
        int r = 7;
        int unit = 2;

        if(arr == null)
        {
            System.out.println(-1);
            return;
        }

  
        int food = r * unit;
        int sum = 0;
        for(int i=0;i<n;i++)
        {

            sum += arr[i];
            if(sum >= food)
            {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(0);

    }
}
import java.util.Scanner;

public class buystock{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xed.nextInt();
			int[] prices=new int[n];
			for(int j=0;j<prices.length;j++)
			{
				prices[j]=xed.nextInt();
			}
            int max=0;
			System.out.println(maxProfit(prices,prices.length,max));
 		}
 		xed.close();
	}
	public int calculateProfit(int[] prices,int k,int max){
        int j=k-1;
        if(k==1)
        {
            return max;
        }
        else
        {
            for(int i=0;i<prices.length;i++)
            {
                if(j>i)
                {
                    if(prices[i]<prices[j])
                    {
                        if(prices[j]-prices[i]>max)
                        {
                           max=prices[j]-prices[i];
                        }
                    }
                }
            }
            return calculateProfit(prices,k-1,max);
        }
    }
}
import java.util.Scanner;

public class palin{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xed.nextInt();
			System.out.println(isPal(n));
		}
		xed.close();
	}
	public static boolean isPal(int n){
		if(numberReverser(n)==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int numberReverser(int n){
		int a=0;
		for(int i=n;i!=0;i/=10)
		{
			a+=i%10;
			a*=10;
		}
		return a/10;
	}
}
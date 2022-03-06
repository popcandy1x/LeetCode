import java.util.Scanner;

public class rintger{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		xed.nextLine();
		for(int j=0;j<t;j++)
		{
			String s=xed.nextLine();
			char[] c=s.toCharArray();
			int[] a=new int[c.length];
			for(int i=0;i<c.length;i++)
			{
				a[i]=romanToIntegerConverter(c[i]);
			}
			System.out.println(romanToNumberBuilder(a));
		}
		xed.close();
	}
	public static int romanToIntegerConverter(char a){
		switch(a){
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}
	public static int romanToNumberBuilder(int[] a){
		int sum=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1]&&a[i]!=0)
			{
				a[i]=a[i+1]-a[i];
				a[i+1]=0;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
}
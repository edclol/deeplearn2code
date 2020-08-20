
 
import java.util.Arrays;
import java.util.Scanner;
 
public class series1 {
 
public static void main(String[] args) {
        //准备数据
		System.out.println("请输入个数N:");
	    Scanner sc1=new Scanner(System.in);
	    int N=sc1.nextInt();
	    System.out.println("请输数列:");
		int[] a=new int[N];
		for (int i = 0; i < a.length; i++) {
			Scanner sc2=new Scanner(System.in);
		    a[i]=sc2.nextInt();
		}
		int count=0;
		int m=0;
		int[] sum=new int[N-2];
		for (int i = 0; i < a.length-2; i++) {
			//判断是否连续
			if (((a[i]-a[i+1]==-1&&a[i+1]-a[i+2]==-1))
					||((a[i]-a[i+1]==1)&&a[i+1]-a[i+2]==1)){
				count++;
			}else if(count!=0) {
				//等差数列求和
				if (count%2==0) {
					sum[m]=((count+2)/2)*(a[i-count]+a[i+1]);
				}else {
					sum[m]=(count+2)*(a[i-1]);
				}
				count=0;
				m++;	
			}else {
				count=0;
			}
			if ((i==a.length-3)&&(count!=0)) {
				if (count%2==0) {
					sum[m]=((count+2)/2)*(a[i-count]+a[i+1]);
				}else {
					sum[m]=(count+2)*(a[i-1]);
				}
			}
			
		}
		
		System.out.println(Arrays.toString(sum));
		Arrays.sort(sum);
		System.out.println("连续子数组的最大和为："+sum[N-3]);
	}
 
}
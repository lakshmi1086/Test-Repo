
public class Armstrong {

	public static void main(String[] args) {
		int num=371;
		int m=0;
		int sum=0;
		while(num!=0){
			m=num%10;
			sum=sum+(m*m*m);
			num=num/10;
		}
		System.out.println(sum);
		System.out.println("Printed Armstrong numbers");

	}

}

package week1.day1;

public class Fibonacci1 {

	public static void main(String[] args) {
		int i;
		int sum;
		int firstNum=0;
		int secNum=1;
		System.out.println(firstNum);
		System.out.println(secNum);
for (i = 1; i<=8; i++) {
	sum=firstNum+secNum;
System.out.println(sum);
}
firstNum=secNum;
secNum=sum;
	}

}

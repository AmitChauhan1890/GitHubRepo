package code;

public class CoreJavaLogic {
	public static void main(String[] args) {
		Object obj1[][]=new Object[10][1];
		for (int i = 0; i < obj1.length; i++)
			for(int j=0; j<1;j++)
			obj1[i][j]="Test"+i+j;
	System.out.println("length of onject array is: "+obj1.length);
	}
	
}

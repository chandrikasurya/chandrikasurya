package x;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a={1,2,3,2,1};
int length=a.length;
for(int i=0;i<length;i++)
{
	for(int j=0;j<length;j++)
	{
		if(j==i||j==(length-1-i))
		{
			System.out.print(a[j]);
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
}
	}

}

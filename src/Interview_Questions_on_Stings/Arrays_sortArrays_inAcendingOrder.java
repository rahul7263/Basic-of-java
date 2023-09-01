package Interview_Questions_on_Stings;

public class Arrays_sortArrays_inAcendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int n[] = {5,3,1,2,4};
		int temp=0;
		int L = n.length;
		
		
		for(int i=0; i<=L; i++)
		{
			for(int j=i+1; j<L; j++)
			{
				if(n[i]>n[j])       // 8>6
				{
					temp=n[i];       //temp=8
					n[i]=n[j];      // ar[i]=6
					n[j]=temp;       // ar[j]=8
				}
			}
		}
		for(int i=0; i<=L-1; i++)
		{
			System.out.print(n[i]+" ");
		}
				
	System.out.println("");
		
		for(int i=L-1; i>=0; i--)
		{
			System.out.print(n[i] +" ");
		}
	}

}

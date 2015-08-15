package ArraysStrings;


/*Dutch Flag Algorithm
 * 
 * */
public class SortZeroOneTwoInArray {
	
	public static void main(String args[])
	{
		int arr[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		int low=0;
		int mid=1;
		int high=arr.length-1;
		int temp;
     while(mid<=high)
     {
			if(arr[mid]==0) //swap it with low
			{  temp=arr[low];
			   arr[low]=arr[mid];
			   arr[mid]=temp;
				//mid++;
				low++;
				
				continue;
			}
			if(arr[mid]==1)  //no swapping
			{
			   mid++;	
			   continue;
			}
			if(arr[mid]==2)  //swap it with high
			{  temp=arr[high];
			   arr[high]=arr[mid];
			   arr[mid]=temp;
				
				//mid++;
				high--;
				continue;
			}
			
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	

}

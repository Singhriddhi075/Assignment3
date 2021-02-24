package Assignment3.Array;

public class Bubblesort {

	
	
	public static void main(String[] args) {
		int[] arr= {2,5,1,5,6,7};
      bubblesort(arr);
	}
	public static void bubblesort(int[] arr) {
		for(int counter=0;counter<=arr.length-1;counter++) {
			for(int j=0;j<arr.length-1-counter;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}

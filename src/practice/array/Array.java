package practice.array;

public class Array {
	public static void main(String []s) {
		int arr[] = {2,4,6,8,10};
		//int largest = linear_search(arr);
		//System.out.println("Largets of the array :"+largest);
		//int index = binary_search(arr,100);
		//System.out.println("index: " +index);
		/*reverse(arr);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		*/
		//pairs(arr);
		subarray(arr);
		
	}
	
	public static int linear_search(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for(int i =0 ; i<arr.length ; i++) {
			if(largest<arr[i]) {
				largest = arr[i];
			}
		}
		
		return largest;
	
	}
	
	public static int binary_search(int arr[], int key) {
		int start = 0 , end = arr.length-1;

		while(start <=end) {
			int mid = (start + end) /2;
			if(key == arr[mid]) {
				return mid;
			}
			else {
				if(key > arr[mid]){
					start = mid+1;
				}
				else {
					end = mid-1;
				}
			}
		
		
		}
		return -1;
		
	}
	
	public static void reverse(int arr[]) {
		int temp;
		int first = 0;
		int last = arr.length -1;
		while(first<last) {
				temp = arr[first];
				arr[first] = arr[last];
				arr[last] = temp;
				
				first++;
				last--;
			}
		
	}
	public static void pairs(int arr[]) {
		for(int i = 0 ; i <arr.length-1 ; i++) {
			for(int j = i+1 ; j<arr.length-1 ;j++) {
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}
	
	public static void subarray(int arr[]) {
		for(int i = 0 ; i< arr.length ;i++) {
			
			for(int j = i+1 ; j<arr.length ; j++) {
				int start = i;
				int end = j;
				int sum =0;
				while(start <= end) {
					System.out.print(arr[start]+" ");
					sum = sum +arr[start];
					start ++;
				}
				System.out.println();
				System.out.println("Sum of Subarray:"+sum);
				
			}
			
			
		}
	}

}

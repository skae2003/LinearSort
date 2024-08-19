
public class LinearSort {

	public static void main(String[] args) {
		
		int[] list = {5,3,9,7,6,12,4,1};
		
		for(int i = 0; i < list.length; ++i) {
			
			int smallest = i;
			
			for(int j = i + 1; j < list.length; ++j) {
				
				if(list[smallest] > list[j]) {
					smallest = j;
				}
				
			}
			
			int temp;
			
			temp = list[i];
			
			list[i] = list[smallest];
			
			list[smallest] = temp;
			
		}
		
		for(int i = 0; i < list.length; ++i) {
			
			System.out.println(list[i]);
			
		}

	}

}

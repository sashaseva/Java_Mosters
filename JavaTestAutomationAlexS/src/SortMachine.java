import java.util.Arrays;

public class SortMachine {
	public static void main(String[] args){
		
		String [] initialArray;
		initialArray = new String [] {"q","qwer", "qwert", "qw", "qwerty", "qwe"};
		String [] sortedArray = new String [initialArray.length];
		
		for (int i=0; i < initialArray.length;i++){
			int length = 0;
			int position = 0;
			
		for (int j=0; j < initialArray.length;j++){
			
			if (length < initialArray[j].length()){
				length = initialArray[j].length();
				sortedArray[i]=initialArray[j]; // setting max String length into sorted array
				position = j; // position of max length String in an array
					}
		}
		initialArray[position] = ""; //setting min length string to array so that it won't be counted
		}
		System.out.println(Arrays.toString(sortedArray));
	}
}
package Question6;
public class Deleteing{
	private static final int[] Array = null;
	static int[] array = {3,7,1,9,4};
	public static void deleteElement(int[] array ,int index) {
		
		int indexTodelete;
		int x = indexTodelete;
		
		int[] newArray = new int[array.length - 1]; 
		for (int i = 0, j = 0; i < array.length; i++) { 
		 if (i != indexTodelete) { 
		 newArray[j++] = array[i]; 
		 } 
		 else {
			 System.out.println( " Invalid index");
			
		 }
		} 
     
	}
	public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            
        }
        System.out.println();
    }   
    public static void main(String[] args) {
    	String x;
		System.out.print("Index to delete : " + x);
        int[] arrray = {3,7,1,9,4};
        printArray(Array);
        
		int indexTodelete;
		deleteElement(array, x);
        printArray(array);
   
		
	}

}

}
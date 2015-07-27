/* package whatever; // don't place package name! */

/* You are given an array, you have to replace each element of the array with product of the rest element. Example: {1,2,3}==> {6,3,2}  */
class NumReplace
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arry = {1,2,3};

		int product = 1;
		for(int i = 0;i<arry.length;i++){
			product = product*arry[i];
		}
		for(int i = 0;i<arry.length;i++){
			arry[i] = product/arry[i];
			System.out.println(arry[i]);
		}
		System.out.println("----");
		int[] arry2 = {1,2,3};
		withoutDivision(arry2);
		
	}
	
	public static void withoutDivision(int[] array){
	    int temp = 1;
	    int[] prod = new int[array.length];
	    
	    
	    for(int i = 0; i<array.length; i++){
	        prod[i] = temp;
	        temp *=array[i];
	    }
	    
	    temp = 1;
	    for(int j = array.length-1 ;j>=0;j--){
	        prod[j] *=temp;
	        temp *=array[j];
	    }
	    
	    for(int i = 0;i<prod.length;i++){
			
			System.out.println(prod[i]);
		}
	}
}
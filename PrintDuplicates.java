package bigarraydupl;


public class PrintDuplicates {

	 	private static BitSet bitset; 
	 	
	 	
	 	public static void main(String args[]) {
	 		bitset = new BitSet(32000);
	 		int[] arr = {2,45,3,6,7,8,1,3,23,34,45,7,8,6,4,2};
	 		duplPrint(arr);
	 	}
	 	
		public static  void duplPrint (int[] arr) {

			if((arr==null)||(arr.length==1)) return;
		
			boolean bool=false; //default, safe setting
	 
	  		for(int i=0; i<arr.length; i++) {
	  			bool = markBits(arr[i]);
	  			if(!bool) System.out.println(arr[i]);
	  		}
	  
		 }
	  
	  public static boolean markBits (int num) {
	  	
	  	if(!bitset.get(num-1))   
	  		{bitset.set(num-1);
	  		 return true; }
	  	else
	  		return false;
	  	
	  }
}


package bigarraydupl;

public class BitSet {
	
	private static int[] arr;
	
	public BitSet (int n){
		arr = new int[n>>5];  //div by 2 pow 5 
	}
	
	public boolean set (int n) {
//	find the corresponding int	arr[n>>5]
//	subtract full ints and use the bit number in that particular int, arr[n<<5] && 1<<( n- (n>>5)*32)
	arr[n>>5] =	((arr[n>>5]) | (1<<( n- ((n>>5)*32))));
	return true;
	
	}
	
	public boolean get (int n) {
	
	if	(((arr[n>>5]) & (1<<( n - ((n>>5)*32))))!=0) 
	    return true;  
//REFER IT WITH wordnumber bitnumber 
//mod 32 is & 0x1F
 else 
     return false;  
	}

}

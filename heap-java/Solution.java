// Heavily influenced by:
// https://www.youtube.com/watch?v=t0Cq6tVNRBA

class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.execute();
	}
	
	private int getParentIndex(int index) { return ((index-2)/2); }
	private int getLeftChildIndex(int index) { return ((index*2)+1); }
	private int getRightChildIndex(int index) { return ((index*2)+2); }

	private void execute() {
		for (int index=0;index<=9;index++) 
			System.out.println("The parent of index: "+index+", is : "+getParentIndex(index));

		
	}
}

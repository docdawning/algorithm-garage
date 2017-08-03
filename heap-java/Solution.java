// Heavily influenced by:
// https://www.youtube.com/watch?v=t0Cq6tVNRBA

class Solution {
	private boolean isMinHeap;

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.execute();
	}
	
	private int getParentIndex(int index) { return ((index-2)/2); }
	private int getLeftChildIndex(int index) { return ((index*2)+1); }
	private int getRightChildIndex(int index) { return ((index*2)+2); }

	private void execute() {
		isMinHeap = true;
		for (int index=0;index<=9;index++) 
			System.out.println("The parent of index: "+index+", is : "+getParentIndex(index));

	}

	private void insert(int value) {
		//add the element to the end of the heap

		//bubble it up to the appropriate position - comparisons will depend on "isMinHeap"
	}

	//this will remove the min if "isMinHeap", else it removes the max node
	private int removeRoot() {
		//the root is removed (return its value, for fun)

		//Move the last element to the root position

		//bubble the root down based on comparisons with children, swap it with the smaller of the two. Comparisons depend on "isMinHeap"
		

	}
}

import java.util.Scanner;
import java.lang.Integer;

public class Solution {
	public static void main(String[] args) {
		Solution solution  = new Solution();
		solution.begin();
	}

	private void begin() {
		System.out.println("Input ints, one per line, will get running avg back.");
		Scanner scanner = new Scanner(System.in);
		int N = 0;
		float avg = 0;

		try {
			while (scanner.hasNext()) {
				int nextInt = scanner.nextInt();
				avg = updateRunningAverage(++N, avg, nextInt);
				System.out.println("AVG: "+avg);
			}
		} catch (Exception e) {
			System.out.println("Scanner caught some exception");
			e.printStackTrace();
		}
	}

	//Using Wellford's Running Average Method: 
	//https://stackoverflow.com/questions/12636613/how-to-calculate-moving-average-without-keeping-the-count-and-data-total
	private float updateRunningAverage(int N, float avg, int sample) {
		if (N == 1) avg = sample;
		else avg = avg + ((sample-avg)/N);
		
		//System.out.println("Running average: "+avg+": N="+N+", sample="+sample);
		return avg;
	}
}

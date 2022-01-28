package matching;
import java.util.Random;
public class numbers {
	public int numlist[];
	
	public numbers() {
		numlist = new int[12];
	}
	
	public void shuffle() {
		Random rand = new Random();
		int r = rand.nextInt(12);
		int s = rand.nextInt(12);
		while (s==r) {
			s = rand.nextInt(12);
		}
		numlist[r] = numlist[s] = 1;
		
		while(numlist[r]!=0) {
			r =rand.nextInt(12);
		}
		while(numlist[s]!=0 || s==r) {
			s = rand.nextInt(12);
		}
		numlist[r]= numlist[s] = 2;
		
		while(numlist[r]!=0) {
			r =rand.nextInt(12);
		}
		while(numlist[s]!=0 || s==r) {
			s = rand.nextInt(12);
		}
		numlist[r]= numlist[s] = 3;
		
		while(numlist[r]!=0) {
			r =rand.nextInt(12);
		}
		while(numlist[s]!=0 || s==r) {
			s = rand.nextInt(12);
		}
		numlist[r]= numlist[s] = 4;
		
		while(numlist[r]!=0) {
			r =rand.nextInt(12);
		}
		while(numlist[s]!=0 || s==r) {
			s = rand.nextInt(12);
		}
		numlist[r]= numlist[s] = 5;
		
		while(numlist[r]!=0) {
			r =rand.nextInt(12);
		}
		while(numlist[s]!=0 || s==r) {
			s = rand.nextInt(12);
		}
		numlist[r]= numlist[s] = 6;
	}

}

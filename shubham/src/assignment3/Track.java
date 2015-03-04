package assignment3;
import java.util.*;

public class Track {
  
	int  random(){
		Random r = new Random();
		int a = 1000;
		int b =4000;
		int c = r.nextInt(b-a)+a;
		return c;
	}
	public int runLength = random() ;
	public int swimLength = random();
	public int cycleLength = random();
	
	
	
	
}

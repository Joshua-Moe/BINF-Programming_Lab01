
import java.util.Random;

public class randomDNA3mers {
	
	public static void main(String[] args) {
		int x = 0;
		int AAA = 0; // counter for occurrence of 'AAA' 3-mer
		while(x < 1000) 
		{
			int count = 0;
			String dna = ""; // variable for storing the built 3-mer
			while(count <= 2) 
			{	
				Random random = new Random();
				float f = random.nextFloat();
				
				/*
				 Part 1: When P(A) = P(C) = P(G) = P(T) = 0.25
				 (0.00) -- A -- (0.25) -- C -- (0.50) -- G -- (0.75) -- T -- (1.00) 
				 
				 Part 2: When P(A) = 0.12 | P(C) = 0.38 | P(G) = 0.39 | P(T) = 0.11
				 (0.00) -- A -- (0.12) -- C -- (0.50) -- G -- (0.89) -- T -- (1.00)
				*/
				
				//Substitute ranges for 'f' according it the corresponding Part (above).
				if (f >= 0 && f < 0.12) {
					dna = dna + "A";
				} else if (f >= 0.12 && f < 0.5) {
					dna = dna + "C";
				} else if (f >= 0.5 && f < 0.89) {
					dna = dna + "G";
				} else {
					dna = dna + "T";
				}
			
			
				count = count + 1; // inner while loop counter
			}
			System.out.println(dna);
			if (dna.equals("AAA")) {
				AAA = AAA + 1;
				}
			x = x + 1; // outer while loop counter
		}
		System.out.println("AAA was produced: " + AAA + " " + "times.");
		
		/*
		 [Part 1] 
		 The probability of the DNA 3-mer 'AAA' appearing by chance is equal to
		 (0.25)^3 = 0.015625. So out of 1000 random 3-mers, 15.625 of them should be 'AAA'.
		 This is consistent with the results produced from Java--I was ranging between 12 and 19.
		 
		 [Part 2]
		 The probability of the DNA 3-mer 'AAA' appearing by chance is equal to
		 (0.12)^3 = 0.001728. So out of 1000 random 3-mers, 1.728 of them should be 'AAA'.
		 This is consistent with the results produced from Java--I was ranging between 0 and 3.
		*/
		
	}
}

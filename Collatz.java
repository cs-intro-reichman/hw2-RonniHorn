// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int actions = 0;
		int currentSeed = seed; // the seed we are making actions on
		boolean loop = true;
		if(mode.equals("v"))
		{
			for(int i = 1; i<=seed; i++)
			{
				loop = true;
				currentSeed = i;
				System.out.print(currentSeed + " ");
				actions = 1; 
				while (loop){
					actions++;
					if(currentSeed%2 == 0){
						currentSeed = currentSeed/2;
					}
					else
					{
						currentSeed = (currentSeed * 3) + 1;
					}
					System.out.print(currentSeed + " ");
					if(currentSeed == 1)
					{
						loop = false;
					}
				}
				System.out.println("(" + actions + ")");
					
			}
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
		else
		{
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}

	}
}

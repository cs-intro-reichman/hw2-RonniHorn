// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int actions = 0;
		int currentSeed = seed; // the seed we are making actions on
		if(mode.equals("v"))
		{
			for(int i = 1; i<=seed; i++)
			{
				currentSeed = i;
				System.out.print(currentSeed + " ");
				actions = 1;
				while (currentSeed != 1){
					actions++;
					if(currentSeed%2 == 0){
						currentSeed = currentSeed/2;
					}
					else
					{
						currentSeed = (currentSeed * 3) + 1;
					}
					System.out.print(currentSeed + " ");
				}
				System.out.println("(" + actions + ")");
					
			}
		}
		else
		{
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}

	}
}

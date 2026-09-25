
public class Display
	{


		//Grid
		static String [][] WordleGrid = new String[6][5];

		
		
		public static void gridInit()
		{
			for(int row = 0; row < WordleGrid.length; row ++ )
			{
				if(row == 0)
				{
					System.out.println(".___________________.");
					System.out.println("|   |   |   |   |   |");
					System.out.println("|---|---|---|---|---|");
				}
				else if(row == WordleGrid.length - 1)
				{
					System.out.println("|   |   |   |   |   |");
					System.out.println("|___|___|___|___|___|");
				}
				else
				{
					System.out.println("|   |   |   |   |   |");
					System.out.println("|---|---|---|---|---|");
				}
			}
		}
	}





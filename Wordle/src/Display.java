
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
					break;
				}
				else
				{
					System.out.println("|   |   |   |   |   |");
					System.out.println("|---|---|---|---|---|");
				}
			}
		}
		
		public static void gridFill(String[][]letters)
		{
			int counter = 0;
			for(int row = 0; row < WordleGrid.length; row ++)
			{
				if(row < letters.length)
				{
					if(row == 0)
					{
						System.out.println(".___________________.");
						System.out.println("|   |   |   |   |   |");
						System.out.println("| " + letters[row][0] + " | " + letters[row][1] + " | " + letters[row][2] + " | " + letters[row][3] + " | " +letters[row][4] + " |");
						System.out.println("|---|---|---|---|---|");
						counter += 1;
					}
				
					else if(row == WordleGrid.length - 1)
					{
						System.out.println("| " + letters[row][0] + " | " + letters[row][1] + " | " + letters[row][2] + " | " + letters[row][3] + " | " +letters[row][4] + " |");
						System.out.println("|___|___|___|___|___|");
						break;
					}
					else
					{
						System.out.println("| " + letters[row][0] + " | " + letters[row][1] + " | " + letters[row][2] + " | " + letters[row][3] + " | " +letters[row][4] + " |");
						System.out.println("|---|---|---|---|---|");
						counter += 1;
					}	
				}
				else
				{
					if(counter == 0)
					{
						System.out.println(".___________________.");
						System.out.println("|   |   |   |   |   |");
						System.out.println("|---|---|---|---|---|");
						counter += 1;
					}
					else if(counter == WordleGrid.length - 1)
					{
						System.out.println("|   |   |   |   |   |");
						System.out.println("|___|___|___|___|___|");
						break;
					}
					else
					{
						System.out.println("|   |   |   |   |   |");
						System.out.println("|---|---|---|---|---|");
						counter += 1;
					}
				}
				
			}
		}
	}





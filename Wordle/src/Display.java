
public class Display
	{


		//Grid
		static String [][] WordleGrid = new String[6][5];

		public static final String RESET = "\u001B[0m";
		public static final String RED = "\u001B[31m";
		public static final String GREEN = "\u001B[32m";
		public static final String YELLOW = "\u001B[33m";
		public static final String BLUE = "\u001B[34m";
		public static final String PURPLE = "\u001B[35m";
		public static final String CYAN = "\u001B[36m";

		
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
			String [] word = Main.word.split("");
			int counter = 0;
			for(int row = 0; row < WordleGrid.length; row ++)
			{
				if(row < letters.length)
				{
					if(row == 0)
					{
						System.out.println(".___________________.");
						System.out.println("|   |   |   |   |   |");
						for(int col = 0; col < WordleGrid[row].length; col ++)
						{
							if(col == 0)
							{
								if(letters[row][col] == word[col])
								{
									System.out.println("| " + GREEN +letters[row][col] + RESET);	
								}
								else if(letters[row][col] != word[col])
								{
									for(int letter = 0; letter < WordleGrid[row].length; letter ++)
									{
										if(letter != col && letters[row][col] == word[col] )
										{
											System.out.println("| " + YELLOW +letters[row][col] + RESET);	
										}
										else
										{
											System.out.println("| " + letters[row][col]);
											break;
										}
									}
								}	
							}
							else if(col == WordleGrid[row].length - 1)
							{
								if(letters[row][col] == word[col])
								{
									System.out.print("| " + GREEN +letters[row][col] + RESET + " |");	
								}
								else if(letters[row][col] != word[col])
								{
									for(int letter = 0; letter < WordleGrid[row].length; letter ++)
									{
										if(letter != col && letters[row][col] == word[col] )
										{
											System.out.print("| " + YELLOW +letters[row][col] + RESET + " |");	
										}
										else
										{
											System.out.print("| " + letters[row][col] + " |");
											break;
										}
									}
								}
							}
							else
							{
								if(letters[row][col].equals(word[col]))
								{
									System.out.print(" | " + GREEN +letters[row][col] + RESET);
								}
								else if(letters[row][col] != word[col])
								{
									for(int letter = 0; letter < WordleGrid[row].length; letter ++)
									{
										if(letter != col && letters[row][col] == word[col] )
										{
											System.out.print(" | " + YELLOW +letters[row][col] + RESET);
										}
										else
										{
											System.out.print(" | " + letters[row][col]);
											break;
										}
									}
								}
							}

						}
						System.out.println("|---|---|---|---|---|");
						counter += 1;
						///
					}
				
					else if(row == WordleGrid.length - 1)
					{
						for(int col = 0; col < WordleGrid[row].length; col ++)
						{
							if(col == 0)
							{
								if(letters[row][col] == word[col])
								{
									System.out.println("| " + GREEN +letters[row][col] + RESET);	
								}
								else if(letters[row][col] != word[col])
								{
									for(int letter = 0; letter < WordleGrid[row].length; letter ++)
									{
										if(letter != col && letters[row][col] == word[col] )
										{
											System.out.println("| " + YELLOW +letters[row][col] + RESET);	
										}
										else
										{
											System.out.println("| " + letters[row][col]);
											break;
										}
									}
								}	
							}
							else if(col == WordleGrid[row].length - 1)
							{
								if(letters[row][col] == word[col])
								{
									System.out.print("| " + GREEN +letters[row][col] + RESET + " |");	
								}
								else if(letters[row][col] != word[col])
								{
									for(int letter = 0; letter < WordleGrid[row].length; letter ++)
									{
										if(letter != col && letters[row][col] == word[col] )
										{
											System.out.print("| " + YELLOW +letters[row][col] + RESET + " |");	
										}
										else
										{
											System.out.print("| " + letters[row][col] + " |");
											break;
										}
									}
								}
							}
							else
							{
								if(letters[row][col] == word[col])
								{
									System.out.print(" | " + GREEN +letters[row][col] + RESET);	
								}
								else if(letters[row][col] != word[col])
								{
									for(int letter = 0; letter < WordleGrid[row].length; letter ++)
									{
										if(letter != col && letters[row][col] == word[col] )
										{
											System.out.print(" | " + YELLOW +letters[row][col] + RESET);	
										}
										else
										{
											System.out.print(" | " + letters[row][col]);
											break;
										}
									}
								}
							}

						}
						System.out.println("|___|___|___|___|___|");
						break;
					}
					else
					{
						for(int col = 0; col < WordleGrid[row].length; col ++)
						{
							if(col == 0)
							{
								if(letters[row][col] == word[col])
								{
									System.out.println("| " + GREEN +letters[row][col] + RESET);	
								}
								else if(letters[row][col] != word[col])
								{
									for(int letter = 0; letter < WordleGrid[row].length; letter ++)
									{
										if(letter != col && letters[row][col] == word[col] )
										{
											System.out.println("| " + YELLOW +letters[row][col] + RESET);	
										}
										else
										{
											System.out.println("| " + letters[row][col]);
											break;
										}
									}
								}	
							}
							else if(col == WordleGrid[row].length - 1)
							{
								if(letters[row][col] == word[col])
								{
									System.out.print("| " + GREEN +letters[row][col] + RESET + " |");	
								}
								else if(letters[row][col] != word[col])
								{
									for(int letter = 0; letter < WordleGrid[row].length; letter ++)
									{
										if(letter != col && letters[row][col] == word[col] )
										{
											System.out.print("| " + YELLOW +letters[row][col] + RESET + " |");	
										}
										else
										{
											System.out.print("| " + letters[row][col] + " |");
											break;
										}
									}
								}
							}
							else
							{
								if(letters[row][col] == word[col])
								{
									System.out.print(" | " + GREEN +letters[row][col] + RESET);	
								}
								else if(letters[row][col] != word[col])
								{
									for(int letter = 0; letter < WordleGrid[row].length; letter ++)
									{
										if(letter != col && letters[row][col] == word[col] )
										{
											System.out.print(" | " + YELLOW +letters[row][col] + RESET);	
										}
										else
										{
											System.out.print(" | " + letters[row][col]);
											break;
										}
									}
								}
							}

						}
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
		
			public static void fillCol()
				{
						
				}
	}







import java.util.Scanner;
public class Main
	{  
		public static void main(String[] args)
			{
				String Word = "AEIOU";
				String [][] words = {{"A"}, {"E"}, {"I"}, {"O"}, {"U"}};
				Display.gridFill(words);
				System.out.println(word);
			}
		
	    static String word = getWord();

		
		public static String getWord()
		{
			int ranNumber = (int)(Math.random() * List.list.length) + 1;
			return List.list[ranNumber];
		}

	}


public class Main
	{

		public static void main(String[] args)
			{
			
				Display.gridInit();
			}
		
		
		
		
		public static String getWord()
		{
			int ranNumber = (int)(Math.random() * List.list.length) + 1;
			return List.list[ranNumber];
		}

	}

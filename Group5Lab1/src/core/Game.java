package core;

import java.util.LinkedList;


public class Game 
{
	
	public static void main(String[] args)
	{
		Round r = new Round();
		LinkedList<Roll> rolls = r.getRolls();
		
		for(int i = 0; i < r.getRolls().size(); i++)
		{
			System.out.print(rolls.get(i).getScore());
			System.out.print(", ");
		}
		
		System.out.println(r.getWinLose());
		
		
	}
}

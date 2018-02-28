package core;

import java.util.LinkedList;

public class Round 
{

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore
		boolean gameOver = false;
		Roll CMR = new Roll();
		ComeOutScore = CMR.getScore();
		rolls.add(CMR);
		
		if(ComeOutScore == 7 || ComeOutScore == 11)
		{
			gameOver = true;
			eGameResult = eGameResult.NATURAL;
		}
		
		if(ComeOutScore == 2 || ComeOutScore == 12 || ComeOutScore == 3)
		{
			gameOver = true;
			eGameResult = eGameResult.CRAPS;
		}
		
		while(!gameOver)
		{
			Roll r = new Roll();
			rolls.add(r);
			
			if(r.getScore() == 7)
			{
				gameOver = true;
				eGameResult = eGameResult.SEVEN_OUT;
			}
			
			else if(r.getScore() == ComeOutScore)
			{
				gameOver = true;
				eGameResult = eGameResult.POINT;
			}
		}

	}

	public int RollCount() 
	{
		return rolls.size();
	}
	
	public LinkedList<Roll> getRolls()
	{
		return rolls;
	}
	
	public eGameResult getWinLose()
	{
		return eGameResult;
	}

}

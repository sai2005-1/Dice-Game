import TurtleGraphics.KeyboardReader;
import java.util.Random;
public class DiceGameMethod 
{
	KeyboardReader reader = new KeyboardReader();
	Random genarator = new Random();
	public void Game()
	{
		int score=1000, bet;
		int roll1, roll2, number;
		char ask;
		
		roll1=genarator.nextInt(6)+1;
		roll2=genarator.nextInt(6)+1;
		
		
		System.out.println("You have "+score+" points");
		System.out.print("Points to risk: ");
		bet=reader.readInt();
		while(bet>score)
		{
			System.out.println("You only have "+score+"points. You can't risk more than your points");
			System.out.print("Points to risk: ");
			bet=reader.readInt();
		}
		System.out.println("Roll is "+roll1+" and "+roll2);
		number=roll1+roll2;
		if(number%2==0)
		{
			System.out.println("You win");
			bet=bet*2;
			score=score+bet;
		}
		else if(number%2!=0)
		{
			System.out.println("You lose ");
			score=score-bet;
		}
		System.out.print("Play again? (y/n): ");
		ask=reader.readChar();
		
		if((ask!='n')&&(ask=='y'))
		{
			DiceGameMethod object = new DiceGameMethod();
			object.Regame(score);
		}
		else if((ask!='y')&&(ask=='n'))
		{
			System.out.println();
			System.out.println("Final score: "+score);
		}
	}
		
		public int Regame(int score2)
		{
			int  bet;
			int roll1, roll2, number;
			char ask;
			System.out.println();
			roll1=genarator.nextInt(6)+1;
			roll2=genarator.nextInt(6)+1;
			
			if(score2==0)
			{
				DiceGameMethod object = new DiceGameMethod();
				object.End();
			}
			System.out.println("You have "+score2+" points");
			System.out.print("Points to risk: ");
			bet=reader.readInt();
			while(bet>score2)
			{
				System.out.println("You have "+score2+" points. You can't risk more than your points");
				System.out.print("Points to risk: ");
				bet=reader.readInt();
			}
			System.out.println("Roll is "+roll1+" and "+roll2);
			number=roll1+roll2;
			if(number%2==0)
			{
				System.out.println("You win");
				bet=bet*2;
				score2=score2+bet;
			}
			else if(number%2!=0)
			{
				System.out.println("You lose ");
				score2=score2-bet;
			}
			System.out.print("Play again? (y/n): ");
			ask=reader.readChar();
			
			if((ask!='n')&&(ask=='y'))
			{
				DiceGameMethod object = new DiceGameMethod();
				object.Regame(score2);
			}
			else if((ask!='y')&&(ask=='n'))
			{
				System.out.println();
				System.out.println("Final score: "+score2);
			}
			return score2;
			
		}
		public void End()
		{
			System.out.println("You have 0 points");
			System.out.println("--Game Ends--");
			
		
			System.exit(0);
			
		}
		
		
		
		
		
		
		
		
	
}

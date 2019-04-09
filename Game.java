import java.util.Scanner;
public class Game 
{
	private int computerwins;
	private int userwins;
	private boolean userquits;
	private HandPosition computer;
	private HandPosition user;
	private Scanner input;

	public Game()
	{
		computerwins =0;
		userwins = 0;
	}

	public boolean isdone(Game game,String choice)
	{
		return (game.userwins==5)||(game.computerwins==5)||(choice.equals("quit"));
	}

	public void makechoice()
	{
		System.out.println("Please choose one of the following:");

	}

	public String getChoiceFromUser()
	{

		String choice;
		System.out.println("What is your choice? (rock, paper, scissor, lizard or spock)");
		Scanner input = new Scanner(System.in);
		choice = input.next();
		return choice;

	}

	public void displayRoundresult(String result)
	{
		System.out.println(result);
	}

	public void displayGameResult() {
		if (userwins>computerwins){
			System.out.println("you win "+userwins+" to "+computerwins);
		}else if (userwins==computerwins){	
			System.out.println("it is a tie game,"+userwins+" to "+computerwins);
		}else if (userwins<computerwins){
			System.out.println("you lose "+computerwins+" to "+userwins);
		}
		
	}

	public void computerWins()
	{
		computerwins++;
	}
	
	public void userWins()
	{
		userwins++;	
	}

}
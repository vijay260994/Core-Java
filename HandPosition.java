import java.util.Random;

public class HandPosition 
{
	private String choice;
	private Random rnd;

	public HandPosition() {
		this.rnd = new Random();
	}

	public void Randomchoice() 
	{

		Game game = new Game();
		int num;
		boolean flag = true;
		

		while (true)
		{
			this.choice = game.getChoiceFromUser();
			num = 1 + rnd.nextInt(5);
					// //rock=1,paper=2,scissor=3,lizard=4,spock=5;

			if (game.isdone(game, this.choice))
			{
				game.displayGameResult();
				break;
			}

			if (num == 1 && choice.equals("scissor")) {
				game.displayRoundresult("you lose: rock crushes scissor\n");
				game.computerWins();
			} else if (num == 1 && choice.equals("rock")) {
				game.displayRoundresult("tie: both choose rock\n");
			} else if (num == 1 && choice.equals("paper")) {
				game.displayRoundresult("you win: paper covers rock\n");
				game.userWins();
			} else if (num == 1 && choice.equals("lizard")) {
				game.displayRoundresult("you lose: rock crushes lizard\n");
				game.computerWins();
			} else if (num == 1 && choice.equals("spock")) {
				game.displayRoundresult("you win: spock vaporizes rock\n");
				game.userWins();
			} else if (num == 2 && choice.equals("rock")) {
				game.displayRoundresult("you lose: paper covers rock\n");
				game.computerWins();
			} else if (num == 2 && choice.equals("paper")) {
				game.displayRoundresult("tie: both choose paper\n");
			} else if (num == 2 && choice.equals("scissor")) {
				game.displayRoundresult("you win: scissor cut paper\n");
				game.userWins();
			} else if (num == 2 && choice.equals("lizard")) {
				game.displayRoundresult("you win: lizard eats paper\n");
				game.userWins();
			} else if (num == 2 && choice.equals("spock")) {
				game.displayRoundresult("you lose: paper disproves spock\n");
				game.computerWins();
			} else if (num == 3 && choice.equals("rock")) {
				System.out.println("you win: rock crushes scissor\n");
				game.userWins();
			} else if (num == 3 && choice.equals("paper")) {
				System.out.println("you win: paper covers rock\n");
				game.userWins();
			} else if (num == 3 && choice.equals("scissor")) {
				System.out.println("tie: both choose scissor\n");
			} else if (num == 3 && choice.equals("lizard")) {
				System.out.println("you lose: scissor decapitates lizard\n");
				game.computerWins();
			} else if (num == 3 && choice.equals("spock")) {
				System.out.println("you win: spock smashes scissor\n");
				game.userWins();
			} else if (num == 4 && choice.equals("rock")) {
				System.out.println("you win: rock crushes lizard\n");
				game.userWins();
			} else if (num == 4 && choice.equals("paper")) {
				System.out.println("you lose: lizard eats paper\n");
				game.userWins();
			} else if (num == 4 && choice.equals("scissor")) {
				System.out.println("you lose: scissor decapitates lizard\n");
				game.computerWins();
			} else if (num == 4 && choice.equals("lizard")) {
				System.out.println("tie: both choose lizard\n");
			} else if (num == 4 && choice.equals("spock")) {
				System.out.println("you lose: lizard poisons spock\n");
				game.computerWins();
			} else if (num == 5 && choice.equals("rock")) {
				System.out.println("you lose: spock vaporises rock\n");
				game.computerWins();
			} else if (num == 5 && choice.equals("paper")) {
				System.out.println("you win: paper disproves spock\n");
				game.userWins();
			} else if (num == 5 && choice.equals("scissor")) {
				System.out.println("you lose:spock smashes scissor\n");
				game.computerWins();
			} else if (num == 5 && choice.equals("lizard")) {
				System.out.println("you win: lizard poisons spock\n");
				game.userWins();
			} else if (num == 5 && choice.equals("spock")) {
				System.out.println("tie:both choose spock\n");
			} else if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 && !(choice.equals("scissor"))
					|| !(choice.equals("paper")) || !(choice.equals("quit"))) {
				game.makechoice();
			} else if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 && !(choice.equals("rock"))
					|| !(choice.equals("lizard")) || !(choice.equals("spock"))) {
				game.makechoice();
			}

		}

	}

	public boolean setchoice;

	public String choices() {
		return null;
	}

	public int compare() {
		return 0;
	}

	public String getname() {
		return null;
	}

}
package U5T3;

/**
 *  This class represents a CoinGame object
 * 
 * @author Alfred Zeng
 */
public class CoinGame {

    /** Starting coins of CoinGame */ 
    private int startingCoins;  

    /** Max rounds for which CoinGame can be played */
    private int maxRounds;      

    /** Tracks current round number */
    private int roundTracker = 1; 
    
    /**
     * Instantiates a CoinGame object
     * 
     * @param s The number of starting coins
     * @param r The max number of rounds which can be played
     */
    public CoinGame(int s, int r) {
    startingCoins = s;
    maxRounds = r;
    }
     
    /** 
     * Method that returns the number of coins player 1 will spend (1, 2 or 3)
     * 
     * @return the number of coins that player 1 will spend
     */
    public int getPlayer1Move() {
        int result;
        if (roundTracker == 1 || roundTracker == 2 || roundTracker == 4) {
            result = 2;
        } else if (roundTracker == 3) {
            result = 1;
        } else {
            result = 3;
        }
        roundTracker++;
        return result;
    }
     
    /** 
     * Method that returns the number of coins player 2 will spend (1, 2 or 3)
     * 
     * @param round The current round of the game
     * @return the number of coins that player 2 will spend
     */
    public int getPlayer2Move(int round) {
    if (round % 3 == 0) {
        return 3;
    } else if (round % 2 == 0) {
        return 2;
    } 
    return 1;
    }
  
    
    
    /** Plays a simulated game between two players */
    public void playGame() {
        int player1Coins = startingCoins;
        int player2Coins = startingCoins;
        int player1Played = 0;
        int player2Played = 0;
        int rounds = 1;
    
        while (rounds <= maxRounds && (player1Coins >= 3 && player2Coins >= 3)) {
            player1Played = getPlayer1Move();
            player2Played = getPlayer2Move(rounds);
            player1Coins -= player1Played;
            player2Coins -= player2Played;
    
            if (player1Played + 1 == player2Played || player1Played -1 == player2Played) {
                player2Coins++;
            }
            else if(player1Played == player2Played) {
                player2Coins++;
            } else {
                player1Coins += 2;
            }
            rounds++;
        }
        if (player1Coins == player2Coins) {
            System.out.println("tie game");
        } else if (player1Coins > player2Coins) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
    }
  
    }
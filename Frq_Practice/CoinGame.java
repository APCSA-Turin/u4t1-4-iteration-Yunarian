
public class CoinGame {
        private int startingCoins;  // starting number of coins
        private int maxRounds;      // maximum number of rounds played
        private int roundTracker = 1; // ADDED TO ENABLE TESTING
        
        
        public CoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
        }
         
        /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
            THIS WAS AN "implementation not shown" METHOD IN THE ORIGINAL FRQ,
            BUT IS INCLUDED HERE TO ENABLE TESTING
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
         
        /** Returns the number of coins (1, 2, or 3) that player 2 will spend,
          * as described in part (a).
          */
        public int getPlayer2Move(int round) {
        if (round % 3 == 0) {
            return 3;
        } else if (round % 2 == 0) {
            return 2;
        } 
        return 1;
        }
      
        
        
        /** Plays a simulated game between two players, as described in part
          * (b).
          */
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
        
        
        
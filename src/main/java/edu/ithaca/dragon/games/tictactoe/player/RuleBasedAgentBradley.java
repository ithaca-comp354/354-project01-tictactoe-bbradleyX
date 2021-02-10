package edu.ithaca.dragon.games.tictactoe.player;

import org.javatuples.Pair;

import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;

/**
 * Rule 1: If I have a winning move, take it.
     * Rule 2: If the opponent has a winning move, block it.
     * Rule 3: If I can create a fork (two winning ways) after this move, do it.
     * Rule 4: Do not let the opponent creating a fork after my move. (Opponent may block your winning move and create a fork.)
     * Rule 5: Place in the position such as I may win in the most number of possible ways.
 */
public class RuleBasedAgentBradley implements TicTacToePlayer {
  /*    Possible Coordinates : {0, 0}, {0, 1}, {0, 2} | {1, 0}, {1, 1},{1, 2} |  {2, 0}, {2, 1}, {2, 2} */
         
        @Override
          public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol){
            TicTacToeBoard curCopy = curBoard.copyBoard();
            //Rule 1: If I have a winning move, take it.
            /*  Copy Board, use checkSquare method to determine location (ex. Pair <0,0>), if the returned char is agent's then
            use is SquareOpen to see if the spot is available then call setSquare method for the winning coordinate*/

            //Top of row winning move -- x=0
            if(curCopy.checksquare(new Pair<>(0,1)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,2)) == yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(0,0))){
                        return new Pair<>(0,0);
                    }
                }
            }
            //Middle row winning move  -- x=0
            if(curCopy.checksquare(new Pair<>(0,0)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,2)) == yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(0,1))){
                        return new Pair<>(0,1);
                    }
                }
            }
            //Bottom of row winning move  -- x=0
            if(curCopy.checksquare(new Pair<>(0,0)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,1)) == yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(1,2))){
                        return new Pair<>(1,2);
                    }
                }
            }

            //Top of row winning move  -- x=1
            if(curCopy.checksquare(new Pair<>(1,1)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(1,2)) == yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(1,0))){
                        return new Pair<>(1,0);
                    }
                }
            }
            //Middle row winning move  -- x=1
            if(curCopy.checksquare(new Pair<>(1,0)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(1,2)) == yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(1,1))){
                        return new Pair<>(1,1);
                    }
                }
            }
            //Bottom of row winning move  -- x=1
            if(curCopy.checksquare(new Pair<>(1,0)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(1,1)) == yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(1,2))){
                        return new Pair<>(1,2);
                    }
                }
            }

            
            //Top of row winning move  -- x=2
            if(curCopy.checksquare(new Pair<>(2,1)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,2)) == yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(2,0))){
                        return new Pair<>(2,0);
                    }
                }
            }
            //Middle row winning move  -- x=2
            if(curCopy.checksquare(new Pair<>(2,0)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,2)) == yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(2,1))){
                        return new Pair<>(2,1);
                    }
                }
            }
            //Bottom of row winning move  -- x=2
            if(curCopy.checksquare(new Pair<>(2,0)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,1)) == yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(2,2))){
                        return new Pair<>(2,2);
                    }
                }
            }

            //Rule 2: If the opponent has a winning move, block it.
            /* Copy Board, use checkSquare method to determine location (ex. Pair <0,0>), if the returned char is not the agent's then 
            use is SquareOpen to see if the spot is available then call setSquare method for the proper blocking coordinate*/
            
            //Top of row blocking move -- x=0
            if(curCopy.checksquare(new Pair<>(0,1)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,2)) != yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(0,0))){
                        return new Pair<>(0,0);
                    }
                }
            }
            //Middle row blocking move  -- x=0
            if(curCopy.checksquare(new Pair<>(0,0)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,2)) != yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(0,1))){
                        return new Pair<>(0,1);
                    }
                }
            }
            //Bottom of row blocking move  -- x=0
            if(curCopy.checksquare(new Pair<>(0,0)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,1)) != yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(0,2))){
                        return new Pair<>(0,2);
                    }
                }
            }
            
            //Top of row blocking move -- x=1
            if(curCopy.checksquare(new Pair<>(1,1)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(1,2)) != yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(1,0))){
                        return new Pair<>(1,0);
                    }
                }
            }
            //Middle row blocking move  -- x=1
            if(curCopy.checksquare(new Pair<>(1,0)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(1,2)) != yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(1,1))){
                        return new Pair<>(1,1);
                    }
                }
            }
            //Bottom of row blocking move  -- x=1
            if(curCopy.checksquare(new Pair<>(1,0)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(1,1)) != yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(1,1))){
                        return new Pair<>(1,2);
                    }
                }
            }
            
            //Top of row blocking move -- x=2
            if(curCopy.checksquare(new Pair<>(2,1)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,2)) != yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(2,0))){
                        return new Pair<>(2,0);
                    }
                }
            }
            //Middle row blocking move  -- x=2
            if(curCopy.checksquare(new Pair<>(2,0)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,2)) != yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(2,1))){
                        return new Pair<>(2,1);
                    }
                }
            }
            //Bottom of row blocking move  -- x=2
            if(curCopy.checksquare(new Pair<>(2,0)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,2)) != yourSymbol){
                    if(curCopy.isSquareOpen(new Pair<>(2,2))){
                        return new Pair<>(2,2);
                    }
                }
            }

            //Rule 3: If I can create a fork (two winning ways) after this move, do it.
            /* Copy Board, use checkSquare method to determine location (ex. Pair <0,0>), if the returned char is not the agent's then 
            use is SquareOpen to see if the spot is available then call setSquare method for a method, if possible, with 2 way of winning*/
            
            //Top of row 2-way winning move -- (0,0)
            if(curCopy.checksquare(new Pair<>(0,1)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,2)) == yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,0)) == yourSymbol){
                        if(curCopy.checksquare(new Pair<>(2,0)) == yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(0,0))){
                                return new Pair<>(0,0);
                            }
                        }
                        
                    }
                }
            }

            //Top of row 2-way winning move -- (0,1)
            if(curCopy.checksquare(new Pair<>(0,0)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,2)) == yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,1)) == yourSymbol){
                        if(curCopy.checksquare(new Pair<>(2,1)) == yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(0,1))){
                                return new Pair<>(0,1);
                            }
                        }
                        
                    }
                }
            }
            
            //Top of row 2-way winning move -- (0,2)
            if(curCopy.checksquare(new Pair<>(0,0)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,1)) == yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,2)) == yourSymbol){
                        if(curCopy.checksquare(new Pair<>(2,2)) == yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(0,2))){
                                return new Pair<>(0,2);
                            }
                        }
                        
                    }
                }
            }


            //Top of row 2-way winning move -- (1,0)
            if(curCopy.checksquare(new Pair<>(0,0)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,0)) == yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,1)) == yourSymbol){
                        if(curCopy.checksquare(new Pair<>(1,2)) == yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(1,0))){
                                return new Pair<>(1,0);
                            }
                        }
                        
                    }
                }
            }

            //Top of row 2-way winning move -- (1,1)
            if(curCopy.checksquare(new Pair<>(0,1)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,1)) == yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,0)) == yourSymbol){
                        if(curCopy.checksquare(new Pair<>(1,2)) == yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(1,1))){
                                return new Pair<>(1,1);
                            }
                        }
                        
                    }
                }
            }

            //Top of row 2-way winning move -- (1,2)
            if(curCopy.checksquare(new Pair<>(0,2)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,2)) == yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,0)) == yourSymbol){
                        if(curCopy.checksquare(new Pair<>(1,1)) == yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(1,2))){
                                return new Pair<>(1,2);
                            }
                        }
                        
                    }
                }
            }


            //Top of row 2-way winning move -- (2,0)
            if(curCopy.checksquare(new Pair<>(0,0)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(1,0)) == yourSymbol){
                    if(curCopy.checksquare(new Pair<>(2,1)) == yourSymbol){
                        if(curCopy.checksquare(new Pair<>(2,2)) == yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(2,0))){
                                return new Pair<>(2,0);
                            }
                        }
                        
                    }
                }
            }
            //Top of row 2-way winning move -- (2,1)
            if(curCopy.checksquare(new Pair<>(2,0)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,2)) == yourSymbol){
                    if(curCopy.checksquare(new Pair<>(0,1)) == yourSymbol){
                        if(curCopy.checksquare(new Pair<>(1,1)) == yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(2,1))){
                                return new Pair<>(2,1);
                            }
                        }
                        
                    }
                }
            }

            //Top of row 2-way winning move -- (2,2)
            if(curCopy.checksquare(new Pair<>(0,2)) == yourSymbol){
                if(curCopy.checksquare(new Pair<>(1,2)) == yourSymbol){
                    if(curCopy.checksquare(new Pair<>(2,0)) == yourSymbol){
                        if(curCopy.checksquare(new Pair<>(2,1)) == yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(2,2))){
                                return new Pair<>(2,2);
                            }
                        }
                        
                    }
                }
            }

            //Rule 4: Do not let the opponent creating a fork after my move. (Opponent may block your winning move and create a fork.)
            /* Copy Board, use checkSquare method to determine location (ex. Pair <0,0>), if the returned char is not the agent's then 
            use is SquareOpen to see if the spot is available then call setSquare method for a coordinate that doesn't allow the opponent to fork*/

             //Top of row 2-way winning move -- (0,0)
             if(curCopy.checksquare(new Pair<>(0,1)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,2)) != yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,0)) != yourSymbol){
                        if(curCopy.checksquare(new Pair<>(2,0)) != yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(0,0))){
                                return new Pair<>(0,0);
                            }
                        }
                        
                    }
                }
            }

            //Top of row 2-way winning move -- (0,1)
            if(curCopy.checksquare(new Pair<>(0,0)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,2)) != yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,1)) != yourSymbol){
                        if(curCopy.checksquare(new Pair<>(2,1)) != yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(0,1))){
                                return new Pair<>(0,1);
                            }
                        }
                        
                    }
                }
            }
            
            //Top of row 2-way winning move -- (0,2)
            if(curCopy.checksquare(new Pair<>(0,0)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(0,1)) != yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,2)) != yourSymbol){
                        if(curCopy.checksquare(new Pair<>(2,2)) != yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(0,2))){
                                return new Pair<>(0,2);
                            }
                        }
                        
                    }
                }
            }


            //Top of row 2-way winning move -- (1,0)
            if(curCopy.checksquare(new Pair<>(0,0)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,0)) != yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,1)) != yourSymbol){
                        if(curCopy.checksquare(new Pair<>(1,2)) != yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(1,0))){
                                return new Pair<>(1,0);
                            }
                        }
                        
                    }
                }
            }

            //Top of row 2-way winning move -- (1,1)
            if(curCopy.checksquare(new Pair<>(0,1)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,1)) != yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,0)) != yourSymbol){
                        if(curCopy.checksquare(new Pair<>(1,2)) != yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(1,1))){
                                return new Pair<>(1,1);
                            }
                        }
                        
                    }
                }
            }

            //Top of row 2-way winning move -- (1,2)
            if(curCopy.checksquare(new Pair<>(0,2)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,2)) != yourSymbol){
                    if(curCopy.checksquare(new Pair<>(1,0)) != yourSymbol){
                        if(curCopy.checksquare(new Pair<>(1,1)) != yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(1,2))){
                                return new Pair<>(1,2);
                            }
                        }
                        
                    }
                }
            }


            //Top of row 2-way winning move -- (2,0)
            if(curCopy.checksquare(new Pair<>(0,0)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(1,0)) != yourSymbol){
                    if(curCopy.checksquare(new Pair<>(2,1)) != yourSymbol){
                        if(curCopy.checksquare(new Pair<>(2,2)) != yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(2,0))){
                                return new Pair<>(2,0);
                            }
                        }
                        
                    }
                }
            }
            //Top of row 2-way winning move -- (2,1)
            if(curCopy.checksquare(new Pair<>(2,0)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(2,2)) != yourSymbol){
                    if(curCopy.checksquare(new Pair<>(0,1)) != yourSymbol){
                        if(curCopy.checksquare(new Pair<>(1,1)) != yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(2,1))){
                                return new Pair<>(2,1);
                            }
                        }
                        
                    }
                }
            }

            //Top of row 2-way winning move -- (2,2)
            if(curCopy.checksquare(new Pair<>(0,2)) != yourSymbol){
                if(curCopy.checksquare(new Pair<>(1,2)) != yourSymbol){
                    if(curCopy.checksquare(new Pair<>(2,0)) != yourSymbol){
                        if(curCopy.checksquare(new Pair<>(2,1)) != yourSymbol){
                            if(curCopy.isSquareOpen(new Pair<>(2,2))){
                                return new Pair<>(2,2);
                            }
                        }
                        
                    }
                }
            }


            //Rule 5: Place in the position such as I may win in the most number of possible ways.
            /* Copy Board, use checkSquare method to determine location (ex. Pair <0,0>), if the returned char is not the agent's then 
            use is SquareOpen to see if the spot is available then call setSquare method for a coordinate that allows you the most likely win
            (probabaly place your symbol in the center of board)*/

            //Top of row 2-way winning move -- (2,2)
                if(curCopy.isSquareOpen(new Pair<>(1,1))){
                    return new Pair<>(1,1);
                }

            
            throw new IllegalArgumentException("Board with no moves given to player:\n" + curBoard.displayString());

 }
}

package diceroller;

import javax.swing.*;																											//To be able to use dialoguesquares.
import java.util.Calendar;																										//To be able to get calendar properties.	
																


public class dice {																		

		public static void main (String[] args)  {																				//Main method									
	
			String d = Calendar.getInstance().getTime().toString();									
			JOptionPane.showMessageDialog(null, "Evy Svensson" + "\n " + d);           				 		
		
		 
			int laps = 0;																										// Declaring most variables in the main-method to keep them organized.
			int userinput = 0;
			int number = 1;
			int sum = 0;
			int choice; 
			
			
			do {																												//'Do' starts the outer loop wich will keep the program running as long as the user wants it.
			String nrofdice = JOptionPane.showInputDialog(null,"Välj mellan 1-4 tärningar som skall kastas");    				//Inputbox returning a string, 'nrofdice'.
				
			userinput = Integer.parseInt(nrofdice);																				//Turning the string variable 'nrofdice' into a more calculatable integer variable
			
			
				if (userinput <= 0 || userinput >= 5 ) {																		//I tried some exceptionhandling in case the user does not enter the numbers we ask for.																					
																																
					choice = JOptionPane.showConfirmDialog(null, " Vill du lämna spelet? ",null, JOptionPane.YES_NO_OPTION);	
						
					if (choice == -1) {System.exit(0);																			//The idea is for the program to do a clean exit when the user chooses not to proceed with the game.
					}
					else if (choice == 0) {System.exit(0);
					}
						
				}
				else	
										
				do {																											//If the user does what is requested, the dicerolling sequens begins here.					
						
					number = (int) (Math.random()*6+0.5);																		//Math.random outputting a number between 0-6, I couldn't figure out how to put a minimun value though. I Googled.
																			
						
					if (number == 6) {																							//If the random number is 6, 2 more laps are inserted into the variable 'userinput'.
																																//The 'number' in this case, will not be added to the total 'sum'-variable.
						JOptionPane.showMessageDialog(null, "Dubbelslag! ");
						userinput =+ 2;													 
					}
						
					else																										//If the random number is not the number 6, one lap is subtracted from the 'userinput',
					sum = sum + number;																							// one lap is added to the total of 'laps' and the 'number' is added to the total s'sum'.	
					JOptionPane.showMessageDialog(null, "Tärningen är kastad! " +   
													"\n Hittills slagna summa: " + sum);
					userinput --;
					laps = laps+ 1 ;
																																//Initiating 'sum' to have a variable that holds all the numbers 
					
				} while (userinput >= 1); 																						//These sequenses will be executed as long as 'userinput' holds a value that is more than 0.
						
						
			JOptionPane.showMessageDialog(null, " Totalt slagna summa: " + sum +												//At the end of the game, the total sum and the total amount of laps that has been executed are shown in a messagebox. 
													"\n Totalt antal slag: " + laps);																									
													//Break;																	//Here I wanted to end the calculations with 'break' or in another way end the calculations.   
																																//If the user keeps playing the game, the results will be added to the previous results.
			choice = JOptionPane.showConfirmDialog(null, " Vill du fortsätta spela? ",null, JOptionPane.YES_NO_OPTION);			//The user gets a question and a choice wether they want to continue the game or not.
			
			}while(choice == 0); 
			
			
			
			
			
				
				
				
		}
				
			

}		
			
		
		
				
		
		
				
				
				
				
				
				
				 
					
		
		   
			
	
	
	

		
	
	
	
		
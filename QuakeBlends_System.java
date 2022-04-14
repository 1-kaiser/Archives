// -- Contributors
// John Kevin Goto
// Renz Daniel Indita
// Mark Ivan Empleo
// Alexander Arendain
// Soren1999

package system_project;
import java.util.*;
public class QuakeBlends_System {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		Random rand = new Random();
			
		int Drink_choice=0,sugarlvl=0;
		int Menu_choice=0,food_order=0,pin,account_points = 0,milktea_order=0,fruittea_order=0,coffee_order=0;
		int frappe_order=0,frappe_order1=0,frappe_order2=0,frappe_order3=0,frappe_order4=0;
		int exit=0;
		int food_quantity=0,food_total=0,milktea_quantity=0,coffee_quantity=0,coffee_total=0,milktea_total=0,fruittea_quantity=0,fruittea_total=0,frappe_quantity=0,frappe_total=0;
		int acc_number = rand.nextInt(5000)+1100;
		int account=0;
		char food_again=0,drinks_again=0,merch_again=0;
		long food_payment=0,milktea_payment,coffee_payment=0,fruittea_payment=0,frappe_payment=0;
		int[] foods = {95,115,70,80,120,180,160,220,200,210}; 
		int[] Milk_tea = {0,89,130,160};
		//coffee
		//hot
		int[] cappuccino = {0,150,170,200};	
		int[] mocha = {0,165,185,205};	
		int[] vanilla_latte = {0,190,215,240};		
		//cold
		int[] salted_caramel = {0,150,170,200};	
		int[] macchiato = {0,165,185,205};	
		int[] whitechoco_mocha = {0,190,215,240};
		//fruit tea
		int[] lemon= {0,115,130,145};
		int[] green_apple = {0,107,118,129};
		int[] kiwi = {0,110,120,125};
		int[] blue_straw = {0,130,140,150};
		int[] frappe = {0,185,220,175,200,170,195,210,235,225};
		int[] Merch= {0,1200,1500,2000,3500,5000};
		String name;

				
			System.out.println("\n================================================================================================================");	
			System.out.println("\n\t\t                   WELCOME TO QUAKE BLENDS! ");
			System.out.print("\n\n\t\t ENTER NAME: "); name =sc.nextLine();
			System.out.println("\n\t\t Thank you our dear customer, your name is "+name);
			System.out.println("\n\t\t As a reward for entering your name, you will get a 300 points for starter.");
			System.out.println("\n\t\t Buy in our shop to get your account number and to gain more points, Thank you!");
			System.out.println("\n================================================================================================================");
			System.out.println("  \t\t  POINTS: "+(account_points+=300));
			System.out.println("================================================================================================================");
			
			do {
				do {			
					do {			
						do {
							do {
								
			   
								System.out.println("\n\n\n================================================================================================================");	
								System.out.println("================================================================================================================");
								
			   System.out.print("\r\n\n"
										+ "  /$$$$$$                      /$$                       /$$$$$$$  /$$                           /$$          \r\n"
										+ " /$$__  $$                    | $$                      | $$__  $$| $$                          | $$          \r\n"
										+ "| $$  \\ $$ /$$   /$$  /$$$$$$ | $$   /$$  /$$$$$$       | $$  \\ $$| $$  /$$$$$$  /$$$$$$$   /$$$$$$$  /$$$$$$$\r\n"
										+ "| $$  | $$| $$  | $$ |____  $$| $$  /$$/ /$$__  $$      | $$$$$$$ | $$ /$$__  $$| $$__  $$ /$$__  $$ /$$_____/\r\n"
										+ "| $$  | $$| $$  | $$  /$$$$$$$| $$$$$$/ | $$$$$$$$      | $$__  $$| $$| $$$$$$$$| $$  \\ $$| $$  | $$|  $$$$$$ \r\n"
										+ "| $$/$$ $$| $$  | $$ /$$__  $$| $$_  $$ | $$_____/      | $$  \\ $$| $$| $$_____/| $$  | $$| $$  | $$ \\____  $$\r\n"
										+ "|  $$$$$$/|  $$$$$$/|  $$$$$$$| $$ \\  $$|  $$$$$$$      | $$$$$$$/| $$|  $$$$$$$| $$  | $$|  $$$$$$$ /$$$$$$$/\r\n"
										+ " \\____ $$$ \\______/  \\_______/|__/  \\__/ \\_______/      |_______/ |__/ \\_______/|__/  |__/ \\_______/|_______/ \r\n"
										+ "      \\__/                                                                                                    \r\n"
										+ "                                                                                                              \r\n");
				
				System.out.println("\n================================================================================================================");
				System.out.println("================================================================================================================");
				
				
				if(food_again=='N'||food_again=='n') {
					System.out.println("\n\t\t Account Number: "+acc_number);
				}
				
				else if(drinks_again=='N'||drinks_again=='n') {
					System.out.println("\n\t\t Account Number: "+acc_number);
				}
				
				else if(merch_again=='Y'||merch_again=='y') {
					System.out.println("\n\t\t Account Number: "+acc_number);
				}
				
				
				System.out.print("\n\t\t\t\t\t\t  MAIN MENU \n\t\t\t\t\t"+"\n\n\t\t CUSTOMER NAME: "+name+"\n\n\n\t\t\t\t\t        [1]. Food \n\t\t\t\t\t        [2]. Beverage \n\t\t\t\t\t        [3]. Merchandise \n\t\t\t\t\t        [4]. Exit \n\n\t\t\t\t\t");
				
				
				System.out.println("        =====================");
				System.out.print("\t\t\t\t\t        Enter Your Choice: ");
				 Menu_choice= sc.nextInt();
								
					
					switch(Menu_choice) {
					
					
						case 1: //FOOD MENU
											
												
							do {
							do {
								
								System.out.println("================================================================================================================");					
								System.out.println("\n\n\t\t\t\t\t\t  Welcome to Food Menu"); 
								
								if(food_again=='Y'||food_again=='y') {
									System.out.println("Account Number: "+acc_number);
								}
								
								System.out.println("\n\n\t\t\t\t  Here is the availabe foods in our shop, "+name);		 
							    System.out.println("\n\t\t\t\t\t\t\t\t\t\t  PRICE");
							    System.out.println("\n\t\t\t\t   [1]. Dark Chocolate Macadamia Cookie ---------  P"+foods[0] + " \n\t\t\t\t   [2]. Triple Cheese Ensaymada -----------------  P"+foods[1] + " \n\t\t\t\t   [3]. Chocolate Dipped Doughnut --------------   P"+foods[2] + 
							    		"\n\t\t\t\t   [4]. Glazed Doughnut -------------------------  P"+foods[3] + " \n\t\t\t\t   [5]. Double Chocolate Pecan Bar --------------  P"+foods[4] + 
							    		"\n\t\t\t\t   [6]. New York Cheescake ----------------------  P"+foods[5] +  "\n\t\t\t\t   [7]. Classic Chocolate cake ------------------  P"+foods[6] +  "\n\t\t\t\t   [8]. Classic Beef Lasagna --------------------  P"+foods[7] +  
							    		"\n\t\t\t\t   [9]. Meatball Pasta -------------------------   P"+foods[8] + "\n\t\t\t\t  [10]. Creamy Carbonara ------------------------  P"+foods[9]);
							    					
							    					System.out.print("\n\n\t\t\t\t   Enter your choice: "); food_order = sc.nextInt();
							
							
							    					switch(food_order) {
													
													
									    				case 1:
									    					
									    					System.out.println("================================================================================================================");
									    					System.out.println("\nYour order is number "+food_order+" which is Dark Chocolate Macadamia Cookie\n\n - The cookie is so chewy and it seems like a cake dough with it's soft \ntexture when you chew it. The Macadamia Nuts and Dark Chocolate Chunks are\nso awesome! The Dark chocolate melts in your mouth that makes it perfect!");
									    					System.out.print("\nPRICE: "+foods[0] +"\nQUANTITY: "); food_quantity = sc.nextInt();
									    					System.out.println("================================================================================================================");
							     							System.out.println("TOTAL: "+(food_total=foods[0]*food_quantity));
							     							System.out.print("Enter your Money: ");  food_payment = sc.nextLong();
							     							
							     							if(food_payment>=food_total) {
							     								
							     								System.out.println("================================================================================================================");
							    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
							     								System.out.println("\n\tFood Ordered : Dark Chocolate Macadamia Cookie"+"\n\tPRICE: "+foods[0]+
							     										"\n\tQUANTITY: "+food_quantity+"\n\tTOTAL: "+food_total+
							     										"\n\tENTERED MONEY: "+food_payment+"\n\tCHANGE: "+(food_payment-=food_total));
							     								System.out.println("-------------------------------------------------------------------------");
							     							    System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
							     							    
							     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
							     								System.out.print("                        Choice: ");  account = sc.nextInt();
							     							    
							     								if(account==1) {
							     							    	
							     							    	for(int i = 1; i <= 4; i++) {
							     							        	
							     							    		if (i < 4) {
							     							        	
							     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
							     							        		
							     							        		if (pin == acc_number) {
							     							    				System.out.println("\nLOGIN SUCCESS");
							     							    				System.out.println("------------------------------");
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							    				i = 5;	
							     							    			}
							     							        		
							     							        		else {
							     							    				System.out.println("\nNot Matched");
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							        		}
							     							    		}
							     							    		
							     							    		else {
							     							    			System.out.println("\nYou tried 3 times.");
							     							    			System.out.println("================================================================================================================");
							     							    		}	
							     							    	}
							     								
							     							    }
							     								
							     							    
								     								else if(account==2) {
								     									
								     									
							     										acc_number = rand.nextInt(5000)+1100;
							     										
							   
							     										System.out.println("\n\nHere is your account number: "+acc_number);  
							     										for(int i = 1; i <= 4; i++) {
							     						     	
							     									if (i < 4) {
									     	
							     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
							     						     		
							     						     		if (pin == acc_number) {
							     						     			System.out.println("\nLOGIN SUCCESS");
							     						     			System.out.println("------------------------------");
							     						     			account_points=300;
					     							    				System.out.println("\nAccount points: "+account_points);
					     							    				System.out.println("\nYour account gets 100 points");
					     							    				System.out.println("\nAccount points: "+(account_points+=100));
					     							    				System.out.println("================================================================================================================");
							     						 			
							     						 				i = 5;	
							     						 				
							     						 			}
							     						     		else {
							     						 				System.out.println("\nNot Matched");
							     						 				System.out.println("================================================================================================================");
							     						 				
							     						     		}
							     						 		}
							     						 		
							     						     	else {
							     						     		System.out.println("\nYou tried 3 times.");
							     						     		System.out.println("================================================================================================================");
							     						 		}	
							     										}
							     							    
							     							    } 
							     						    	
							     							}
							     
							     							else {
							     								System.out.println("================================================================================================================");
							    								System.out.println("\t\t\t   Not Enough Money");
							    								System.out.println("================================================================================================================");
							     							}
							     							
							     						break;
							     						
									    				
									    				case 2:
									    					
									    					System.out.println("================================================================================================================");
									    					System.out.println("\nYour order is number "+food_order+" which is Triple Cheese Ensaymada\n\n - It's a satisfying combo of sugary, buttery, and cheesy flavors, which\ncan be overwhelming for some, but it's nothing a good coffee pairing can't fix.");
									    					System.out.print("\nPRICE: "+foods[1] +"\nQUANTITY: "); food_quantity = sc.nextInt();
									    					System.out.println("================================================================================================================");
							     							System.out.println("TOTAL: "+(food_total=foods[1]*food_quantity));
							     							System.out.print("Enter your Money: "); food_payment = sc.nextLong();
							     							
							     							if(food_payment>=food_total) {
							     								
							     								System.out.println("================================================================================================================");	
							    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
							     								System.out.println("\n\tFood Ordered : Tripple Cheese Ensaymada"+"\n\tPRICE: "+foods[1]+
							     										"\n\tQUANTITY: "+food_quantity+"\n\tTOTAL: "+food_total+
							     										"\n\tENTERED MONEY: "+food_payment+"\n\tCHANGE: "+(food_payment-=food_total));
							     								System.out.println("-------------------------------------------------------------------------");
							     							    System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
							     							    
							     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
							     								System.out.print("                        Choice: "); account = sc.nextInt();
							     							    
							     								if(account==1) {
							     							    	
							     							    	for(int i = 1; i <= 4; i++) {
							     							        	
							     							    		if (i < 4) {
							     							        	
							     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
							     							        		
							     							        		if (pin == acc_number) {
							     							    				System.out.println("\nLOGIN SUCCESS");
							     							    				System.out.println("------------------------------");
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							    				i = 5;	
							     							    			}
							     							        		
							     							        		else {
							     							    				System.out.println("\nNot Matched");
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							        		}
							     							    		}
							     							    		
							     							    		else {
							     							    			System.out.println("\nYou tried 3 times.");
							     							    			
							     							    		}	
							     							    	}
							     								
							     							    }
							     								
							     							    
							     								else if(account==2) {
							     									
							     										acc_number = rand.nextInt(5000)+1100;									
							     										System.out.println("\n\nHere is your account number: "+acc_number);  
							     										for(int i = 1; i <= 4; i++) {
							     						     	
							     									if (i < 4) {
							     						     	
							     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
							     						     		
							     						     		if (pin == acc_number) {
							     						     			System.out.println("\nLOGIN SUCCESS");
							     						     			System.out.println("------------------------------");
							     						     			account_points=300;
					     							    				System.out.println("\nAccount points: "+account_points);
					     							    				System.out.println("\nYour account gets 100 points");	
					     							    				System.out.println("\nAccount points: "+(account_points+=100));
					     							    				System.out.println("================================================================================================================");
							     						 			
							     						 				i = 5;	
							     						 			}
							     						     		else {
							     						 				System.out.println("\nNot Matched");
							     						 				System.out.println("================================================================================================================");
							     						 				
							     						 		
							     						     		}
							     						 		}
							     						 		
							     						     	else {
							     						     		System.out.println("\nYou tried 3 times.");
							     						     		System.out.println("================================================================================================================");
							     						 			
							     						 		}	
							     										}
							     							    
							     							    } 
							     						    	
							     							}
							     
							     							else {
							     								System.out.println("================================================================================================================");
							    								System.out.println("\t\t\t   Not Enough Money");
							    								System.out.println("================================================================================================================");
							     							}
									    				
							     						break;
							     						
									    				case 3:
									    					
									    					System.out.println("================================================================================================================");
									    					System.out.println("\nYour order is number "+food_order+" which is Chocolate Dipped Doughnut\n\n - These chocolate glazed donuts are made from a thick chocolate cake batter.\nYou begin by whisking together the dry and wet ingredients separately,\nlike any basic cake batter recipe, then mix the two mixture together.");
									    					System.out.print("\nPRICE: "+foods[2] +"\nQUANTITY: "); food_quantity = sc.nextInt();
									    					System.out.println("================================================================================================================");
							     							System.out.println("TOTAL: "+(food_total=foods[2]*food_quantity));
							     							System.out.print("Enter your Money: ");  food_payment = sc.nextLong();
							     							
							     							if(food_payment>=food_total) {
							     								
							     								System.out.println("================================================================================================================");
							    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
							     								System.out.println("\n\tFood Ordered : Chocolate Dipped Dougnut"+"\n\tPRICE: "+foods[2]+
							     										"\n\tQUANTITY: "+food_quantity+"\n\tTOTAL: "+food_total+
							     										"\n\tENTERED MONEY: "+food_payment+"\n\tCHANGE: "+(food_payment-=food_total));
							     								System.out.println("-------------------------------------------------------------------------");
							     								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
							     							    
							     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
							     								System.out.print("                        Choice: ");  account = sc.nextInt();
							     							    
							     								if(account==1) {
							     							    	
							     							    	for(int i = 1; i <= 4; i++) {
							     							        	
							     							    		if (i < 4) {
							     							        	
							     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
							     							        		
							     							        		if (pin == acc_number) {
							     							    				System.out.println("\nLOGIN SUCCESS");
							     							    				System.out.println("------------------------------");
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							    				i = 5;	
							     							    			}
							     							        		
							     							        		else {
							     							    				System.out.println("\nNot Matched");
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							        		}
							     							    		}
							     							    		
							     							    		else {
							     							    			System.out.println("\nYou tried 3 times.");
							     							    			System.out.println("================================================================================================================");
							     							    		}	
							     							    	}
							     								
							     							    }
							     								
							     							    
							     								else if(account==2) {
							     									
							     										acc_number = rand.nextInt(5000)+1100;
							     										System.out.println("\n\nHere is your account number: "+acc_number);  
							     										for(int i = 1; i <= 4; i++) {
							     						     	
							     									if (i < 4) {
							     						     	
							     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
							     						     		
							     						     		if (pin == acc_number) {
							     						     			System.out.println("\nLOGIN SUCCESS");
							     						     			System.out.println("------------------------------");
							     						     			account_points=300;
					     							    				System.out.println("\nAccount points: "+account_points);
					     							    				System.out.println("\nYour account gets 100 points");
					     							    				System.out.println("\nAccount points: "+(account_points+=100));
					     							    				System.out.println("================================================================================================================");
							     						 			
							     						 				i = 5;	
							     						 			}
							     						     		else {
							     						 				System.out.println("\nNot Matched");
							     						 				System.out.println("================================================================================================================");
							     						 		
							     						     		}
							     						 		}
							     						 		
							     						     	else {
							     						     		System.out.println("\nYou tried 3 times.");
							     						     		System.out.println("================================================================================================================");
							     						 		}	
							     										}
							     							    
							     							    } 
							     						    	
							     							}
							     
							     							else {
							     								System.out.println("================================================================================================================");
							    								System.out.println("\t\t\t   Not Enough Money");
							    								System.out.println("================================================================================================================");
							     							}
							     							
							     						break;
									    				
									    				case 4:
									    					
									    					System.out.println("================================================================================================================");
									    					System.out.println("\nYour order is number "+food_order+" which is Glazed Dougnut\n\n - Melted salted butter, vanilla, powdered sugar, and a generous splash\nof milk. Combine until all the ingredients until the mixture is smooth\nand dip your warm donuts halfway into the glaze to cover the tops with\nthe sweet icing. ");
									    					System.out.print("\nPRICE: "+foods[3] +"\nQUANTITY: "); food_quantity = sc.nextInt();
									    					System.out.println("================================================================================================================");
							     							System.out.println("TOTAL: "+(food_total=foods[3]*food_quantity));
							     							System.out.print("Enter your Money: ");  food_payment = sc.nextLong();
							     							
							     							if(food_payment>=food_total) {
							     								
							     								System.out.println("================================================================================================================");
							    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
							     								System.out.println("\n\tFood Ordered : Glazed Doughnut"+"\n\tPRICE: "+foods[3]+
							     										"\n\tQUANTITY: "+food_quantity+"\n\tTOTAL: "+food_total+
							     										"\n\tENTERED MONEY: "+food_payment+"\n\tCHANGE: "+(food_payment-=food_total));
							     								System.out.println("-------------------------------------------------------------------------");
							     								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
							     							    
							     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
							     								System.out.print("                        Choice: ");  account = sc.nextInt();
							     							    
							     								if(account==1) {
							     							    	
							     							    	for(int i = 1; i <= 4; i++) {
							     							        	
							     							    		if (i < 4) {
							     							        	
							     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
							     							        		
							     							        		if (pin == acc_number) {
							     							    				System.out.println("\nLOGIN SUCCESS");
							     							    				System.out.println("------------------------------");
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							    				i = 5;	
							     							    			}
							     							        		
							     							        		else {
							     							    				System.out.println("\nNot Matched");
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							        		}
							     							    		}
							     							    		
							     							    		else {
							     							    			System.out.println("\nYou tried 3 times.");
							     							    			System.out.println("================================================================================================================");
							     							    		}	
							     							    	}
							     								
							     							    }
							     								
							     							    
							     								else if(account==2) {
							     									
							     										acc_number = rand.nextInt(5000)+1100;
							     										System.out.println("\n\nHere is your account number: "+acc_number);  
							     										for(int i = 1; i <= 4; i++) {
							     						     	
							     									if (i < 4) {
							     						     	
							     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
							     						     		
							     						     		if (pin == acc_number) {
							     						     			System.out.println("\nLOGIN SUCCESS");
							     						     			System.out.println("------------------------------");
							     						     			account_points=300;
					     							    				System.out.println("\nAccount points: "+account_points);
					     							    				System.out.println("\nYour account gets 100 points");
					     							    				System.out.println("\nAccount points: "+(account_points+=100));
					     							    				System.out.println("================================================================================================================");
							     						 			
							     						 				i = 5;	
							     						 			}
							     						     		else {
							     						 				System.out.println("\nNot Matched");
							     						 				System.out.println("================================================================================================================");
							     						 		
							     						     		}
							     						 		}
							     						 		
							     						     	else {
							     						     		System.out.println("\nYou tried 3 times.");
							     						     		System.out.println("================================================================================================================");
							     						 		}	
							     										}
							     							    
							     							    } 
							     						    	
							     							}
							     
							     							else {
							     								System.out.println("================================================================================================================");
							    								System.out.println("\t\t\t   Not Enough Money");
							    								System.out.println("================================================================================================================");
							     							}
							     							
							     						break;
							     						
									    				case 5:
									    					
									    					System.out.println("================================================================================================================");
									    					System.out.println("\nYour order is number "+food_order+" which is Double Chocolate Pecan Bar\n\n - These double chocolate pecan bars are gluten-free and can even be made\nPaleo or Vegan. Loaded with two kinds of chocolate and filled with\ndecadent crunchy pecans.");
									    					System.out.print("\nPRICE: "+foods[4] +"\nQUANTITY: "); food_quantity = sc.nextInt();
									    					System.out.println("================================================================================================================");
							     							System.out.println("TOTAL: "+(food_total=foods[4]*food_quantity));
							     							System.out.print("Enter your Money: ");  food_payment = sc.nextLong();
							     							
							     							if(food_payment>=food_total) {
							     								
							     								System.out.println("================================================================================================================");
							    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
							     								System.out.println("\n\tFood Ordered : Dark Chocolate Macadamia Cookie"+"\n\tPRICE: "+foods[4]+
							     										"\n\tQUANTITY: "+food_quantity+"\n\tTOTAL: "+food_total+
							     										"\n\tENTERED MONEY: "+food_payment+"\n\tCHANGE: "+(food_payment-=food_total));
							     								System.out.println("-------------------------------------------------------------------------");
							     								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
							     							    
							     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
							     								System.out.print("                        Choice: ");  account = sc.nextInt();
							     							    
							     								if(account==1) {
							     							    	
							     							    	for(int i = 1; i <= 4; i++) {
							     							        	
							     							    		if (i < 4) {
							     							        	
							     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
							     							        		
							     							        		if (pin == acc_number) {
							     							    				System.out.println("\nLOGIN SUCCESS");
							     							    				System.out.println("------------------------------");
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							    				i = 5;	
							     							    			}
							     							        		
							     							        		else {
							     							    				System.out.println("\nNot Matched");
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							        		}
							     							    		}
							     							    		
							     							    		else {
							     							    			System.out.println("\nYou tried 3 times.");
							     							    			System.out.println("================================================================================================================");
							     							    		}	
							     							    	}
							     								
							     							    }
							     								
							     							    
							     								else if(account==2) {
							     									
							     										acc_number = rand.nextInt(5000)+1100;
							     										System.out.println("\n\nHere is your account number: "+acc_number);  
							     										for(int i = 1; i <= 4; i++) {
							     						     	
							     									if (i < 4) {
							     						     	
							     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
							     						     		
							     						     		if (pin == acc_number) {
							     						     			System.out.println("\nLOGIN SUCCESS");
							     						     			System.out.println("------------------------------");
							     						     			account_points=300;
					     							    				System.out.println("\nAccount points: "+account_points);
					     							    				System.out.println("\nYour account gets 100 points");
					     							    				System.out.println("\nAccount points: "+(account_points+=100));
					     							    				System.out.println("================================================================================================================");
							     						 			
							     						 				i = 5;	
							     						 			}
							     						     		else {
							     						 				System.out.println("\nNot Matched");
							     						 				System.out.println("================================================================================================================");
							     						 		
							     						     		}
							     						 		}
							     						 		
							     						     	else {
							     						     		System.out.println("\nYou tried 3 times.");
							     						     		System.out.println("================================================================================================================");
							     						 		}	
							     										}
							     							    
							     							    } 
							     						    	
							     							}
							     
							     							else {
							     								System.out.println("================================================================================================================");
							    								System.out.println("\t\t\t   Not Enough Money");
							    								System.out.println("================================================================================================================");
							     							}
							     							
							     						break;
							     						
									    				case 6:
									    					
									    					System.out.println("================================================================================================================");
									    					System.out.println("\nYour order is number "+food_order+" which is New York Cheesecake\n\n - New York cheesecake is known for its creamy, satiny texture. It's rich,\ndense and tall with a flat top exactly how I like my cheesecake.");
									    					System.out.print("\nPRICE: "+foods[5] +"\nQUANTITY: "); food_quantity = sc.nextInt();
									    					System.out.println("================================================================================================================");
							     							System.out.println("TOTAL: "+(food_total=foods[5]*food_quantity));
							     							System.out.print("Enter your Money: ");  food_payment = sc.nextLong();
							     							
							     							if(food_payment>=food_total) {
							     								
							     								System.out.println("================================================================================================================");	
							    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
							     								System.out.println("\n\tFood Ordered : New York Cheesecake"+"\n\tPRICE: "+foods[5]+
							     										"\n\tQUANTITY: "+food_quantity+"\n\tTOTAL: "+food_total+
							     										"\n\tENTERED MONEY: "+food_payment+"\n\tCHANGE: "+(food_payment-=food_total));
							     								System.out.println("-------------------------------------------------------------------------");
							     								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
							     							    
							     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
							     								System.out.print("                        Choice: ");  account = sc.nextInt();
							     							    
							     								if(account==1) {
							     							    	
							     							    	for(int i = 1; i <= 4; i++) {
							     							        	
							     							    		if (i < 4) {
							     							        	
							     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
							     							        		
							     							        		if (pin == acc_number) {
							     							    				System.out.println("\nLOGIN SUCCESS");
							     							    				System.out.println("------------------------------");
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							    				i = 5;	
							     							    			}
							     							        		
							     							        		else {
							     							    				System.out.println("\nNot Matched");
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							        		}
							     							    		}
							     							    		
							     							    		else {
							     							    			System.out.println("\nYou tried 3 times.");
							     							    			System.out.println("================================================================================================================");
							     							    		}	
							     							    	}
							     								
							     							    }
							     								
							     							    
							     								else if(account==2) {
							     									
							     										acc_number = rand.nextInt(5000)+1100;
							     										System.out.println("\n\nHere is your account number: "+acc_number);  
							     										for(int i = 1; i <= 4; i++) {
							     						     	
							     									if (i < 4) {
							     						     	
							     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
							     						     		
							     						     		if (pin == acc_number) {
							     						     			System.out.println("\nLOGIN SUCCESS");
							     						     			System.out.println("------------------------------");
							     						     			account_points=300;
					     							    				System.out.println("\nAccount points: "+account_points);
					     							    				System.out.println("\nYour account gets 100 points");
					     							    				System.out.println("\nAccount points: "+(account_points+=100));
					     							    				System.out.println("================================================================================================================");
							     						 			
							     						 				i = 5;	
							     						 			}
							     						     		else {
							     						 				System.out.println("\nNot Matched");
							     						 				System.out.println("================================================================================================================");
							     						 		
							     						     		}
							     						 		}
							     						 		
							     						     	else {
							     						     		System.out.println("\nYou tried 3 times.");
							     						     		System.out.println("================================================================================================================");
							     						 		}	
							     										}
							     							    
							     							    } 
							     						    	
							     							}
							     
							     							else {
							     								System.out.println("================================================================================================================");
							    								System.out.println("\t\t\t   Not Enough Money");
							    								System.out.println("================================================================================================================");
							     							}
							     							
							     						break;
							     						
									    				case 7:
									    					
									    					System.out.println("================================================================================================================");
									    					System.out.println("\nYour order is number "+food_order+" which is Classic Chocolate cake\n\n - A cake made by layering smooth white cream, rich chocolate dough,\nand soft chocolate mousse on a crispy bottom dough using cocoa crumble\nand cocoa sponge crumb. Decorate the top with fluffy chocolate cream\nand top with cocoa powder to finish.");
									    					System.out.print("\nPRICE: "+foods[6] +"\nQUANTITY: "); food_quantity = sc.nextInt();
									    					System.out.println("================================================================================================================");
							     							System.out.println("TOTAL: "+(food_total=foods[6]*food_quantity));
							     							System.out.print("Enter your Money: ");  food_payment = sc.nextLong();
							     							
							     							if(food_payment>=food_total) {
							     								
							     								System.out.println("================================================================================================================");
							    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
							     								System.out.println("\n\tFood Ordered : Classic Chocolate"+"\n\tPRICE: "+foods[6]+
							     										"\n\tQUANTITY: "+food_quantity+"\n\tTOTAL: "+food_total+
							     										"\n\tENTERED MONEY: "+food_payment+"\n\tCHANGE: "+(food_payment-=food_total));
							     								System.out.println("-------------------------------------------------------------------------");
							     								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
							     							    
							     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
							     								System.out.print("                        Choice: ");  account = sc.nextInt();
							     							    
							     								if(account==1) {
							     							    	
							     							    	for(int i = 1; i <= 4; i++) {
							     							        	
							     							    		if (i < 4) {
							     							        	
							     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
							     							        		
							     							        		if (pin == acc_number) {
							     							    				System.out.println("\nLOGIN SUCCESS");
							     							    				System.out.println("------------------------------");
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							    				i = 5;	
							     							    			}
							     							        		
							     							        		else {
							     							    				System.out.println("\nNot Matched");
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							        		}
							     							    		}
							     							    		
							     							    		else {
							     							    			System.out.println("\nYou tried 3 times.");
							     							    			System.out.println("================================================================================================================");
							     							    		}	
							     							    	}
							     								
							     							    }
							     								
							     							    
							     								else if(account==2) {
							     									
							     										acc_number = rand.nextInt(5000)+1100;	
							     										System.out.println("\n\nHere is your account number: "+acc_number);  
							     										for(int i = 1; i <= 4; i++) {
							     						     	
							     									if (i < 4) {
							     						     	
							     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
							     						     		
							     						     		if (pin == acc_number) {
							     						     			System.out.println("\nLOGIN SUCCESS");
							     						     			System.out.println("------------------------------");
							     						     			account_points=300;
					     							    				System.out.println("\nAccount points: "+account_points);
					     							    				System.out.println("\nYour account gets 100 points");
					     							    				System.out.println("\nAccount points: "+(account_points+=100));
					     							    				System.out.println("================================================================================================================");
							     						 			
							     						 				i = 5;	
							     						 			}
							     						     		else {
							     						 				System.out.println("\nNot Matched");
							     						 				System.out.println("================================================================================================================");
							     						 		
							     						     		}
							     						 		}
							     						 		
							     						     	else {
							     						     		System.out.println("\nYou tried 3 times.");
							     						     		System.out.println("================================================================================================================");
							     						 		}	
							     										}
							     							    
							     							    } 
							     						    	
							     							}
							     
							     							else {
							     								System.out.println("================================================================================================================");
							    								System.out.println("\t\t\t   Not Enough Money");
							    								System.out.println("================================================================================================================");
							     							}
							     							
							     						break;
							     						
									    				case 8:
									    					
									    					System.out.println("================================================================================================================");
									    					System.out.println("\nYour order is number "+food_order+" which is Classic Beef Lasagna\n\n - Classic Beef Lasagna is made with savory meat, creamy béchamel\nsauce and lasagna baked with a topping of mozzarella cheese.Penne Pesto\nwith Mushroom is also a great choice for those looking for a quick and\ndelicious meal, it is made with penne that is sautéed with button\nmushroom and creamy pesto sauce.");
									    					System.out.print("\nPRICE: "+foods[7] +"\nQUANTITY: "); food_quantity = sc.nextInt();
									    					System.out.println("================================================================================================================");
							     							System.out.println("TOTAL: "+(food_total=foods[7]*food_quantity));
							     							System.out.print("Enter your Money: ");  food_payment = sc.nextLong();
							     							
							     							if(food_payment>=food_total) {
							     								
							     								System.out.println("================================================================================================================");
							    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
							     								System.out.println("\n\tFood Ordered : Classic Beef Lasagna"+"\n\tPRICE: "+foods[7]+
							     										"\n\tQUANTITY: "+food_quantity+"\n\tTOTAL: "+food_total+
							     										"\n\tENTERED MONEY: "+food_payment+"\n\tCHANGE: "+(food_payment-=food_total));
							     								System.out.println("-------------------------------------------------------------------------");
							     								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
							     							    
							     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
							     								System.out.print("                        Choice: ");  account = sc.nextInt();
							     							    
							     								if(account==1) {
							     							    	
							     							    	for(int i = 1; i <= 4; i++) {
							     							        	
							     							    		if (i < 4) {
							     							        	
							     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
							     							        		
							     							        		if (pin == acc_number) {
							     							    				System.out.println("\nLOGIN SUCCESS");
							     							    				System.out.println("------------------------------");
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							    				i = 5;	
							     							    			}
							     							        		
							     							        		else {
							     							    				System.out.println("\nNot Matched");
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							        		}
							     							    		}
							     							    		
							     							    		else {
							     							    			System.out.println("\nYou tried 3 times.");
							     							    			System.out.println("================================================================================================================");
							     							    		}	
							     							    	}
							     								
							     							    }
							     								
							     							    
							     								else if(account==2) {
							     									
							     										acc_number = rand.nextInt(5000)+1100;
							     										System.out.println("\n\nHere is your account number: "+acc_number);  
							     										for(int i = 1; i <= 4; i++) {
							     						     	
							     									if (i < 4) {
							     						     	
							     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
							     						     		
							     						     		if (pin == acc_number) {
							     						     			System.out.println("\nLOGIN SUCCESS");
							     						     			System.out.println("------------------------------");
							     						     			account_points=300;
					     							    				System.out.println("\nAccount points: "+account_points);
					     							    				System.out.println("\nYour account gets 100 points");
					     							    				System.out.println("\nAccount points: "+(account_points+=100));
					     							    				System.out.println("================================================================================================================");
							     						 			
							     						 				i = 5;	
							     						 			}
							     						     		else {
							     						 				System.out.println("\nNot Matched");
							     						 				System.out.println("================================================================================================================");
							     						 		
							     						     		}
							     						 		}
							     						 		
							     						     	else {
							     						     		System.out.println("\nYou tried 3 times.");
							     						     		System.out.println("================================================================================================================");
							     						 		}	
							     										}
							     							    
							     							    } 
							     						    	
							     							}
							     
							     							else {
							     								System.out.println("================================================================================================================");
							    								System.out.println("\t\t\t   Not Enough Money");
							    								System.out.println("================================================================================================================");
							     							}
							     							
							     						break;
									    				
									    				case 9:
									    					
									    					System.out.println("================================================================================================================");
									    					System.out.println("\nYour order is number "+food_order+" which is Meatball Pasta\n\n - Tender juicy meatballs simmered in marinara sauce and served with\nvegetable pasta.");
									    					System.out.print("\nPRICE: "+foods[8] +"\nQUANTITY: "); food_quantity = sc.nextInt();
									    					System.out.println("================================================================================================================");
							     							System.out.println("TOTAL: "+(food_total=foods[8]*food_quantity));
							     							System.out.print("Enter your Money: ");  food_payment = sc.nextLong();
							     							
							     							if(food_payment>=food_total) {
							     								
							     								System.out.println("================================================================================================================");
							    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
							     								System.out.println("\n\tFood Ordered : Meatball Pasta"+"\n\tPRICE: "+foods[8]+
							     										"\n\tQUANTITY: "+food_quantity+"\n\tTOTAL: "+food_total+
							     										"\n\tENTERED MONEY: "+food_payment+"\n\tCHANGE: "+(food_payment-=food_total));
							     								System.out.println("-------------------------------------------------------------------------");
							     								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
							     							    
							     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
							     								System.out.print("                        Choice: ");  account = sc.nextInt();
							     							    
							     								if(account==1) {
							     							    	
							     							    	for(int i = 1; i <= 4; i++) {
							     							        	
							     							    		if (i < 4) {
							     							        	
							     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
							     							        		
							     							        		if (pin == acc_number) {
							     							    				System.out.println("\nLOGIN SUCCESS");
							     							    				System.out.println("------------------------------");
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							    				i = 5;	
							     							    			}
							     							        		
							     							        		else {
							     							    				System.out.println("\nNot Matched");
							     							    				System.out.println("================================================================================================================");
							     							    				
							     							        		}
							     							    		}
							     							    		
							     							    		else {
							     							    			System.out.println("\nYou tried 3 times.");
							     							    			System.out.println("\n================================================================================================================");	
							     							    		}	
							     							    	}
							     								
							     							    }
							     								
							     							    
							     								else if(account==2) {
							     									
							     										acc_number = rand.nextInt(5000)+1100;
							     										System.out.println("\n\nHere is your account number: "+acc_number);  
							     										for(int i = 1; i <= 4; i++) {
							     						     	
							     									if (i < 4) {
							     						     	
							     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
							     						     		
							     						     		if (pin == acc_number) {
							     						     			System.out.println("\nLOGIN SUCCESS");
							     						     			System.out.println("------------------------------");
							     						     			account_points=300;
					     							    				System.out.println("\nAccount points: "+account_points);
					     							    				System.out.println("\nYour account gets 100 points");
					     							    				System.out.println("\nAccount points: "+(account_points+=100));
					     							    				System.out.println("\n================================================================================================================");	
							     						 			
							     						 				i = 5;	
							     						 			}
							     						     		else {
							     						 				System.out.println("\nNot Matched");
							     						 				System.out.println("\n================================================================================================================");	
							     						 		
							     						     		}
							     						 		}
							     						 		
							     						     	else {
							     						     		System.out.println("\nYou tried 3 times.");
							     						     		System.out.println("\n================================================================================================================");	
							     						 		}	
							     										}
							     							    
							     							    } 
							     						    	
							     							}
							     
							     							else {
							     								System.out.println("\n================================================================================================================");	
							    								System.out.println("\t\t\t   Not Enough Money");
							    								System.out.println("\n================================================================================================================");	
							     							}
							     							
							     						break;
									    				
									    				case 10:
									    					
									    					System.out.println("\n================================================================================================================");	
									    					System.out.println("\nYour order is number "+food_order+" which is Creamy Carbonara\n\n - the carbonara is made with bacon, eggs, Parmesan,\n a little olive oil, salt and pepper.");
									    					System.out.print("\nPRICE: "+foods[9] +"\nQUANTITY: "); food_quantity = sc.nextInt();
									    					System.out.println("\n================================================================================================================");	
							     							System.out.println("TOTAL: "+(food_total=foods[9]*food_quantity));
							     							System.out.print("Enter your Money: ");  food_payment = sc.nextLong();
							     							
							     							if(food_payment>=food_total) {
							     								
							     								System.out.println("\n================================================================================================================");		
							    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
							     								System.out.println("\n\tFood Ordered : Creamy Carbonara"+"\n\tPRICE: "+foods[9]+
							     										"\n\tQUANTITY: "+food_quantity+"\n\tTOTAL: "+food_total+
							     										"\n\tENTERED MONEY: "+food_payment+"\n\tCHANGE: "+(food_payment-=food_total));
							     								System.out.println("-------------------------------------------------------------------------");
							     								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
							     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
							     								System.out.print("                        Choice: ");  account = sc.nextInt();
							     							    
							     								if(account==1) {
							     							    	
							     							    	for(int i = 1; i <= 4; i++) {
							     							        	
							     							    		if (i < 4) {
							     							        	
							     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
							     							        		
							     							        		if (pin == acc_number) {
							     							    				System.out.println("\nLOGIN SUCCESS");
							     							    				System.out.println("------------------------------");
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("\n================================================================================================================");	
							     							    				
							     							    				i = 5;	
							     							    			}
							     							        		
							     							        		else {
							     							    				System.out.println("\nNot Matched");
							     							    				System.out.println("\n================================================================================================================");	
							     							    				
							     							        		}
							     							    		}
							     							    		
							     							    		else {
							     							    			System.out.println("\nYou tried 3 times.");
							     							    			System.out.println("\n================================================================================================================");	
							     							    		}	
							     							    	}
							     								
							     							    }
							     								
							     							    
							     								else if(account==2) {
							     										acc_number = rand.nextInt(5000)+1100;
							     										System.out.println("\n\nHere is your account number: "+acc_number);  
							     										for(int i = 1; i <= 4; i++) {
							     						     	
							     									if (i < 4) {
							     						     	
							     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
							     						     		
							     						     		if (pin == acc_number) {
							     						     			System.out.println("\nLOGIN SUCCESS");
							     						     			System.out.println("------------------------------");
							     						     			account_points=300;
					     							    				System.out.println("\nAccount points: "+account_points);
					     							    				System.out.println("\nYour account gets 100 points");
					     							    				System.out.println("\nAccount points: "+(account_points+=100));
					     							    				System.out.println("\n================================================================================================================");	
							     						 			
							     						 				i = 5;	
							     						 			}
							     						     		else {
							     						 				System.out.println("\nNot Matched");
							     						 				System.out.println("\n================================================================================================================");	
							     						 		
							     						     		}
							     						 		}
							     						 		
							     						     	else {
							     						     		System.out.println("\nYou tried 3 times.");
							     						     		System.out.println("\n================================================================================================================");	
							     						 		}	
							     										}
							     							    
							     							    } 
							     						    	
							     							}
							     
							     							else {
							     								System.out.println("\n================================================================================================================");	
							    								System.out.println("\t\t\t   Not Enough Money");
							    								System.out.println("\n================================================================================================================");	
							     							}
							     							
							     						break;
							     						
									    				default:									    				 
															System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t\t\t\t   Invalid Number");
																				     												     												     												     												     												     												     												     											     																     												     									     												     						
							    					}
							    					
							
							    												    					
							} while(food_order>10);	
							
							
								do {
									
									System.out.println("\n\t\t\t\t\t (IF NO THE SYSTEM WILL GO BACK TO MAIN MENU)");
									System.out.print("\n\t\t\t\t\t\t   Order again? Y/N: "); food_again = sc.next().charAt(0);
								
								} while(food_again!='Y'&&food_again!='y'&&food_again!='N'&&food_again!='n');
									
									if(food_again=='N'||food_again=='n') {
										System.out.println("\n================================================================================================================");	
									}
							
							} while(food_again=='Y'||food_again=='y');		
									
								
						
						break;
											 
						case 2: //Beverage
								
								do {
									do {
									
										
									 System.out.println("================================================================================================================");								 												 
									 System.out.println("\n\t\t\t\t\t\t   Beverages");
									 System.out.println("\n\t\t\t\t\t\t Types of Drinks");
									 
									 if(drinks_again=='Y'||drinks_again=='y') {
											System.out.println("Account Number: "+acc_number);
										}
										
									 System.out.print("\n\n\t\t\t\t\t      [1]. Coffee \n\t\t\t\t\t      [2]. Milk Tea \n\t\t\t\t\t      [3]. Fruit Tea \n\t\t\t\t\t      [4]. Frappuccino \n\n\t\t\t\t\t");
									 System.out.println("      =====================");
									 System.out.print("\t\t\t\t\t      Enter Your Choice: ");
									 Drink_choice = sc.nextInt();	
									
									
									 switch(Drink_choice) {
									 
									 	
									 	case 1:
									 		do {
									 			System.out.println("================================================================================================================");	
										 		System.out.println("\n\n\t\t\t\t\t Welcome to Coffee Section");
										 		System.out.println("\n\t\t\t\tHere is the availabe coffee in our shop, "+name);
										 		System.out.println("\n\n   Hot Coffee \t\t\t     TALL \t    GRANDE \t    VENTI");
										 		System.out.println("   ----------");
										 		System.out.println("\n\t   [1]. Cappucino\t     P"+cappuccino[1]+"\t     P"+cappuccino[2]+"\t    P"+cappuccino[3]+"  \n\t   "
										 				+ "[2]. Mocha\t\t     P"+mocha[1]+"\t     P"+mocha[2]+"\t    P"+mocha[3]+"\t   \n\t   "
										 				+ "[3]. Vanilla Latte\t     P"+vanilla_latte[1]+"\t     P"+vanilla_latte[2]+"\t    P"+vanilla_latte[3]+"\t     \n\t   ");
						
										 	
										 		System.out.println("\n----------------------------------------------------------------------------------------------------------------");
										 		
										 		System.out.println("\n\n\n   Iced Coffee \n   ------------");
										 		System.out.println("\n\t   [4]. Salted Caramel\t     P"+salted_caramel[1]+"\t     P"+salted_caramel[2]+"\t    P"+salted_caramel[3]+"\t   \n\t   "
										 				+ "[5]. Macchiato\t     P"+macchiato[1]+"\t     P"+macchiato[2]+"\t    P"+macchiato[3]+"\t \n\t   "
										 				+ "[6]. White Chocolate\t     P"+whitechoco_mocha[1]+"\t     P"+whitechoco_mocha[2]+"\t    P"+whitechoco_mocha[3]+"\t \n\t  "
										 				+ "         Mocha");
										 		System.out.print("\n\n\t  Enter your choice: "); coffee_order = sc.nextInt();
										 		
										 		if(coffee_order==1) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Cappucino\n\n- is an Italian coffee drink that is traditionally prepared\r\n"
								 							+ "with equal parts double espresso, steamed milk, and steamed milk foam on top. Cream may.");
								 				}
									 			
									 			if(coffee_order==2) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Mocha\n\n- A caffé mocha is basically a chocolate-flavored variant of a caffé latte so its");
									 			}
									 			
									 			if(coffee_order==3) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Vanilla Latte\n\n- A vanilla latte is a very specific, and very iconic type of espresso-based\r\n"
								 							+ "drink. While you could just make some vanilla-flavored coffee, it's not the same thing.");
									 			}
									 			
									 			if(coffee_order==4) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Salted Caramel\n\n- tSea Salt Caramel flavored coffee is defined by its rich caramel flavor\r\n"
								 							+ "combined with a touch of sea salt that results in a perfect savory balance. This coffee is");
									 			}
									 			
									 			if(coffee_order==5) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Macchiato\n\n- The iced macchiato uses whole milk and an extra shot of espresso to\r\n"
								 							+ "make it a bit more flavorful and very different in taste than the iced latte.");
									 			}
									 			
									 			if(coffee_order==6) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("White Chocolate Mocha\n\n- syrup to taste somewhere between what you'd find biting \ninto a white chocolate bar and sweetened condensed milk.");
									 			}
										 		
										 		
										 		switch(coffee_order) {
										 		// CAPPUCCINO
										 		case 1:
										 			
										 			System.out.println("\n=================================================================================================================================");
										 			do {
													System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR COFFEE");	
													System.out.println("\t\t\nOrdered Number: "+coffee_order+" -- Coffee");
													System.out.println("\n\t\t\t  [1]. TALL"+"\n\t\t\t  [2]. GRANDE"+"\n\t\t\t  [3]. VENTI");
													System.out.print("\n\n\t  Enter your choice: "); cappuccino[0] = sc.nextInt();
													
													switch(cappuccino[0]) {
													
														case 1:
												
															System.out.println("\n================================================================================================================");	
															System.out.print("SIZE: TALL"+"\nPRICE: P"+cappuccino[1]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=cappuccino[1]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");	
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Hot Coffee: Cappuccino " +"\nSIZE: TALL"+"\nPRICE: P"+cappuccino[1]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");	
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");	
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");	
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");	
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																	
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");	
													    				
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");	
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");	
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
														    System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														
														case 2:
															
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: GRANDE"+"\nPRICE: P"+cappuccino[2]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=cappuccino[2]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");	
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Hot Coffee: Cappuccino " +"\nSIZE: GRANDE"+"\nPRICE: P"+cappuccino[1]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																	
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
																System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														case 3:
															
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: VENTI"+"\nPRICE: P"+cappuccino[3]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=cappuccino[3]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Hot Coffee: Cappuccino " +"\nSIZE: VENTI"+"\nPRICE: P"+cappuccino[3]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																	
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
													        System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														default:
															System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   INVALID SIZE");
															System.out.println("\n================================================================================================================");
															
													}
													
										 			}while(cappuccino[0]>3);
													
												break;
												// MOCHA	
										 		case 2:
										 			
										 			System.out.println("\n=================================================================================================================================");
										 			do {
													System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR COFFEE");	
													System.out.println("\t\t\nOrdered Number: "+coffee_order+" -- Coffee");
													System.out.println("\n\t\t\t  [1]. TALL"+"\n\t\t\t  [2]. GRANDE"+"\n\t\t\t  [3]. VENTI");
													System.out.print("\n\n\t  Enter your choice: "); mocha[0] = sc.nextInt();
													
													switch(mocha[0]) {
													
														case 1:
												
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: TALL"+"\nPRICE: P"+mocha[1]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=mocha[1]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");	
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Hot Coffee: Mocha " +"\nSIZE: TALL"+"\nPRICE: P"+mocha[1]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																	
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
														    System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
										 			
														case 2:
															
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: GRANDE"+"\nPRICE: P"+mocha[2]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=mocha[2]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");	
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Hot Coffee: Mocha " +"\nSIZE: GRANDE"+"\nPRICE: P"+mocha[2]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
														    System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														case 3:
															
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: VENTI"+"\nPRICE: P"+mocha[3]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=mocha[3]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Hot Coffee: Mocha " +"\nSIZE: VENTI"+"\nPRICE: P"+mocha[3]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
														    System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														default:
															System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   INVALID SIZE");
															System.out.println("\n================================================================================================================");
										 			
										 		}
										 			}while(mocha[0]>3);
						
												
												break;
												// VANILLA LATTE
										 		case 3:
										 			
										 			System.out.println("\n=================================================================================================================================");
										 			do {
													System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR COFFEE");	
													System.out.println("\t\t\nOrdered Number: "+coffee_order+" -- Coffee");
													System.out.println("\n\t\t\t  [1]. TALL"+"\n\t\t\t  [2]. GRANDE"+"\n\t\t\t  [3]. VENTI");
													System.out.print("\n\n\t  Enter your choice: "); vanilla_latte[0] = sc.nextInt();
													
													switch(vanilla_latte[0]) {
													
														case 1:
												
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: TALL"+"\nPRICE: P"+vanilla_latte[1]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=vanilla_latte[1]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Hot Coffee: Vanilla Latte " +"\nSIZE: TALL"+"\nPRICE: P"+vanilla_latte[1]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
													    				
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
														    System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
										 			
														case 2:
															
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: GRANDE"+"\nPRICE: P"+vanilla_latte[2]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=vanilla_latte[2]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Hot Coffee: Vanilla Latte " +"\nSIZE: GRANDE"+"\nPRICE: P"+vanilla_latte[2]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 				
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
																System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														case 3:
															
															System.out.println("\n================================================================================================================");;
															System.out.print("\nTOTAL: "+(coffee_total=vanilla_latte[3]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Hot Coffee: Vanilla Latte " +"\nSIZE: VENTI"+"\nPRICE: P"+vanilla_latte[3]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
														System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														default:
															System.out.println("=========================================================================");
															System.out.println("\t\t\t   INVALID SIZE");
															System.out.println("=========================================================================");
										 			
										 		}
										 			}while(vanilla_latte[0]>3);
												
												break;
												// SALTED CARAMEL
										 		case 4:
										 			
										 			System.out.println("\n=================================================================================================================================");
										 			do {
													System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR COFFEE");	
													System.out.println("\t\t\nOrdered Number: "+coffee_order+" -- Coffee");
													System.out.println("\n\t\t\t  [1]. TALL"+"\n\t\t\t  [2]. GRANDE"+"\n\t\t\t  [3]. VENTI");
													System.out.print("\n\n\t  Enter your choice: "); salted_caramel[0] = sc.nextInt();
													
													switch(salted_caramel[0]) {
													
														case 1:
												
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: TALL"+"\nPRICE: P"+salted_caramel[1]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=salted_caramel[1]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");	
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Cold Coffee: Salted Caramel " +"\nSIZE: TALL"+"\nPRICE: P"+salted_caramel[1]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
																System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
										 			
														case 2:
															
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: GRANDE"+"\nPRICE: P"+salted_caramel[2]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=salted_caramel[2]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");	
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Cold Coffee: Salted Caramel " +"\nSIZE: GRANDE"+"\nPRICE: P"+salted_caramel[2]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
														    System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														case 3:
															
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: VENTI"+"\nPRICE: P"+salted_caramel[3]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=salted_caramel[3]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Cold Coffee: Salted Caramel " +"\nSIZE: VENTI"+"\nPRICE: P"+salted_caramel[3]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
															System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														default:
															System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   INVALID SIZE");
															System.out.println("\n================================================================================================================");
										 			
										 		}
										 			}while(salted_caramel[0]>3);
												
												break;
												// MACCHIATO
										 		case 5:
										 			
										 			System.out.println("\n=================================================================================================================================");
										 			do {
													System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR COFFEE");	
													System.out.println("\t\t\nOrdered Number: "+coffee_order+" -- Coffee");
													System.out.println("\n\t\t\t  [1]. TALL"+"\n\t\t\t  [2]. GRANDE"+"\n\t\t\t  [3]. VENTI");
													System.out.print("\n\n\t  Enter your choice: "); macchiato[0] = sc.nextInt();
													
													switch(macchiato[0]) {
													
														case 1:
												
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: TALL"+"\nPRICE: P"+macchiato[1]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=macchiato[1]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Cold Coffee: Macchiato " +"\nSIZE: TALL"+"\nPRICE: P"+macchiato[1]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
														    System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
										 			
														case 2:
															
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: GRANDE"+"\nPRICE: P"+macchiato[2]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=macchiato[2]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");	
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Cold Coffee: Macchiato " +"\nSIZE: GRANDE"+"\nPRICE: P"+macchiato[2]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
																System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														case 3:
															
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: VENTI"+"\nPRICE: P"+macchiato[3]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=macchiato[3]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");	
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Cold Coffee: Macchiato " +"\nSIZE: VENTI"+"\nPRICE: P"+macchiato[3]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
														    System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														default:
															System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   INVALID SIZE");
															System.out.println("\n================================================================================================================");
										 			
										 		}
										 			}while(macchiato[0]>3);
												
												break;
												// WHITE CHOCOLATE MOCHA
										 		case 6:
										 			
										 			System.out.println("\n=================================================================================================================================");
										 			do {
													System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR COFFEE");	
													System.out.println("\t\t\nOrdered Number: "+coffee_order+" -- Coffee");
													System.out.println("\n\t\t\t  [1]. TALL"+"\n\t\t\t  [2]. GRANDE"+"\n\t\t\t  [3]. VENTI");
													System.out.print("\n\n\t  Enter your choice: "); whitechoco_mocha[0] = sc.nextInt();
													
													switch(whitechoco_mocha[0]) {
													
														case 1:
												
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: TALL"+"\nPRICE: P"+whitechoco_mocha[1]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=whitechoco_mocha[1]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");	
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Cold Coffee: White Chocolate Mocha " +"\nSIZE: TALL"+"\nPRICE: P"+whitechoco_mocha[1]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");																    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");																    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");															 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");															 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
															System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
										 			
														case 2:
															
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: GRANDE"+"\nPRICE: P"+whitechoco_mocha[2]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=whitechoco_mocha[2]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");	
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Cold Coffee: White Chocolate Mocha " +"\nSIZE: GRANDE"+"\nPRICE: P"+whitechoco_mocha[2]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
															System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");
															}
														
														break;
														
														case 3:
															
															System.out.println("\n================================================================================================================");
															System.out.print("SIZE: VENTI"+"\nPRICE: P"+whitechoco_mocha[3]+"\nQUANTITY: "); coffee_quantity=sc.nextInt();
															System.out.print("\nTOTAL: "+(coffee_total=whitechoco_mocha[3]*coffee_quantity)); System.out.print("\nEnter your money: "); coffee_payment=sc.nextLong();
															
															if(coffee_payment>=coffee_total) {
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
																System.out.print("\nOrdered Cold Coffee: White Chocolate Mocha " +"\nSIZE: VENTI"+"\nPRICE: P"+whitechoco_mocha[3]+"\nQUANTITY: "+coffee_quantity); 
																System.out.print("\nTOTAL: "+coffee_total+"\nMONEY ENTERED: "+coffee_payment+"\nCHANGE: "+(coffee_payment-=coffee_total));  
																System.out.println("\n================================================================================================================");
																System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
															    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
																System.out.print("                        Choice: ");  account = sc.nextInt();
															    
																if(account==1) {
															    	
															    	for(int i = 1; i <= 4; i++) {
															        	
															    		if (i < 4) {
															        	
															        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
															        		
															        		if (pin == acc_number) {
															    				System.out.println("\nLOGIN SUCCESS");
															    				System.out.println("------------------------------");
															    				System.out.println("\nAccount points: "+account_points);
															    				System.out.println("\nYour account gets 100 points");
															    				System.out.println("\nAccount points: "+(account_points+=100));
															    				System.out.println("\n================================================================================================================");
															    				
															    				i = 5;	
															    			}
															        		
															        		else {
															    				System.out.println("\nNot Matched");
															    				System.out.println("\n================================================================================================================");
															    				
															        		}
															    		}
															    		
															    		else {
															    			System.out.println("\nYou tried 3 times.");
															    			System.out.println("\n================================================================================================================");
															    		}	
															    	}
																
															    }
																
															    
																else if(account==2) {
																		acc_number = rand.nextInt(5000)+1100;
																		System.out.println("\n\nHere is your account number: "+acc_number);  
																		for(int i = 1; i <= 4; i++) {
														     	
																	if (i < 4) {
														     	
														     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
														     		
														     		if (pin == acc_number) {
														     			System.out.println("\nLOGIN SUCCESS");
														     			System.out.println("------------------------------");
														     			account_points=300;
													    				System.out.println("\nAccount points: "+account_points);
													    				System.out.println("\nYour account gets 100 points");
													    				System.out.println("\nAccount points: "+(account_points+=100));
													    				System.out.println("\n================================================================================================================");
														 			
														 				i = 5;	
														 			}
														     		else {
														 				System.out.println("\nNot Matched");
														 				System.out.println("\n================================================================================================================");
														 		
														     		}
														 		}
														 		
														     	else {
														     		System.out.println("\nYou tried 3 times.");
														     		System.out.println("\n================================================================================================================");
														 		}	
																		}
															    
															    } 								 										
																
															}
															
															else {
																System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   Not Enough Money");
															System.out.println("\n================================================================================================================");																}
														
														break;
														
														default:
															System.out.println("\n================================================================================================================");
															System.out.println("\t\t\t   INVALID SIZE");
															System.out.println("\n================================================================================================================");
										 			
										 		}
										 			}while(whitechoco_mocha[0]>3);
												
												break;
												
										 		default:
										 			System.out.println("\n================================================================================================================");
						 						System.out.println("\t\t\t    NOT IN MENU");
						 						
										 		}
												
										 		}while(coffee_order>6);
									 		
									 		break;
									 	
									 	case 2:	
									 		
									 		
									 		System.out.println("\n================================================================================================================");
									 		do {
									 		System.out.println("\n\n\t\t\t\t\t    Welcome to Milk Tea Section");
									 		System.out.println("\n\t\t\t\t Here is the availabe Milk tea in our shop, "+name);
									 		System.out.println("\n\t\t\t\t\t          REGULAR \t    MEDIUM \t    LARGE");
									 		System.out.println("\n\n\t\t\t   [1]. Red Velvet\t    P"+Milk_tea[1]+"\t\t     P"+Milk_tea[2]+"\t     P"+Milk_tea[3] + "\n\t\t\t   [2]. Taro\t\t    P"+Milk_tea[1]+"\t\t     P"+Milk_tea[2]+"\t     P"+Milk_tea[3]+
									 				"\n\t\t\t   [3]. Coockies N Cream    P"+Milk_tea[1]+"\t\t     P"+Milk_tea[2]+"\t     P"+Milk_tea[3]+"\n\t\t\t   [4]. Double Dutch  \t    P"+Milk_tea[1]+ "\t\t     P"+Milk_tea[2]+"\t     P"+Milk_tea[3]
									 						+ "\n\t\t\t   [5]. Matcha\t\t    P"+Milk_tea[1]+"\t\t     P"+Milk_tea[2]+"\t     P"+Milk_tea[3]);
									 		System.out.print("\n\n\t\t     Enter your choice: "); Milk_tea[0] = sc.nextInt();
									 		
									 		do {
									 			
									 			if(Milk_tea[0]>5) {
									 				continue;
									 			}
										 		
									 			System.out.print("\nEnter your customize sugar level (1-100): "); sugarlvl = sc.nextInt();
										 		if(sugarlvl>100) {
										 			System.out.println("\n===============================================");
										 			System.out.println("\t ENTER 1 - 100 NUMBERS ONLY!");
										 			System.out.println("===============================================");
										 		}
										 	
										 		if(sugarlvl>100) {
										 			continue;
										 		}
										 		
										 		System.out.println("\n(NOTED! YOUR MILK TEA SUGAR LEVEL IS  "+sugarlvl+"%)");
									 		} while(sugarlvl>100);
									 				
									 		
									 		
									 				if(Milk_tea[0]==1) {
									 					System.out.println("\n=================================================================================================================================");
									 					System.out.println("Red Velvet\n\n- flavoured milk tea that's mixed with fresh milk and golden pearls, \nbefore being topped with white chocolate balls.");
									 					
									 				}
									 				
									 				if(Milk_tea[0]==2) {
									 					System.out.println("\n=================================================================================================================================");
									 					System.out.println("Taro\n\n- is typically a boba milk tea that is flavored with taro.\nTaro has a sweet and vanilla flavor profile similar to sweet potato.");
									 				}
									 				
									 				if(Milk_tea[0]==3) {
									 					System.out.println("\n=================================================================================================================================");
									 					System.out.println("Cookies and Cream\n\n- Crushed Oreo cookies blended in thick and creamy vanilla milk and mixed with tapioca pearls\ncooked in a house blend of Okinawan black sugar.");
									 				}
									 				
									 				if(Milk_tea[0]==4) {
									 					System.out.println("\n=================================================================================================================================");
									 					System.out.println("Double Dutch\n\n- combines a rich, creamy flavor with the finest milk tea.\nMade with only the highest quality 100% natural ingredients, it offers consumers a better tea experience.");
									 				}
									 				
									 				if(Milk_tea[0]==5) {
									 					System.out.println("\n=================================================================================================================================");
									 					System.out.println("Matcha\n\n- is a refreshing beverage that is composed of your choice of milk, sweeteners,\nand matcha powder, which gives it a distinct green color.");
									 				}
									 				
									 				switch(Milk_tea[0]) {
									 							
									 						
									 						case 1: case 2: case 3: case 4: case 5:
									 							
									 							
									 							System.out.println("===========================================================================================================================");
									 							do {
									 							System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR MILK TEA");	
									 							System.out.println("\t\t\nOrdered Number: "+Milk_tea[0]);
									 							System.out.println("\n\t\t\t  [1]. REGULAR"+"\n\t\t\t  [2]. MEDIUM"+"\n\t\t\t  [3]. LARGE");
									 							System.out.print("\n\n\t  Enter your choice: "); milktea_order = sc.nextInt();
									 							
									 							switch(milktea_order) {
									 							
									 							
									 							 case 1:
									 								System.out.println("\n================================================================================================================");
									 								System.out.print("SUGAR LEVEL: "+sugarlvl+"\nSIZE: REGULAR"+"\nPRICE: P"+Milk_tea[1]+"\nQUANTITY: "); milktea_quantity=sc.nextInt();
									 								System.out.print("\nTOTAL: "+(milktea_total=Milk_tea[1]*milktea_quantity)); System.out.print("\nEnter your money: "); milktea_payment=sc.nextLong();
									 								
									 								if(milktea_payment>=milktea_total) {
									 									System.out.println("\n================================================================================================================");
									    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									    								System.out.print("\nOrdered Milktea Number: "+Milk_tea[0] +"\nSUGAR LEVEL: "+sugarlvl+"\nSIZE: REGULAR"+"\nPRICE: P"+Milk_tea[1]+"\nQUANTITY: "+milktea_quantity); 
										 								System.out.print("\nTOTAL: "+milktea_total+"\nMONEY ENTERED: "+milktea_payment+"\nCHANGE: "+(milktea_payment-=milktea_total));  
										 								System.out.println("\n================================================================================================================");
										 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									     								System.out.print("                        Choice: ");  account = sc.nextInt();
									     							    
									     								if(account==1) {
									     							    	
									     							    	for(int i = 1; i <= 4; i++) {
									     							        	
									     							    		if (i < 4) {
									     							        	
									     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									     							        		
									     							        		if (pin == acc_number) {
									     							    				System.out.println("\nLOGIN SUCCESS");
									     							    				System.out.println("------------------------------");
									     							    				System.out.println("\nAccount points: "+account_points);
									     							    				System.out.println("\nYour account gets 100 points");
									     							    				System.out.println("\nAccount points: "+(account_points+=100));
									     							    				System.out.println("\n================================================================================================================");
									     							    				
									     							    				i = 5;	
									     							    			}
									     							        		
									     							        		else {
									     							    				System.out.println("\nNot Matched");
									     							    				System.out.println("\n================================================================================================================");
									     							    				
									     							        		}
									     							    		}
									     							    		
									     							    		else {
									     							    			System.out.println("\nYou tried 3 times.");
									     							    			System.out.println("\n================================================================================================================");
									     							    		}	
									     							    	}
									     								
									     							    }
									     								
									     							    
									     								else if(account==2) {
									     										acc_number = rand.nextInt(5000)+1100;
									     										System.out.println("\n\nHere is your account number: "+acc_number);  
									     										for(int i = 1; i <= 4; i++) {
									     						     	
									     									if (i < 4) {
									     						     	
									     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									     						     		
									     						     		if (pin == acc_number) {
									     						     			System.out.println("\nLOGIN SUCCESS");
									     						     			System.out.println("------------------------------");
									     						     			account_points=300;
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("\n================================================================================================================");
									     						 			
									     						 				i = 5;	
									     						 			}
									     						     		else {
									     						 				System.out.println("\nNot Matched");
									     						 				System.out.println("\n================================================================================================================");
									     						 		
									     						     		}
									     						 		}
									     						 		
									     						     	else {
									     						     		System.out.println("\nYou tried 3 times.");
									     						     		System.out.println("\n================================================================================================================");
									     						 		}	
									     										}
									     							    
									     							    } 								 										
									 									
									 								}
									 								
									 								else {
									 									System.out.println("\n================================================================================================================");
									    								System.out.println("\t\t\t   Not Enough Money");
									    								System.out.println("\n================================================================================================================");
									     							}	
									 							
									 							break;
									 							
									 
									 							case 2:
									 								System.out.println("\n================================================================================================================");
									 								System.out.print("SUGAR LEVEL: "+sugarlvl+"\nSIZE: MEDIUM"+"\nPRICE: P"+Milk_tea[2]+"\nQUANTITY: "); milktea_quantity=sc.nextInt();
									 								System.out.print("\nTOTAL: "+(milktea_total=Milk_tea[2]*milktea_quantity)); System.out.print("\nEnter your money: "); milktea_payment=sc.nextLong();
									 								
									 								if(milktea_payment>=milktea_total) {
									 									System.out.println("\n================================================================================================================");
									    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									    								System.out.print("\nOrdered Milktea Number: "+Milk_tea[0] +"\nSUGAR LEVEL: "+sugarlvl+"\nSIZE: MEDIUM"+"\nPRICE: P"+Milk_tea[2]+"\nQUANTITY: "+milktea_quantity); 
										 								System.out.print("\nTOTAL: "+milktea_total+"\nMONEY ENTERED: "+milktea_payment+"\nCHANGE: "+(milktea_payment-=milktea_total));  
										 								System.out.println("\n================================================================================================================");
										 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									     								System.out.print("                        Choice: ");  account = sc.nextInt();
									     							    
									     								if(account==1) {
									     							    	
									     							    	for(int i = 1; i <= 4; i++) {
									     							        	
									     							    		if (i < 4) {
									     							        	
									     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									     							        		
									     							        		if (pin == acc_number) {
									     							    				System.out.println("\nLOGIN SUCCESS");
									     							    				System.out.println("------------------------------");
									     							    				System.out.println("\nAccount points: "+account_points);
									     							    				System.out.println("\nYour account gets 100 points");
									     							    				System.out.println("\nAccount points: "+(account_points+=100));
									     							    				System.out.println("\n================================================================================================================");
									     							    				
									     							    				i = 5;	
									     							    			}
									     							        		
									     							        		else {
									     							    				System.out.println("\nNot Matched");
									     							    				System.out.println("\n================================================================================================================");
									     							    				
									     							        		}
									     							    		}
									     							    		
									     							    		else {
									     							    			System.out.println("\nYou tried 3 times.");
									     							    			System.out.println("\n================================================================================================================");
									     							    		}	
									     							    	}
									     								
									     							    }
									     								
									     							    
									     								else if(account==2) {
									     										acc_number = rand.nextInt(5000)+1100;
									     										System.out.println("\n\nHere is your account number: "+acc_number);  
									     										for(int i = 1; i <= 4; i++) {
									     						     	
									     									if (i < 4) {
									     						     	
									     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									     						     		
									     						     		if (pin == acc_number) {
									     						     			System.out.println("\nLOGIN SUCCESS");
									     						     			System.out.println("------------------------------");
									     						     			account_points=300;
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("\n================================================================================================================");
									     						 			
									     						 				i = 5;	
									     						 			}
									     						     		else {
									     						 				System.out.println("\nNot Matched");
									     						 				System.out.println("\n================================================================================================================");
									     						 		
									     						     		}
									     						 		}
									     						 		
									     						     	else {
									     						     		System.out.println("\nYou tried 3 times.");
									     						     		System.out.println("\n================================================================================================================");
									     						 		}	
									     										}
									     							    
									     							    } 								 										
									 									
									 								}
									 								
									 								else {
									 									System.out.println("\n================================================================================================================");
									    								System.out.println("\t\t\t   Not Enough Money");
									    								System.out.println("\n================================================================================================================");
									     							}	
									 							
									 							break;
									 							
									 							case 3:
									 								System.out.println("\n================================================================================================================");
									 								System.out.print("SUGAR LEVEL: "+sugarlvl+"\nSIZE: LARGE"+"\nPRICE: P"+Milk_tea[3]+"\nQUANTITY: "); milktea_quantity=sc.nextInt();
									 								System.out.print("\nTOTAL: "+(milktea_total=Milk_tea[3]*milktea_quantity)); System.out.print("\nEnter your money: "); milktea_payment=sc.nextLong();
									 								
									 								if(milktea_payment>=milktea_total) {
									 									System.out.println("\n================================================================================================================");
									    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									    								System.out.print("\nOrdered Milktea Number: "+Milk_tea[0] +"\nSUGAR LEVEL: "+sugarlvl+"\nSIZE: LARGE"+"\nPRICE: P"+Milk_tea[3]+"\nQUANTITY: "+milktea_quantity); 
										 								System.out.print("\nTOTAL: "+milktea_total+"\nMONEY ENTERED: "+milktea_payment+"\nCHANGE: "+(milktea_payment-=milktea_total));  
										 								System.out.println("\n================================================================================================================");
										 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									     								System.out.print("                        Choice: ");  account = sc.nextInt();
									     							    
									     								if(account==1) {
									     							    	
									     							    	for(int i = 1; i <= 4; i++) {
									     							        	
									     							    		if (i < 4) {
									     							        	
									     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									     							        		
									     							        		if (pin == acc_number) {
									     							    				System.out.println("\nLOGIN SUCCESS");
									     							    				System.out.println("------------------------------");
									     							    				System.out.println("\nAccount points: "+account_points);
									     							    				System.out.println("\nYour account gets 100 points");
									     							    				System.out.println("\nAccount points: "+(account_points+=100));
									     							    				System.out.println("\n================================================================================================================");
									     							    				
									     							    				i = 5;	
									     							    			}
									     							        		
									     							        		else {
									     							    				System.out.println("\nNot Matched");
									     							    				System.out.println("\n================================================================================================================");
									     							    				
									     							        		}
									     							    		}
									     							    		
									     							    		else {
									     							    			System.out.println("\nYou tried 3 times.");
									     							    			System.out.println("\n================================================================================================================");
									     							    		}	
									     							    	}
									     								
									     							    }
									     								
									     							    
									     								else if(account==2) {
									     										acc_number = rand.nextInt(5000)+1100;
									     										System.out.println("\n\nHere is your account number: "+acc_number);  
									     										for(int i = 1; i <= 4; i++) {
									     						     	
									     									if (i < 4) {
									     						     	
									     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									     						     		
									     						     		if (pin == acc_number) {
									     						     			System.out.println("\nLOGIN SUCCESS");
									     						     			System.out.println("------------------------------");
									     						     			account_points=300;
							     							    				System.out.println("\nAccount points: "+account_points);
							     							    				System.out.println("\nYour account gets 100 points");
							     							    				System.out.println("\nAccount points: "+(account_points+=100));
							     							    				System.out.println("\n================================================================================================================");
									     						 			
									     						 				i = 5;	
									     						 			}
									     						     		else {
									     						 				System.out.println("\nNot Matched");
									     						 				System.out.println("\n================================================================================================================");
									     						 		
									     						     		}
									     						 		}
									     						 		
									     						     	else {
									     						     		System.out.println("\nYou tried 3 times.");
									     						     		System.out.println("\n================================================================================================================");
									     						 		}	
									     										}
									     							    
									     							    } 								 										
									 									
									 								}
									 								
									 								else {
									 									System.out.println("\n================================================================================================================");
									    								System.out.println("\t\t\t   Not Enough Money");
									    								System.out.println("\n================================================================================================================");
									     							}	
									 							
									 							break;
									 							
									 							default:
									 								System.out.println("\n================================================================================================================");
								    								System.out.println("\t\t\t   INVALID SIZE");
								    								System.out.println("\n================================================================================================================");
									 					
									 							}
									 							
									 		}while(milktea_order>3);	
									 						
									 						break;	
									 							
									 						default:
									 							System.out.println("\n================================================================================================================");
							    								System.out.println("\t\t\t\t\t\t  NOT IN MENU");
							    								System.out.println("================================================================================================================");
									 						
									 						}	
									 		}while(Milk_tea[0]>5);
									        
									 		break;
									        
									 	case 3: // FRUI TEA SECTION 
									 		
									 		do {
									 			System.out.println("================================================================================================================");
									 			System.out.println("\n\n\t\t\t\t\t Welcome to Fruit Tea Section");
									 			System.out.println("\n\t\t\t\t Here is the availabe Fruit Tea in our shop, "+name);
									 			System.out.println("\n\t\t\t\t\t          REGULAR \t    MEDIUM \t    LARGE");
									 			System.out.println("\n\n\t\t\t   [1]. Lemon\t\t    P"+lemon[1]+"\t     P"+lemon[2]+"\t     P"+lemon[3] + "\n\t\t\t   [2]. Green Apple\t    P"+green_apple[1]+"\t     P"+green_apple[2]+"\t     P"+green_apple[3]+
									 					"\n\t\t\t   [3]. Kiwi\t\t    P"+kiwi[1]+"\t     P"+kiwi[2]+"\t     P"+kiwi[3]+"\n\t\t\t   [4]. Blue Berry  \t    P"+blue_straw[1]+ "\t     P"+blue_straw[2]+"\t     P"+blue_straw[3]
									 							+ "\n\t\t\t   [5]. Strawberry\t    P"+blue_straw[1]+"\t     P"+blue_straw[2]+"\t     P"+blue_straw[3]);
									 			System.out.print("\n\n\t\t\t  Enter your choice: "); fruittea_order = sc.nextInt();
									 				
									 			
									 			if(fruittea_order==1) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Lemon\n\n- is prepared using black tea or green tea and by adding \nthe right amount of lemon juice to it.");
								 				}
									 			
									 			if(fruittea_order==2) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Green Apple\n\n- has a slightly sweet tart apple flavor that pairs well with the sencha green tea base.\nLuxury Ingredients: Green tea, Apple pieces, Natural flavors.");
									 			}
									 			
									 			if(fruittea_order==3) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Kiwi\n\n- A delicious tea with a combination of sweetness added with orange syrup and a sour kiwi flavor.\nIt's blended with lemon juice and has a jelly texture.");
									 			}
									 			
									 			if(fruittea_order==4) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Blue Berry\n\n- this tea has the tiniest little taste of it that just enhances the flavor. Seriously,\nthis tea is like a bowl of fresh blueberries, cherries, and currants wrapped into one.");
									 			}
									 			
									 			if(fruittea_order==5) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Strawberry Tea\n\n- Made using water, green tea leaves, fresh strawberries, and honey,\nthis flavorful strawberry tea delights you one sip at a time.");
									 			}
									 				
									 				switch(fruittea_order) {
									 				
									 					case 1:
									 							System.out.println("\n================================================================================================================");
									 						do {
									 							System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR FRUIT TEA");	
									 							System.out.println("\t\t\nOrdered Number: "+fruittea_order+" -- Lemon");
									 							System.out.println("\n\t\t\t  [1]. REGULAR"+"\n\t\t\t  [2]. MEDIUM"+"\n\t\t\t  [3]. LARGE");
									 							System.out.print("\n\n\t  Enter your choice: "); lemon[0] = sc.nextInt();
									 							
									 							switch(lemon[0]) {
									 							
									 							 case 1:
									 								System.out.println("\n================================================================================================================");
									 								System.out.print("SIZE: REGULAR"+"\nPRICE: P"+lemon[1]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 								System.out.print("\nTOTAL: "+(fruittea_total=lemon[1]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 								
									 								if(fruittea_payment>=fruittea_total) {
									 									System.out.println("\n================================================================================================================");
									 									System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 									System.out.print("\nOrdered Fruit Tea: Lemon " +"\nSIZE: REGULAR"+"\nPRICE: P"+lemon[1]+"\nQUANTITY: "+fruittea_quantity); 
									 									System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 									System.out.println("\n================================================================================================================");
									 									System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 								    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 									System.out.print("                        Choice: ");  account = sc.nextInt();
									 								    
									 									if(account==1) {
									 								    	
									 								    	for(int i = 1; i <= 4; i++) {
									 								        	
									 								    		if (i < 4) {
									 								        	
									 								        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 								        		
									 								        		if (pin == acc_number) {
									 								    				System.out.println("\nLOGIN SUCCESS");
									 								    				System.out.println("------------------------------");
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								    				i = 5;	
									 								    			}
									 								        		
									 								        		else {
									 								    				System.out.println("\nNot Matched");
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								        		}
									 								    		}
									 								    		
									 								    		else {
									 								    			System.out.println("\nYou tried 3 times.");
									 								    			System.out.println("\n================================================================================================================");
									 								    		}	
									 								    	}
									 									
									 								    }
									 									
									 								    
									 									else if(account==2) {
									 											acc_number = rand.nextInt(5000)+1100;
									 											System.out.println("\n\nHere is your account number: "+acc_number);  
									 											for(int i = 1; i <= 4; i++) {
									 							     	
									 										if (i < 4) {
									 							     	
									 							     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 							     		
									 							     		if (pin == acc_number) {
									 							     			System.out.println("\nLOGIN SUCCESS");
									 							     			System.out.println("------------------------------");
									 							     			account_points=300;
									 						    				System.out.println("\nAccount points: "+account_points);
									 						    				System.out.println("\nYour account gets 100 points");
									 						    				System.out.println("\nAccount points: "+(account_points+=100));
									 						    				System.out.println("\n================================================================================================================");
									 							 			
									 							 				i = 5;	
									 							 			}
									 							     		else {
									 							 				System.out.println("\nNot Matched");
									 							 				System.out.println("\n================================================================================================================");
									 							 		
									 							     		}
									 							 		}
									 							 		
									 							     	else {
									 							     		System.out.println("\nYou tried 3 times.");
									 							     		System.out.println("\n================================================================================================================");
									 							 		}	
									 											}
									 								    
									 								    } 								 										
									 									
									 								}
									 								
									 								else {
									 								System.out.println("\n================================================================================================================");
									 								System.out.println("\t\t\t   Not Enough Money");
									 								System.out.println("\n================================================================================================================");
									 								}	
									 							
									 							 break;		
									 							
									 							 case 2:
									 								System.out.println("\n================================================================================================================");
									 									System.out.print("SIZE: MEDIUM"+"\nPRICE: P"+lemon[2]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 									System.out.print("\nTOTAL: "+(fruittea_total=lemon[2]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 									
									 									if(fruittea_payment>=fruittea_total) {
									 										System.out.println("\n================================================================================================================");	
									 										System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 										System.out.print("\nOrdered Fruit Tea: Lemon " +"\nSIZE: MEDIUM"+"\nPRICE: P"+lemon[2]+"\nQUANTITY: "+fruittea_quantity); 
									 										System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 										System.out.println("\n================================================================================================================");
									 										System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 									    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 										System.out.print("                        Choice: ");  account = sc.nextInt();
									 									    
									 										if(account==1) {
									 									    	
									 									    	for(int i = 1; i <= 4; i++) {
									 									        	
									 									    		if (i < 4) {
									 									        	
									 									        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 									        		
									 									        		if (pin == acc_number) {
									 									    				System.out.println("\nLOGIN SUCCESS");
									 									    				System.out.println("------------------------------");
									 									    				System.out.println("\nAccount points: "+account_points);
									 									    				System.out.println("\nYour account gets 100 points");
									 									    				System.out.println("\nAccount points: "+(account_points+=100));
									 									    				System.out.println("\n================================================================================================================");
									 									    				
									 									    				i = 5;	
									 									    			}
									 									        		
									 									        		else {
									 									    				System.out.println("\nNot Matched");
									 									    				System.out.println("\n================================================================================================================");
									 									    				
									 									        		}
									 									    		}
									 									    		
									 									    		else {
									 									    			System.out.println("\nYou tried 3 times.");
									 									    			System.out.println("\n================================================================================================================");
									 									    		}	
									 									    	}
									 										
									 									    }
									 										
									 									    
									 										else if(account==2) {
									 												acc_number = rand.nextInt(5000)+1100;
									 												System.out.println("\n\nHere is your account number: "+acc_number);  
									 												for(int i = 1; i <= 4; i++) {
									 								     	
									 											if (i < 4) {
									 								     	
									 								     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 								     		
									 								     		if (pin == acc_number) {
									 								     			System.out.println("\nLOGIN SUCCESS");
									 								     			System.out.println("------------------------------");
									 								     			acc_number = rand.nextInt(5000)+1100;
									 							    				System.out.println("\nAccount points: "+account_points);
									 							    				System.out.println("\nYour account gets 100 points");
									 							    				System.out.println("\nAccount points: "+(account_points+=100));
									 							    				System.out.println("\n================================================================================================================");
									 								 			
									 								 				i = 5;	
									 								 			}
									 								     		else {
									 								 				System.out.println("\nNot Matched");
									 								 				System.out.println("\n================================================================================================================");
									 								 		
									 								     		}
									 								 		}
									 								 		
									 								     	else {
									 								     		System.out.println("\nYou tried 3 times.");
									 								     		System.out.println("\n================================================================================================================");
									 								 		}	
									 												}
									 									    
									 									    } 								 										
									 										
									 									}
									 									
									 									else {
									 									System.out.println("\n================================================================================================================");
									 									System.out.println("\t\t\t   Not Enough Money");
									 									System.out.println("\n================================================================================================================");
									 									}	
									 								
									 							 break;

									 							 case 3:
									 								System.out.println("\n================================================================================================================");
									 									System.out.print("SIZE: LARGE"+"\nPRICE: P"+lemon[3]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 									System.out.print("\nTOTAL: "+(fruittea_total=lemon[3]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 									
									 									if(fruittea_payment>=fruittea_total) {
									 										System.out.println("\n================================================================================================================");
									 										System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 										System.out.print("\nOrdered Fruit Tea: Lemon " +"\nSIZE: LARGE"+"\nPRICE: P"+lemon[3]+"\nQUANTITY: "+fruittea_quantity); 
									 										System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 										System.out.println("\n================================================================================================================");
									 										System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 									    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 										System.out.print("                        Choice: ");  account = sc.nextInt();
									 									    
									 										if(account==1) {
									 									    	
									 									    	for(int i = 1; i <= 4; i++) {
									 									        	
									 									    		if (i < 4) {
									 									        	
									 									        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 									        		
									 									        		if (pin == acc_number) {
									 									    				System.out.println("\nLOGIN SUCCESS");
									 									    				System.out.println("------------------------------");
									 									    				System.out.println("\nAccount points: "+account_points);
									 									    				System.out.println("\nYour account gets 100 points");
									 									    				System.out.println("\nAccount points: "+(account_points+=100));
									 									    				System.out.println("\n================================================================================================================");
									 									    				
									 									    				i = 5;	
									 									    			}
									 									        		
									 									        		else {
									 									    				System.out.println("\nNot Matched");
									 									    				System.out.println("\n================================================================================================================");
									 									    				
									 									        		}
									 									    		}
									 									    		
									 									    		else {
									 									    			System.out.println("\nYou tried 3 times.");
									 									    			System.out.println("\n================================================================================================================");
									 									    		}	
									 									    	}
									 										
									 									    }
									 										
									 									    
									 										else if(account==2) {
									 												acc_number = rand.nextInt(5000)+1100;
									 												System.out.println("\n\nHere is your account number: "+acc_number);  
									 												for(int i = 1; i <= 4; i++) {
									 								     	
									 											if (i < 4) {
									 								     	
									 								     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 								     		
									 								     		if (pin == acc_number) {
									 								     			System.out.println("\nLOGIN SUCCESS");
									 								     			System.out.println("------------------------------");
									 								     			account_points=300;
									 							    				System.out.println("\nAccount points: "+account_points);
									 							    				System.out.println("\nYour account gets 100 points");
									 							    				System.out.println("\nAccount points: "+(account_points+=100));
									 							    				System.out.println("\n================================================================================================================");
									 								 			
									 								 				i = 5;	
									 								 			}
									 								     		else {
									 								 				System.out.println("\nNot Matched");
									 								 				System.out.println("\n================================================================================================================");
									 								 		
									 								     		}
									 								 		}
									 								 		
									 								     	else {
									 								     		System.out.println("\nYou tried 3 times.");
									 								     		System.out.println("\n================================================================================================================");
									 								 		}	
									 												}
									 									    
									 									    } 								 										
									 										
									 									}
									 									
									 									else {
									 									System.out.println("\n================================================================================================================");
									 									System.out.println("\t\t\t   Not Enough Money");
									 									System.out.println("\n================================================================================================================");
									 									}	
									 								
									 							 break;
									 							 
									 							 default:
									 								    System.out.println("\n================================================================================================================");
									 									System.out.println("\t\t\t   INVALID SIZE");
									 									System.out.println("\n================================================================================================================");										 				
									 							}
									 							
									 						}while(lemon[0]>3);
									 					
									 					break; 
									 					
									 					case 2:
									 						System.out.println("\n================================================================================================================");
									 						do {
									 						System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR FRUIT TEA");	
									 						System.out.println("\t\t\nOrdered Number: "+fruittea_order+" -- Green Apple");
									 						System.out.println("\n\t\t\t  [1]. REGULAR"+"\n\t\t\t  [2]. MEDIUM"+"\n\t\t\t  [3]. LARGE");
									 						System.out.print("\n\n\t  Enter your choice: "); green_apple[0] = sc.nextInt();
									 						
									 						switch(green_apple[0]) {
									 						
									 						 case 1:
									 							System.out.println("=========================================================================");
									 							System.out.print("SIZE: REGULAR"+"\nPRICE: P"+green_apple[1]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 							System.out.print("\nTOTAL: "+(fruittea_total=green_apple[1]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 							
									 							if(fruittea_payment>=fruittea_total) {
									 								System.out.println("\n================================================================================================================");
									 								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 								System.out.print("\nOrdered Fruit Tea: Green Apple " +"\nSIZE: REGULAR"+"\nPRICE: P"+green_apple[1]+"\nQUANTITY: "+fruittea_quantity); 
									 								System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 								System.out.println("\n================================================================================================================");
									 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 								System.out.print("                        Choice: ");  account = sc.nextInt();
									 							    
									 								if(account==1) {
									 							    	
									 							    	for(int i = 1; i <= 4; i++) {
									 							        	
									 							    		if (i < 4) {
									 							        	
									 							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 							        		
									 							        		if (pin == acc_number) {
									 							    				System.out.println("\nLOGIN SUCCESS");
									 							    				System.out.println("------------------------------");
									 							    				System.out.println("\nAccount points: "+account_points);
									 							    				System.out.println("\nYour account gets 100 points");
									 							    				System.out.println("\nAccount points: "+(account_points+=100));
									 							    				System.out.println("\n================================================================================================================");
									 							    				
									 							    				i = 5;	
									 							    			}
									 							        		
									 							        		else {
									 							    				System.out.println("\nNot Matched");
									 							    				System.out.println("\n================================================================================================================");
									 							    				
									 							        		}
									 							    		}
									 							    		
									 							    		else {
									 							    			System.out.println("\nYou tried 3 times.");
									 							    			System.out.println("\n================================================================================================================");
									 							    		}	
									 							    	}
									 								
									 							    }
									 								
									 							    
									 								else if(account==2) {
									 										acc_number = rand.nextInt(5000)+1100;
									 										System.out.println("\n\nHere is your account number: "+acc_number);  
									 										for(int i = 1; i <= 4; i++) {
									 						     	
									 									if (i < 4) {
									 						     	
									 						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 						     		
									 						     		if (pin == acc_number) {
									 						     			System.out.println("\nLOGIN SUCCESS");
									 						     			System.out.println("------------------------------");
									 						     			account_points=300;
									 					    				System.out.println("\nAccount points: "+account_points);
									 					    				System.out.println("\nYour account gets 100 points");
									 					    				System.out.println("\nAccount points: "+(account_points+=100));
									 					    				System.out.println("\n================================================================================================================");
									 						 			
									 						 				i = 5;	
									 						 			}
									 						     		else {
									 						 				System.out.println("\nNot Matched");
									 						 				System.out.println("\n================================================================================================================");
									 						 		
									 						     		}
									 						 		}
									 						 		
									 						     	else {
									 						     		System.out.println("\nYou tried 3 times.");
									 						     		System.out.println("\n================================================================================================================");
									 						 		}	
									 										}
									 							    
									 							    } 								 										
									 								
									 							}
									 							
									 							else {
									 							System.out.println("\n================================================================================================================");
									 							System.out.println("\t\t\t   Not Enough Money");
									 							System.out.println("\n================================================================================================================");
									 							}	
									 						
									 						 break;		
									 						
									 						 case 2:
									 							    System.out.println("\n================================================================================================================");
									 								System.out.print("SIZE: MEDIUM"+"\nPRICE: P"+green_apple[2]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 								System.out.print("\nTOTAL: "+(fruittea_total=green_apple[2]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 								
									 								if(fruittea_payment>=fruittea_total) {
									 									System.out.println("\n================================================================================================================");	
									 									System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 									System.out.print("\nOrdered Fruit Tea: Green Apple " +"\nSIZE: MEDIUM"+"\nPRICE: P"+green_apple[2]+"\nQUANTITY: "+fruittea_quantity); 
									 									System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 									System.out.println("\n================================================================================================================");
									 									System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 								    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 									System.out.print("                        Choice: ");  account = sc.nextInt();
									 								    
									 									if(account==1) {
									 								    	
									 								    	for(int i = 1; i <= 4; i++) {
									 								        	
									 								    		if (i < 4) {
									 								        	
									 								        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 								        		
									 								        		if (pin == acc_number) {
									 								    				System.out.println("\nLOGIN SUCCESS");
									 								    				System.out.println("------------------------------");
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								    				i = 5;	
									 								    			}
									 								        		
									 								        		else {
									 								    				System.out.println("\nNot Matched");
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								        		}
									 								    		}
									 								    		
									 								    		else {
									 								    			System.out.println("\nYou tried 3 times.");
									 								    			System.out.println("\n================================================================================================================");
									 								    		}	
									 								    	}
									 									
									 								    }
									 									
									 								    
									 									else if(account==2) {
									 											acc_number = rand.nextInt(5000)+1100;
									 											System.out.println("\n\nHere is your account number: "+acc_number);  
									 											for(int i = 1; i <= 4; i++) {
									 							     	
									 										if (i < 4) {
									 							     	
									 							     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 							     		
									 							     		if (pin == acc_number) {
									 							     			System.out.println("\nLOGIN SUCCESS");
									 							     			System.out.println("------------------------------");
									 							     			account_points=300;
									 						    				System.out.println("\nAccount points: "+account_points);
									 						    				System.out.println("\nYour account gets 100 points");
									 						    				System.out.println("\nAccount points: "+(account_points+=100));
									 						    				System.out.println("\n================================================================================================================");
									 							 			
									 							 				i = 5;	
									 							 			}
									 							     		else {
									 							 				System.out.println("\nNot Matched");
									 							 				System.out.println("\n================================================================================================================");
									 							 		
									 							     		}
									 							 		}
									 							 		
									 							     	else {
									 							     		System.out.println("\nYou tried 3 times.");
									 							     		System.out.println("\n================================================================================================================");
									 							 		}	
									 											}
									 								    
									 								    } 								 										
									 									
									 								}
									 								
									 								else {
									 								System.out.println("\n================================================================================================================");
									 								System.out.println("\t\t\t   Not Enough Money");
									 								System.out.println("\n================================================================================================================");
									 								}	
									 							
									 						 break;

									 						 case 3:
									 							System.out.println("\n================================================================================================================");
									 								System.out.print("SIZE: LARGE"+"\nPRICE: P"+green_apple[3]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 								System.out.print("\nTOTAL: "+(fruittea_total=green_apple[3]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 								
									 								if(fruittea_payment>=fruittea_total) {
									 									System.out.println("\n================================================================================================================");	
									 									System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 									System.out.print("\nOrdered Fruit Tea: Green Apple " +"\nSIZE: LARGE"+"\nPRICE: P"+green_apple[3]+"\nQUANTITY: "+fruittea_quantity); 
									 									System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 									System.out.println("\n================================================================================================================");
									 									System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 								    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 									System.out.print("                        Choice: ");  account = sc.nextInt();
									 								    
									 									if(account==1) {
									 								    	
									 								    	for(int i = 1; i <= 4; i++) {
									 								        	
									 								    		if (i < 4) {
									 								        	
									 								        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 								        		
									 								        		if (pin == acc_number) {
									 								    				System.out.println("\nLOGIN SUCCESS");
									 								    				System.out.println("------------------------------");
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								    				i = 5;	
									 								    			}
									 								        		
									 								        		else {
									 								    				System.out.println("\nNot Matched");
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								        		}
									 								    		}
									 								    		
									 								    		else {
									 								    			System.out.println("\nYou tried 3 times.");
									 								    			System.out.println("\n================================================================================================================");
									 								    		}	
									 								    	}
									 									
									 								    }
									 									
									 								    
									 									else if(account==2) {
									 											acc_number = rand.nextInt(5000)+1100;
									 											System.out.println("\n\nHere is your account number: "+acc_number);  
									 											for(int i = 1; i <= 4; i++) {
									 							     	
									 										if (i < 4) {
									 							     	
									 							     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 							     		
									 							     		if (pin == acc_number) {
									 							     			System.out.println("\nLOGIN SUCCESS");
									 							     			System.out.println("------------------------------");
									 							     			account_points=300;
									 						    				System.out.println("\nAccount points: "+account_points);
									 						    				System.out.println("\nYour account gets 100 points");
									 						    				System.out.println("\nAccount points: "+(account_points+=100));
									 						    				System.out.println("\n================================================================================================================");
									 							 			
									 							 				i = 5;	
									 							 			}
									 							     		else {
									 							 				System.out.println("\nNot Matched");
									 							 				System.out.println("\n================================================================================================================");
									 							 		
									 							     		}
									 							 		}
									 							 		
									 							     	else {
									 							     		System.out.println("\nYou tried 3 times.");
									 							     		System.out.println("\n================================================================================================================");
									 							 		}	
									 											}
									 								    
									 								    } 								 										
									 									
									 								}
									 								
									 								else {
									 								System.out.println("\n================================================================================================================");
									 								System.out.println("\t\t\t   Not Enough Money");
									 								System.out.println("\n================================================================================================================");
									 								}	
									 							
									 						 break;
									 						 
									 						 default:
									 							    System.out.println("\n================================================================================================================");
									 								System.out.println("\t\t\t   INVALID SIZE");
									 								System.out.println("\n================================================================================================================");
									 			
									 						 }
									 						
									 						}while(green_apple[0]>3);
									 			 
									 					break;
									 					
									 					case 3:
									 						System.out.println("\n================================================================================================================");
									 						do {
									 						System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR FRUIT TEA");	
									 						System.out.println("\t\t\nOrdered Number: "+fruittea_order+" -- Kiwi");
									 						System.out.println("\n\t\t\t  [1]. REGULAR"+"\n\t\t\t  [2]. MEDIUM"+"\n\t\t\t  [3]. LARGE");
									 						System.out.print("\n\n\t  Enter your choice: "); kiwi[0] = sc.nextInt();
									 						
									 						switch(kiwi[0]) {
									 						
									 						 case 1:
									 							System.out.println("\n================================================================================================================");
									 							System.out.print("SIZE: REGULAR"+"\nPRICE: P"+kiwi[1]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 							System.out.print("\nTOTAL: "+(fruittea_total=kiwi[1]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 							
									 							if(fruittea_payment>=fruittea_total) {
									 								System.out.println("\n================================================================================================================");
									 								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 								System.out.print("\nOrdered Fruit Tea: Kiwi " +"\nSIZE: REGULAR"+"\nPRICE: P"+kiwi[1]+"\nQUANTITY: "+fruittea_quantity); 
									 								System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 								System.out.println("\n================================================================================================================");
									 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 								System.out.print("                        Choice: ");  account = sc.nextInt();
									 							    
									 								if(account==1) {
									 							    	
									 							    	for(int i = 1; i <= 4; i++) {
									 							        	
									 							    		if (i < 4) {
									 							        	
									 							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 							        		
									 							        		if (pin == acc_number) {
									 							    				System.out.println("\nLOGIN SUCCESS");
									 							    				System.out.println("------------------------------");
									 							    				System.out.println("\nAccount points: "+account_points);
									 							    				System.out.println("\nYour account gets 100 points");
									 							    				System.out.println("\nAccount points: "+(account_points+=100));
									 							    				System.out.println("\n================================================================================================================");
									 							    				
									 							    				i = 5;	
									 							    			}
									 							        		
									 							        		else {
									 							    				System.out.println("\nNot Matched");
									 							    				System.out.println("\n================================================================================================================");
									 							    				
									 							        		}
									 							    		}
									 							    		
									 							    		else {
									 							    			System.out.println("\nYou tried 3 times.");
									 							    			System.out.println("\n================================================================================================================");
									 							    		}	
									 							    	}
									 								
									 							    }
									 								
									 							    
									 								else if(account==2) {
									 										acc_number = rand.nextInt(5000)+1100;
									 										System.out.println("\n\nHere is your account number: "+acc_number);  
									 										for(int i = 1; i <= 4; i++) {
									 						     	
									 									if (i < 4) {
									 						     	
									 						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 						     		
									 						     		if (pin == acc_number) {
									 						     			System.out.println("\nLOGIN SUCCESS");
									 						     			System.out.println("------------------------------");
									 						     			account_points=300;
									 					    				System.out.println("\nAccount points: "+account_points);
									 					    				System.out.println("\nYour account gets 100 points");
									 					    				System.out.println("\nAccount points: "+(account_points+=100));
									 					    				System.out.println("\n================================================================================================================");
									 						 			
									 						 				i = 5;	
									 						 			}
									 						     		else {
									 						 				System.out.println("\nNot Matched");
									 						 				System.out.println("\n================================================================================================================");
									 						 		
									 						     		}
									 						 		}
									 						 		
									 						     	else {
									 						     		System.out.println("\nYou tried 3 times.");
									 						     		System.out.println("\n================================================================================================================");
									 						 		}	
									 										}
									 							    
									 							    } 								 										
									 								
									 							}
									 							
									 							else {
									 								System.out.println("\n================================================================================================================");
									 							System.out.println("\t\t\t   Not Enough Money");
									 							System.out.println("\n================================================================================================================");
									 							}	
									 						
									 						 break;		
									 						
									 						 case 2:
									 							System.out.println("\n================================================================================================================");
									 								System.out.print("SIZE: MEDIUM"+"\nPRICE: P"+kiwi[2]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 								System.out.print("\nTOTAL: "+(fruittea_total=kiwi[2]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 								
									 								if(fruittea_payment>=fruittea_total) {
									 									System.out.println("\n================================================================================================================");	
									 									System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 									System.out.print("\nOrdered Fruit Tea: Kiwi " +"\nSIZE: MEDIUM"+"\nPRICE: P"+kiwi[2]+"\nQUANTITY: "+fruittea_quantity); 
									 									System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 									System.out.println("\n================================================================================================================");
									 									System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 								    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 									System.out.print("                        Choice: ");  account = sc.nextInt();
									 								    
									 									if(account==1) {
									 								    	
									 								    	for(int i = 1; i <= 4; i++) {
									 								        	
									 								    		if (i < 4) {
									 								        	
									 								        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 								        		
									 								        		if (pin == acc_number) {
									 								    				System.out.println("\nLOGIN SUCCESS");
									 								    				System.out.println("------------------------------");
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								    				i = 5;	
									 								    			}
									 								        		
									 								        		else {
									 								    				System.out.println("\nNot Matched");
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								        		}
									 								    		}
									 								    		
									 								    		else {
									 								    			System.out.println("\nYou tried 3 times.");
									 								    			System.out.println("\n================================================================================================================");
									 								    		}	
									 								    	}
									 									
									 								    }
									 									
									 								    
									 									else if(account==2) {
									 											acc_number = rand.nextInt(5000)+1100;
									 											System.out.println("\n\nHere is your account number: "+acc_number);  
									 											for(int i = 1; i <= 4; i++) {
									 							     	
									 										if (i < 4) {
									 							     	
									 							     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 							     		
									 							     		if (pin == acc_number) {
									 							     			System.out.println("\nLOGIN SUCCESS");
									 							     			System.out.println("------------------------------");
									 							     			account_points=300;
									 						    				System.out.println("\nAccount points: "+account_points);
									 						    				System.out.println("\nYour account gets 100 points");
									 						    				System.out.println("\nAccount points: "+(account_points+=100));
									 						    				System.out.println("\n================================================================================================================");
									 							 			
									 							 				i = 5;	
									 							 			}
									 							     		else {
									 							 				System.out.println("\nNot Matched");
									 							 				System.out.println("\n================================================================================================================");
									 							 		
									 							     		}
									 							 		}
									 							 		
									 							     	else {
									 							     		System.out.println("\nYou tried 3 times.");
									 							     		System.out.println("\n================================================================================================================");
									 							 		}	
									 											}
									 								    
									 								    } 								 										
									 									
									 								}
									 								
									 								else {
									 								System.out.println("\n================================================================================================================");
									 								System.out.println("\t\t\t   Not Enough Money");
									 								System.out.println("\n================================================================================================================");
									 								}	
									 							
									 						 break;

									 						 case 3:
									 							   System.out.println("\n================================================================================================================");
									 								System.out.print("SIZE: LARGE"+"\nPRICE: P"+kiwi[3]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 								System.out.print("\nTOTAL: "+(fruittea_total=kiwi[3]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 								
									 								if(fruittea_payment>=fruittea_total) {
									 									System.out.println("\n================================================================================================================");	
									 									System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 									System.out.print("\nOrdered Fruit Tea: Kiwi " +"\nSIZE: LARGE"+"\nPRICE: P"+kiwi[3]+"\nQUANTITY: "+fruittea_quantity); 
									 									System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 									System.out.println("\n================================================================================================================");
									 									System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 								    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 									System.out.print("                        Choice: ");  account = sc.nextInt();
									 								    
									 									if(account==1) {
									 								    	
									 								    	for(int i = 1; i <= 4; i++) {
									 								        	
									 								    		if (i < 4) {
									 								        	
									 								        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 								        		
									 								        		if (pin == acc_number) {
									 								    				System.out.println("\nLOGIN SUCCESS");
									 								    				System.out.println("------------------------------");
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								    				i = 5;	
									 								    			}
									 								        		
									 								        		else {
									 								    				System.out.println("\nNot Matched");
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								        		}
									 								    		}
									 								    		
									 								    		else {
									 								    			System.out.println("\nYou tried 3 times.");
									 								    			System.out.println("\n================================================================================================================");
									 								    		}	
									 								    	}
									 									
									 								    }
									 									
									 								    
									 									else if(account==2) {
									 											acc_number = rand.nextInt(5000)+1100;
									 											System.out.println("\n\nHere is your account number: "+acc_number);  
									 											for(int i = 1; i <= 4; i++) {
									 							     	
									 										if (i < 4) {
									 							     	
									 							     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 							     		
									 							     		if (pin == acc_number) {
									 							     			System.out.println("\nLOGIN SUCCESS");
									 							     			System.out.println("------------------------------");
									 							     			account_points=0;
									 						    				System.out.println("\nAccount points: "+account_points);
									 						    				System.out.println("\nYour account gets 100 points");
									 						    				System.out.println("\nAccount points: "+(account_points+=100));
									 						    				System.out.println("\n================================================================================================================");
									 							 			
									 							 				i = 5;	
									 							 			}
									 							     		else {
									 							 				System.out.println("\nNot Matched");
									 							 				System.out.println("\n================================================================================================================");
									 							 		
									 							     		}
									 							 		}
									 							 		
									 							     	else {
									 							     		System.out.println("\nYou tried 3 times.");
									 							     		System.out.println("\n================================================================================================================");
									 							 		}	
									 											}
									 								    
									 								    } 								 										
									 									
									 								}
									 								
									 								else {
									 									System.out.println("\n================================================================================================================");
									 								System.out.println("\t\t\t   Not Enough Money");
									 								System.out.println("\n================================================================================================================");
									 								}	
									 							
									 						 break;
									 						 
									 						 default:
									 							 	System.out.println("\n================================================================================================================");
									 								System.out.println("\t\t\t   INVALID SIZE");
									 								System.out.println("\n================================================================================================================");
									 			
									 						 }
									 					}while(kiwi[0]>3);
									 						
									 					break;
									 					
									 					case 4: case 5:
									 						do {
									 						if(fruittea_order==4) {
									 							
									 						
									 							System.out.println("\n================================================================================================================");
									 							System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR FRUIT TEA");	
									 							System.out.println("\t\t\nOrdered Number: "+fruittea_order+" -- Blue Berry");
									 							System.out.println("\n\t\t\t  [1]. REGULAR"+"\n\t\t\t  [2]. MEDIUM"+"\n\t\t\t  [3]. LARGE");
									 							System.out.print("\n\n\t  Enter your choice: "); blue_straw[0] = sc.nextInt();
									 						}
									 						
									 						if(fruittea_order==5 ) {
									 							
									 							System.out.println("\n================================================================================================================");
									 							System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR FRUIT TEA");	
									 							System.out.println("\t\t\nOrdered Number: "+fruittea_order+" -- Strawberry");
									 							System.out.println("\n\t\t\t  [1]. REGULAR"+"\n\t\t\t  [2]. MEDIUM"+"\n\t\t\t  [3]. LARGE");
									 							System.out.print("\n\n\t  Enter your choice: "); blue_straw[0] = sc.nextInt();	
									 						}
									 						
									 						switch(blue_straw[0]) {
									 						
									 						 case 1:
									 							System.out.println("\n================================================================================================================");
									 							System.out.print("SIZE: REGULAR"+"\nPRICE: P"+blue_straw[1]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 							System.out.print("\nTOTAL: "+(fruittea_total=blue_straw[1]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 							
									 							if(fruittea_payment>=fruittea_total) {
									 								System.out.println("\n================================================================================================================");	
									 								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 								System.out.print("\nOrdered Fruit Tea number:  "+fruittea_order +"\nSIZE: REGULAR"+"\nPRICE: P"+blue_straw[1]+"\nQUANTITY: "+fruittea_quantity); 
									 								System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 								System.out.println("\n================================================================================================================");
									 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 								System.out.print("                        Choice: ");  account = sc.nextInt();
									 							    
									 								if(account==1) {
									 							    	
									 							    	for(int i = 1; i <= 4; i++) {
									 							        	
									 							    		if (i < 4) {
									 							        	
									 							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 							        		
									 							        		if (pin == acc_number) {
									 							    				System.out.println("\nLOGIN SUCCESS");
									 							    				System.out.println("------------------------------");
									 							    				System.out.println("\nAccount points: "+account_points);
									 							    				System.out.println("\nYour account gets 100 points");
									 							    				System.out.println("\nAccount points: "+(account_points+=100));
									 							    				System.out.println("\n================================================================================================================");
									 							    				
									 							    				i = 5;	
									 							    			}
									 							        		
									 							        		else {
									 							    				System.out.println("\nNot Matched");
									 							    				System.out.println("\n================================================================================================================");
									 							    				
									 							        		}
									 							    		}
									 							    		
									 							    		else {
									 							    			System.out.println("\nYou tried 3 times.");
									 							    			System.out.println("\n================================================================================================================");
									 							    		}	
									 							    	}
									 								
									 							    }
									 								
									 							    
									 								else if(account==2) {
									 										acc_number = rand.nextInt(5000)+1100;
									 										System.out.println("\n\nHere is your account number: "+acc_number);  
									 										for(int i = 1; i <= 4; i++) {
									 						     	
									 									if (i < 4) {
									 						     	
									 						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 						     		
									 						     		if (pin == acc_number) {
									 						     			System.out.println("\nLOGIN SUCCESS");
									 						     			System.out.println("------------------------------");
									 						     			account_points=300;
									 					    				System.out.println("\nAccount points: "+account_points);
									 					    				System.out.println("\nYour account gets 100 points");
									 					    				System.out.println("\nAccount points: "+(account_points+=100));
									 					    				System.out.println("\n================================================================================================================");
									 						 			
									 						 				i = 5;	
									 						 			}
									 						     		else {
									 						 				System.out.println("\nNot Matched");
									 						 				System.out.println("\n================================================================================================================");
									 						 		
									 						     		}
									 						 		}
									 						 		
									 						     	else {
									 						     		System.out.println("\nYou tried 3 times.");
									 						     		System.out.println("\n================================================================================================================");
									 						 		}	
									 										}
									 							    
									 							    } 								 										
									 								
									 							}
									 							
									 							else {
									 							System.out.println("\n================================================================================================================");
									 							System.out.println("\t\t\t   Not Enough Money");
									 							System.out.println("\n================================================================================================================");
									 							}	
									 						
									 						 break;		
									 						
									 						 case 2:
									 							System.out.println("\n================================================================================================================");
									 								System.out.print("SIZE: MEDIUM"+"\nPRICE: P"+blue_straw[2]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 								System.out.print("\nTOTAL: "+(fruittea_total=blue_straw[2]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 								
									 								if(fruittea_payment>=fruittea_total) {
									 									System.out.println("\n================================================================================================================");	
									 									System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 									System.out.print("\nOrdered Fruit Tea number:  "+fruittea_order +"\nSIZE: MEDIUM"+"\nPRICE: P"+blue_straw[2]+"\nQUANTITY: "+fruittea_quantity); 
									 									System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 									System.out.println("\n================================================================================================================");
									 									System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 								    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 									System.out.print("                        Choice: ");  account = sc.nextInt();
									 								    
									 									if(account==1) {
									 								    	
									 								    	for(int i = 1; i <= 4; i++) {
									 								        	
									 								    		if (i < 4) {
									 								        	
									 								        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 								        		
									 								        		if (pin == acc_number) {
									 								    				System.out.println("\nLOGIN SUCCESS");
									 								    				System.out.println("------------------------------");
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								    				i = 5;	
									 								    			}
									 								        		
									 								        		else {
									 								    				System.out.println("\nNot Matched");
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								        		}
									 								    		}
									 								    		
									 								    		else {
									 								    			System.out.println("\nYou tried 3 times.");
									 								    			System.out.println("\n================================================================================================================");
									 								    		}	
									 								    	}
									 									
									 								    }
									 									
									 								    
									 									else if(account==2) {
									 											acc_number = rand.nextInt(5000)+1100;
									 											System.out.println("\n\nHere is your account number: "+acc_number);  
									 											for(int i = 1; i <= 4; i++) {
									 							     	
									 										if (i < 4) {
									 							     	
									 							     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 							     		
									 							     		if (pin == acc_number) {
									 							     			System.out.println("\nLOGIN SUCCESS");
									 							     			System.out.println("------------------------------");
									 							     			account_points=300;
									 						    				System.out.println("\nAccount points: "+account_points);
									 						    				System.out.println("\nYour account gets 100 points");
									 						    				System.out.println("\nAccount points: "+(account_points+=100));
									 						    				System.out.println("\n================================================================================================================");
									 						    				
									 							 				i = 5;	
									 							 			}
									 							     		else {
									 							 				System.out.println("\nNot Matched");
									 							 				System.out.println("\n================================================================================================================");
									 							 		
									 							     		}
									 							 		}
									 							 		
									 							     	else {
									 							     		System.out.println("\nYou tried 3 times.");
									 							     		System.out.println("\n================================================================================================================");
									 							 		}	
									 											}
									 								    
									 								    } 								 										
									 									
									 								}
									 								
									 								else {
									 								System.out.println("\n================================================================================================================");
									 								System.out.println("\t\t\t   Not Enough Money");
									 								System.out.println("\n================================================================================================================");
									 								}	
									 							
									 						 break;

									 						 case 3:
									 							System.out.println("\n================================================================================================================");
									 								System.out.print("SIZE: LARGE"+"\nPRICE: P"+blue_straw[3]+"\nQUANTITY: "); fruittea_quantity=sc.nextInt();
									 								System.out.print("\nTOTAL: "+(fruittea_total=blue_straw[3]*fruittea_quantity)); System.out.print("\nEnter your money: "); fruittea_payment=sc.nextLong();
									 								
									 								if(fruittea_payment>=fruittea_total) {
									 									System.out.println("\n================================================================================================================");	
									 									System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 									System.out.print("\nOrdered Fruit Tea number:  "+fruittea_order +"\nSIZE: LARGE"+"\nPRICE: P"+blue_straw[3]+"\nQUANTITY: "+fruittea_quantity); 
									 									System.out.print("\nTOTAL: "+fruittea_total+"\nMONEY ENTERED: "+fruittea_payment+"\nCHANGE: "+(fruittea_payment-=fruittea_total));  
									 									System.out.println("\n================================================================================================================");
									 									System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 								    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 									System.out.print("                        Choice: ");  account = sc.nextInt();
									 								    
									 									if(account==1) {
									 								    	
									 								    	for(int i = 1; i <= 4; i++) {
									 								        	
									 								    		if (i < 4) {
									 								        	
									 								        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 								        		
									 								        		if (pin == acc_number) {
									 								    				System.out.println("\nLOGIN SUCCESS");
									 								    				System.out.println("------------------------------");
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								    				i = 5;	
									 								    			}
									 								        		
									 								        		else {
									 								    				System.out.println("\nNot Matched");
									 								    				System.out.println("\n================================================================================================================");
									 								    				
									 								        		}
									 								    		}
									 								    		
									 								    		else {
									 								    			System.out.println("\nYou tried 3 times.");
									 								    			System.out.println("\n================================================================================================================");
									 								    		}	
									 								    	}
									 									
									 								    }
									 									
									 								    
									 									else if(account==2) {
									 											acc_number = rand.nextInt(5000)+1100;
									 											System.out.println("\n\nHere is your account number: "+acc_number);  
									 											for(int i = 1; i <= 4; i++) {
									 							     	
									 										if (i < 4) {
									 							     	
									 							     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 							     		
									 							     		if (pin == acc_number) {
									 							     			System.out.println("\nLOGIN SUCCESS");
									 							     			System.out.println("------------------------------");
									 							     			account_points=300;
									 						    				System.out.println("\nAccount points: "+account_points);
									 						    				System.out.println("\nYour account gets 100 points");
									 						    				System.out.println("\nAccount points: "+(account_points+=100));
									 						    				System.out.println("\n================================================================================================================");
									 							 			
									 							 				i = 5;	
									 							 			}
									 							     		else {
									 							 				System.out.println("\nNot Matched");
									 							 				System.out.println("\n================================================================================================================");
									 							 		
									 							     		}
									 							 		}
									 							 		
									 							     	else {
									 							     		System.out.println("\nYou tried 3 times.");
									 							     		System.out.println("\n================================================================================================================");
									 							 		}	
									 											}
									 								    
									 								    } 								 										
									 									
									 								}
									 								
									 								else {
									 								System.out.println("\n================================================================================================================");
									 								System.out.println("\t\t\t   Not Enough Money");
									 								System.out.println("\n================================================================================================================");
									 								}	
									 							
									 						 break;
									 						 
									 						 default:
									 							System.out.println("\n================================================================================================================");
									 								System.out.println("\t\t\t   INVALID SIZE");
									 								
									 						
									 						 }
									 						}while(blue_straw[0]>3);
									 					break;
									 				
									 					
									 					default:
									 						System.out.println("\n================================================================================================================");
									 						System.out.println("\t\t\t\t\t\t   NOT IN MENU");
									 						System.out.println("================================================================================================================");
									 				} 
									 				 
									 			}while(fruittea_order>5); 
									 		
									        
									 		break;
									 	
									 		
									 	case 4: //Frappuccino section
									 		
									 		do {
									 			System.out.println("================================================================================================================");
									 	 		System.out.println("\n\n\t\t\t\t\t Welcome to Frappiccino Section");
									 	 		System.out.println("\n\t\t\t\t Here is the availabe Frappuccino in our shop, "+name);
									 	 		System.out.println("\n\n\t\t\t\t\t\t\t    GRANDE \t    VENTI ");
									 	 		System.out.println("\n\n\t\t\t   [1]. Java Chip\t\t    P"+frappe[1]+"\t     P"+frappe[2]+"\n\t\t\t   [2]. Vanilla Cream Creme\t    P"+frappe[3]+"\t     P"+frappe[4]+"\n\t\t\t   [3]. Caramel\t\t\t    P"+frappe[5]+"\t     P"+frappe[6]+
									 	 				            "\n\t\t\t   [4]. Double Chocolate Chip\t    P"+frappe[7]+"\t     P"+frappe[8]+"\n\t\t\t   [5]. Pistachio Cream\t\t    P"+frappe[4]+"\t     P"+frappe[9]);
									 	 				
									 	 		System.out.print("\n\n\t\t\t  Enter your choice: "); frappe[0] = sc.nextInt();
									 	 		
									 	 		
									 	 		if(frappe[0]==1) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Java Chip\n\n- is a popular chips with coffee, milk and ice, \nthen topped with whipped cream and mocha drizzle.");
								 				}
									 	 		
									 	 		if(frappe[0]==2) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Vanilla bean Creme\n\n- This rich and creamy blend of vanilla bean, milk and ice topped with whipped cream\ntakes vanilla flavor to another level. To change things up, try it affogato-style\nwith a hot espresso shot poured right over the top.");
									 	 		}
									 	 		
									 	 		if(frappe[0]==3) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Caramel\n\n- meets coffee, milk and ice for a rendezvous in the blender,\nwhile whipped cream and buttery caramel sauce layer the love on top.");
									 	 		}
									 	 		
									 	 		if(frappe[0]==4) {
								 					System.out.println("\n=================================================================================================================================");
									 	 		System.out.println("Double Chocolate Chip\n- Rich mocha-flavored sauce meets up with chocolaty chips, milk and ice for a blender bash.\nTop it off with sweetened whipped cream and mocha drizzle for a real party in your mouth.");
									 	 		}
									 	 		
									 	 		if(frappe[0]==5) {
								 					System.out.println("\n=================================================================================================================================");
								 					System.out.println("Pistachio Cream\n\n- Sweet pistachio flavor blended with milk and ice, then finished with whipped cream and a rich,\nsalted brown-buttery topping: an icy-smooth, creamy treat to keep you refreshed and energized\nin the new year.");
									 	 		}
									 	 			switch(frappe[0]) {
									 	 						
									 	 						case 1: 
									 	 							
									 	 							System.out.println("\n================================================================================================================");
									 	 							do {
									 	 							System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR FRAPPE");	
									 	 							System.out.println("\t\t\nOrdered Number: "+frappe[0]+" -- Java Chip");
									 	 							System.out.println("\n\t\t\t  [1]. GRANDE"+"\n\t\t\t  [2]. VENTI");
									 	 							System.out.print("\n\n\t  Enter your choice: "); frappe_order = sc.nextInt();
									 	 							
									 	 							switch(frappe_order) {
									 	 							
									 	 							 case 1:
									 	 								System.out.println("\n================================================================================================================");
									 	 								System.out.print("SIZE: GRANDE"+"\nPRICE: P"+frappe[1]+"\nQUANTITY: "); frappe_quantity=sc.nextInt();
									 	 								System.out.print("\nTOTAL: "+(frappe_total=frappe[1]*frappe_quantity)); System.out.print("\nEnter your money: "); frappe_payment=sc.nextLong();
									 	 								
									 	 								if(frappe_payment>=frappe_total) {
									 	 									System.out.println("\n================================================================================================================");	
									 	    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 	    								System.out.print("\nOrdered Frappe: Java Chip" +"\nSIZE: GRANDE"+"\nPRICE: P"+frappe[1]+"\nQUANTITY: "+frappe_quantity); 
									 		 								System.out.print("\nTOTAL: "+frappe_total+"\nMONEY ENTERED: "+frappe_payment+"\nCHANGE: "+(frappe_payment-=frappe_total));  
									 		 								System.out.println("\n================================================================================================================");
									 		 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 	     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 	     								System.out.print("                        Choice: ");  account = sc.nextInt();
									 	     							    
									 	     								if(account==1) {
									 	     							    	
									 	     							    	for(int i = 1; i <= 4; i++) {
									 	     							        	
									 	     							    		if (i < 4) {
									 	     							        	
									 	     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 	     							        		
									 	     							        		if (pin == acc_number) {
									 	     							    				System.out.println("\nLOGIN SUCCESS");
									 	     							    				System.out.println("------------------------------");
									 	     							    				System.out.println("\nAccount points: "+account_points);
									 	     							    				System.out.println("\nYour account gets 100 points");
									 	     							    				System.out.println("\nAccount points: "+(account_points+=100));
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							    				i = 5;	
									 	     							    			}
									 	     							        		
									 	     							        		else {
									 	     							    				System.out.println("\nNot Matched");
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							        		}
									 	     							    		}
									 	     							    		
									 	     							    		else {
									 	     							    			System.out.println("\nYou tried 3 times.");
									 	     							    			System.out.println("\n================================================================================================================");
									 	     							    		}	
									 	     							    	}
									 	     								
									 	     							    }
									 	     								
									 	     							    
									 	     								else if(account==2) {
									 	     									acc_number = rand.nextInt(5000)+1100;
									 	     										System.out.println("\n\nHere is your account number: "+acc_number);  
									 	     										for(int i = 1; i <= 4; i++) {
									 	     						     	
									 	     									if (i < 4) {
									 	     						     	
									 	     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 	     						     		
									 	     						     		if (pin == acc_number) {
									 	     						     			System.out.println("\nLOGIN SUCCESS");
									 	     						     			System.out.println("------------------------------");
									 	     						     			account_points=300;
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 	     						 			
									 	     						 				i = 5;	
									 	     						 			}
									 	     						     		else {
									 	     						 				System.out.println("\nNot Matched");
									 	     						 				System.out.println("\n================================================================================================================");
									 	     						 		
									 	     						     		}
									 	     						 		}
									 	     						 		
									 	     						     	else {
									 	     						     		System.out.println("\nYou tried 3 times.");
									 	     						     		System.out.println("\n================================================================================================================");
									 	     						 		}	
									 	     										}
									 	     							    
									 	     							    } 								 										
									 	 									
									 	 								}
									 	 								
									 	 								else {
									 	 									System.out.println("\n================================================================================================================");
									 	    								System.out.println("\t\t\t   Not Enough Money");
									 	    								System.out.println("\n================================================================================================================");
									 	     							}	
									 	 							
									 	 							break;		
									 	 							
									 	 							 case 2:
									 	 								System.out.println("\n================================================================================================================");
									 	 								System.out.print("SIZE: VENTI"+"\nPRICE: P"+frappe[2]+"\nQUANTITY: "); frappe_quantity=sc.nextInt();
									 	 								System.out.print("\nTOTAL: "+(frappe_total=frappe[2]*frappe_quantity)); System.out.print("\nEnter your money: "); frappe_payment=sc.nextLong();
									 	 								
									 	 								if(frappe_payment>=frappe_total) {
									 	 									System.out.println("\n================================================================================================================");	
									 	    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 	    								System.out.print("\nOrdered Frappe: Java Chip "+frappe[0] +"\nSIZE: VENTI "+"\nPRICE: P"+frappe[2]+"\nQUANTITY: "+frappe_quantity); 
									 		 								System.out.print("\nTOTAL: "+frappe_total+"\nMONEY ENTERED: "+frappe_payment+"\nCHANGE: "+(frappe_payment-=frappe_total));  
									 		 								System.out.println("\n================================================================================================================");
									 		 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 	     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 	     								System.out.print("                        Choice: ");  account = sc.nextInt();
									 	     							    
									 	     								if(account==1) {
									 	     							    	
									 	     							    	for(int i = 1; i <= 4; i++) {
									 	     							        	
									 	     							    		if (i < 4) {
									 	     							        	
									 	     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 	     							        		
									 	     							        		if (pin == acc_number) {
									 	     							    				System.out.println("\nLOGIN SUCCESS");
									 	     							    				System.out.println("------------------------------");
									 	     							    				System.out.println("\nAccount points: "+account_points);
									 	     							    				System.out.println("\nYour account gets 100 points");
									 	     							    				System.out.println("\nAccount points: "+(account_points+=100));
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							    				i = 5;	
									 	     							    			}
									 	     							        		
									 	     							        		else {
									 	     							    				System.out.println("\nNot Matched");
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							        		}
									 	     							    		}
									 	     							    		
									 	     							    		else {
									 	     							    			System.out.println("\nYou tried 3 times.");
									 	     							    			System.out.println("\n================================================================================================================");
									 	     							    		}	
									 	     							    	}
									 	     								
									 	     							    }
									 	     								
									 	     							    
									 	     								else if(account==2) {
									 	     										acc_number = rand.nextInt(5000)+1100;
									 	     										System.out.println("\n\nHere is your account number: "+acc_number);  
									 	     										for(int i = 1; i <= 4; i++) {
									 	     						     	
									 	     									if (i < 4) {
									 	     						     	
									 	     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 	     						     		
									 	     						     		if (pin == acc_number) {
									 	     						     			System.out.println("\nLOGIN SUCCESS");
									 	     						     			System.out.println("------------------------------");
									 	     						     			account_points=300;
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 	     						 			
									 	     						 				i = 5;	
									 	     						 			}
									 	     						     		else {
									 	     						 				System.out.println("\nNot Matched");
									 	     						 				System.out.println("\n================================================================================================================");
									 	     						 		
									 	     						     		}
									 	     						 		}
									 	     						 		
									 	     						     	else {
									 	     						     		System.out.println("\nYou tried 3 times.");
									 	     						     		System.out.println("\n================================================================================================================");
									 	     						 		}	
									 	     										}
									 	     							    
									 	     							    } 								 										
									 	 									
									 	 								}
									 	 								
									 	 								else {
									 	 									System.out.println("\n================================================================================================================");
									 	    								System.out.println("\t\t\t   Not Enough Money");
									 	    								System.out.println("\n================================================================================================================");
									 	     							}
									 	 							 break;	
									 	 								 
									 								 default:
									 								    	System.out.println("\n================================================================================================================");
									 										System.out.println("\t\t\t   INVALID SIZE");
									 										System.out.println("\n================================================================================================================");
									 	 							}
									 	 							
									 	 							}while(frappe_order>2);
									 	 							
									 	 							break;
									 		
									 	 						case 2:
									 	 							
									 	 							System.out.println("\n================================================================================================================");
									 	 							do {
									 	 							System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR FRAPPE");	
									 	 							System.out.println("\t\t\nOrdered Number: "+frappe[0]+" -- Vanilla bean Creme");
									 	 							System.out.println("\n\t\t\t  [1]. GRANDE"+"\n\t\t\t  [2]. VENTI");
									 	 							System.out.print("\n\n\t  Enter your choice: "); frappe_order1 = sc.nextInt();
									 	 							
									 	 							switch(frappe_order1) {
									 	 							
									 	 							 case 1:
									 	 								System.out.println("\n================================================================================================================");
									 	 								System.out.print("SIZE: GRANDE"+"\nPRICE: P"+frappe[3]+"\nQUANTITY: "); frappe_quantity=sc.nextInt();
									 	 								System.out.print("\nTOTAL: "+(frappe_total=frappe[3]*frappe_quantity)); System.out.print("\nEnter your money: "); frappe_payment=sc.nextLong();
									 	 								
									 	 								if(frappe_payment>=frappe_total) {
									 	 									System.out.println("\n================================================================================================================");	
									 	    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 	    								System.out.print("\nOrdered Frappe : Vanilla bean Creme" +"\nSIZE: GRANDE"+"\nPRICE: P"+frappe[3]+"\nQUANTITY: "+frappe_quantity); 
									 		 								System.out.print("\nTOTAL: "+frappe_total+"\nMONEY ENTERED: "+frappe_payment+"\nCHANGE: "+(frappe_payment-=frappe_total));  
									 		 								System.out.println("\n================================================================================================================");
									 		 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 	     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 	     								System.out.print("                        Choice: ");  account = sc.nextInt();
									 	     							    
									 	     								if(account==1) {
									 	     							    	
									 	     							    	for(int i = 1; i <= 4; i++) {
									 	     							        	
									 	     							    		if (i < 4) {
									 	     							        	
									 	     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 	     							        		
									 	     							        		if (pin == acc_number) {
									 	     							    				System.out.println("\nLOGIN SUCCESS");
									 	     							    				System.out.println("------------------------------");
									 	     							    				System.out.println("\nAccount points: "+account_points);
									 	     							    				System.out.println("\nYour account gets 100 points");
									 	     							    				System.out.println("\nAccount points: "+(account_points+=100));
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							    				i = 5;	
									 	     							    			}
									 	     							        		
									 	     							        		else {
									 	     							    				System.out.println("\nNot Matched");
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							        		}
									 	     							    		}
									 	     							    		
									 	     							    		else {
									 	     							    			System.out.println("\nYou tried 3 times.");
									 	     							    			System.out.println("\n================================================================================================================");
									 	     							    		}	
									 	     							    	}
									 	     								
									 	     							    }
									 	     								
									 	     							    
									 	     								else if(account==2) {
									 	     										acc_number = rand.nextInt(5000)+1100;
									 	     										System.out.println("\n\nHere is your account number: "+acc_number);  
									 	     										for(int i = 1; i <= 4; i++) {
									 	     						     	
									 	     									if (i < 4) {
									 	     						     	
									 	     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 	     						     		
									 	     						     		if (pin == acc_number) {
									 	     						     			System.out.println("\nLOGIN SUCCESS");
									 	     						     			System.out.println("------------------------------");
									 	     						     			account_points=300;
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 	     						 			
									 	     						 				i = 5;	
									 	     						 			}
									 	     						     		else {
									 	     						 				System.out.println("\nNot Matched");
									 	     						 				System.out.println("\n================================================================================================================");
									 	     						 		
									 	     						     		}
									 	     						 		}
									 	     						 		
									 	     						     	else {
									 	     						     		System.out.println("\nYou tried 3 times.");
									 	     						     		System.out.println("\n================================================================================================================");
									 	     						 		}	
									 	     										}
									 	     							    
									 	     							    } 								 										
									 	 									
									 	 								}
									 	 								
									 	 								else {
									 	 									System.out.println("\n================================================================================================================");
									 	    								System.out.println("\t\t\t   Not Enough Money");
									 	    								System.out.println("\n================================================================================================================");
									 	     							}	
									 	 							
									 	 							break;		
									 	 							
									 	 							 case 2:
									 	 								System.out.println("\n================================================================================================================");
									 	 								System.out.print("SIZE: VENTI"+"\nPRICE: P"+frappe[4]+"\nQUANTITY: "); frappe_quantity=sc.nextInt();
									 	 								System.out.print("\nTOTAL: "+(frappe_total=frappe[4]*frappe_quantity)); System.out.print("\nEnter your money: "); frappe_payment=sc.nextLong();
									 	 								
									 	 								if(frappe_payment>=frappe_total) {
									 	 									System.out.println("\n================================================================================================================");	
									 	    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 	    								System.out.print("\nOrdered Frappe: Vanilla bean Creme " +"\nSIZE: VENTI "+"\nPRICE: P"+frappe[4]+"\nQUANTITY: "+frappe_quantity); 
									 		 								System.out.print("\nTOTAL: "+frappe_total+"\nMONEY ENTERED: "+frappe_payment+"\nCHANGE: "+(frappe_payment-=frappe_total));  
									 		 								System.out.println("\n================================================================================================================");
									 		 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 	     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 	     								System.out.print("                        Choice: ");  account = sc.nextInt();
									 	     							    
									 	     								if(account==1) {
									 	     							    	
									 	     							    	for(int i = 1; i <= 4; i++) {
									 	     							        	
									 	     							    		if (i < 4) {
									 	     							        	
									 	     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 	     							        		
									 	     							        		if (pin == acc_number) {
									 	     							    				System.out.println("\nLOGIN SUCCESS");
									 	     							    				System.out.println("------------------------------");
									 	     							    				System.out.println("\nAccount points: "+account_points);
									 	     							    				System.out.println("\nYour account gets 100 points");
									 	     							    				System.out.println("\nAccount points: "+(account_points+=100));
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							    				i = 5;	
									 	     							    			}
									 	     							        		
									 	     							        		else {
									 	     							    				System.out.println("\nNot Matched");
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							        		}
									 	     							    		}
									 	     							    		
									 	     							    		else {
									 	     							    			System.out.println("\nYou tried 3 times.");
									 	     							    			System.out.println("\n================================================================================================================");
									 	     							    		}	
									 	     							    	}
									 	     								
									 	     							    }
									 	     								
									 	     							    
									 	     								else if(account==2) {
									 	     										acc_number = rand.nextInt(5000)+1100;
									 	     										System.out.println("\n\nHere is your account number: "+acc_number);  
									 	     										for(int i = 1; i <= 4; i++) {
									 	     						     	
									 	     									if (i < 4) {
									 	     						     	
									 	     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 	     						     		
									 	     						     		if (pin == acc_number) {
									 	     						     			System.out.println("\nLOGIN SUCCESS");
									 	     						     			System.out.println("------------------------------");
									 	     						     			account_points=300;
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 	     						 			
									 	     						 				i = 5;	
									 	     						 			}
									 	     						     		else {
									 	     						 				System.out.println("\nNot Matched");
									 	     						 				System.out.println("\n================================================================================================================");
												 		
									 	     						     		}
									 	     						 		}
									 	     						 		
									 	     						     	else {
									 	     						     		System.out.println("\nYou tried 3 times.");
									 	     						     		System.out.println("\n================================================================================================================");
									 	     						 		}	
									 	     										}
									 	     							    
									 	     							    } 								 										
									 	 									
									 	 								}
									 	 								
									 	 								else {
									 	 									System.out.println("\n================================================================================================================");
									 	    								System.out.println("\t\t\t   Not Enough Money");
									 	    								System.out.println("\n================================================================================================================");
									 	     							}
									 	 								
									 	 							 break;	
									 	 								 
									 								 default:
									 									System.out.println("\n================================================================================================================");
									 										System.out.println("\t\t\t   INVALID SIZE");
									 										System.out.println("\n================================================================================================================");
									 	 							}
									 	 							}while(frappe_order1>2);
									 	 							
									 	 							break;

									 		
									 	                      case 3:
									 	 							
									 	                    	 System.out.println("\n================================================================================================================");
									 	 							do {
									 	 							System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR FRAPPE");	
									 	 							System.out.println("\t\t\nOrdered Number: "+frappe[0]+" -- Caramel");
									 	 							System.out.println("\n\t\t\t  [1]. GRANDE"+"\n\t\t\t  [2]. VENTI");
									 	 							System.out.print("\n\n\t  Enter your choice: "); frappe_order2 = sc.nextInt();
									 	 							
									 	 							switch(frappe_order2) {
									 	 							
									 	 							 case 1:
									 	 								System.out.println("\n================================================================================================================");
									 	 								System.out.print("SIZE: GRANDE"+"\nPRICE: P"+frappe[5]+"\nQUANTITY: "); frappe_quantity=sc.nextInt();
									 	 								System.out.print("\nTOTAL: "+(frappe_total=frappe[5]*frappe_quantity)); System.out.print("\nEnter your money: "); frappe_payment=sc.nextLong();
									 	 								
									 	 								if(frappe_payment>=frappe_total) {
									 	 									System.out.println("\n================================================================================================================");
									 	    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 	    								System.out.print("\nOrdered Frappe: Caramel " +"\nSIZE: GRANDE"+"\nPRICE: P"+frappe[5]+"\nQUANTITY: "+frappe_quantity); 
									 		 								System.out.print("\nTOTAL: "+frappe_total+"\nMONEY ENTERED: "+frappe_payment+"\nCHANGE: "+(frappe_payment-=frappe_total));  
									 		 								System.out.println("\n================================================================================================================");
									 		 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 	     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 	     								System.out.print("                        Choice: ");  account = sc.nextInt();
									 	     							    
									 	     								if(account==1) {
									 	     							    	
									 	     							    	for(int i = 1; i <= 4; i++) {
									 	     							        	
									 	     							    		if (i < 4) {
									 	     							        	
									 	     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 	     							        		
									 	     							        		if (pin == acc_number) {
									 	     							    				System.out.println("\nLOGIN SUCCESS");
									 	     							    				System.out.println("------------------------------");
									 	     							    				System.out.println("\nAccount points: "+account_points);
									 	     							    				System.out.println("\nYour account gets 100 points");
									 	     							    				System.out.println("\nAccount points: "+(account_points+=100));
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							    				i = 5;	
									 	     							    			}
									 	     							        		
									 	     							        		else {
									 	     							    				System.out.println("\nNot Matched");
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							        		}
									 	     							    		}
									 	     							    		
									 	     							    		else {
									 	     							    			System.out.println("\nYou tried 3 times.");
									 	     							    			System.out.println("\n================================================================================================================");
									 	     							    		}	
									 	     							    	}
									 	     								
									 	     							    }
									 	     								
									 	     							    
									 	     								else if(account==2) {
									 	     										acc_number = rand.nextInt(5000)+1100;
									 	     										System.out.println("\n\nHere is your account number: "+acc_number);  
									 	     										for(int i = 1; i <= 4; i++) {
									 	     						     	
									 	     									if (i < 4) {
									 	     						     	
									 	     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 	     						     		
									 	     						     		if (pin == acc_number) {
									 	     						     			System.out.println("\nLOGIN SUCCESS");
									 	     						     			System.out.println("------------------------------");
									 	     						     				account_points=0;
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 	     						 			
									 	     						 				i = 5;	
									 	     						 			}
									 	     						     		else {
									 	     						 				System.out.println("\nNot Matched");
									 	     						 				System.out.println("\n================================================================================================================");
									 	     						 		
									 	     						     		}
									 	     						 		}
									 	     						 		
									 	     						     	else {
									 	     						     		System.out.println("\nYou tried 3 times.");
									 	     						     		System.out.println("\n================================================================================================================");
									 	     						 		}	
									 	     										}
									 	     							    
									 	     							    } 								 										
									 	 									
									 	 								}
									 	 								
									 	 								else {
									 	 									System.out.println("\n================================================================================================================");
									 	    								System.out.println("\t\t\t   Not Enough Money");
									 	    								System.out.println("\n================================================================================================================");
									 	     							}	
									 	 							
									 	 							break;		
									 	 							
									 	 							 case 2:
									 	 								System.out.println("\n================================================================================================================");
									 	 								System.out.print("SIZE: VENTI"+"\nPRICE: P"+frappe[6]+"\nQUANTITY: "); frappe_quantity=sc.nextInt();
									 	 								System.out.print("\nTOTAL: "+(frappe_total=frappe[6]*frappe_quantity)); System.out.print("\nEnter your money: "); frappe_payment=sc.nextLong();
									 	 								
									 	 								if(frappe_payment>=frappe_total) {
									 	 									System.out.println("\n================================================================================================================");	
									 	    								System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 	    								System.out.print("\nOrdered Frappe: Caramel " +"\nSIZE: VENTI"+"\nPRICE: P"+frappe[6]+"\nQUANTITY: "+frappe_quantity); 
									 		 								System.out.print("\nTOTAL: "+frappe_total+"\nMONEY ENTERED: "+frappe_payment+"\nCHANGE: "+(frappe_payment-=frappe_total));  
									 		 								System.out.println("\n================================================================================================================");
									 		 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 	     							    System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 	     								System.out.print("                        Choice: ");  account = sc.nextInt();
									 	     							    
									 	     								if(account==1) {
									 	     							    	
									 	     							    	for(int i = 1; i <= 4; i++) {
									 	     							        	
									 	     							    		if (i < 4) {
									 	     							        	
									 	     							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 	     							        		
									 	     							        		if (pin == acc_number) {
									 	     							    				System.out.println("\nLOGIN SUCCESS");
									 	     							    				System.out.println("------------------------------");
									 	     							    				System.out.println("\nAccount points: "+account_points);
									 	     							    				System.out.println("\nYour account gets 100 points");
									 	     							    				System.out.println("\nAccount points: "+(account_points+=100));
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							    				i = 5;	
									 	     							    			}
									 	     							        		
									 	     							        		else {
									 	     							    				System.out.println("\nNot Matched");
									 	     							    				System.out.println("\n================================================================================================================");
									 	     							    				
									 	     							        		}
									 	     							    		}
									 	     							    		
									 	     							    		else {
									 	     							    			System.out.println("\nYou tried 3 times.");
									 	     							    			System.out.println("\n================================================================================================================");
									 	     							    		}	
									 	     							    	}
									 	     								
									 	     							    }
									 	     								
									 	     							    
									 	     								else if(account==2) {
									 	     										acc_number = rand.nextInt(5000)+1100;
									 	     										System.out.println("\n\nHere is your account number: "+acc_number);  
									 	     										for(int i = 1; i <= 4; i++) {
									 	     						     	
									 	     									if (i < 4) {
									 	     						     	
									 	     						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 	     						     		
									 	     						     		if (pin == acc_number) {
									 	     						     			System.out.println("\nLOGIN SUCCESS");
									 	     						     			System.out.println("------------------------------");
									 	     						     				account_points=300;
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				System.out.println("\n================================================================================================================");
									 	     						 			
									 	     						 				i = 5;	
									 	     						 			}
									 	     						     		else {
									 	     						 				System.out.println("\nNot Matched");
									 	     						 				System.out.println("\n================================================================================================================");
									 	     						 		
									 	     						     		}
									 	     						 		}
									 	     						 		
									 	     						     	else {
									 	     						     		System.out.println("\nYou tried 3 times.");
									 	     						     		System.out.println("\n================================================================================================================");
									 	     						 		}	
									 	     										}
									 	     							    
									 	     							    } 								 										
									 	 									
									 	 								}
									 	 								
									 	 								else {
									 	 									System.out.println("\n================================================================================================================");
									 	    								System.out.println("\t\t\t   Not Enough Money");
									 	    								System.out.println("\n================================================================================================================");
									 	     							}
									 	 							 break;	
									 	 								 
									 								 default:
									 									System.out.println("\n================================================================================================================");
									 										System.out.println("\t\t\t   INVALID SIZE");
									 										System.out.println("\n================================================================================================================");
									 	 							
									 	 							}
									 	 						}while(frappe_order2>2);
									 	 							
									 	 							break;
									 	                      case 4:
									 								
									 	                    	 System.out.println("\n================================================================================================================");
									 								do {
									 								System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR FRAPPE");	
									 								System.out.println("\t\t\nOrdered Number: "+frappe[0]+" --  Double Chocolate Chip");
									 								System.out.println("\n\t\t\t  [1]. GRANDE"+"\n\t\t\t  [2]. VENTI");
									 								System.out.print("\n\n\t  Enter your choice: "); frappe_order3 = sc.nextInt();
									 								
									 								switch(frappe_order3) {
									 								
									 								 case 1:
									 									System.out.println("\n================================================================================================================");
									 									System.out.print("SIZE: GRANDE"+"\nPRICE: P"+frappe[7]+"\nQUANTITY: "); frappe_quantity=sc.nextInt();
									 									System.out.print("\nTOTAL: "+(frappe_total=frappe[7]*frappe_quantity)); System.out.print("\nEnter your money: "); frappe_payment=sc.nextLong();
									 									
									 									if(frappe_payment>=frappe_total) {
									 										System.out.println("\n================================================================================================================");	
									 										System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 										System.out.print("\nOrdered Frappe:  Double Chocolate Chip" +"\nSIZE: GRANDE"+"\nPRICE: P"+frappe[7]+"\nQUANTITY: "+frappe_quantity); 
									 		 								System.out.print("\nTOTAL: "+frappe_total+"\nMONEY ENTERED: "+frappe_payment+"\nCHANGE: "+(frappe_payment-=frappe_total));  
									 		 								System.out.println("\n================================================================================================================");
									 		 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 		 								System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 		 								System.out.print("                        Choice: ");  account = sc.nextInt();
									 	   							    
									 	   								if(account==1) {
									 	   							    	
									 	   							    	for(int i = 1; i <= 4; i++) {
									 	   							        	
									 	   							    		if (i < 4) {
									 	   							        	
									 	   							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 	   							        		
									 	   							        		if (pin == acc_number) {
									 	   							    				System.out.println("\nLOGIN SUCCESS");
									 	   							    				System.out.println("------------------------------");
									 	   							    				System.out.println("\nAccount points: "+account_points);
									 	   							    				System.out.println("\nYour account gets 100 points");
									 	   							    				System.out.println("\nAccount points: "+(account_points+=100));
									 	   							    			 System.out.println("\n================================================================================================================");
									 	   							    				
									 	   							    				i = 5;	
									 	   							    			}
									 	   							        		
									 	   							        		else {
									 	   							    				System.out.println("\nNot Matched");
									 	   							    			 System.out.println("\n================================================================================================================");
									 	   							    				
									 	   							        		}
									 	   							    		}
									 	   							    		
									 	   							    		else {
									 	   							    			System.out.println("\nYou tried 3 times.");
									 	   							    		 System.out.println("\n================================================================================================================");
									 	   							    		}	
									 	   							    	}
									 	   								
									 	   							    }
									 	   								
									 	   							    
									 	   								else if(account==2) {
									 	   									acc_number = rand.nextInt(5000)+1100;
									 	   										System.out.println("\n\nHere is your account number: "+acc_number);  
									 	   										for(int i = 1; i <= 4; i++) {
									 	   						     	
									 	   									if (i < 4) {
									 	   						     	
									 	   						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 	   						     		
									 	   						     		if (pin == acc_number) {
									 	   						     					System.out.println("\nLOGIN SUCCESS");
									 	   						     					System.out.println("------------------------------");
									 	   						     					account_points=300;
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				 System.out.println("\n================================================================================================================");
									 	   						 			
									 	   						 				i = 5;	
									 	   						 			}
									 	   						     		else {
									 	   						 				System.out.println("\nNot Matched");
									 	   						 			    System.out.println("\n================================================================================================================");
									 	   						 		
									 	   						     		}
									 	   						 		}
									 	   						 		
									 	   						     	else {
									 	   						     		System.out.println("\nYou tried 3 times.");
									 	   						     	    System.out.println("\n================================================================================================================");
									 	   						 		}	
									 	   										}
									 	   							    
									 	   									} 								 										
									 										
									 									}
									 									
									 									else {
									 								    System.out.println("\n================================================================================================================");
									 	  								System.out.println("\t\t\t   Not Enough Money");
									 	  							    System.out.println("\n================================================================================================================");
									 	   							}	
									 								
									 								break;		
									 								
									 								case 2:
									 									 System.out.println("\n================================================================================================================");
									 									System.out.print("SIZE: VENTI"+"\nPRICE: P"+frappe[8]+"\nQUANTITY: "); frappe_quantity=sc.nextInt();
									 									System.out.print("\nTOTAL: "+(frappe_total=frappe[8]*frappe_quantity)); System.out.print("\nEnter your money: "); frappe_payment=sc.nextLong();
									 									
									 									if(frappe_payment>=frappe_total) {
									 										 System.out.println("\n================================================================================================================");	
									 										System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 										System.out.print("\nOrdered Frappe:  Double Chocolate Chip " +"\nSIZE: VENTI"+"\nPRICE: P"+frappe[8]+"\nQUANTITY: "+frappe_quantity); 
									 		 								System.out.print("\nTOTAL: "+frappe_total+"\nMONEY ENTERED: "+frappe_payment+"\nCHANGE: "+(frappe_payment-=frappe_total));  
									 		 								 System.out.println("\n================================================================================================================");
									 		 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 		 								System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 		 								System.out.print("                        Choice: ");  account = sc.nextInt();
									 	   							    
									 	   								if(account==1) {
									 	   							    	
									 	   							    	for(int i = 1; i <= 4; i++) {
									 	   							        	
									 	   							    		if (i < 4) {
									 	   							        	
									 	   							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 	   							        		
									 	   							        		if (pin == acc_number) {
									 	   							    				System.out.println("\nLOGIN SUCCESS");
									 	   							    				System.out.println("------------------------------");
									 	   							    				System.out.println("\nAccount points: "+account_points);
									 	   							    				System.out.println("\nYour account gets 100 points");
									 	   							    				System.out.println("\nAccount points: "+(account_points+=100));
									 	   							    			 System.out.println("\n================================================================================================================");
									 	   							    				
									 	   							    				i = 5;	
									 	   							    			}
									 	   							        		
									 	   							        		else {
									 	   							    				System.out.println("\nNot Matched");
									 	   							    			 System.out.println("\n================================================================================================================");
									 	   							    				
									 	   							        		}
									 	   							    		}
									 	   							    		
									 	   							    		else {
									 	   							    			System.out.println("\nYou tried 3 times.");
									 	   							    		 System.out.println("\n================================================================================================================");
									 	   							    		}	
									 	   							    	}
									 	   								
									 	   							    }
									 	   								
									 	   							    
									 	   								else if(account==2) {
									 	   								acc_number = rand.nextInt(5000)+1100;
									 	   										System.out.println("\n\nHere is your account number: "+acc_number);  
									 	   										for(int i = 1; i <= 4; i++) {
									 	   						     	
									 	   									if (i < 4) {
									 	   						     	
									 	   						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 	   						     		
									 	   						     		if (pin == acc_number) {
									 	   						     					System.out.println("\nLOGIN SUCCESS");
									 	   						     					System.out.println("------------------------------");
									 	   						     					account_points=300;
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				 System.out.println("\n================================================================================================================");
									 	   						 			
									 	   						 				i = 5;	
									 	   						 			}
									 	   						     		else {
									 	   						 				System.out.println("\nNot Matched");
									 	   						 			 System.out.println("\n================================================================================================================");
									 	   						 		
									 	   						     		}
									 	   						 		}
									 	   						 		
									 	   						     	else {
									 	   						     		System.out.println("\nYou tried 3 times.");
									 	   						     	 System.out.println("\n================================================================================================================");
									 	   						 		}	
									 	   										}
									 	   							    
									 	   							    	} 								 										
									 										
									 									}
									 									
									 									else {
									 										 System.out.println("\n================================================================================================================");
									 	  								System.out.println("\t\t\t   Not Enough Money");
									 	  							 System.out.println("\n================================================================================================================");
									 									}	
									 									
									 								 break;	
									 								 
									 								 default:
									 									    System.out.println("\n================================================================================================================");
									 										System.out.println("\t\t\t   INVALID SIZE");
									 										System.out.println("\n================================================================================================================");

									 								}			
									 							}while(frappe_order3>2);
									 								
									 								break;
									 	                     
									 	                      case 5:
									 								
									 	                    	 System.out.println("\n================================================================================================================");
									 								do {
									 								System.out.println("\n\n\t\t  PLEASE SELECT SIZES OF YOUR FRAPPE");	
									 								System.out.println("\t\t\nOrdered Number: "+frappe[0]+" -- Pistachio Creme ");
									 								System.out.println("\n\t\t\t  [1]. GRANDE"+"\n\t\t\t  [2]. VENTI");
									 								System.out.print("\n\n\t  Enter your choice: "); frappe_order4 = sc.nextInt();
									 								
									 								switch(frappe_order4) {
									 								
									 								 case 1:
									 									 System.out.println("\n================================================================================================================");
									 									System.out.print("SIZE: GRANDE"+"\nPRICE: P"+frappe[4]+"\nQUANTITY: "); frappe_quantity=sc.nextInt();
									 									System.out.print("\nTOTAL: "+(frappe_total=frappe[4]*frappe_quantity)); System.out.print("\nEnter your money: "); frappe_payment=sc.nextLong();
									 									
									 									if(frappe_payment>=frappe_total) {
									 										 System.out.println("\n================================================================================================================");
									 										System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 	  									System.out.print("\nOrdered Frappe: Pistachio Creme " +"\nSIZE: GRANDE"+"\nPRICE: P"+frappe[4]+"\nQUANTITY: "+frappe_quantity); 
									 		 								System.out.print("\nTOTAL: "+frappe_total+"\nMONEY ENTERED: "+frappe_payment+"\nCHANGE: "+(frappe_payment-=frappe_total));  
									 		 								 System.out.println("\n================================================================================================================");
									 		 								System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 		 								System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 		 								System.out.print("                        Choice: ");  account = sc.nextInt();
									 	   							    
									 	   								if(account==1) {
									 	   							    	
									 	   							    	for(int i = 1; i <= 4; i++) {
									 	   							        	
									 	   							    		if (i < 4) {
									 	   							        	
									 	   							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 	   							        		
									 	   							        		if (pin == acc_number) {
									 	   							    				System.out.println("\nLOGIN SUCCESS");
									 	   							    				System.out.println("------------------------------");
									 	   							    				System.out.println("\nAccount points: "+account_points);
									 	   							    				System.out.println("\nYour account gets 100 points");
									 	   							    				System.out.println("\nAccount points: "+(account_points+=100));
									 	   							    			 System.out.println("\n================================================================================================================");
									 	   							    				
									 	   							    				i = 5;	
									 	   							    			}
									 	   							        		
									 	   							        		else {
									 	   							    				System.out.println("\nNot Matched");
									 	   							    			 System.out.println("\n================================================================================================================");
									 	   							    				
									 	   							        		}
									 	   							    		}
									 	   							    		
									 	   							    		else {
									 	   							    			System.out.println("\nYou tried 3 times.");
									 	   							    		 System.out.println("\n================================================================================================================");
									 	   							    		}	
									 	   							    	}
									 	   								
									 	   							    }
									 	   								
									 	   							    
									 	   								else if(account==2) {
									 	   										acc_number = rand.nextInt(5000)+1100;
									 	   										System.out.println("\n\nHere is your account number: "+acc_number);  
									 	   										for(int i = 1; i <= 4; i++) {
									 	   						     	
									 	   									if (i < 4) {
									 	   						     	
									 	   						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 	   						     		
									 	   						     		if (pin == acc_number) {
									 	   						     			System.out.println("\nLOGIN SUCCESS");
									 	   						     			System.out.println("------------------------------");
									 	   						     			account_points=300;
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				 System.out.println("\n================================================================================================================");
									 	   						 			
									 	   						 				i = 5;	
									 	   						 			}
									 	   						     		else {
									 	   						 				System.out.println("\nNot Matched");
									 	   						 			 System.out.println("\n================================================================================================================");
									 	   						 		
									 	   						     		}
									 	   						 		}
									 	   						 		
									 	   						     	else {
									 	   						     		System.out.println("\nYou tried 3 times.");
									 	   						     	 System.out.println("\n================================================================================================================");
									 	   						 		}	
									 	   										}
									 	   							    
									 	   							    } 								 										
									 										
									 									}
									 									
									 									else {
									 										 System.out.println("\n================================================================================================================");
									 	  								System.out.println("\t\t\t   Not Enough Money");
									 	  							 System.out.println("\n================================================================================================================");
									 	   							}	
									 								
									 								break;		
									 								
									 								 case 2:
									 									System.out.println("\n================================================================================================================");
									 									System.out.print("SIZE: VENTI"+"\nPRICE: P"+frappe[9]+"\nQUANTITY: "); frappe_quantity=sc.nextInt();
									 									System.out.print("\nTOTAL: "+(frappe_total=frappe[9]*frappe_quantity)); System.out.print("\nEnter your money: "); frappe_payment=sc.nextLong();
									 									
									 									if(frappe_payment>=frappe_total) {
									 										 System.out.println("\n================================================================================================================");	
									 										 System.out.println("\n\t\t\t   Quake Blends \n\n\t\t\t Official Receipt \n\t\t\t ----------------");
									 	  									 System.out.print("\nOrdered Frappe: Pistachio Creme " +"\nSIZE: VENTI "+"\nPRICE: P"+frappe[9]+"\nQUANTITY: "+frappe_quantity); 
									 		 								 System.out.print("\nTOTAL: "+frappe_total+"\nMONEY ENTERED: "+frappe_payment+"\nCHANGE: "+(frappe_payment-=frappe_total));  
									 		 								 System.out.println("\n================================================================================================================");
									 		 								 System.out.println("\n\t\tTHANK YOU FOR BUYING IN QUAKE BLENDS!!!!");
									 		 								 System.out.println("\n\n\tDo you already have a account? | 1. Yes or 2. No");	
									 		 								 System.out.print("                        Choice: ");  account = sc.nextInt();
									 	   							    
									 	   								if(account==1) {
									 	   							    	
									 	   							    	for(int i = 1; i <= 4; i++) {
									 	   							        	
									 	   							    		if (i < 4) {
									 	   							        	
									 	   							        		System.out.print("\n\nEnter your account number: "); pin = sc.nextInt();
									 	   							        		
									 	   							        		if (pin == acc_number) {
									 	   							    				System.out.println("\nLOGIN SUCCESS");
									 	   							    				System.out.println("------------------------------");
									 	   							    				System.out.println("\nAccount points: "+account_points);
									 	   							    				System.out.println("\nYour account gets 100 points");
									 	   							    				System.out.println("\nAccount points: "+(account_points+=100));
									 	   							    			 System.out.println("\n================================================================================================================");
									 	   							    				
									 	   							    				i = 5;	
									 	   							    			}
									 	   							        		
									 	   							        		else {
									 	   							    				System.out.println("\nNot Matched");
									 	   							    			 System.out.println("\n================================================================================================================");
									 	   							    				
									 	   							        		}
									 	   							    		}
									 	   							    		
									 	   							    		else {
									 	   							    			System.out.println("\nYou tried 3 times.");
									 	   							    		 System.out.println("\n================================================================================================================");
									 	   							    		}	
									 	   							    	}
									 	   								
									 	   							    }
									 	   								
									 	   							    
									 	   								else if(account==2) {
									 	   										acc_number = rand.nextInt(5000)+1100;
									 	   										System.out.println("\n\nHere is your account number: "+acc_number);  
									 	   										for(int i = 1; i <= 4; i++) {
									 	   						     	
									 	   									if (i < 4) {
									 	   						     	
									 	   						     		System.out.print("\nEnter your account number: "); pin = sc.nextInt();
									 	   						     		
									 	   						     		if (pin == acc_number) {
									 	   						     			System.out.println("\nLOGIN SUCCESS");
									 	   						     			System.out.println("------------------------------");
									 	   						     			account_points=300;
									 								    				System.out.println("\nAccount points: "+account_points);
									 								    				System.out.println("\nYour account gets 100 points");
									 								    				System.out.println("\nAccount points: "+(account_points+=100));
									 								    				 System.out.println("\n================================================================================================================");
									 	   						 			
									 	   						 				i = 5;	
									 	   						 			}
									 	   						     		else {
									 	   						 				System.out.println("\nNot Matched");
									 	   						 			    System.out.println("\n================================================================================================================");
									 	   						 		
									 	   						     		}
									 	   						 		}
									 	   						 		
									 	   						     	else {
									 	   						     		System.out.println("\nYou tried 3 times.");
									 	   						     	 System.out.println("\n================================================================================================================");
									 	   						 		}	
									 	   										}
									 	   							    
									 	   							    } 								 										
									 										
									 									}
									 									
									 								else {
									 									System.out.println("\n================================================================================================================");
									 	  								System.out.println("\t\t\t   Not Enough Money");
									 	  							    System.out.println("\n================================================================================================================");
									 									}
									 									break;
									 									 
									 								 default:
									 									    System.out.println("\n================================================================================================================");
									 										System.out.println("\t\t\t   INVALID SIZE");
									 										System.out.println("\n================================================================================================================");
									 										 
									 								}	
									 								
									 								}while(frappe_order4>2);
									 								
									 								break;
									 	                      
									 	                      default:
									 	                    	  	System.out.println("\n================================================================================================================");
								    								System.out.println("\t\t\t\t\t\t  NOT IN MENU");
								    								
									 	 					
									 	 					}
									 	 									
									 			}while(frappe[0]>5); 
									 
									 		break;
										        
									    default:
									    	System.out.println("\n================================================================================================================");
				 	      					System.out.println("\t\t\t\t\t  INVALID INPUT (CHOOSE 1-4 ONLY)");
				 	      				    
									 }
									 
								}while(Drink_choice > 4);
								
									do {
										
										System.out.println("\n\t\t (IF NO THE SYSTEM WILL GO BACK TO MAIN MENU)");
										System.out.print("\n\t\t\t   Order again? Y/N: "); drinks_again = sc.next().charAt(0);
										
									
									} while(drinks_again!='Y'&&drinks_again!='y'&&drinks_again!='N'&&drinks_again!='n');
									
									if(drinks_again=='N'||drinks_again=='n') {
										 System.out.println("\n================================================================================================================");
									}
								
								} while(drinks_again=='Y'||drinks_again=='y');
						
								
						
						break;
						
						case 3://merchandises
						
					do {
						
						do {
							System.out.println("\n================================================================================================================");
					 		System.out.println("\n\t\t\t Welcome to Merchandise Section");
					 		System.out.println("\n Exchange your account points here by choosing the numbers of item you want");
					 		System.out.println("\n\n\t\t\t     QUAKE BLENDS MERCH ");
							System.out.println("\n\n[1]. Quake Blends Cap  \t[2]. Quake Blends Hoodie + Baller   [3]. Tumbler and Mug");
							System.out.println("\t"+Merch[1]+" POINTS  "+"\t             "+Merch[2]+" POINTS"+"\t           "+Merch[3]+" POINTS");
							System.out.println("\n\n\n\t[4]. AIR JORDAN 1 MID SE SNEAKERS \t\t[5]. ACOUSTIC GUITAR SET ");
							System.out.println("\t\t  "+Merch[4]+" POINTS  "+"\t\t                         "+Merch[5]+" POINTS");
							System.out.println("\n\n Account points available: "+account_points);
							System.out.print("\n\n Choice: "); Merch[0] =sc.nextInt();
							
								switch(Merch[0]) {
								
									case 1:
										    System.out.println("\n================================================================================================================");
											System.out.println("You choose Quake Blends Cap");
											System.out.println("\n================================================================================================================");
											if (account_points>=Merch[1]) {
												System.out.println("Account number:"+acc_number);
												System.out.println("\nCongratiolations! for getting our Quake Blends Cap official merchandise");
												System.out.println("\nAccount points: "+account_points);
												System.out.println("\nYour account points will be deducted by "+Merch[1] +" points");
												System.out.println("--------------------------------------------------------------------");
												System.out.println("Account points: "+(account_points-=Merch[1]));	
											}
											
											else {
												System.out.println("Account number:"+acc_number);
												System.out.println("\nSorry! your account points is not enough to avail this merch");
												System.out.println("\nKeep buying and support our shop to gain more points, Thank you!");
												System.out.println("--------------------------------------------------------------------");
												System.out.println("Account points: "+account_points);
											}
								
								    break;
											
									case 2:
										System.out.println("\n================================================================================================================");
										System.out.println("You choose Quake Blends Hoodie + Baller");
										System.out.println("\n================================================================================================================");
										if (account_points>=Merch[2]) {
											System.out.println("Account number:"+acc_number);
											System.out.println("\nCongratiolations! for getting our Quake Blends Hoodie and Baller official merchandise");
											System.out.println("\nAccount points: "+account_points);
											System.out.println("\nYour account points will be deducted by "+Merch[2] +" points");
											System.out.println("--------------------------------------------------------------------");;
											System.out.println("Account points: "+(account_points-=Merch[2]));	
										}
										
										else {
											System.out.println("Account number:"+acc_number);
											System.out.println("\nSorry! your account points is not enough to avail this merch");
											System.out.println("\nKeep buying and support our shop to gain more points, Thank you!");
											System.out.println("--------------------------------------------------------------------");
											System.out.println("Account points: "+account_points);
										}
							
							    break;	
							    
								case 3:
								    	System.out.println("\n================================================================================================================");
										System.out.println("You choose Quake Blends Tumbler and Mug");
										System.out.println("\n================================================================================================================");
										if (account_points>=Merch[3]) {
											System.out.println("Account number:"+acc_number);
											System.out.println("\nCongratiolations! for getting our Quake Blends Tumbler and Mug official merchandise");
											System.out.println("\nAccount points: "+account_points);
											System.out.println("\nYour account points will be deducted by "+Merch[3] +" points");
											System.out.println("--------------------------------------------------------------------");
											System.out.println("Account points: "+(account_points-=Merch[3]));	
										}
										
										else {
											System.out.println("Account number:"+acc_number);
											System.out.println("\nSorry! your account points is not enough to avail this merch");
											System.out.println("\nKeep buying and support our shop to gain more points, Thank you!");
											System.out.println("--------------------------------------------------------------------");
											System.out.println("\nAccount points: "+account_points);
										}
							
							    break;
								
								case 4:
									System.out.println("\n================================================================================================================");
									System.out.println("You choose Air Jordan 1 Mid SE Sneakers");
									System.out.println("\n================================================================================================================");
									if (account_points>=Merch[4]) {
										System.out.println("Account number:"+acc_number);
										System.out.println("\n\nCongratiolations! for getting our Air Jordan 1 Mid SE Sneakers official merchandise");
										System.out.println("\nAccount points: "+account_points);
										System.out.println("\nYour account points will be deducted by "+Merch[4] +" points");
										System.out.println("---------------------------------------------------------------------");
										System.out.println("Account points: "+(account_points-=Merch[4]));	
									}
									
									else {
										System.out.println("Account number:"+acc_number);
										System.out.println("\nSorry! your account points is not enough to avail this merch");
										System.out.println("\nKeep buying and support our shop to gain more points, Thank you!");
										System.out.println("---------------------------------------------------------------------");
										System.out.println("\nAccount points: "+account_points);
									}
						
								break;
								
								case 5:
									System.out.println("\n================================================================================================================");
									System.out.println("You choose Acoustic Guitar Set");
									System.out.println("\n================================================================================================================");
									if (account_points>=Merch[5]) {
										System.out.println("Account number:"+acc_number);
										System.out.println("\nCongratiolations! for getting our Acoustic Guitar Set official merchandise");
										System.out.println("\nAccount points: "+account_points);
										System.out.println("\nYour account points will be deducted by "+Merch[5] +" points");
										System.out.println("---------------------------------------------------------------------");
										System.out.println("Account points: "+(account_points-=Merch[5]));	
									}
									
									else {
										System.out.println("Account number:"+acc_number);
										System.out.println("\nSorry! your account points is not enough to avail this merch");
										System.out.println("\nKeep buying and support our shop to gain more points, Thank you!");
										System.out.println("---------------------------------------------------------------------");
										System.out.println("\nAccount points: "+account_points);
									}

								break;
									
								default:
									    System.out.println("\n================================================================================================================");
										System.out.println("\t\t\t  NO MERCH AVAILABLE (INVALID INPUT)");
										System.out.println("\n================================================================================================================");
								}
						
								
								} while(Merch[0]>5);
					
									do {
										System.out.println("\n================================================================================================================");
										System.out.print("\n\t\t\tBACK TO MAIN MENU? Y/N: "); merch_again = sc.next().charAt(0);
									
									} while(merch_again!='Y'&&merch_again!='y'&&merch_again!='N'&&merch_again!='n');
									
									if(merch_again=='Y'||merch_again=='y') {
										System.out.println("\n================================================================================================================");	
									}
									
								} while(merch_again=='N'||merch_again=='n');
								
					 
							
								break;		
						
						
							case 4:
								
								System.out.println("\n\tDo you want to exit? | 1. Yes or 2. No");	
								System.out.print("                        Choice: ");
								exit = sc.nextInt();
								
								
								if(exit==1) {
									System.out.println("\n================================================================================================================");	
									System.out.println("     To make it a beautiful day, enjoy a coffee at Quake Blends. ");
									System.out.println("\n================================================================================================================");
									System.exit(exit);
								}
								break;
							
						
							default: 
								System.out.println("\n================================================================================================================");
								System.out.println("\t\t\t\t\t\t   Invalid Number");
								System.out.println("================================================================================================================");
							
					}
				
			
			} while(Menu_choice>4); // Sa main menu to pag pinili nila is 4 pataas wala naman sa choice yun
				} while(exit==2); // sa exit to pag nag no sila balik sila sa main menu
						} while(food_again=='N'||food_again=='n'); // Pag nag no sila sa order again sa food balik main menu		
							} while(drinks_again=='N'||drinks_again=='n'); // pag nag no sila sa order again sa drinks balik main menu
								} while(merch_again=='Y'||merch_again=='y');
									
			sc.close();

	}


}

	

package src.com.ocr.anthony;

import java.util.Scanner;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix menu");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - v�g�tarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
    	if(nbMenu == 1) {
        System.out.println("Vous avez choisi comme menu : poulet");
    	}
    	else if(nbMenu == 2) {
            System.out.println("Vous avez choisi comme menu : boeuf");
        	}
    	else if(nbMenu == 3) {
            System.out.println("Vous avez choisi comme menu : v�g�tarien");
        	}
    	else if(nbMenu < 1 || nbMenu > 3) {
    		System.out.println("Vous n'avez pas choisi de menu parmi les choix propos�s");
    	}
    }
    
    /**
     * Run asking process for a new menu
     * */
    public void runMenu() {
    	this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nbMenu = sc.nextInt();
        this.displaySelectedMenu(nbMenu);
        switch (nbMenu) {
            case 1:
                displayAvailableSide(true);
                int nbSide = sc.nextInt();
                displaySelectedSide(nbSide, true);
                displayAvailableDrink();
                int nbDrink = sc.nextInt();
                displaySelectedDrink(nbDrink);
                break;
            case 2:
                displayAvailableSide(true);
                nbSide = sc.nextInt();
                displaySelectedSide(nbSide, true);
                break;
            case 3:
                displayAvailableSide(false);
                nbSide = sc.nextInt();
                displaySelectedSide(nbSide, false);
                displayAvailableDrink();
                nbDrink = sc.nextInt();
                displaySelectedDrink(nbDrink);
                break;
        }
        sc.close();
    }
    /**
     * Display a selected side depending on all sides enable or not.
     * All sides = vegetables, fries and rice
     * No all sides = rice or not
     * @param nbSide The selected Side
     * @param allSidesEnable  enable display for all side or not
     * */
    
	public void displaySelectedSide(int nbSide, boolean allSidesEnable) {
		
		if(allSidesEnable) {
			switch(nbSide) {
			case 1 : 
				System.out.println("Vous avez choisi comme accompagnement : l�gumes frais");
				break;
			case 2 : 
				System.out.println("Vous avez choisi comme accompagnement : frites");
				break;
			case 3 : 
				System.out.println("Vous avez choisi comme accompagnement : riz");
				break;
			}
		}else {
			switch(nbSide) {
			case 1 : 
				System.out.println("Vous avez choisi comme accompagnement : riz");
				break;
			case 2 : 
				System.out.println("Vous avez choisi comme accompagnement : pas de riz");
				break;
			default : 
				System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix propos�s");
				break;
			}
		}
	}
	
	/**
	 * 
	 * @param i
	 */
	public void displaySelectedDrink(int i) {
		
			switch(i) {
			case 1 : 
				System.out.println("Vous avez choisi comme boisson : eau plate"); 
				break;
			case 2 : 
				System.out.println("Vous avez choisi comme boisson : eau gazeuse"); 
				break;
			case 3 : 
				System.out.println("Vous avez choisi comme boisson : soda"); 
				break;
			default : 
				System.out.println("Vous n'avez pas choisi de boisson parmi les choix propos�s");
				break;
		}	
	}
	
	/**
	 * Display all available sides depending on all sides enable or not.
	 * All sides = vegetables, fries and rice
	 * No all sides = rice or not
	 * @param allSideEnable enable display for all side or not
	 */
	 public void displayAvailableSide(boolean allSideEnable) {
		 System.out.println("Choix d'accompagnement");
		 if(allSideEnable) {
		  System.out.println("1 - l�gumes frais \n"
		  		           + "2 - Frites \n"
		  		           + "3 - riz");
		 }else {
			 System.out.println("1 - riz");
			 System.out.println("2 - pas de riz");
		 }
		 	 System.out.println("Que souhaitez-vous comme accompagnement ?");
	 }
	 
	 /**
	  * Display all available drinks in the restaurant
	  */   
	 public void displayAvailableDrink() {
	     System.out.println("Choix boisson");
	     System.out.println("1 - eau plate");
	     System.out.println("2 - eau gazeuse");
	     System.out.println("3 - soda");
	     System.out.println("Que souhaitez-vous comme boisson ?");
	 }
    
}
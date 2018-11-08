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
         int nb = sc.nextInt();
         this.displaySelectedMenu(nb);
         
         sc.close();
    }
}
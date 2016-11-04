/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
abstract class MenuView {
    MenuView() {
        type = "    ";
        command1 = " ";
        command2 = " ";
        command3 = " ";
        command4 = " ";
    }
    protected String getChoice() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid){
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1){
                System.out.println("\nINVALID!!! Please enter a command!");
            }
            else{
                valid = true;
            }
        }
        return value;
    }
    protected void displayMenu() {
        System.out.println("\n========================================================="
                         + "\n***                " + type +  " MENU                     ***"
                         + "\n**=====================================================**"
                         + "\n*                                                       *"
                         + "\n* Please type one of the following capitalized commands *"
                         + "\n*     ============================================      *"
                         + "\n" + command1 + command2 + command3 + command4
                         + "\n"
                         + "\n=========================================================");
    }
    protected boolean doAction(String choice) {
        return true;
    }
    public void display() {
        boolean done = false;
        do{
            displayMenu();
            String action = getChoice(); 
            if(action.toUpperCase().equals("Q")){
                return;
            }
            done = doAction(action);
        }while(!done);
    }
    
    protected String type;
    protected String command1;
    protected String command2;
    protected String command3;
    protected String command4;
}

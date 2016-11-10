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
abstract class MenuView extends View {
    public MenuView(String type, String command1, String command2) {
        super("\n========================================================="
                         + "\n***                " + type +  " MENU                     ***"
                         + "\n**=====================================================**"
                         + "\n*                                                       *"
                         + "\n* Please type one of the following capitalized commands *"
                         + "\n*     ============================================      *"
                         + "\n\n \t" + command1 + "\n \t" + command2
                         + "\n"
                         + "\n=========================================================");
    }
    public MenuView(String type, String command1, String command2, String command3) {
        super("\n========================================================="
                         + "\n***                " + type +  " MENU                     ***"
                         + "\n**=====================================================**"
                         + "\n*                                                       *"
                         + "\n* Please type one of the following capitalized commands *"
                         + "\n*     ============================================      *"
                         + "\n\n \t" + command1 + "\n \t" + command2 + "\n \t" + command3
                         + "\n"
                         + "\n=========================================================");
    }
    public MenuView(String type, String command1, String command2, String command3, String command4) {
        super("\n========================================================="
                         + "\n***                " + type +  " MENU                     ***"
                         + "\n**=====================================================**"
                         + "\n*                                                       *"
                         + "\n* Please type one of the following capitalized commands *"
                         + "\n*     ============================================      *"
                         + "\n\n \t" + command1 + "\n \t" + command2 + "\n \t" + command3 
                         + "\n \t" + command4
                         + "\n"
                         + "\n=========================================================");
    }
    public MenuView(String type, String command1, String command2, String command3, String command4,
             String command5) {
        super("\n========================================================="
                         + "\n***                " + type +  " MENU                     ***"
                         + "\n**=====================================================**"
                         + "\n*                                                       *"
                         + "\n* Please type one of the following capitalized commands *"
                         + "\n*     ============================================      *"
                         + "\n\n \t" + command1 + "\n \t" + command2 + "\n \t" + command3 
                         + "\n \t" + command4 + "\n \t" + command5
                         + "\n"
                         + "\n=========================================================");
    }
    public MenuView(String type, String command1, String command2, String command3, String command4,
             String command5, String command6) {
        super("\n========================================================="
                         + "\n***                " + type +  " MENU                     ***"
                         + "\n**=====================================================**"
                         + "\n*                                                       *"
                         + "\n* Please type one of the following capitalized commands *"
                         + "\n*     ============================================      *"
                         + "\n\n \t" + command1 + "\n \t" + command2 + "\n \t" + command3 
                         + "\n \t" + command4 + "\n \t" + command5 + "\n \t" + command6
                         + "\n"
                         + "\n=========================================================");
    }
    
    protected String makeMenu() {
        String menu =      "\n========================================================="
                         + "\n***                " + type +  " MENU                     ***"
                         + "\n**=====================================================**"
                         + "\n*                                                       *"
                         + "\n* Please type one of the following capitalized commands *"
                         + "\n*     ============================================      *"
                         + "\n" + command1 + command2 + command3 + command4 + command5 + command6
                         + "\n"
                         + "\n=========================================================";
        return menu;
    }
    protected boolean doAction(String choice) {
        return true;
    }
    
    
    protected String type = " ";
    protected String command1 = " ";
    protected String command2 = " ";
    protected String command3 = " ";
    protected String command4 = " ";
    protected String command5 = " ";
    protected String command6 = " ";
}

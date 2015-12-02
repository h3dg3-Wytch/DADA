//Main method
package dada;

import Models.Databases.EntityManager;
import View.GUI.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DADA {

    public static void main(String args[]) {
 
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DADA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DADA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DADA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(DADA.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<Models.Entity.Character> characters = EntityManager.loadCharacters();
        for(int i = 0; i < characters.size(); i ++)
        {
            System.out.println(characters.get(i).getDescriptions().getName());
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainMenuFrame mainFrame = new MainMenuFrame();
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setVisible(true);
            }
        });
    }

}

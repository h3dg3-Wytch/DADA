//Main method
package dada;

import GUI.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DADA
{

    public static void main(String args[])
    {

        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DADA.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            Logger.getLogger(DADA.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            Logger.getLogger(DADA.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex)
        {
            Logger.getLogger(DADA.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                MainMenuFrame mainFrame = new MainMenuFrame();
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setVisible(true);
            }
        });
    }

}

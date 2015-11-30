/**
 *
 * @author Morgan Miller
 */
package Models.Databases;

import Models.etc.Spell;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpellManager
{

    private static final String SPELLS_FILE = "Spells.DADA";

    public static void saveCharacters(List<Spell> spells)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(SPELLS_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            try
            {
                for (int i = 0; i < spells.size(); i++)
                {
                    oos.writeObject(spells.get(i));
                }

            }
            catch (IOException ex)
            {
                oos.close();
                fos.close();
            }
        }
        catch (IOException ex)
        {
            Logger.getLogger(SpellManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public static List<Spell> loadSpells()
    {
        FileInputStream fis;
        try
        {
            fis = new FileInputStream(SPELLS_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Spell> spells = new ArrayList();

            try
            {
                Spell spell = null;

                while ((spell = (Spell) ois.readObject()) != null)
                {
                    spells.add(spell);
                }

            }
            catch (IOException ex)
            {
                //ignore EOF
            }
            catch (ClassNotFoundException ex)
            {
                Logger.getLogger(SpellManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                return spells;
            }
        }
        catch (FileNotFoundException ex)
        {
            return null;
        }
        catch (IOException ex)
        {
            return null;
        }
    }
}


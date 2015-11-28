/**
 *
 * @author Morgan Miller
 */
package Models.Databases;

import Models.Equipment.Armor;
import Models.Equipment.Weapon;
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

public class EquipmentManager
{

    private static final String WEAPONS_FILE = "Weapons.DADA",
            ARMOR_FILE = "Armor.DADA";

    public static void saveWeapons(List<Weapon> weapons)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(WEAPONS_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            try
            {
                for (int i = 0; i < weapons.size(); i++)
                {
                    oos.writeObject(weapons.get(i));
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
            Logger.getLogger(EquipmentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void saveArmor(List<Armor> armor)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(ARMOR_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            try
            {
                for (int i = 0; i < armor.size(); i++)
                {
                    oos.writeObject(armor.get(i));
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
            Logger.getLogger(EquipmentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void saveAll(List<Weapon> weapons, List<Armor> armor)
    {
        saveWeapons(weapons);
        saveArmor(armor);
    }

    public static List<Weapon> loadWeapons()
    {
        FileInputStream fis;
        try
        {
            fis = new FileInputStream(WEAPONS_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Weapon> weapons = new ArrayList();

            try
            {
                Weapon weapon = null;

                while ((weapon = (Weapon) ois.readObject()) != null)
                {
                    weapons.add(weapon);

                }

            }
            catch (IOException ex)
            {
                // ignore EOF
            }
            catch (ClassNotFoundException ex)
            {
                Logger.getLogger(EquipmentManager.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                return weapons;
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

    public static List<Armor> loadArmor()
    {
        FileInputStream fis;
        try
        {
            fis = new FileInputStream(ARMOR_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Armor> armorList = new ArrayList();

            try
            {
                Armor armor = null;

                while ((armor = (Armor) ois.readObject()) != null)
                {
                    armorList.add(armor);
                }

            }
            catch (IOException ex)
            {
                //ignore EOF
            }
            catch (ClassNotFoundException ex)
            {
                Logger.getLogger(EquipmentManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                return armorList;
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

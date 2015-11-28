/**
 *
 * @author Morgan Miller
 */

package Models.Databases;

import Models.Entity.Monster;
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

public class EntityManager
{

    private static final String CHARACTERS_FILE = "Characters.DADA",
            MONSTERS_FILE = "Monsters.DADA";

    public static void saveCharacters(List<Models.Entity.Character> characters)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(CHARACTERS_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            try
            {
                for (int i = 0; i < characters.size(); i++)
                {
                    oos.writeObject(characters.get(i));
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
            Logger.getLogger(EntityManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void saveMonsters(List<Monster> monsters)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(MONSTERS_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            try
            {
                for (int i = 0; i < monsters.size(); i++)
                {
                    oos.writeObject(monsters.get(i));
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
            Logger.getLogger(EntityManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void saveAll(List<Models.Entity.Character> characters, List<Monster> monsters)
    {
        saveCharacters(characters);
        saveMonsters(monsters);
    }

    public static List<Models.Entity.Character> loadCharacters()
    {
        FileInputStream fis;
        try
        {
            fis = new FileInputStream(CHARACTERS_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Models.Entity.Character> characters = new ArrayList();

            try
            {
                Models.Entity.Character character = null;

                while ((character = (Models.Entity.Character) ois.readObject()) != null)
                {
                    characters.add(character);

                }

            }
            catch (IOException ex)
            {

            }
            catch (ClassNotFoundException ex)
            {
                Logger.getLogger(EntityManager.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                return characters;
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

    public static List<Monster> loadMonsters()
    {
        FileInputStream fis;
        try
        {
            fis = new FileInputStream(MONSTERS_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Monster> monsters = new ArrayList();

            try
            {
                Monster monster = null;

                while ((monster = (Monster) ois.readObject()) != null)
                {
                    monsters.add(monster);
                }

            }
            catch (IOException ex)
            {
                //ignore EOF
            }
            catch (ClassNotFoundException ex)
            {
                Logger.getLogger(EntityManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                return monsters;
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Monster file not found");
            return null;
        }
        catch (IOException ex)
        {
            System.out.println("IO error");
            return null;
        }
    }
}

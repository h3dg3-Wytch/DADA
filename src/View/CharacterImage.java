//Maia Ross created 11/25/15
package View;

import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.Graphics;
import java.awt.image.DataBufferInt;
import java.awt.image.WritableRaster;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CharacterImage  implements Serializable {

    private String imageName, charRace, charClass, charGender, charPalette;
    private int width = 288;
    private int height = 288;
    private int[] pixels;
    private BufferedImage image = new BufferedImage(288,288, BufferedImage.TYPE_INT_RGB);

    public CharacterImage() {
    }

    public CharacterImage(String imageName, String charRace, String charClass, String charGender, String charPalette) {
        this.imageName = imageName;
        this.charRace = charRace;
        this.charClass = charClass;
        this.charGender = charGender;
        this.charPalette = charPalette;
    }
    
   public BufferedImage setImage() {
        try {

            //FIRST LOAD UP TORSO BASED ON PALETTE
            String torsoPath = getTorso(charPalette, charRace);
            if (torsoPath == null) {
            //    System.out.println("Invalid palette. Please input 'a', 'b', or 'c' for palette.");
                System.exit(2);
            }//if imagepath = null
            BufferedImage torso = ImageIO.read(new File(torsoPath));

            //CREATE FINAL IMAGE, GRAPHICS OBJECT
            Graphics g = image.getGraphics();

            g.drawImage(torso, 0, 0, null); //DRAW TORSO LAYER

            //LOAD UP CLOTHING BASED ON CLASS
            String clothesPath = getClothes(charClass);
            if (clothesPath == null) {
            //    System.out.println("Invalid class.");
                System.exit(3);
            }//if imagepath = null
            BufferedImage clothes = ImageIO.read(new File(clothesPath));

            g.drawImage(clothes, 0, 0, null); //DRAW CLOTHES LAYER

            //LOAD UP FACE IMAGE BASED ON GENDER RACE AND PALETTE
            String headPath = getHead(charRace, charGender, charPalette);
            if (headPath == null) {
                //System.out.println("Invalid race. Use spaces between multiple words.");
                System.exit(4);
            }//if imagepath = null
            BufferedImage head = ImageIO.read(new File(headPath));

            g.drawImage(head, 0, 0, null); //DRAW HEAD LAYER

            //IF HAT IS TRUE LOAD UP HAT IMAGE
            if (hasHat(charClass)) {
                String hatPath = getHat(charClass);
                if (hatPath == null) {
            //        System.out.println("Invalid class.");
                    System.exit(5);
                }//if imagepath = null
                BufferedImage hat = ImageIO.read(new File(hatPath));

                g.drawImage(hat, 0, 0, null); //DRAW HAT LAYER
            }//if hasHat

        } catch (IOException e) {
            return null;
        }//catch
        return image;

    }//drawImage
   
   public void drawImage(){
        try {
            File outputfile = new File("src\\View\\Images\\temp.png");
            ImageIO.write(image, "png", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(CharacterImage.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    

    public void setPixels(){
        image = new BufferedImage(width,height, BufferedImage.TYPE_INT_RGB);
        pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
    }
    
    public BufferedImage drawPixels(){
            WritableRaster raster = (WritableRaster) image.getRaster();
            raster.setPixels(0, 0, width, height, pixels);
            image.setData(raster);
            return image;
    }
            
            
    private static String getTorso(String palette, String charRace) {
        if ("half orc".equals(charRace.toLowerCase())) {
            return "src\\View\\Images\\torso orc.png";
        } else {
            switch (palette.toLowerCase()) {
                case "a":
                    return "src\\View\\Images\\torso a.png";
                case "b":
                    return "src\\View\\Images\\torso b.png";
                case "c":
                    return "src\\View\\Images\\torso c.png";
                default:
                    return null;
            }
        }
    }//getTorso

    private static String getHead(String race, String gender, String palette) {
        if ("m".equals(gender.toLowerCase())) {
            switch (palette.toLowerCase()) {
                case "a":
                    //gender = m  palette = a
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "src\\View\\Images\\Dwarf (m) (A).png";
                        case "elf":
                            return "src\\View\\Images\\Elf (m) (A).png";
                        case "gnome":
                            return "src\\View\\Images\\Gnome (m) (A).png";
                        case "half elf":
                            return "src\\View\\Images\\Half Elf (m) (A).png";
                        case "halfling":
                            return "src\\View\\Images\\Halfling (m) (A).png";
                        case "half orc":
                            return "src\\View\\Images\\Half Orc (m).png";
                        case "human":
                            return "src\\View\\Images\\Human (m) (A).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "b":
                    //gender = m  palette = b                    
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "src\\View\\Images\\Dwarf (m) (B).png";
                        case "elf":
                            return "src\\View\\Images\\Elf (m) (B).png";
                        case "gnome":
                            return "src\\View\\Images\\Gnome (m) (B).png";
                        case "half elf":
                            return "src\\View\\Images\\Half Elf (m) (B).png";
                        case "halfling":
                            return "src\\View\\Images\\Halfling (m) (B).png";
                        case "half orc":
                            return "src\\View\\Images\\Half Orc (m).png";
                        case "human":
                            return "src\\View\\Images\\Human (m) (B).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "c":
                    //gender = m  palette = c
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "src\\View\\Images\\Dwarf (m) (C).png";
                        case "elf":
                            return "src\\View\\Images\\Elf (m) (C).png";
                        case "gnome":
                            return "src\\View\\Images\\Gnome (m) (C).png";
                        case "half elf":
                            return "src\\View\\Images\\Half Elf (m) (C).png";
                        case "halfling":
                            return "src\\View\\Images\\Halfling (m) (C).png";
                        case "half orc":
                            return "src\\View\\Images\\Half Orc (m).png";
                        case "human":
                            return "src\\View\\Images\\Human (m) (C).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                default: //for palette
                    return null;
            }//switch (palette.toLowerCase()) 
        } else if ("f".equals(gender.toLowerCase())) {
            switch (palette.toLowerCase()) {
                case "a":
                    //gender = f  palette = a                   
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "src\\View\\Images\\Dwarf (f) (A).png";
                        case "elf":
                            return "src\\View\\Images\\Elf (f) (A).png";
                        case "gnome":
                            return "src\\View\\Images\\Gnome (f) (A).png";
                        case "half elf":
                            return "src\\View\\Images\\Half Elf (f) (A).png";
                        case "halfling":
                            return "src\\View\\Images\\Halfling (f) (A).png";
                        case "half orc":
                            return "src\\View\\Images\\Half Orc (f).png";
                        case "human":
                            return "src\\View\\Images\\Human (f) (A).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "b":
                    //gender = f  palette = a                     
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "src\\View\\Images\\Dwarf (f) (B).png";
                        case "elf":
                            return "src\\View\\Images\\Elf (f) (B).png";
                        case "gnome":
                            return "src\\View\\Images\\Gnome (f) (B).png";
                        case "half elf":
                            return "src\\View\\Images\\Half Elf (f) (B).png";
                        case "halfling":
                            return "src\\View\\Images\\Halfling (f) (B).png";
                        case "half orc":
                            return "src\\View\\Images\\Half Orc (f).png";
                        case "human":
                            return "src\\View\\Images\\Human (f) (B).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "c":
                    //gender = f  palette = a                     
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "src\\View\\Images\\Dwarf (f) (C).png";
                        case "elf":
                            return "src\\View\\Images\\Elf (f) (C).png";
                        case "gnome":
                            return "src\\View\\Images\\Gnome (f) (C).png";
                        case "half elf":
                            return "src\\View\\Images\\Half Elf (f) (C).png";
                        case "halfling":
                            return "src\\View\\Images\\Halfling (f) (C).png";
                        case "half orc":
                            return "src\\View\\Images\\Half Orc (f).png";
                        case "human":
                            return "src\\View\\Images\\Human (f) (C).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                default:
                    return null;
            }//switch (palette.toLowerCase()) 
        } else {
            return null;
        }//if/else gender
    }//getHead

    private static String getClothes(String charClass) {
        switch (charClass.toLowerCase()) {
            case "barbarian":
                return "src\\View\\Images\\Barbarian.png";
            case "bard":
                return "src\\View\\Images\\Bard.png";
            case "druid":
                return "src\\View\\Images\\Druid.png";
            case "fighter":
                return "src\\View\\Images\\Fighter.png";
            case "monk":
                return "src\\View\\Images\\Monk.png";
            case "paladin":
                return "src\\View\\Images\\Paladin.png";
            case "ranger":
                return "src\\View\\Images\\ranger.png";
            case "rogue":
                return "src\\View\\Images\\Rogue.png";
            case "sorcerer":
                return "src\\View\\Images\\Sorcerer.png";
            case "wizard":
                return "src\\View\\Images\\Wizard.png";
            default:
                return null;
        }//switch
    }//getClothes

    private static Boolean hasHat(String charClass) {
        switch (charClass.toLowerCase()) {
            case "druid":
            case "monk":
            case "rogue":
            case "sorcerer":
            case "wizard":
                return true;
            case "fighter":
            case "paladin":
            case "ranger":
            case "barbarian":
            case "bard":
            default:
                return false;
        }//switch
    }//hasHat

    private static String getHat(String charClass) {
        switch (charClass.toLowerCase()) {
            case "druid":
                return "src\\View\\Images\\Druid Hat.png";
            case "monk":
                return "src\\View\\Images\\Monk Hat.png";
            case "rogue":
                return "src\\View\\Images\\Rogue hat.png";
            case "sorcerer":
                return "src\\View\\Images\\Sorcerer Hat.png";
            case "wizard":
                return "src\\View\\Images\\Wizard Hat.png";
            default:
                return null;
        }//switch
    }//getHat

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getCharRace() {
        return charRace;
    }

    public void setCharRace(String charRace) {
        this.charRace = charRace;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public String getCharGender() {
        return charGender;
    }

    public void setCharGender(String charGender) {
        this.charGender = charGender;
    }

    public String getCharPalette() {
        return charPalette;
    }

    public int[] getPixels() {
        return pixels;
    }

    public void setCharPalette(String charPalette) {
        this.charPalette = charPalette;
    }

}//class

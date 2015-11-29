//Maia Ross created 11/25/15
package View;

import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.Graphics;
import java.awt.image.DataBufferInt;

public class CharacterImage {

    private String imageName, charRace, charClass, charGender, charPalette;
    private int[] pixels;

    public CharacterImage() {
    }

    public CharacterImage(String imageName, String charRace, String charClass, String charGender, String charPalette) {
        this.imageName = imageName;
        this.charRace = charRace;
        this.charClass = charClass;
        this.charGender = charGender;
        this.charPalette = charPalette;
    }

    public int[] drawImage() {

        try {

            //FIRST LOAD UP TORSO BASED ON PALETTE
            String torsoPath = getTorso(charPalette, charRace);
            if (torsoPath == null) {
                System.out.println("Invalid palette. Please input 'a', 'b', or 'c' for palette.");
                System.exit(2);
            }//if imagepath = null
            BufferedImage torso = ImageIO.read(new File(torsoPath));

            //CREATE FINAL IMAGE, GRAPHICS OBJECT
            BufferedImage image = new BufferedImage(torso.getWidth(), torso.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics g = image.getGraphics();

            g.drawImage(torso, 0, 0, null); //DRAW TORSO LAYER

            //LOAD UP CLOTHING BASED ON CLASS
            String clothesPath = getClothes(charClass);
            if (clothesPath == null) {
                System.out.println("Invalid class.");
                System.exit(3);
            }//if imagepath = null
            BufferedImage clothes = ImageIO.read(new File(clothesPath));

            g.drawImage(clothes, 0, 0, null); //DRAW CLOTHES LAYER

            //LOAD UP FACE IMAGE BASED ON GENDER RACE AND PALETTE
            String headPath = getHead(charRace, charGender, charPalette);
            if (headPath == null) {
                System.out.println("Invalid race. Use spaces between multiple words.");
                System.exit(4);
            }//if imagepath = null
            BufferedImage head = ImageIO.read(new File(headPath));

            g.drawImage(head, 0, 0, null); //DRAW HEAD LAYER

            //IF HAT IS TRUE LOAD UP HAT IMAGE
            if (hasHat(charClass)) {
                String hatPath = getHat(charClass);
                if (hatPath == null) {
                    System.out.println("Invalid class.");
                    System.exit(5);
                }//if imagepath = null
                BufferedImage hat = ImageIO.read(new File(hatPath));

                g.drawImage(hat, 0, 0, null); //DRAW HAT LAYER
            }//if hasHat

            //CREATE AND SAVE OUTPUT FILE AS <<actually ignore this>>
            //File outputfile = new File("Images\\Output\\"+imageName + ".png");
            //ImageIO.write(finalImage, "png", outputfile);
            
            //SAVE OUTPUT IMAGE AS INT ARRAY
            this.pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();

        } catch (IOException e) {
        }//catch
        return pixels;

    }//generateImage

    private static String getTorso(String palette, String charRace) {
        if ("half orc".equals(charRace.toLowerCase())) {
            return "Images\\Torsos\\torso orc.png";
        } else {
            switch (palette.toLowerCase()) {
                case "a":
                    return "Images\\Torsos\\torso a.png";
                case "b":
                    return "Images\\Torsos\\torso b.png";
                case "c":
                    return "Images\\Torsos\\torso c.png";
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
                            return "Images\\Heads\\Dwarf (m) (A).png";
                        case "elf":
                            return "Images\\Heads\\Elf (m) (A).png";
                        case "gnome":
                            return "Images\\Heads\\Gnome (m) (A).png";
                        case "half elf":
                            return "Images\\Heads\\Half Elf (m) (A).png";
                        case "halfling":
                            return "Images\\Heads\\Halfling (m) (A).png";
                        case "half orc":
                            return "Images\\Heads\\Half Orc (m).png";
                        case "human":
                            return "Images\\Heads\\Human (m) (A).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "b":
                    //gender = m  palette = b                    
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "Images\\Heads\\Dwarf (m) (B).png";
                        case "elf":
                            return "Images\\Heads\\Elf (m) (B).png";
                        case "gnome":
                            return "Images\\Heads\\Gnome (m) (B).png";
                        case "half elf":
                            return "Images\\Heads\\Half Elf (m) (B).png";
                        case "halfling":
                            return "Images\\Heads\\Halfling (m) (B).png";
                        case "half orc":
                            return "Images\\Heads\\Half Orc (m).png";
                        case "human":
                            return "Images\\Heads\\Human (m) (B).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "c":
                    //gender = m  palette = c
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "Images\\Heads\\warf (m) (C).png";
                        case "elf":
                            return "Images\\Heads\\Elf (m) (C).png";
                        case "gnome":
                            return "Images\\Heads\\Gnome (m) (C).png";
                        case "half elf":
                            return "Images\\Heads\\Half Elf (m) (C).png";
                        case "halfling":
                            return "Images\\Heads\\Halfling (m) (C).png";
                        case "half orc":
                            return "Images\\Heads\\Half Orc (m).png";
                        case "human":
                            return "Images\\Heads\\Human (m) (C).png";
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
                            return "Images\\Heads\\Dwarf (f) (A).png";
                        case "elf":
                            return "Images\\Heads\\Elf (f) (A).png";
                        case "gnome":
                            return "Images\\Heads\\Gnome (f) (A).png";
                        case "half elf":
                            return "Images\\Heads\\Half Elf (f) (A).png";
                        case "halfling":
                            return "Images\\Heads\\Halfling (f) (A).png";
                        case "half orc":
                            return "Images\\Heads\\Half Orc (f).png";
                        case "human":
                            return "Images\\Heads\\Human (f) (A).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "b":
                    //gender = f  palette = a                     
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "Images\\Heads\\Dwarf (f) (B).png";
                        case "elf":
                            return "Images\\Heads\\Elf (f) (B).png";
                        case "gnome":
                            return "Images\\Heads\\Gnome (f) (B).png";
                        case "half elf":
                            return "Images\\Heads\\Half Elf (f) (B).png";
                        case "halfling":
                            return "Images\\Heads\\Halfling (f) (B).png";
                        case "half orc":
                            return "Images\\Heads\\Half Orc (f).png";
                        case "human":
                            return "Images\\Heads\\Human (f) (B).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "c":
                    //gender = f  palette = a                     
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "Images\\Heads\\Dwarf (f) (C).png";
                        case "elf":
                            return "Images\\Heads\\Elf (f) (C).png";
                        case "gnome":
                            return "Images\\Heads\\Gnome (f) (C).png";
                        case "half elf":
                            return "Images\\Heads\\Half Elf (f) (C).png";
                        case "halfling":
                            return "Images\\Heads\\Halfling (f) (C).png";
                        case "half orc":
                            return "Images\\Heads\\Half Orc (f).png";
                        case "human":
                            return "Images\\Heads\\Human (f) (C).png";
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
                return "Images\\Clothes\\Barbarian.png";
            case "bard":
                return "Images\\Clothes\\Bard.png";
            case "druid":
                return "Images\\Clothes\\Druid.png";
            case "fighter":
                return "Images\\Clothes\\Fighter.png";
            case "monk":
                return "Images\\Clothes\\Monk.png";
            case "paladin":
                return "Images\\Clothes\\Paladin.png";
            case "ranger":
                return "Images\\Clothes\\ranger.png";
            case "rogue":
                return "Images\\Clothes\\Rogue.png";
            case "sorcerer":
                return "Images\\Clothes\\Sorcerer.png";
            case "wizard":
                return "Images\\Clothes\\Wizard.png";
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
                return "Images\\Hats\\Druid Hat.png";
            case "monk":
                return "Images\\Hats\\Monk Hat.png";
            case "rogue":
                return "Images\\Hats\\Rogue hat.png";
            case "sorcerer":
                return "Images\\Hats\\Sorcerer Hat.png";
            case "wizard":
                return "Images\\Hats\\Wizard Hat.png";
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

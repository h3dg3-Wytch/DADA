//Maia Ross created 11/25/15
package View;

import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.Graphics;

public class CharacterImage {

    public static void generateImage(String imageName, String charRace, String charClass, String gender, String palette) {

        if (!"m".equals(gender.toLowerCase()) || !"f".equals(gender.toLowerCase())) {
            System.out.println("Invalid gender. Please input 'm' or 'f' for gender.");
            System.exit(1);
        }//if

        try {
            
            //FIRST LOAD UP TORSO BASED ON PALETTE
            String torsoPath = getTorso(palette);
            if (torsoPath == null) {
                System.out.println("Invalid palette. Please input 'a', 'b', or 'c' for palette.");
                System.exit(2);
            }//if imagepath = null
            BufferedImage torso = ImageIO.read(new File(torsoPath));
            
            //CREATE FINAL IMAGE, GRAPHICS OBJECT
            BufferedImage finalImage = new BufferedImage(torso.getWidth(), torso.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics g = finalImage.getGraphics();
            
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
            String headPath = getHead(charRace, gender, palette);
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
            
            //CREATE AND SAVE OUTPUT FILE
            File outputfile = new File(imageName+".png");
            ImageIO.write(finalImage, "png", outputfile);


        } catch (IOException e) {
        }//catch

    }//generateImage

    private static String getTorso(String palette) {
        switch (palette.toLowerCase()) {
            case "a":
                return "src\\Images\\Torso Base (A).png";
            case "b":
                return "src\\Images\\Torso Base (B).png";
            case "c":
                return "src\\Images\\Torso Base (C).png";
            case "orc":
                return "src\\Images\\Orc Torso Base.png";
            default:
                return null;
        }
    }//getTorso

    private static String getHead(String race, String gender, String palette) {
        if ("m".equals(gender.toLowerCase())) {
            switch (palette.toLowerCase()) {
                case "a":
                    //gender = m  palette = a
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "src\\Images\\Dwarf (m) (A).png";
                        case "elf":
                            return "src\\Images\\Elf (m) (A).png";
                        case "gnome":
                            return "src\\Images\\Gnome (m) (A).png";
                        case "half elf":
                            return "src\\Images\\Half Elf (m) (A).png";
                        case "halfling":
                            return "src\\Images\\Halfling (m) (A).png";
                        case "half orc":
                            return "src\\Images\\Half Orc (m) (A).png";
                        case "human":
                            return "src\\Images\\Human (m) (A).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "b":
                    //gender = m  palette = b                    
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "src\\Images\\Dwarf (m) (B).png";
                        case "elf":
                            return "src\\Images\\Elf (m) (B).png";
                        case "gnome":
                            return "src\\Images\\Gnome (m) (B).png";
                        case "half elf":
                            return "src\\Images\\Half Elf (m) (B).png";
                        case "halfling":
                            return "src\\Images\\Halfling (m) (B).png";
                        case "half orc":
                            return "src\\Images\\Half Orc (m) (B).png";
                        case "human":
                            return "src\\Images\\Human (m) (B).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "c":
                    //gender = m  palette = c
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "src\\Images\\Dwarf (m) (C).png";
                        case "elf":
                            return "src\\Images\\Elf (m) (C).png";
                        case "gnome":
                            return "src\\Images\\Gnome (m) (C).png";
                        case "half elf":
                            return "src\\Images\\Half Elf (m) (C).png";
                        case "halfling":
                            return "src\\Images\\Halfling (m) (C).png";
                        case "half orc":
                            return "src\\Images\\Half Orc (m) (C).png";
                        case "human":
                            return "src\\Images\\Human (m) (C).png";
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
                            return "src\\Images\\Dwarf (f) (A).png";
                        case "elf":
                            return "src\\Images\\Elf (f) (A).png";
                        case "gnome":
                            return "src\\Images\\Gnome (f) (A).png";
                        case "half elf":
                            return "src\\Images\\Half Elf (f) (A).png";
                        case "halfling":
                            return "src\\Images\\Halfling (f) (A).png";
                        case "half orc":
                            return "src\\Images\\Half Orc (f) (A).png";
                        case "human":
                            return "src\\Images\\Human (f) (A).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "b":
                    //gender = f  palette = a                     
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "src\\Images\\Dwarf (f) (B).png";
                        case "elf":
                            return "src\\Images\\Elf (f) (B).png";
                        case "gnome":
                            return "src\\Images\\Gnome (f) (B).png";
                        case "half elf":
                            return "src\\Images\\Half Elf (f) (B).png";
                        case "halfling":
                            return "src\\Images\\Halfling (f) (B).png";
                        case "half orc":
                            return "src\\Images\\Half Orc (f) (B).png";
                        case "human":
                            return "src\\Images\\Human (f) (B).png";
                        default:
                            return null;
                    }//switch (race.toLowerCase())

                case "c":
                    //gender = f  palette = a                     
                    switch (race.toLowerCase()) {
                        case "dwarf":
                            return "src\\Images\\Dwarf (f) (C).png";
                        case "elf":
                            return "src\\Images\\Elf (f) (C).png";
                        case "gnome":
                            return "src\\Images\\Gnome (f) (C).png";
                        case "half elf":
                            return "src\\Images\\Half Elf (f) (C).png";
                        case "halfling":
                            return "src\\Images\\Halfling (f) (C).png";
                        case "half orc":
                            return "src\\Images\\Half Orc (f) (C).png";
                        case "human":
                            return "src\\Images\\Human (f) (C).png";
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
                return "src\\Images\\Barbarian.png";
            case "bard":
                return "src\\Images\\Bard.png";
            case "druid":
                return "src\\Images\\Druid.png";
            case "fighter":
                return "src\\Images\\Fighter.png";
            case "monk":
                return "src\\Images\\Monk.png";
            case "paladin":
                return "src\\Images\\Paladin.png";
            case "ranger":
                return "src\\Images\\ranger.png";
            case "rogue":
                return "src\\Images\\Rogue.png";
            case "sorcerer":
                return "src\\Images\\Sorcerer.png";
            case "wizard":
                return "src\\Images\\Wizard.png";
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
                return "src\\Images\\Druid Hat.png";
            case "monk":
                return "src\\Images\\Monk Hat.png";
            case "rogue":
                return "src\\Images\\Rogue hat.png";
            case "sorcerer":
                return "src\\Images\\Sorcerer Hat.png";
            case "wizard":
                return "src\\Images\\Wizard Hat.png";
            default:
                return null;
        }//switch
    }//getHat

}//class

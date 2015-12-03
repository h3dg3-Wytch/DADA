//Maia Ross created 11/25/15 //////
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
import View.Images.ImageLoader;
import java.net.URL;

public class CharacterImage implements Serializable {

    private String imageName, charRace, charClass, charGender, charPalette;
    private int width = 288;
    private int height = 288;
    private int[] pixels;
    private BufferedImage image = new BufferedImage(288, 288, BufferedImage.TYPE_INT_RGB);
    private URL path;

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
            path = getTorso(charPalette, charRace);
            if (path == null) {
                //    System.out.println("Invalid palette. Please input 'a', 'b', or 'c' for palette.");
                System.exit(2);
            }//if imagepath = null
            BufferedImage torso = ImageIO.read(path);

            //CREATE FINAL IMAGE, GRAPHICS OBJECT
            Graphics g = image.getGraphics();

            g.drawImage(torso, 0, 0, null); //DRAW TORSO LAYER

            //LOAD UP CLOTHING BASED ON CLASS
            path = getClothes(charClass);
            if (path == null) {
                //    System.out.println("Invalid class.");
                System.exit(3);
            }//if imagepath = null
            BufferedImage clothes = ImageIO.read(path);

            g.drawImage(clothes, 0, 0, null); //DRAW CLOTHES LAYER

            //LOAD UP FACE IMAGE BASED ON GENDER RACE AND PALETTE
            path = getHead(charRace, charGender, charPalette);
            if (path == null) {
                //System.out.println("Invalid race. Use spaces between multiple words.");
                System.exit(4);
            }//if imagepath = null
            BufferedImage head = ImageIO.read(path);

            g.drawImage(head, 0, 0, null); //DRAW HEAD LAYER

            //IF HAT IS TRUE LOAD UP HAT IMAGE
            if (hasHat(charClass)) {
                path = getHat(charClass);
                if (path == null) {
                    //        System.out.println("Invalid class.");
                    System.exit(5);
                }//if imagepath = null
                BufferedImage hat = ImageIO.read(path);

                g.drawImage(hat, 0, 0, null); //DRAW HAT LAYER
            }//if hasHat

        } catch (IOException e) {
            return null;
        }//catch
        return image;

    }//drawImage

    public void drawImage() {
        try {
            File outputfile = new File("src\\View\\Images\\temp.png");
            ImageIO.write(image, "png", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(CharacterImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static URL getTorso(String palette, String charRace) {
        String path = null;
        if ("half orc".equals(charRace.toLowerCase())) {
            path = "torso orc.png";
        } else {
            switch (palette.toLowerCase()) {
                case "a":
                    path = "torso a.png";
                    break;
                case "b":
                    path = "torso b.png";
                    break;
                case "c":
                    path = "torso c.png";
                    break;
                default:
                    break;
            }//switch
        }//else
        return ImageLoader.loadImage(path);
    }//getTorso

    private static URL getHead(String race, String gender, String palette) {
        String path = null;
        if ("m".equals(gender.toLowerCase())) {
                switch (palette.toLowerCase()) {
                    case "a":
                        //gender = m  palette = a
                        switch (race.toLowerCase()) {
                            case "dwarf":
                                path = "Dwarf (m) (A).png";
                                break;
                            case "elf":
                                path = "Elf (m) (A).png";
                                break;
                            case "gnome":
                                path = "Gnome (m) (A).png";
                                break;
                            case "half elf":
                                path = "Half Elf (m) (A).png";
                                break;
                            case "halfling":
                                path = "Halfling (m) (A).png";
                                break;
                            case "half orc":
                                path = "Half Orc (m).png";
                                break;
                            case "human":
                                path = "Human (m) (A).png";
                                break;
                            default:
                                 break;
                        }//switch (race.toLowerCase())
                    break;
                    case "b":
                        //gender = m  palette = b
                        switch (race.toLowerCase()) {
                            case "dwarf":
                                path = "Dwarf (m) (B).png";
                                break;
                            case "elf":
                                path = "Elf (m) (B).png";
                                break;
                            case "gnome":
                                path = "Gnome (m) (B).png";
                                break;
                            case "half elf":
                                path = "Half Elf (m) (B).png";
                                break;
                            case "halfling":
                                path = "Halfling (m) (B).png";
                                break;
                            case "half orc":
                                path = "Half Orc (m).png";
                                break;
                            case "human":
                                path = "Human (m) (B).png";
                                break;
                            default:
                        }//switch (race.toLowerCase())
                    break;
                    case "c":
                        //gender = m  palette = c
                        switch (race.toLowerCase()) {
                            case "dwarf":
                                path = "Dwarf (m) (C).png";
                                break;
                            case "elf":
                                path = "Elf (m) (C).png";
                                break;
                            case "gnome":
                                path = "Gnome (m) (C).png";
                                break;
                            case "half elf":
                                path = "Half Elf (m) (C).png";
                                break;
                            case "halfling":
                                path = "Halfling (m) (C).png";
                                break;
                            case "half orc":
                                path = "Half Orc (m).png";
                                break;
                            case "human":
                                path = "Human (m) (C).png";
                                break;
                            default:
                                break;
                        }//switch (race.toLowerCase())
                    
                }
        }else{
                switch (palette.toLowerCase()) {
                    case "a":
                        //gender = f  palette = a
                        switch (race.toLowerCase()) {
                            case "dwarf":
                                path =  "Dwarf (f) (A).png";
                                break;
                            case "elf":
                                path =  "Elf (f) (A).png";
                                break;
                            case "gnome":
                                path =  "Gnome (f) (A).png";
                                break;
                            case "half elf":
                                path =  "Half Elf (f) (A).png";
                                break;
                            case "halfling":
                                path =  "Halfling (f) (A).png";
                                break;
                            case "half orc":
                                path =  "Half Orc (f).png";
                                break;
                            case "human":
                                path =  "Human (f) (A).png";
                                break;
                            default:
                                break;
                        }//switch (race.toLowerCase())
                    break;
                    case "b":
                        //gender = m  palette = b
                        switch (race.toLowerCase()) {
                            case "dwarf":
                                path = "Dwarf (f) (B).png";
                                break;
                            case "elf":
                                path = "Elf (f) (B).png";
                                break;
                            case "gnome":
                                path = "Gnome (f) (B).png";
                                break;
                            case "half elf":
                                path = "Half Elf (f) (B).png";
                                break;
                            case "halfling":
                                path = "Halfling (f) (B).png";
                                break;
                            case "half orc":
                                path = "Half Orc (f).png";
                                break;
                            case "human":
                                path = "Human (f) (B).png";
                                break;
                            default:
                        }//switch (race.toLowerCase())
                    break;
                    case "c":
                        //gender = f  palette = a
                        switch (race.toLowerCase()) {
                            case "dwarf":
                                path =  "Dwarf (f) (C).png";
                                break;
                            case "elf":
                                path =  "Elf (f) (C).png";
                                break;
                            case "gnome":
                                path =  "Gnome (f) (C).png";
                                break;
                            case "half elf":
                                path =  "Half Elf (f) (C).png";
                                break;
                            case "halfling":
                                path =  "Halfling (f) (C).png";
                                break;
                            case "half orc":
                                path =  "Half Orc (f).png";
                                break;
                            case "human":
                                path =  "Human (f) (C).png";
                                break;
                            default:
                                break;
                        }//switch (race.toLowerCase())
                    default:
                        break;
                }//switch (palette.toLowerCase()) 
        }
        return ImageLoader.loadImage(path);
    }//getHead

    private static URL getClothes(String charClass) {
        String path = null;
        switch (charClass.toLowerCase()) {
            case "barbarian":
                path =  "Barbarian.png";
                break;
            case "bard":
                path =  "Bard.png";
                break;
            case "druid":
                path =  "Druid.png";
                break;
            case "fighter":
                path =  "Fighter.png";
                break;
            case "monk":
                path =  "Monk.png";
                break;
            case "paladin":
                path =  "Paladin.png";
                break;
            case "ranger":
                path =  "ranger.png";
                break;
            case "rogue":
                path =  "Rogue.png";
                break;
            case "sorcerer":
                path =  "Sorcerer.png";
                break;
            case "wizard":
                path =  "Wizard.png";
                break;
            default:
                break;
        }//switch
        return ImageLoader.loadImage(path);
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

    private static URL getHat(String charClass) {
        String path = null;
        switch (charClass.toLowerCase()) {
            case "druid":
                path =  "Druid Hat.png";
                break;
            case "monk":
                path =  "Monk Hat.png";
                break;
            case "rogue":
                path =  "Rogue hat.png";
                break;
            case "sorcerer":
                path =  "Sorcerer Hat.png";
                break;
            case "wizard":
                path =  "Wizard Hat.png";
                break;
            default:
                break;
        }//switch
        return ImageLoader.loadImage(path);
    }//getHat
    
    public void setPixels() {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        
        pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
    }

    public BufferedImage drawPixels() {
        WritableRaster raster = (WritableRaster) image.getRaster();
        raster.setPixels(0, 0, width, height, pixels);
        image.setData(raster);
        return image;
    }

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


import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dagger
 */
public class Properties {
    private Color bgColor = Color.BLACK;
    private Color borderColor = Color.WHITE;
    private Color textColor=Color.CYAN;
    private Font font;
    private int borderSize = 5;
   
     
    public Color getBgColor() {
        return bgColor;
    }

    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }
    
    
    public Properties() {
        String filename="font_file.ttf";
        
        try
        {
            font = Font.createFont(Font.TRUETYPE_FONT, new File(filename));
            font = font.deriveFont(Font.BOLD,96);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
        }catch(Exception exception){
            exception.printStackTrace();
            font = new Font("AnjaliOldLipi",Font.PLAIN,48);
        }
    }

    public Properties(Color bgColor, Color borderColor, Color textColor, Font font) {
        this.bgColor = bgColor;
        this.borderColor = borderColor;
        this.textColor = textColor;
        this.font = font;
    }
    public String getStyleName(){
        int style = font.getStyle();
        if(style == Font.PLAIN){
            return "Plain";
        }
        else if(style == Font.ITALIC){
            return "Italic";
        }
        else if(style == Font.BOLD){
            return "Bold";
        }
        else if(style == Font.BOLD + Font.ITALIC){
            return "Bold Italic";
        }
        else{
            return "Unknown";
        }
    }
    
    
}

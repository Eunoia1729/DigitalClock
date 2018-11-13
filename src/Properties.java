
import java.awt.Color;
import java.awt.Font;

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
    private Color textColor=Color.MAGENTA;
    private Font font = new Font("AnjaliOldLipi",Font.BOLD,48);

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

    public Properties() {
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

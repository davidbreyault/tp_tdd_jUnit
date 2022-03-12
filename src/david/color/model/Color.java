package david.color.model;

import java.util.regex.Pattern;

public class Color {

    private int red;
    private int green;
    private int blue;
    private String hexadecimal;

    private final String HEXA_WEBCOLOR_PATTERN = "^#[A-F0-9]{6}$";
    private final Pattern pattern = Pattern.compile(HEXA_WEBCOLOR_PATTERN);

    // ##################################################################################################
    // CONSTRUCTORS
    // ##################################################################################################

    public Color(int red, int green, int blue) {
        if ((red < 0 || red > 255) || (green < 0 || green > 255) || (blue < 0 || blue > 255)) {
            throw new IllegalArgumentException();
        } else {
            this.red = red;
            this.green = green;
            this.blue = blue;
            this.hexadecimal = String.format("#%02X%02X%02X", red, green, blue);
        }
    }

    public Color(String hexadecimal) {
        if (hexadecimal == null || !pattern.matcher(hexadecimal).matches()) {
            throw new IllegalArgumentException();
        } else {
            this.hexadecimal = hexadecimal;
            this.red = Integer.valueOf( hexadecimal.substring( 1, 3 ), 16 );
            this.green = Integer.valueOf( hexadecimal.substring( 3, 5 ), 16 );
            this.blue = Integer.valueOf( hexadecimal.substring( 5, 7 ), 16 );
        }
    }

    // ##################################################################################################
    // GETTERS
    // ##################################################################################################

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

    public String getHexValue() {
        return this.hexadecimal;
    }

    // ##################################################################################################
    // SETTERS
    // ##################################################################################################

    public void setRed(int rgbRed) {
        if (rgbRed < 0 || rgbRed > 255) {
            throw new IllegalArgumentException();
        } else {
            this.red = rgbRed;
        }
    }

    public void setGreen(int rgbGreen) {
        if (rgbGreen < 0 || rgbGreen > 255) {
            throw new IllegalArgumentException();
        } else {
            this.green = rgbGreen;
        }
    }

    public void setBlue(int rgbBlue) {
        if (rgbBlue < 0 || rgbBlue > 255) {
            throw new IllegalArgumentException();
        } else {
            this.blue = rgbBlue;
        }
    }

    public void setHexValue(String hexValue) {
        if (hexValue == null || !pattern.matcher(hexValue).matches()) {
            throw new IllegalArgumentException();
        } else {
            this.hexadecimal = hexValue;
            this.red = Integer.valueOf( hexValue.substring( 1, 3 ), 16 );
            this.green = Integer.valueOf( hexValue.substring( 3, 5 ), 16 );
            this.blue = Integer.valueOf( hexValue.substring( 5, 7 ), 16 );
        }
    }

    // ##################################################################################################
    // OVERRIDE METHOD
    // ##################################################################################################

    @Override
    public String toString() {
        return "[value=#118AAE, r=17, g=138, b=174]";
    }
}

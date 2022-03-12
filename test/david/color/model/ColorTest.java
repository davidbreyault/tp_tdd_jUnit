package david.color.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {

    // #118AAE - rgb(17, 138, 174)
    private Color color;

    @BeforeEach
    void setUp() {
        this.color = new Color(17, 138, 174);
    }

    @AfterEach
    void tearDown() {
        this.color = null;
    }

    // ##################################################################################################
    // CONSTRUCTEUR RGB
    // ##################################################################################################

    @Test
    void test_rgb_constructor() {
        assertAll("L'objet Color n'est pas conforme",
            ()-> assertEquals(17, this.color.getRed()),
            ()-> assertEquals(138, this.color.getGreen()),
            ()-> assertEquals(174, this.color.getBlue()),
            ()-> assertEquals("#118AAE", this.color.getHexValue())
        );
    }

    @Test
    void test_rgb_constructor_red_value_less_than_0_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color(-3, 138, 174));
    }

    @Test
    void test_rgb_constructor_red_value_more_than_255_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color(300, 138, 174));
    }

    @Test
    void test_rgb_constructor_green_value_less_than_0_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color(17, -10, 174));
    }

    @Test
    void test_rgb_constructor_green_value_more_than_255_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color(17, 256, 174));
    }

    @Test
    void test_rgb_constructor_blue_value_less_than_0_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color(17, 138, -1));
    }

    @Test
    void test_rgb_constructor_blue_value_more_than_255_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color(17, 138, 465));
    }

    // ##################################################################################################
    // CONSTRUCTEUR HEXADECIMAL
    // ##################################################################################################

    @Test
    void test_hexadecimal_constructor() {
        assertAll("L'object Color n'est pas conforme",
            ()-> assertEquals("#118AAE", this.color.getHexValue(), "getHexadecimal() est incorrect"),
            ()-> assertEquals(17, this.color.getRed(), "getRed() est incorrect"),
            ()-> assertEquals(138, this.color.getGreen(), "getGreen() est incorrect"),
            ()-> assertEquals(174, this.color.getBlue(), "getBlue() est incorrect")
        );
    }

    @Test
    void test_hexadecimal_constructor_with_null_value_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color(null));
    }

    @Test
    void text_hexadecimal_constructor_with_wrong_value_1_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color("118AAE"));
    }

    @Test
    void test_hexadecimal_constructor_with_wrong_value_2_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color("#118AAE2"));
    }

    @Test
    void test_hexadecimal_constructor_with_wrong_value_3_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color("#118AA"));
    }

    @Test
    void test_hexadecimal_constructor_with_wrong_value_4_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color("#118AAG"));
    }

    @Test
    void test_hexadecimal_constructor_with_wrong_value_5_exception() {
        assertThrows(IllegalArgumentException.class, ()-> new Color("#118aae"));
    }

    // ##################################################################################################
    // GETTERS
    // ##################################################################################################

    @Test
    void test_get_red_method() {
        assertAll("L'objet Color est non conforme",
            ()-> assertEquals(17, this.color.getRed(), "getRed() est incorrect"),
            ()-> assertEquals(138, this.color.getGreen(), "getGreen() est incorrect"),
            ()-> assertEquals(174, this.color.getBlue(), "getBlue() est incorrect"),
            ()-> assertEquals("#118AAE", this.color.getHexValue(), "getHexadecimal() est incorrect")
        );
    }

    @Test
    void test_get_green_method() {
        assertAll("L'objet Color est non conforme",
            ()-> assertEquals(138, this.color.getGreen(), "getGreen() est incorrect"),
            ()-> assertEquals(17, this.color.getRed(), "getRed() est incorrect"),
            ()-> assertEquals(174, this.color.getBlue(), "getBlue() est incorrect"),
            ()-> assertEquals("#118AAE", this.color.getHexValue(), "getHexadecimal() est incorrect")
        );
    }

    @Test
    void test_get_blue_method() {
        assertAll("L'objet Color est non conforme",
            ()-> assertEquals(174, this.color.getBlue(), "getBlue() est incorrect"),
            ()-> assertEquals(17, this.color.getRed(), "getRed() est incorrect"),
            ()-> assertEquals(138, this.color.getGreen(), "getGreen() est incorrect"),
            ()-> assertEquals("#118AAE", this.color.getHexValue(), "getHexadecimal() est incorrect")
        );
    }

    @Test
    void test_get_hex_value_method() {
        assertAll("L'objet Color est non conforme",
            ()-> assertEquals("#118AAE", this.color.getHexValue(), "getHexadecimal() est incorrect"),
            ()-> assertEquals(17, this.color.getRed(), "getRed() est incorrect"),
            ()-> assertEquals(138, this.color.getGreen(), "getGreen() est incorrect"),
            ()-> assertEquals(174, this.color.getBlue(), "getBlue() est incorrect")
        );
    }

    // ##################################################################################################
    // SETTERS
    // ##################################################################################################

    // RED

    @Test
    void test_set_red_method() {
        this.color.setRed(26);
        assertAll("L'objet Color est non conforme",
            ()-> assertEquals(26, this.color.getRed(), "getRed() est incorrect"),
            ()-> assertEquals(138, this.color.getGreen(), "getGreen() est incorrect"),
            ()-> assertEquals(174, this.color.getBlue(), "getBlue() est incorrect"),
            ()-> assertEquals("#118AAE", this.color.getHexValue(), "getHexadecimal() est incorrect")
        );
    }

    @Test
    void test_set_red_method_argument_less_than_0_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setRed(-2));
    }

    @Test
    void test_set_red_method_argument_more_than_255_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setRed(256));
    }

    // GREEN

    @Test
    void test_set_green_method() {
        this.color.setGreen(121);
        assertAll("L'objet Color est non conforme",
            ()-> assertEquals(121, this.color.getGreen(), "getGreen() est incorrect"),
            ()-> assertEquals(17, this.color.getRed(), "getRed() est incorrect"),
            ()-> assertEquals(174, this.color.getBlue(), "getBlue() est incorrect"),
            ()-> assertEquals("#118AAE", this.color.getHexValue(), "getHexadecimal() est incorrect")
        );
    }

    @Test
    void test_set_green_method_argument_less_than_0_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setGreen(-15));
    }

    @Test
    void test_set_green_method_argument_more_than_255_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setGreen(402));
    }

    // BLUE

    @Test
    void test_set_blue_method() {
        this.color.setBlue(204);
        assertAll("L'objet Color est non conforme",
            ()-> assertEquals(204, this.color.getBlue(), "getBlue() est incorrect"),
            ()-> assertEquals(17, this.color.getRed(), "getRed() est incorrect"),
            ()-> assertEquals(138, this.color.getGreen(), "getGreen() est incorrect"),
            ()-> assertEquals("#118AAE", this.color.getHexValue(), "getHexadecimal() est incorrect")
        );
    }

    @Test
    void test_set_blue_method_argument_less_than_0_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setBlue(-110));
    }

    @Test
    void test_set_blue_method_argument_more_than_255_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setBlue(411));
    }

    // HEXADECIMAL

    @Test
    void test_set_hex_value_method() {
        this.color.setHexValue("#AC4E11");
        assertAll("L'objet Color est non conforme",
            ()-> assertEquals("#AC4E11", this.color.getHexValue(), "getHexadecimal() est incorrect"),
            ()-> assertEquals(172, this.color.getRed(), "getRed() est incorrect"),
            ()-> assertEquals(78, this.color.getGreen(), "getGreen() est incorrect"),
            ()-> assertEquals(17, this.color.getBlue(), "getBlue() est incorrect")
        );
    }

    @Test
    void test_set_hex_value_method_with_null_argument_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setHexValue(null));
    }

    @Test
    void test_set_hex_value_method_with_wrong_value_1_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setHexValue("118AAE"));
    }

    @Test
    void test_set_hex_value_method_with_wrong_value_2_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setHexValue("#118AAE2"));
    }

    @Test
    void test_set_hex_value_method_with_wrong_value_3_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setHexValue("#118AA"));
    }

    @Test
    void test_set_hex_value_method_with_wrong_value_4_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setHexValue("#118AAG"));
    }

    @Test
    void test_set_hex_value_method_with_wrong_value_5_exception() {
        assertThrows(IllegalArgumentException.class, ()-> this.color.setHexValue("#118aae"));
    }

    // ##################################################################################################
    // OVERRIDE METHOD
    // ##################################################################################################

    @Test
    void test_to_string_is_not_null() {
        assertNotNull(this.color.toString(), "toString() est null");
    }

    @Test
    void test_to_string_method() {
        assertEquals("[value=#118AAE, r=17, g=138, b=174]", this.color.toString(), "toString() est incorrect");
    }
}
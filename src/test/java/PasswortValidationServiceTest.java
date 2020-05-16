import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PasswortValidationServiceTest {
    @Test
    public void iflengthiskorrect() {
// GIVEN
        String input = "123456";
// WHEN
        String result = PasswortValidationService.hasMinLenght(input);
// THEN
        assertEquals("Passwortlänge korrekt", result);

}
    @Test
    public void iflengthisnotkorrect() {
// GIVEN
        String input = "1234";
// WHEN
        String result = PasswortValidationService.hasMinLenght(input);
// THEN
        assertEquals("Passwortlänge inkorrekt", result);

    }

    @Test
    public void ifcontainnumber() {
// GIVEN
        String input = "abcd4";
// WHEN
        String result = PasswortValidationService.hasNumber(input);
// THEN
        assertEquals("Zahl enthalten", result);

    }

    @Test
    public void ifnotcontainnumber() {
// GIVEN
        String input = "abcdef";
// WHEN
        String result = PasswortValidationService.hasNumber(input);
// THEN
        assertEquals("Zahl nicht enthalten", result);

    }

    @Test
    public void ifcontainlowercase() {
// GIVEN
        String input = "abcdef";
// WHEN
        String result = PasswortValidationService.hasLowerCase(input);
// THEN
        assertEquals("kleiner Buchstabe enthalten", result);

    }

    @Test
    public void ifnotcontainlowercase() {
// GIVEN
        String input = "ABCDE";
// WHEN
        String result = PasswortValidationService.hasLowerCase(input);
// THEN
        assertEquals("kleiner Buchstabe nicht enthalten", result);

    }

    @Test
    public void ifcontainuppercase() {
// GIVEN
        String input = "ABCDE";
// WHEN
        String result = PasswortValidationService.hasUpperCase(input);
// THEN
        assertEquals("großer Buchstabe enthalten", result);

    }

    @Test
    public void ifnotcontainuppercase() {
// GIVEN
        String input = "abcde";
// WHEN
        String result = PasswortValidationService.hasUpperCase(input);
// THEN
        assertEquals("großer Buchstabe nicht enthalten", result);

    }
}
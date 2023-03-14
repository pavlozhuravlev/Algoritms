import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {
    @Test
    void testIsValidUkrainianPhoneNumber() {
        String validPhoneNumber = "(+380)50-333-33-33";
        String invalidPhoneNumber = "(+380)50-333-33-333";

        assertEquals(true, Main.isValidUkrainianPhoneNumber(validPhoneNumber));
        assertEquals(false, Main.isValidUkrainianPhoneNumber(invalidPhoneNumber));
    }

    @Test
    void testRemoveExtraSpaces() {
        String input = "Я хочу  бути     програмістом";
        String expectedOutput = "Я хочу бути програмістом";

        assertEquals(expectedOutput, Main.removeExtraSpaces(input));
    }

    @Test
    void testRemoveHtmlTags() {
        String html = "<div>\n" +
                "<p>Символы круглых скобок <code>'('</code> и <code>')'</code>. Эти символы\n" +
                "позволяют получить из искомой строки дополнительную информацию.\n" +
                "<br/>Обычно, если парсер регулярных выражений ищет в тексте информацию\n" +
                "по заданному выражению и находит ее - он просто возвращает\n" +
                "найденную строку.</p>\n" +
                "<p align=\"right\">А вот тут <a href=\"google.com\">ссылка</a>, чтоб жизнь медом не казалась.</p>\n" +
                "</div>";
        String expectedOutput = "\n" + "Символы круглых скобок '(' и ')'. Эти символы\n" + "позволяют получить из искомой строки дополнительную информацию.\n"
                + "Обычно, если парсер регулярных выражений ищет в тексте информацию\n" + "по заданному выражению и находит ее - он просто возвращает\n"
                + "найденную строку.\n" + "А вот тут ссылка, чтоб жизнь медом не казалась.\n" + "";


        assertEquals(expectedOutput, Main.removeHtmlTags(html));
    }
}

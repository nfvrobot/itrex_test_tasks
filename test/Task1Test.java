import static org.junit.Assert.assertEquals;

import com.chernyavsky.itrex.task1.Task1;
import org.junit.Test;

public class Task1Test {

    @Test
    public void stringModifierTest() {
        String actual = Task1.stringModifier("cacao and coffee", "cacao and coffee");
        assertEquals("kakao and kofi", actual);
    }

    @Test
    public void replaceCharCTest() {
        String actual = Task1.replaceCharC("success");
        assertEquals("suksess", actual);
    }

    @Test
    public void removeDoubleCharTest() {
        String actual = Task1.removeDoubleChar("coffee");
        assertEquals("cofi", actual);
    }

    @Test
    public void removeLastCharETest() {
        String actual = Task1.removeLastCharE("the");
        assertEquals("th", actual);
    }

    @Test
    public void deleteArticlesTest() {
        String actual = Task1.deleteArticles("The table", "Th tabl");
        assertEquals("tabl", actual);
    }
}

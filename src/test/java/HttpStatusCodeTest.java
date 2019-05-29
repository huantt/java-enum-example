import com.huantt.enumexample.HttpStatusCodde;
import org.junit.Test;

/**
 * @author huantt on 2019-05-29
 */
public class HttpStatusCodeTest {
    @Test
    public void testGetFieldValue() {
        HttpStatusCodde statusCode = HttpStatusCodde.OK;
        assert statusCode.getCode() == 200;
        assert statusCode.getText().equals("Ok");
    }

    @Test
    public void testOverrideMethod() {
        final HttpStatusCodde statusCode = HttpStatusCodde.OK;
        assert statusCode.toString().equals(statusCode.getCode() + ": " + statusCode.getText());
    }

}

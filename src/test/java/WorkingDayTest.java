import com.huantt.enumexample.WorkingDay;
import org.junit.Test;

/**
 * @author huantt on 2019-05-29
 */
public class WorkingDayTest {

    @Test
    public void testGetStringValue() {
        String stringValue = WorkingDay.MONDAY.toString();
        assert stringValue.equals("MONDAY");
    }

    /**
     * Can not pass the value that isn't value of WorkingDay into this function
     * For example: WorkingDaySpeaker.speakWorkingDay("SUNDAY")
     */
    @Test
    public void testPassEnumAsParameter() {
        assert WorkingDaySpeaker.speakWorkingDay(WorkingDay.MONDAY).equals("Today is " + WorkingDay.MONDAY.toString());
    }

    private static class WorkingDaySpeaker {
        static String speakWorkingDay(final WorkingDay workingDay) {
            return "Today is " + workingDay.toString();
        }

    }
}

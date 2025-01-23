import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    private Driver driver;

    @BeforeEach
    public void setUp() {
        driver = new Driver("John", 20);
    }

    @Test
    public void isAdult_for_adult_should_succeed() {
        assertThat(driver.estAdulte()).isTrue();
    }

    @Test
    public void isAdult_for_nonAdult_should_Fail() {
        assertThat(driver.estAdulte()).isFalse();
    }

}

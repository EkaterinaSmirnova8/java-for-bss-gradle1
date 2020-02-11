package ru.tsystems.msp.qa.selenium;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BaseSeleniumTest {
    @Test
    public void testSum() {
        int x = 2;
        int result = x + x * x;
        // assertThat("Summ is not workin properly", result,is(20));
        assertThat("Summ is not workin properly",
                result,
                anyOf(greaterThan(10), is(6)));
    }
}

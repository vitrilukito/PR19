package stepDef;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static helper.Utility.quitDriver;
import static helper.Utility.startDriver;

public class Hooks {

    @BeforeAll
    public static void setUp(){
    }

    @AfterAll
    public static void tearDown(){
    }

    @Before
    public void beforeTest(){
        startDriver();
    }

    @After
    public void afterTest() throws InterruptedException{
        Thread.sleep(3000);
        quitDriver();
    }
}


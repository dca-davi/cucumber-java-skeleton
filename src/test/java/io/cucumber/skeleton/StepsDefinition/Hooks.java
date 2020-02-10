package io.cucumber.skeleton.StepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Hooks {

    Random rand = new Random();
    BaseClassStep test = new BaseClassStep();
    private Integer cenario;
    private ArrayList result;

    @Before
    public void beforeScenario(Scenario scenario) throws Exception {
        cenario = test.getCountTest();
        System.out.println("Before Scenario " + cenario + "\n");
    }

    @After
    public void afterScenario(Scenario scenario) throws InterruptedException, IOException {
        result = test.addItem(scenario.getSourceTagNames().iterator().next(), scenario.getStatus());
        System.out.println("After Scenario " + result + "\n");
    }

}

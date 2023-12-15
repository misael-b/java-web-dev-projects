package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CarTest {
    Car test_car;

    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {

        assertEquals(10, test_car.getGasTankLevel(), .001);
    }



    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testTankLevelAfterDriving(){
        test_car.drive(500);
        assertEquals(0, test_car.getGasTankLevel(),0.001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void gasTankLevelAfterDrivingPastTankRange(){
        test_car.drive(5000);
        assertEquals(0, test_car.getGasTankLevel(),0.001);
        assertEquals(500, test_car.getOdometer(), 0.001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test
    public void testGasTankSize(){

        assertTrue(test_car.getGasTankSize() >= test_car.getGasTankLevel());
    }
}
package fr.imt.coffee.machine.component;

import fr.imt.cours.coffee.storage.cupboard.coffee.type.CoffeeType;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BeanTankTest {

    /**
     * Test permettant de vérifier le fonctionnement du choix du type de grain
     */
    @Test
    public void testBeanCoffeeType() {
        double initialVolume = 0, minVolume = 0, maxVolume = 0;
        CoffeeType coffeeType = CoffeeType.valueOf("ARABICA");

        BeanTank beanTank = new BeanTank(initialVolume, minVolume, maxVolume, coffeeType);
        beanTank.setBeanCoffeeType(coffeeType);

        Assertions.assertEquals(coffeeType, beanTank.getBeanCoffeeType());
    }
}

/*
 * CommonPackage
 *
 * Copyright (c) 2021
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.common;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class RandomGaussianTest {

    @Test
    public void testGetGaussian() {
        RandomGaussian gaussian = new RandomGaussian(7,2,2,12);
        Map<Integer, Integer> valueCount = new HashMap<Integer, Integer>();
        for (int idx = 1; idx <= 1000; ++idx) {
            int val = (int) gaussian.getGaussian();
            valueCount.merge(val, 1, Integer::sum);
        }
        System.out.println(valueCount);

        for (int key = 2; key <= 12; key++) {
            assert valueCount.containsKey(key);
        }
    }

    @Test
    public void testGetGaussian1() {
        Map<Integer, Integer> valueCount = new HashMap<Integer, Integer>();
        for (int idx = 1; idx <= 1000; ++idx) {
            int val = RandomGaussian.getRandom(2, 12);
            valueCount.merge(val, 1, Integer::sum);
        }
        System.out.println(valueCount);

        for (int key = 2; key <= 12; key++) {
            assert valueCount.containsKey(key);
        }
    }
}
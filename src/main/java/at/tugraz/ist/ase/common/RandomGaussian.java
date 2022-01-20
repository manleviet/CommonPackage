/*
 * CommonPackage
 *
 * Copyright (c) 2021-2022
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.common;

import java.util.Random;

/**
 * Generate pseudo-random floating point values, with an approximately Gaussian
 * (normal) distribution.
 */
@Deprecated
public final class RandomGaussian {
    double mean;
    double variance;
    int min;
    int max;
    private final Random fRandom = new Random();

    /**
     * Creates a random number
     * @param mean mean
     * @param variance variance of distribution
     * @param min minbound
     * @param max maxbound
     */
    public RandomGaussian(double mean, double variance, int min, int max) {
        this.mean = mean;
        this.variance = variance;
        this.min = min;
        this.max = max;
    }

    /**
     * Gets an integer-converted value
     * @return a random value
     */
    public double getGaussian() {
        double value = this.mean + fRandom.nextGaussian() * this.variance;
        int result = (int)Math.round(value);
        if (result < min) result = min;
        if (result > max) result = max;
        return result;
    }

    public static int getRandom(int min, int max) {
        double mean = min + (double)(max - min) / 2;
        double variance = Math.min(2.0, (double)(max - min) / 3);
        RandomGaussian r = new RandomGaussian(mean, variance, min, max);

        return (int)r.getGaussian();
    }
}

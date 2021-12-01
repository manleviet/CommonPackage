/*
 * CommonPackage
 *
 * Copyright (c) 2021
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.common;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * Random stuff for projects
 *
 * This random uses a seed to generate the same sequence of random numbers.
 * This lets us make all randomness in the project predictable,
 * if desired, for when we run unit tests, which should be repeatable.
 */
@Slf4j
public final class RandomUtils {

    @Getter
    private static long SEED = 141982;

    private static final Random random;

    static {
        random = new Random(SEED);

        log.info("Random object created with the seed {}", SEED);
    }

    public static void setSeed(long seed) {
        SEED = seed;
        random.setSeed(SEED);

        log.info("Random object has been reset with the seed {}", SEED);
    }

    public static int getRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public static int getRandomInt(int bound, int offset) {
        return random.nextInt(bound) + offset;
    }

    public static double getRandomDouble(double bound) {
        return random.nextDouble() * bound;
    }

    public static double getRandomDouble(double bound, double offset) {
        return random.nextDouble() * bound + offset;
    }

    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }
}
/*
 * CommonPackage
 *
 * Copyright (c) 2021
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.common;

import lombok.experimental.UtilityClass;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.variables.Variable;

import java.util.Arrays;
import java.util.List;

@UtilityClass
public class ChocoSolverUtils {

    /**
     * Get a variable with the given name.
     * @param model a Choco model
     * @param name the name of the variable
     * @return a {@link Variable} with the given name, or null if no such variable exists
     */
    public Variable getVariable(Model model, String name) {
        for (Variable v : model.getVars()) {
            if (v.getName().equals(name)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No variable with name " + name + " exists");
    }

    /**
     * Print all constraints of a Choco model to the console
     *
     * @param model - a Choco model
     */
    public void printConstraintsWithNoFormat(Model model) {
        List<Constraint> ac = Arrays.asList(model.getCstrs());
        ac.forEach(System.out::println);
    }
}

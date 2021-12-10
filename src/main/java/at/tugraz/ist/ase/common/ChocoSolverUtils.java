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
import org.chocosolver.solver.variables.Variable;

@UtilityClass
public class ChocoSolverUtils {

    /**
     * Get a variable with the given name.
     * @param model a Choco model
     * @param name the name of the variable
     * @return a {@link Variable} with the given name, or null if no such variable exists
     */
    private Variable getVariable(Model model, String name) {
        for (Variable v : model.getVars()) {
            if (v.getName().equals(name)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No variable with name " + name + " exists");
    }
}

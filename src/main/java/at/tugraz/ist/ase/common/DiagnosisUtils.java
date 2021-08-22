/*
 * CommonPackage
 *
 * Copyright (c) 2021
 *
 *  @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.common;

import org.chocosolver.solver.constraints.Constraint;

import java.util.List;
import java.util.Set;

public class DiagnosisUtils {
    /**
    * Print diagnoses to the console
    *
    * @param diagnoses - a list of set of constraints
    */
    public static void printDiagnoses(List<Set<Constraint>> diagnoses) {
        int count = 0;
        for (Set<Constraint> diag : diagnoses) {
            count++;
            System.out.println("Diagnosis " + count + ":");
            diag.forEach(System.out::println);
        }
    }
}

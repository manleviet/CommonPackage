///*
// * CommonPackage
// *
// * Copyright (c) 2021
// *
// * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
// */
//
//package at.tugraz.ist.ase.common;
//
//import lombok.NonNull;
//import lombok.experimental.UtilityClass;
//
//import java.util.List;
//import java.util.Set;
//
//@UtilityClass
//public final class ConstraintUtils {
////    /**
////    * Print diagnoses to the console
////    *
////    * @param diagnoses - a list of set of constraints
////    */
////    public void printDiagnoses(@NonNull List<Set<Constraint>> diagnoses) {
////        int count = 0;
////        for (Set<Constraint> diag : diagnoses) {
////            count++;
////            System.out.println("Diagnosis " + count + ":");
////            diag.forEach(System.out::println);
////        }
////    }
//
//    public String convertToString(@NonNull Set<String> ac) {
//        return String.join("\n", ac);
//    }
//
//    public String convertToStringWithMessage(@NonNull List<Set<String>> allDiag, @NonNull String mess) {
//        StringBuilder sb = new StringBuilder();
//        int count = 0;
//        for (Set<String> diag : allDiag) {
//            count++;
//            sb.append(mess).append(" ").append(count).append(":\n");
////            System.out.println(mess + " " + count + ":");
//            sb.append(String.join("\n", diag));
////            diag.forEach(System.out::println);
//        }
//        return sb.toString();
//    }
//}

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
//import java.util.List;
//
//public class StringUtils {
//    /**
//     * Replaces special characters (e.g. space, -) by underscore characters.
//     *
//     * @param st - a string needed to replace
//     * @return a new string in which the special characters are replaced
//     */
//    public static String replaceSpecialCharactersByUnderscore(String st) {
//        return st.replaceAll("[^a-zA-Z0-9]", "_");
//    }
//
//    // TODO: test with FeatureModelPackage
//    /**
//     * Converts an array to a string with a given separator.
//     *
//     * @param array - an array of strings
//     * @param separator - a separator
//     * @return a new string includes all strings in the array which is separated by the given separator.
//     */
//    public static String createStringFromArrayWithSeparator(List<String> array, String separator) {
//
//        StringBuilder str = new StringBuilder();
//        for (String s: array) {
//            if (separator.equals("+") || separator.equals("*1+") || separator.equals(" or ")) {
//                s = replaceSpecialCharactersByUnderscore(s);
//                str.append(String.format("%s%s", s, separator));
//            } else if (separator.equals("\n")) {
//                str.append(String.format("\t[%s]%s", s, separator));
//            } else {
//                str.append(String.format("%s%s ", s, separator));
//            }
//        }
//        // delete several residual words in the postfix of the string
//        String s = "";
//        if (separator.equals("+")) {
//            s = str.substring(0, str.length() - 1);
//        } else if (separator.equals("*1+")) {
//            s = str.substring(0, str.length() - 3);
//        } else if (separator.equals(" or ")) {
//            s = str.substring(0, str.length() - 4);
//        } else if (separator.equals("\n")) {
//            s = str.substring(0, str.length() - 1);
//        } else {
//            s = str.substring(0, str.length() - 2);
//        }
//        return s;
//    }
//}

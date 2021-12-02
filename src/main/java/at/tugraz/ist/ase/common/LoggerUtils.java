/*
 * CommonPackage
 *
 * Copyright (c) 2021
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.common;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LoggerUtils {
    @Getter
    public String tab = "";

    public void indent() {
        tab += "\t";
    }

    public void outdent() {
        if (tab.length() > 0) {
            tab = tab.substring(0, tab.length() - 1);
        }
    }
}

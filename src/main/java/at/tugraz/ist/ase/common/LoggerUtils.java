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
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
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

    public void logMethodInfoWithSession(String nameMethod, String sessionId, int timeout, String requestUri) {
        log.debug("[{}] - sessionId: {}, timeout: {}, request: {}", nameMethod, sessionId, timeout, requestUri);
    }
}

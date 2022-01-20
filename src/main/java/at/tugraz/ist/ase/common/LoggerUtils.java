/*
 * CommonPackage
 *
 * Copyright (c) 2021-2022
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.common;

import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class LoggerUtils {
    @Getter
    public String tab = "";

    public void indent() {
        tab += "   ";
    }

    public void outdent() {
        if (tab.length() > 0) {
            tab = tab.substring(0, tab.length() - 3);
        }
    }

    public void logMethodInfoWithSession(@NonNull String nameMethod, @NonNull String sessionId, int timeout, @NonNull String requestUri) {
        log.debug("{}[method={}] - sessionId={}, timeout={}, request={}", tab, nameMethod, sessionId, timeout, requestUri);
    }
}

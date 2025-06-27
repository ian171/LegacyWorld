package net.chen.util.exceptions;

import net.chen.LegacyWorld;

public class GuiRenderException extends RuntimeException {
    public GuiRenderException(String message) {
        LegacyWorld.LOGGER.error(message);
    }
    public GuiRenderException(String message, Throwable cause) {
        LegacyWorld.LOGGER.error(message, cause);
    }
}

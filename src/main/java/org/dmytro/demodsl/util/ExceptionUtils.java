package org.dmytro.demodsl.util;

import java.util.function.Supplier;

public class ExceptionUtils {

    private ExceptionUtils() {}

    public static Supplier<IllegalArgumentException> illegalArgumentSupplier(String message) {
        return () -> illegalArgument(message);
    }

    public static IllegalArgumentException illegalArgument(String message) {
        return new IllegalArgumentException(message);
    }
}

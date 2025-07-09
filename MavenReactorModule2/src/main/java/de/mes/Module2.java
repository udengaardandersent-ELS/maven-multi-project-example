package de.mes;

import java.util.function.Supplier;

public class Module2 implements Supplier<String> {

    protected static final String MODULE_NAME = "module2";

    @Override
    public String get() {
        return MODULE_NAME;
    }
}

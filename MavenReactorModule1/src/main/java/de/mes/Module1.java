package de.mes;

import java.util.Date;
import java.util.function.Supplier;

public class Module1 implements Supplier<String> {
    
    protected static final String MODULE_NAME = "module1";

    @Override
    public String get() {
        return MODULE_NAME;
    }

    /**
     * Build in intellij IDEA will fail on this warning.
     * However, this is a deprecation that should be suppressed given the options set in the ReactorCore module.
     */
    public void triggerCompileError() {
        new Date(0, 10, 10);
    }
}

/*
 * The MIT License
 *
 * Copyright 2014 Markus Eschenbach.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package de.mes;

import java.util.Date;
import java.util.function.Supplier;

/**
 *
 * @author esche
 */
public class Module1 implements Supplier<String> {
    
    protected static final String MODULE_NAME = "module1";

    @Override
    public String get() {
        return MODULE_NAME;
    }

    /**
     * Build with in intellij IDEA will fail on this warning. However this is a deprecation that should be supressed given the options set in the ReactorCore module.
     */
    public void triggerCompileError() {
        new Date(0, 10, 10);
    }
}

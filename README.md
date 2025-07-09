# IntelliJ IDEA Maven Multi-Module Build Error Reproduction

This repository is created to reproduce a specific build error encountered in IntelliJ IDEA when working with a multi-module Maven project.

## Problem Description

When configuring `-Xlint` options from a **parent Maven project** in a multi-module setup, Maven itself builds the project correctly and honors the suppression of certain warnings as configured.

However, **IntelliJ IDEA does not behave as expected** in this scenario:

- IntelliJ provoke build errors on all warnings, including those that are explicitly suppressed via the `-Xlint` options.
- IntelliJ fails to suppress warnings like `-deprecation` and `-processing` which are configured to be ignored.
- This discrepancy causes confusion and false-positive error reporting inside the IDE, although Maven builds succeed.

## Example Configuration

The problematic configuration is typically defined in the parent `pom.xml` like this:

```xml
<properties>
    <!-- treat warnings as errors as default -->
    <fail.on.warnings.args>-Werror</fail.on.warnings.args>
    <!-- deprecations and annotation processing are suppressed -->
    <xlint.args>-Xlint:all,-deprecation,-processing</xlint.args>

    <!-- specify the encoding once per entire project -->
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
</properties>

<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <configuration>
        <showWarnings>true</showWarnings>
        <compilerArgs>
            <args>${fail.on.warnings.args}</args>
            <args>${xlint.args}</args>
        </compilerArgs>
    </configuration>
</plugin>

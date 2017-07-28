# Simple language plugin

It is a plugin for a simple language that consists of definitions with expressions. Expressions consists of variables, numeric constants and `+` operator.

Sample file:
```
five = 5

twelve = five + 2 + five

```

File extension is `.simple`

## What for?

This repository was created to illustrate the problems with references in a IntelliJ language plugins.

When you create a class for your references, you need to extend `PsiReferenceBase` (`SimpleReference` in this plugin).
When you call the base constructor like that:
```java
super(element, TextRange.allOf(element.getText()));
```
...then the navigation (Ctrl + Click) works fine, but `PsiNamedElement`'s features (e.g. rename refactoring) stops working.
When the base constructor is called like that:
```java
super(element, element.getTextRange());
```
...then it's the opposite: navigation does not work and `PsiNamedElement`'s features are callable.

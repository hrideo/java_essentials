/*
Sealed classes: grants inheritance permission to a specific list of classes
-Every permitted subclass must already exist and must explicitly extend the sealed class
-Every permitted subclass is required to declare itself as sealed, non-sealed, or final

e.g.
public sealed class Shape permits Rectangle, Circle {}

public sealed class Rectangle extends Shape permits Square {}

public non-sealed class Circle extends Shape {}

public final class Square extends Rectangle {}
 */
package inheritance;

public class Docs {
}

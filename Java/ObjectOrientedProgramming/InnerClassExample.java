class OuterClass {

    private int outterfield = 10;

    public void outerMethod() {
        System.out.println("This is the outer method.");
    }

    class InnerClass {
        public void innerMethod() {
            System.out.println("This is the inner method.");
            System.out.println("Accessing outer class field: " + outterfield);
            outerMethod(); // Accessing outer class method
        }
    }

    static class StaticInnerClass {
        public void staticInnerMethod() {
            System.out.println("This is the static inner method.");
            // Cannot access non-static members of outer class
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod(); // Calling method of outer class
        OuterClass.InnerClass inner = outer.new InnerClass(); // Creating instance of inner class
        inner.innerMethod(); // Calling method of inner class

        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass(); // Creating instance of static inner class
        staticInner.staticInnerMethod(); // Calling method of static inner class
    }
}
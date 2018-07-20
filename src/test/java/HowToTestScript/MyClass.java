package HowToTestScript;

    public class MyClass {

        private static int x = 2;   // Static variables are initialized only once, at the start of the program execution. These variables should be initialized first, before the initialization of any instance variables.
        private int y = 3;          // None static variable, Object specific and are known as instance variables

        private static void myMethod1() {       // Static method
            System.out.println("Executing static myMethod1");
        }

        private void myMethod2() {              // None static method

            x = 88;                             // We can assign a value to x from anywhere it's a static variable and no need an object to access it

            y = 66;                             // From a none static method we can access none static variables,
            System.out.println("Executing static myMethod2");                                    // this will access the variable of the corresponding object that is used to call this method
        }

        public static void main(String[] args) {        // Main method so we can directly execute this class from JVM

            x = 8;

            System.out.println("Print x static variable : " + x );   // We can access x static variable directly from a static method

            //y = 3;     <-- This won't work, we can't directly access a none static variable from a static method like main

            myMethod1();

            MyClass.myMethod1();

            // myMethod2(); <-- This won't work, we can't directly access a none static method from a static method like main and that's why we create objects,like below.

            MyClass a = new MyClass();

            a.y = 12;
            a.x = 13;

            a.myMethod2(); //   Now this works

            MyClass.x = 55;

            System.out.println("Value of y in object a is : " + a.y);
            System.out.println("Value of x in object a is : " + a.x);

            MyClass b = new MyClass();

            b.y = 22;

            System.out.println();
            System.out.println("Value of y in object b is : " + b.y);
            System.out.println("Value of x in object b is : " + b.x);
        }


    }
}

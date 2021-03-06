package Inheritance;

class Base2 { 
    public static void show() { 
       System.out.println("Base::show() called"); 
    } 
} 
   
class Derived2 extends Base2 { 
    public static void show() { 
       System.out.println("Derived::show() called"); 
    } 
} 
   
class Test2 { 
    public static void main(String[] args) { 
        Base2 b = new Derived2();; 
        b.show(); 
    } 
} 

 class A {
    static int i = 10;
    
   static class B{
        public void m(){
            System.out.println(i);
        }
    }
}

class X{
    
    public static void main(String[] args) {
        A a = new A();
        
        System.out.println(A.i);
        A.B b = new A.B();
    }
    
}

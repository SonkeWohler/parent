package me.parent.jModule;

public class AccessScala{
    public static void main(String[] args){
        WithinModule within = new WithinModule();
        // -- this is like a static variable
        System.out.println(WithinModule.string);
        // -- this is like an instance variable
        System.out.println(within.string);
        // -- this is a getter, as it should be in Java
        System.out.println(within.getString());
    }
}
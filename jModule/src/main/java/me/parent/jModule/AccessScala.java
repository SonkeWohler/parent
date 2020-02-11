package me.parent.jModule;

import me.parent.jModule.WithinModule;

public class AccessScala {
    public static void main(String[] args) {
        WithinModule within = new WithinModule();
        // -- this is like a static variable, but Scala doesn't allow that
        // System.out.println(WithinModule.string());
        // -- this is the auto-generated getter
        System.out.println(within.string());
        // -- this getter was manually added
        System.out.println(within.getString());
    }
}

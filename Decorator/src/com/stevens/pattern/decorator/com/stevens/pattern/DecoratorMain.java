package com.stevens.pattern.decorator.com.stevens.pattern;

/**
 * Created by stevens on 2016/12/5.
 */
public class DecoratorMain {

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();

    }
}

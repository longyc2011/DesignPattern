package com.stevens.pattern.decorator.com.stevens.pattern;

/**
 * Created by stevens on 2016/12/5.
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体的装饰对象A");
    }
}

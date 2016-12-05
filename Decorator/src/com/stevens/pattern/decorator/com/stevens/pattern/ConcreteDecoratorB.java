package com.stevens.pattern.decorator.com.stevens.pattern;

/**
 * Created by stevens on 2016/12/5.
 */
public class ConcreteDecoratorB extends Decorator {


    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体的装饰对象B");
    }

    private void addBehavior() {
    }

}

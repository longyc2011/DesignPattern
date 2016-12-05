package com.stevens.pattern.decorator.com.stevens.pattern;

/**
 * Created by stevens on 2016/12/5.
 */
public class ConcreteComponent implements Component  {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}

package com.stevens.pattern.decorator.com.stevens.pattern;

/**
 * Created by stevens on 2016/12/5.
 */
public class Decorator implements Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {

        if (component != null) {
            component.operation();
        }
    }
}

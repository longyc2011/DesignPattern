package com.stevens.pattern.decorator;

public abstract class Finery extends Person{
	
	protected Person component;
	
	public void Decorate(Person component) {
		this.component = component;
	}
	
	public void Show() {
		if (component != null) {
			component.Show();
		}
	}

}

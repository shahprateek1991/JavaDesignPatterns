package com.patterns.abstractfactory;

/**
 * 
 * @author prateekshah
 * Factory for Mac platforms
 */
public class MacWidgetFactory implements WidgetFactory {

	@Override
	public void createWindow() {
		Window macWindow = new MacOSXWindow();
		macWindow.setTitle("Photoshop");

	}

}

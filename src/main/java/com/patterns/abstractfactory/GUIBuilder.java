package com.patterns.abstractfactory;
/**
 * 
 * @author prateekshah
 * Client code to make products
 */
public class GUIBuilder {
	
	public static void buildWindow(WidgetFactory widgetFactory) {
		widgetFactory.createWindow();
	}

}

package com.patterns.abstractfactory;

/**
 * 
 * @author prateekshah
 * Factory for the MS products
 */
public class MSWidgetFactory implements WidgetFactory {

	@Override
	public void createWindow() {
		Window msWindow = new MSWindow();
		msWindow.setTitle("Eclipse");

	}

}

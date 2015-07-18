package org.vaadin.addon.leaflet.demoandtestapp.util;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import org.vaadin.addonhelpers.TServer;

@Theme("valo")
@Widgetset("org.vaadin.addon.leaflet.demoandtestapp.TestWidgetset")
public class UiRunner extends TServer {

	/**
     * Starts and embedded server for the tests
	 */
	public static void main(String[] args) throws Exception {
        new UiRunner().startServer();
	}
}

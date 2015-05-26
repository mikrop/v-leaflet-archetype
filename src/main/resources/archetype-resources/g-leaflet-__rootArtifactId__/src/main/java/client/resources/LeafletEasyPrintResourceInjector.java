#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.resources;

import com.google.gwt.core.client.GWT;
import org.peimari.gleaflet.client.resources.LeafletResourceInjector;

public class LeafletEasyPrintResourceInjector {

	protected static LeafletEasyPrintClientBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			LeafletResourceInjector.ensureInjected();
			bundle = GWT.create(LeafletEasyPrintClientBundle.class);
			LeafletEasyPrintResourceInjector injector = GWT.create(LeafletEasyPrintResourceInjector.class);
			injector.injectResources();
		}
	}
	
	/**
	 * Override this with deferred binding to customize injected stuff
	 */
	protected void injectResources() {
		bundle.css().ensureInjected();
		injectScript(bundle.jquery().getText());
		injectScript(bundle.script().getText());
	}

	private static native void injectScript(String script)
	/*-{
	    ${symbol_dollar}wnd.eval(script);
	}-*/;

}

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.client.resources;

import com.google.gwt.core.client.GWT;
import org.peimari.gleaflet.client.resources.LeafletResourceInjector;

public class Leaflet${capitalizeRootArtifactId}ResourceInjector {

	protected static Leaflet${capitalizeRootArtifactId}ClientBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			LeafletResourceInjector.ensureInjected();
			bundle = GWT.create(Leaflet${capitalizeRootArtifactId}ClientBundle.class);
			Leaflet${capitalizeRootArtifactId}ResourceInjector injector = GWT.create(Leaflet${capitalizeRootArtifactId}ResourceInjector.class);
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

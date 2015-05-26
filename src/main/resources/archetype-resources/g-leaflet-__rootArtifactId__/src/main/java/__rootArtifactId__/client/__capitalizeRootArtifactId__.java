#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.client;

import org.peimari.gleaflet.client.control.Control;
import ${package}.${rootArtifactId}.client.resources.Leaflet${capitalizeRootArtifactId}ResourceInjector;

public class ${capitalizeRootArtifactId} extends Control {

	static {
        Leaflet${capitalizeRootArtifactId}ResourceInjector.ensureInjected();
	}

	protected ${capitalizeRootArtifactId}() {}
	
	public static native ${capitalizeRootArtifactId} create()
	/*-{
        return new ${symbol_dollar}wnd.L.easyPrint();
	}-*/;

}

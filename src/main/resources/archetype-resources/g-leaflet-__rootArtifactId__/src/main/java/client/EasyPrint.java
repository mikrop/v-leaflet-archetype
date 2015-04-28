#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import org.peimari.gleaflet.client.control.Control;
import ${package}.client.resources.LeafletEasyPrintResourceInjector;

public class EasyPrint extends Control {

	static {
        LeafletEasyPrintResourceInjector.ensureInjected();
	}

	protected EasyPrint() {}
	
	public static native EasyPrint create()
	/*-{
        return new ${symbol_dollar}wnd.L.easyPrint();
	}-*/;

}

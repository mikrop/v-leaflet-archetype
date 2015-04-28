#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.TextResource;

public interface LeafletEasyPrintClientBundle extends ClientBundle {

    @Source("jquery-1.11.2.min.js")
    TextResource jquery();

    @Source("leaflet.${rootArtifactId}.js")
    @DoNotEmbed
    TextResource script();

    @Source("${rootArtifactId}.css")
    @CssResource.NotStrict
    CssResource css();

}

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.demoandtestapp;

import com.vaadin.ui.Component;
import ${package}.${rootArtifactId}.L${capitalizeRootArtifactId};
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.shared.ControlPosition;
import org.vaadin.addonhelpers.AbstractTest;

public class ${capitalizeRootArtifactId}Test extends AbstractTest {

    @Override
    public String getDescription() {
        return "Test ${rootArtifactId} control";
    }

    private LMap leafletMap;

    @Override
    public Component getTestComponent() {
        leafletMap = new LMap();
        leafletMap.setCenter(60.4525, 22.301);
        leafletMap.setZoomLevel(15);
        leafletMap.addBaseLayer(new LOpenStreetMapLayer(), "OSM");

        L${capitalizeRootArtifactId} control = new L${capitalizeRootArtifactId}();
        control.setPosition(ControlPosition.topleft);
//        control.setEnabled(false);
        leafletMap.addControl(control);

        return leafletMap;
    }

    @Override
    protected void setup() {
        super.setup();
    }

}

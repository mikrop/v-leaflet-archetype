#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.client;

import com.vaadin.shared.ui.Connect;
import org.vaadin.addon.leaflet.client.AbstractDefaultControl;
import ${package}.${rootArtifactId}.L${capitalizeRootArtifactId};
import ${package}.${rootArtifactId}.client.${capitalizeRootArtifactId};

@Connect(L${capitalizeRootArtifactId}.class)
public class Leaflet${capitalizeRootArtifactId}Connector extends AbstractDefaultControl {

    @Override
    protected ${capitalizeRootArtifactId} createControl() {
        ${capitalizeRootArtifactId} result = ${capitalizeRootArtifactId}.create();
        getMap().addControl(result);
        return result;
    }

    @Override
    protected ${capitalizeRootArtifactId} getControl() {
        return (${capitalizeRootArtifactId}) super.getControl();
    }

}
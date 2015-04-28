#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import com.vaadin.shared.ui.Connect;
import org.vaadin.addon.leaflet.client.AbstractDefaultControl;
import ${package}.LEasyPrint;
import ${package}.client.EasyPrint;

@Connect(LEasyPrint.class)
public class LeafletEasyPrintConnector extends AbstractDefaultControl {

    @Override
    protected EasyPrint createControl() {
        EasyPrint result = EasyPrint.create();
        getMap().addControl(result);
        return result;
    }

    @Override
    protected EasyPrint getControl() {
        return (EasyPrint) super.getControl();
    }

}
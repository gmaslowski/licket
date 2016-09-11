package org.licket.core.view;

import org.licket.core.id.CompositeId;
import org.licket.core.model.LicketModel;

/**
 * @author activey
 */
public interface LicketComponent<T> {
    LicketModel<T> getComponentModel();

    void setComponentModel(LicketModel<T> componentModel);

    void setComponentModelObject(T componentModelObject);

    void setParent(LicketComponent<?> parent);

    LicketComponent<?> findChild(CompositeId compositeId);

    LicketComponentView getComponentView();

    String getId();

    void initialize();
}
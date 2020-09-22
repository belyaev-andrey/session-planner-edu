package com.company.sessionplanner.web.screens.session;

import com.haulmont.cuba.gui.components.Form;
import com.haulmont.cuba.gui.components.HBoxLayout;
import com.haulmont.cuba.gui.screen.*;
import com.company.sessionplanner.entity.Session;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Slider;

import javax.inject.Inject;

@UiController("sessionplanner_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {

    private final Slider slider = new Slider();

    @Inject
    private HBoxLayout sliderBox;

    @Subscribe
    public void onInit(InitEvent event) {
        slider.setMin(0);
        slider.setMax(4);
        slider.setWidth("100%");

        slider.addValueChangeListener( valueChangedEvent -> {
            getEditedEntity().setDuration(valueChangedEvent.getValue().intValue());
        });

        sliderBox.unwrap(AbstractOrderedLayout.class).addComponent(slider);
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        slider.setValue(getEditedEntity().getDuration().doubleValue());
    }



    @Subscribe
    public void onInitEntity(InitEntityEvent<Session> event) {
        event.getEntity().setDuration(1);
    }
}

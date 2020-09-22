package com.company.sessionplanner.web.screens.session;

import com.haulmont.bali.util.ParamsMap;
import com.haulmont.cuba.gui.components.Form;
import com.haulmont.cuba.gui.components.HBoxLayout;
import com.haulmont.cuba.gui.screen.*;
import com.company.sessionplanner.entity.Session;
import com.haulmont.cuba.web.gui.components.JavaScriptComponent;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Slider;

import javax.inject.Inject;
import java.util.Map;

@UiController("sessionplanner_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {

    private final Slider slider = new Slider();

    @Inject
    private HBoxLayout sliderBox;

    @Inject
    private JavaScriptComponent descriptionEdit;

    @Subscribe
    public void onInit(InitEvent event) {
        initSlider();

        QuillOptions qopts = new QuillOptions();
        qopts.options = ParamsMap.of("theme", "snow", "placeholder", "");
        descriptionEdit.setState(qopts);

        descriptionEdit.addFunction("valueChanged", javaScriptCallbackEvent -> {
            String value = javaScriptCallbackEvent.getArguments().getString(0);
            getEditedEntity().setDescription(value);
        });

    }

    private void initSlider() {
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

        descriptionEdit.callFunction("setText", getEditedEntity().getDescription());

        slider.setValue(getEditedEntity().getDuration().doubleValue());
    }



    @Subscribe
    public void onInitEntity(InitEntityEvent<Session> event) {
        event.getEntity().setDuration(1);
    }

    class QuillOptions {
        public Map<String, Object> options;
    }

}

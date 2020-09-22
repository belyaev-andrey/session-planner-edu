package com.company.sessionplanner.web.screens.speaker;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;
import com.company.sessionplanner.entity.Speaker;
import com.haulmont.reports.gui.actions.EditorPrintFormAction;

import javax.inject.Inject;

@UiController("sessionplanner_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
@LoadDataBeforeShow
public class SpeakerEdit extends StandardEditor<Speaker> {

    @Inject
    private Button speakerReportBtn;

    @Subscribe
    public void onInit(InitEvent event) {
        speakerReportBtn.setAction(new EditorPrintFormAction(this, null));
    }


}
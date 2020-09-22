package com.company.sessionplanner.web.screens.speaker;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;
import com.company.sessionplanner.entity.Speaker;
import com.haulmont.reports.gui.actions.RunReportAction;

import javax.inject.Inject;

@UiController("sessionplanner_Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
@LoadDataBeforeShow
public class SpeakerBrowse extends StandardLookup<Speaker> {

    @Inject
    private Button showReports;

    @Subscribe
    public void onInit(InitEvent event) {
        showReports.setAction(new RunReportAction());
    }


}

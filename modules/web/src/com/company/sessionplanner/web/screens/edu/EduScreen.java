package com.company.sessionplanner.web.screens.edu;

import com.company.sessionplanner.entity.Speaker;
import com.company.sessionplanner.web.screens.speaker.SpeakerEdit;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Route;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.EditorScreenFacet;
import com.haulmont.cuba.gui.components.ScreenFacet;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.reports.entity.Report;
import com.haulmont.reports.gui.ReportGuiManager;

import javax.inject.Inject;

@UiController("sessionplanner_EduScreen")
@UiDescriptor("edu-screen.xml")
@LoadDataBeforeShow
public class EduScreen extends Screen {

    @Inject
    private EditorScreenFacet<Speaker, SpeakerEdit> speakerEditor;
    @Inject
    private DataGrid<Speaker> speakersTable;
    @Inject
    private ReportGuiManager reportGuiManager;
    @Inject
    private DataManager dataManager;

    @Subscribe("speakersTable.notificationAction")
    public void onSpeakersTableNotificationAction(Action.ActionPerformedEvent event) {
        speakerEditor.show();
    }

    @Install(to = "speakersTable.notificationAction", subject = "enabledRule")
    private boolean speakersTableNotificationActionEnabledRule() {
        return speakersTable.getSelected().size() > 0;
    }

    @Install(to = "speakerEditor", subject = "entityProvider")
    private Speaker speakerEditorEntityProvider() {
        return speakersTable.getSelected().stream().findFirst().get();
    }

    @Subscribe("speakerEditor")
    public void onSpeakerEditorAfterClose(ScreenFacet.AfterCloseEvent event) {

    }

    @Subscribe("speakersTable.runReport")
    public void onSpeakersTableRunReport(Action.ActionPerformedEvent event) {
        reportGuiManager.getAvailableReports(null, null, null)
                .stream().filter(r -> "ALL_SPEAKERS".equals(r.getCode()))
                .findFirst()
                .ifPresent(r -> {
                    Report report = dataManager.reload(r, "report.edit");
                    reportGuiManager.runReport(report, this);
                });
    }
}
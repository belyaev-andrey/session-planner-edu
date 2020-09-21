package com.company.sessionplanner.web.screens.session;

import com.company.sessionplanner.entity.Session;
import com.company.sessionplanner.service.SessionService;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.app.core.entitydiff.EntityDiffViewer;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Calendar;
import com.haulmont.cuba.gui.components.EditorScreenFacet;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;

@UiController("sessionplanner_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {

    @Inject
    private SessionService sessionService;

    @Inject
    private CollectionContainer<Session> sessionsDc;
    @Inject
    private EditorScreenFacet<Session, SessionEdit> sessionEditDialog;
    @Inject
    private EntityDiffViewer diffFrame;
    @Inject
    private GroupTable<Session> sessionsTable;

    @Subscribe("sessionsCalendar")
    private void onSessionsCalendarCalendarEventClick(Calendar.CalendarEventClickEvent<LocalDateTime> event) {
        sessionEditDialog.setEntityProvider(() -> (Session)event.getEntity());
        sessionEditDialog.show();
    }

    @Subscribe("sessionsCalendar")
    private void onSessionsCalendarCalendarEventMove(Calendar.CalendarEventMoveEvent<LocalDateTime> event) {
        Session session = sessionService.rescheduleSession((Session) event.getEntity(), event.getNewStart());
        sessionsDc.replaceItem(session);
    }

    @Subscribe("sessionsTable.showVersions")
    public void onSessionsTableShowVersions(Action.ActionPerformedEvent event) {
        Set<Session> selected = sessionsTable.getSelected();
        diffFrame.loadVersions(selected.stream().findAny().get());
    }

    @Install(to = "sessionsTable.showVersions", subject = "enabledRule")
    private boolean sessionsTableShowVersionsEnabledRule() {
        return (sessionsTable.getSelected()  != null) && (sessionsTable.getSelected().size() != 0);
    }



}

package com.company.sessionplanner.service;

import com.company.sessionplanner.entity.Session;
import com.haulmont.cuba.core.app.EmailerAPI;
import com.haulmont.cuba.core.global.EmailException;
import com.haulmont.cuba.core.global.EmailInfoBuilder;
import org.slf4j.Logger;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/*
@Profile("prod")
@Service(MailNotificationService.NAME)
*/
public class ProdMailNotificationServiceBean implements MailNotificationService {

    @Inject
    private Logger log;

    @Inject
    private EmailerAPI emailerAPI;

    @Override
    public void notifyAboutScheduleChange(Session session) {
        log.info("Production: Sending mail to: "+session.getSpeaker().getEmail());
        String caption = "Session schedule has changed!";
        String body = String.format("For session %s new time is: %s", session.getTopic(), session.getStartDate());
        try {
            emailerAPI.sendEmail(EmailInfoBuilder.create(session.getSpeaker().getEmail(), caption, body).build());
        } catch (EmailException e) {
            log.error(e.getMessage(), e);
        }
    }
}
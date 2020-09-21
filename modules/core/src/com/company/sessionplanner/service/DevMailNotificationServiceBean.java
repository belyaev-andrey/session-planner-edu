package com.company.sessionplanner.service;

import com.company.sessionplanner.entity.Session;
import org.slf4j.Logger;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/*
@Profile("dev")
@Service(MailNotificationService.NAME)
*/
public class DevMailNotificationServiceBean implements MailNotificationService {

    @Inject
    private Logger log;

    @Override
    public void notifyAboutScheduleChange(Session session) {
        log.info("Sending mail to: "+session.getSpeaker().getEmail());
    }
}
package com.company.sessionplanner.service;

import com.company.sessionplanner.entity.Session;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(MailNotificationService.NAME)
public class MailNotificationServiceBean implements MailNotificationService {

    @Inject
    private Logger log;

    @Override
    public void notifyAboutScheduleChange(Session session) {
        log.info("Sending mail to: "+session.getSpeaker().getEmail());
    }
}
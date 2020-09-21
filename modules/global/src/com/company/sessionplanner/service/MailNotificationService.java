package com.company.sessionplanner.service;

import com.company.sessionplanner.entity.Session;

public interface MailNotificationService {
    String NAME = "sessionplanner_MailNotificationService";

    void notifyAboutScheduleChange(Session session);

}
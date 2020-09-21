package com.company.sessionplanner.service;

import com.company.sessionplanner.entity.Session;

import java.time.LocalDateTime;
import java.util.List;

public interface SessionService {
    String NAME = "sessionplanner_SessionService";

    Session rescheduleSession(Session session, LocalDateTime newStartDate);

    List<Session> findSessionsBySpeaker(String speakerEmail);
}

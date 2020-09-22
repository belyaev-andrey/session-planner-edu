package com.company.sessionplanner.portal.rest;

import com.company.sessionplanner.entity.Session;
import com.company.sessionplanner.portal.model.SessionDto;
import com.company.sessionplanner.service.SessionService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class SessionsController {

    @Inject
    private SessionService sessionService;

    @GetMapping(value = "sessions/find", produces = "application/json", consumes = "application/json")
    public List<SessionDto> findSessionBySpeaker(@RequestParam("email") String speakerEmail) {
        List<Session> sessions = sessionService.findSessionsBySpeaker(speakerEmail);

        return sessions.stream()
                .map(s -> new SessionDto(s.getTopic(), s.getStartDate(), s.getDuration(), s.getDescription(), s.getId()))
                .collect(Collectors.toList());
    }


}

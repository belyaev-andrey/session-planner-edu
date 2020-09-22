package com.company.sessionplanner.portal.controllers;

import com.company.sessionplanner.entity.Session;
import com.company.sessionplanner.portal.model.SessionDto;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Controller
public class SessionsWebController {

    @Inject
    private DataManager dataManager;

    @GetMapping("sessionsBrowse")
    public String sessionsBrowse(Model model) {
        List<SessionDto> sessionDtos = dataManager.loadList(LoadContext.create(Session.class)).stream()
                .map(s -> new SessionDto(s.getTopic(), s.getStartDate(), s.getDuration(), s.getDescription(), s.getId()))
                .collect(Collectors.toList());
        model.addAttribute("sessions", sessionDtos);
        return "sessions";
    }

    @GetMapping("editSession")
    public String editSession(@RequestParam("id") String id, Model model) {
        Session s = dataManager.load(Session.class).id(UUID.fromString(id)).one();
        model.addAttribute("sessionDto",
                new SessionDto(s.getTopic(), s.getStartDate(), s.getDuration(), s.getDescription(), s.getId()));
        return "editSession";
    }

    @PostMapping("saveSession")
    public String saveSession(@ModelAttribute SessionDto session) {
        Session loaded = dataManager.load(Session.class).id(session.getId()).one();
        loaded.setTopic(session.getTopic());
        loaded.setDuration(session.getDuration());
        dataManager.commit(loaded);
        return "redirect:/sessionsBrowse";
    }

}

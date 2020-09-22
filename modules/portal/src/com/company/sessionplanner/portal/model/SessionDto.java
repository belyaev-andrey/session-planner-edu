package com.company.sessionplanner.portal.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class SessionDto {

    private String topic;

    private LocalDateTime startDate;

    private Integer duration;

    private String description;

    private UUID id;

    public SessionDto() {
    }

    public SessionDto(String topic, LocalDateTime startDate, Integer duration, String description, UUID id) {
        this.topic = topic;
        this.startDate = startDate;
        this.duration = duration;
        this.description = description;
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

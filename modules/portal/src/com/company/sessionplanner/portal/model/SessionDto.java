package com.company.sessionplanner.portal.model;

import java.time.LocalDateTime;

public class SessionDto {

    private String topic;

    private LocalDateTime startDate;

    private Integer duration;

    private String description;

    public SessionDto() {
    }

    public SessionDto(String topic, LocalDateTime startDate, Integer duration, String description) {
        this.topic = topic;
        this.startDate = startDate;
        this.duration = duration;
        this.description = description;
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

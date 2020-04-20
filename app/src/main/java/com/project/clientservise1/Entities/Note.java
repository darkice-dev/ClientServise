package com.project.clientservise1.Entities;

public class Note {
    private String serviceName;
    private String description;
    private String price;
    private String workTime;
    private String appTime;

    public Note(String serviceName, String description, String price, String workTime, String appTime) {
        this.serviceName = serviceName;
        this.description = description;
        this.price = price;
        this.workTime = workTime;
        this.appTime = appTime;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getAppTime() {
        return appTime;
    }

    public void setAppTime(String appTime) {
        this.appTime = appTime;
    }
}

package com.canvas.cheater.models.assignment_models;

public class ExternalToolTagAttributes {
    private String url;
    private boolean new_tab;
    private String resource_link_id;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isNew_tab() {
        return new_tab;
    }

    public void setNew_tab(boolean new_tab) {
        this.new_tab = new_tab;
    }

    public String getResource_link_id() {
        return resource_link_id;
    }

    public void setResource_link_id(String resource_link_id) {
        this.resource_link_id = resource_link_id;
    }
}

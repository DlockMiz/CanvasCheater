package com.canvas.cheater.models.course_models;

public class BlueprintRestrictionByObjectType {
    private BlueprintAssignment assignment;
    private BlueprintWikiPage wiki_page;

    public BlueprintAssignment getAssignment() {
        return assignment;
    }

    public void setAssignment(BlueprintAssignment assignment) {
        this.assignment = assignment;
    }

    public BlueprintWikiPage getWiki_page() {
        return wiki_page;
    }

    public void setWiki_page(BlueprintWikiPage wiki_page) {
        this.wiki_page = wiki_page;
    }
}

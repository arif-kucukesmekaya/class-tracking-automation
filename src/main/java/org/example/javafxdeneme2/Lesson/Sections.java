package org.example.javafxdeneme2.Lesson;

import java.util.List;

public class Sections {
    private List<Section> sections;

    public Sections(List<Section> sections){
        this.sections=sections;
    }

    public List<Section> getSections(){
        return sections;
    }

    public void setSections(List<Section> sections){
        this.sections=sections;
    }
}

package pl.mwrobel91.linksaver.model;

import pl.mwrobel91.linksaver.LinkState;

import java.util.Date;

public class LinkModel {

    // todo: add 'title' and 'note' field
    private String title;
    private Date date;
    private String link;
    private String note;
    private LinkState state;

    public LinkModel() {
    }

    public LinkModel(String title, Date date, String link, String note, LinkState state) {
        this.title = title;
        this.date = date;
        this.link = link;
        this.note = note;
        this.state = state;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LinkState getState() {
        return state;
    }

    public void setState(LinkState state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

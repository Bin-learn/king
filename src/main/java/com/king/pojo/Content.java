package com.king.pojo;

public class Content {
    private Integer id;

    private String username;

    private String label;

    private Byte isOpen;

    private String content;

    public Content(Integer id, String username, String label, Byte isOpen, String content) {
        this.id = id;
        this.username = username;
        this.label = label;
        this.isOpen = isOpen;
        this.content = content;
    }

    public Content() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Byte getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Byte isOpen) {
        this.isOpen = isOpen;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
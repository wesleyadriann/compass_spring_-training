package com.example.demo.dto;

public class ContactResponseDTO {
    private static final String msgTemplate = "Thank %s, for getting in touch and sharing your interests. We look forward to hearing from you soon.";
    public String msg;

    public void prepareMsg(String name) {
        this.msg = String.format(msgTemplate, name);
    }
}

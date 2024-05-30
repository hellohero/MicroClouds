package com.microclouddisks.functions;

public class queryIcon {

    public String iconQuery(String filetype) {

        if ("txt".equals(filetype)) {
            return "img/txt.jpg";
        } else if ("jpg".equals(filetype) || "png".equals(filetype) || "gif".equals(filetype)) {
            return "img/image.jpg";
        } else if ("zip".equals(filetype) || "rar".equals(filetype)) {
            return "img/zip.jpg";
        } else if ("doc".equals(filetype) || "docx".equals(filetype)) {
            return "img/word.jpg";
        } else if ("pdf".equals(filetype)) {
            return "img/pdf.jpg";
        } else if ("ppt".equals(filetype) || "pptx".equals(filetype)) {
            return "img/ppt.jpg";
        } else if ("mp3".equals(filetype) || "flac".equals(filetype) || "wav".equals(filetype)) {
            return "img/music.jpg";
        } else if ("xlsx".equals(filetype)) {
            return "img/excel.jpg";
        } else if ("mp4".equals(filetype) || "avi".equals(filetype) || "wmv".equals(filetype)) {
            return "img/video.jpg";
        } else {
            return "img/otherfiles.jpg";
        }
    }
}

package com.learn2crack.imageupload;

public class Response {

    private Data data;
    private boolean success;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Response{" +
                "data=" + data +
                ", success=" + success +
                '}';
    }
}

class Data {

    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Data{" +
                "image=" + image +
                '}';
    }
}

class Image {
    private String fileName;
    private String name;
    private String mime;
    private String extension;
    private String url;


    public String getFileName() {
        return fileName;
    }

    public String getName() {
        return name;
    }

    public String getMime() {
        return mime;
    }

    public String getExtension() {
        return extension;
    }

    public String getUrl() {
        return url;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "fileName='" + fileName + '\'' +
                ", name='" + name + '\'' +
                ", mime='" + mime + '\'' +
                ", extension='" + extension + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

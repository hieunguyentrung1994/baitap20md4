package ra.model;

import java.util.List;

public class Upload {
    private int id ;
    private String albumName;
    private List<String> videoAlbum;
    private String song;
    private String singe;
    private List<String> category;

    public Upload() {
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public List<String> getVideoAlbum() {
        return videoAlbum;
    }

    public void setVideoAlbum(List<String> videoAlbum) {
        this.videoAlbum = videoAlbum;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSinge() {
        return singe;
    }

    public void setSinge(String singe) {
        this.singe = singe;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public Upload(int id,String albumName, List<String> videoAlbum, String song, String singe, List<String> category) {
        this.id = id;
        this.albumName = albumName;
        this.videoAlbum = videoAlbum;
        this.song = song;
        this.singe = singe;
        this.category = category;
    }
}

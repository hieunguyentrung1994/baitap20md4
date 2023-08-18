package ra.sevice;

import ra.model.Upload;

import java.util.ArrayList;
import java.util.List;

public class UploadSevice implements IGenericService<Upload,Integer> {
    List<Upload> uploads = new ArrayList<>();
    @Override
    public List<Upload> findAll() {
        return uploads;
    }

    @Override
    public void save(Upload upload) {
        if (upload.getId() == 0){
            int id =getnewId();
            uploads.add(new Upload(id, upload.getAlbumName(), upload.getVideoAlbum(), upload.getSong(),upload.getSinge(), upload.getCategory()));
        }else{

        }
    }

    @Override
    public void delete(Integer integer) {
        Upload upload = findById(integer);
        uploads.remove(upload);
    }

    @Override
    public Upload findById(Integer integer) {
        for (Upload up: uploads) {
            if (up.getId() == integer){
                return up;
            }
        }
        return null;
    }
    public int getnewId(){
        int id =0;
        for (Upload up: uploads) {
            if (up.getId() > id){
                id = up.getId();
            }
        }
        return id+1;
    }
}

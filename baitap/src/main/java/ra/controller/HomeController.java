package ra.controller;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.model.Upload;
import ra.sevice.UploadSevice;

import javax.servlet.ServletException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
@PropertySource("classpath:upload.properties")
public class HomeController {
    protected UploadSevice uploadSevice;
    public void init() throws ServletException {
        uploadSevice= new UploadSevice();
    }
    @GetMapping({"/home", "/"})
    public String home(Model model){
        model.addAttribute("albuml", new Upload());
        List<String> catagory = new ArrayList<>();
        catagory.add("nhac tre");
        catagory.add("nhac vang");
        catagory.add("nhac do");
        catagory.add("nhac xanh");
        model.addAttribute("category",catagory );
        return "home";
    }
    @GetMapping("/hienthi")
    public String getHienthi(@ModelAttribute Upload albuml, Model model){
        model.addAttribute("album", uploadSevice.save(albuml));)
        return "hienthi";
    }


}

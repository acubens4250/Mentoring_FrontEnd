package kr.ac.mokwon.team_d.admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// 컴포넌트 스캔으로 컨트롤러 인식

// 의존관계 역전. 인스턴스가 스태틱처럼 됨(스프링에서)
public class AdminindexController {

    @GetMapping("/")
    public String adminIndex(Model model){

        model.addAttribute("title", "home :: title");
        model.addAttribute("content", "home ::content");

        return "layout/layout";
    }
}

package kr.ac.mokwon.team_d.front.board.controller;

import kr.ac.mokwon.team_d.front.board.service.impl.FrontBoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FrontBoardController {

    @Autowired
    private FrontBoardServiceImpl frontBoardServiceImpl;

    @GetMapping("/list")
    public String boardList(
            Model model
    ) {
        HashMap<String, Object> dataMap = new HashMap<>();
        Map<String, Object> resultMap = frontBoardServiceImpl.selectBoardListService(dataMap);
        model.addAttribute("result", resultMap);

        return "front/board/list";
    }

    @GetMapping("/board/list")
    public String frontBoardList(){

        return "front/board/list";
    }
}

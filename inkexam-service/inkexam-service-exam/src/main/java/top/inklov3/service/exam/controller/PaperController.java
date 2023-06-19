package top.inklov3.service.exam.controller;

import top.inklov3.common.core.domain.Response;
import top.inklov3.service.exam.domain.dto.PaperDto;
import top.inklov3.service.exam.domain.po.PaperInfo;
import top.inklov3.service.exam.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PaperController {

    @Autowired
    PaperService paperService;

    @PostMapping("/paper/make_paper")
    @ResponseBody
    public Response<Integer> uploadQuestionBank(@RequestBody PaperDto paperDto) {
        Integer lastInsertId = paperService.makerPaper(paperDto);
        return Response.ok(lastInsertId);
    }

    @GetMapping("/paper/get_paper_info")
    @ResponseBody
    public Response<PaperInfo> getPaperInfo(@RequestParam("paperId")Integer paperId){
        PaperInfo paperInfo = paperService.getPaperInfo(paperId);
        return Response.ok(paperInfo);
    }
}

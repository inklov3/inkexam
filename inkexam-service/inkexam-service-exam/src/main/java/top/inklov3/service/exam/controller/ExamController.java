package top.inklov3.service.exam.controller;

import top.inklov3.common.core.domain.Response;
import top.inklov3.service.exam.domain.dto.ExamDto;
import top.inklov3.service.exam.domain.po.Exam;
import top.inklov3.service.exam.domain.po.TestPaper;
import top.inklov3.service.exam.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ExamController {
    @Autowired
    ExamService examService;

    @PostMapping("/exam/execute_exam")
    @ResponseBody
    public Response<Integer> executeExam(@RequestBody ExamDto examDto) {
        return Response.ok(examService.executeExam(examDto));
    }

    @GetMapping("/exam/get_exam_list")
    @ResponseBody
    public Response<List<Exam>> getExamList() {
        return Response.ok(examService.getExamList());
    }

    @GetMapping("/exam/get_exam_paper")
    @ResponseBody
    public Response<List<TestPaper>> getExamPaper(@RequestParam("paperId")Integer paperId){
        return Response.ok(examService.getExamPaper(paperId));
    }
}

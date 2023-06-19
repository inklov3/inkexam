package top.inklov3.service.exam.controller;

import top.inklov3.common.core.domain.Response;
import top.inklov3.service.exam.domain.dto.QuestionBankDto;
import top.inklov3.service.exam.domain.po.QuestionBank;
import top.inklov3.service.exam.service.QuestionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class QuestionBankController {
    @Autowired
    QuestionBankService questionBankService;

    @PostMapping("/question_bank/upload_question_bank")
    @ResponseBody
    public Response<Integer> uploadQuestionBank(@RequestBody QuestionBankDto questionBankDTO) {
        Integer insertNumber = questionBankService.uploadQuestionBank(questionBankDTO);
        return Response.ok(insertNumber);
    }

    @GetMapping("/question_bank/get_question_bank_list")
    @ResponseBody
    public Response<List<QuestionBank>> getQuestionBankList(@RequestParam("tid") String tid) {
        return Response.ok(questionBankService.getQuestionBankList(tid));
    }

    @GetMapping("/question_bank/get_question_bank_info")
    @ResponseBody
    public Response<QuestionBankDto> getQuestionBankInfo(@RequestParam("tid") String tid, @RequestParam("title")String title) {
        return Response.ok(questionBankService.getQuestionBankInfo(tid, title));
    }
}

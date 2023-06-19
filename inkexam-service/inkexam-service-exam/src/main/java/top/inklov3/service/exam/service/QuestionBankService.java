package top.inklov3.service.exam.service;

import top.inklov3.service.exam.domain.dto.QuestionBankDto;
import top.inklov3.service.exam.domain.po.QuestionBank;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionBankService {

    Integer uploadQuestionBank(QuestionBankDto questionBankDTO);

    List<QuestionBank> getQuestionBankList(@Param("tid") String tid);

    QuestionBankDto getQuestionBankInfo(@Param("tid") String tid, @Param("title") String title);
}

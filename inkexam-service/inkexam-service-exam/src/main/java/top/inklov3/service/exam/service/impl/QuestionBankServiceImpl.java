package top.inklov3.service.exam.service.impl;

import top.inklov3.service.exam.domain.dto.QuestionBankDto;
import top.inklov3.service.exam.domain.dto.QuestionDto;
import top.inklov3.service.exam.domain.dtomapper.QuestionBankDtoMapper;
import top.inklov3.service.exam.domain.dtomapper.QuestionDtoMapper;
import top.inklov3.service.exam.domain.po.Question;
import top.inklov3.service.exam.domain.po.QuestionBank;
import top.inklov3.service.exam.mapper.QuestionBankMapper;
import top.inklov3.service.exam.mapper.QuestionMapper;
import top.inklov3.service.exam.service.QuestionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service

public class QuestionBankServiceImpl implements QuestionBankService {
    @Autowired
    QuestionMapper questionMapper;
    @Autowired
    QuestionBankMapper questionBankMapper;
    /**
     * 上传题库
     *
     * @param questionBankDto 前端题库对象
     * @return 返回插入数量
     */
    @Override
    @Transactional
    public Integer uploadQuestionBank(QuestionBankDto questionBankDto) {
        QuestionBank questionBank = QuestionBankDtoMapper.INSTANT.toQuestionBank(questionBankDto);
        questionBankMapper.insertQuestionBank(questionBank);
        Long bankId = questionBankMapper.getLastInsertIndex();
        List<Question> questions = QuestionDtoMapper.INSTANT.toQuestion(Arrays.asList(questionBankDto.getQuestions()));
        return questionMapper.insertQuestions(bankId, questions);
    }
    /**
     * 获取题库列表
     * @param tid 教师id
     * @return 题库列表
     */
    @Override
    public List<QuestionBank> getQuestionBankList(String tid) {
        List<QuestionBank> questionBankList = questionBankMapper.getQuestionBankList(tid);
        return questionBankList;
    }
    @Override
    public QuestionBankDto getQuestionBankInfo(String tid, String title) {
        QuestionBank questionBank = questionBankMapper.getByTidAndTitle(tid, title);
        List<Question> questions = questionMapper.selectByBankId(questionBank.getIndex());
        QuestionBankDto questionBankDto = QuestionBankDtoMapper.INSTANT.toQuestionBankDto(questionBank);
        QuestionDto[] questionDtos = new QuestionDto[questions.size()];
        QuestionDtoMapper.INSTANT.toQuestionDto(questions).toArray(questionDtos);
        questionBankDto.setQuestions(questionDtos);
        return questionBankDto;
    }
}

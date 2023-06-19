package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.QuestionBank;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author inklov3
* @description 针对表【question_bank(题库)】的数据库操作Mapper
* @createDate 2023-06-05 10:32:48
* @Entity net.laputa.service.onlineexam.domain.po.QuestionBank
*/
@Mapper
public interface QuestionBankMapper {

    int deleteByPrimaryKey(Long id);

    int insert(QuestionBank record);

    int insertSelective(QuestionBank record);

    QuestionBank selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(QuestionBank record);

    int updateByPrimaryKey(QuestionBank record);

    Integer insertQuestionBank(@Param("question_bank") QuestionBank questionBank);

    Long getLastInsertIndex();

    List<QuestionBank> getQuestionBankList(@Param("tid")String tid);

    QuestionBank getByTidAndTitle(@Param("tid")String tid, @Param("title")String title);
}

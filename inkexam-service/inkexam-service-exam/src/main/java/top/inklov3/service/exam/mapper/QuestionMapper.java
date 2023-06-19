package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.Question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author inklov3
 * @description 针对表【question(题目)】的数据库操作Mapper
 * @createDate 2023-06-05 10:32:47
 * @Entity net.laputa.service.onlineexam.domain.po.Question
 */
@Mapper
public interface QuestionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);

    Integer insertQuestions(@Param("bank_id") Long bankId, @Param("questions") List<Question> questions);

    List<Question> selectByBankId(@Param("bank_id") Integer bankId);
}

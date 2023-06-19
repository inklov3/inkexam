package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.PaperQuestion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author inklov3
 * @description 针对表【paper_question(试题)】的数据库操作Mapper
 * @createDate 2023-06-05 22:50:31
 * @Entity net.laputa.service.onlineexam.domain.po.PaperQuestion
 */
@Mapper
public interface PaperQuestionMapper {
    Integer batchInsertWithPaperId(@Param("paper_id") Integer paperId, @Param("paperQuestions") List<PaperQuestion> paperQuestions);

}

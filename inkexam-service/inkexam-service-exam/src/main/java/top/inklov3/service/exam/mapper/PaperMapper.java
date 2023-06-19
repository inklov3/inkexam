package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.Paper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author inklov3
 * @description 针对表【paper(试卷)】的数据库操作Mapper
 * @createDate 2023-06-05 22:50:31
 * @Entity net.laputa.service.onlineexam.domain.po.Paper
 */
@Mapper
public interface PaperMapper {

    int deleteByPrimaryKey(Long id);

    int insert(@Param("paper") Paper paper);

    int insertSelective(Paper record);

    Paper selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);

    Integer selectLastInsertId();

}

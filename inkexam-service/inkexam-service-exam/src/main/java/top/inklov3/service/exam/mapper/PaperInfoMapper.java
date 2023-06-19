package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.PaperInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author inklov3
* @description 针对表【paper_info】的数据库操作Mapper
* @createDate 2023-06-06 05:07:53
* @Entity net.laputa.service.onlineexam.domain.po.PaperInfo
*/
@Mapper
public interface PaperInfoMapper {


    PaperInfo selectByPrimaryKey(@Param("pid") Integer pid);


}

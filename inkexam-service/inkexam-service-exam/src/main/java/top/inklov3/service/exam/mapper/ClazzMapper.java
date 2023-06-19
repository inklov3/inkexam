package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.Clazz;

/**
* @author inklov3
* @description 针对表【clazz(班级表)】的数据库操作Mapper
* @createDate 2023-06-05 10:32:48
* @Entity net.laputa.service.onlineexam.domain.po.Clazz
*/
public interface ClazzMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);

}

package top.inklov3.auth.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import top.inklov3.auth.domain.dto.UserDto;
import top.inklov3.auth.domain.po.User;

import java.util.List;

@Mapper
public interface TransformMapper {
    TransformMapper INSTANT = Mappers.getMapper(TransformMapper.class);

    User toUser(UserDto userDto);

    List<User> toUser(List<UserDto> userDtoList);
}

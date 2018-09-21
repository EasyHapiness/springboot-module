package yin.ya.song.mapper;

import org.apache.ibatis.annotations.Mapper;
import yin.ya.song.User;

@Mapper
public interface UserMapper {

	User selectByPrimaryKey(Long id);

}

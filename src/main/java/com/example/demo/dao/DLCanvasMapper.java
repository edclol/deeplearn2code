package com.example.demo.dao;

import com.example.demo.entry.DLCanvas.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface DLCanvasMapper {

    @Select("SELECT * FROM DLCanvas WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO DLCanvas (user_id, module_name,module2json) VALUES(#{user_id}, #{module_name}, #{module2json})")
    int insert(@Param("user_id") int user_id, @Param("module_name") String module_name, @Param("module2json") String module2json);

    @Select("SELECT module_name,module_id FROM test.DLCanvas WHERE user_id = #{user_id}")
    List<Map> getModuleListByUserId(int user_id);

    @Select("SELECT module2json FROM test.DLCanvas WHERE user_id = #{user_id} and module_id = #{module_id}")
    String getModuleById(int user_id, int module_id);
}

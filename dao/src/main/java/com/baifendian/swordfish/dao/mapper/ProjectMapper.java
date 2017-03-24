/*
 * Copyright (C) 2017 Baifendian Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baifendian.swordfish.dao.mapper;

import com.baifendian.swordfish.dao.model.Project;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.annotation.MapperScan;

import java.util.Date;
import java.util.List;

@MapperScan
public interface ProjectMapper {

  @InsertProvider(type = ProjectSqlProvider.class, method = "insert")
  @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "project.id", before = false, resultType = int.class)
  int insert(@Param("project") Project project);

  @Results(value = {@Result(property = "id", column = "id", id = true, javaType = int.class, jdbcType = JdbcType.INTEGER),
          @Result(property = "name", column = "name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
          @Result(property = "desc", column = "desc", javaType = String.class, jdbcType = JdbcType.VARCHAR),
          @Result(property = "createTime", column = "create_time", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
          @Result(property = "modifyTime", column = "modify_time", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
          @Result(property = "ownerId", column = "owner_id", javaType = int.class, jdbcType = JdbcType.INTEGER),
          @Result(property = "owner", column = "owner", javaType = String.class, jdbcType = JdbcType.VARCHAR),
  })
  @SelectProvider(type = ProjectSqlProvider.class, method = "queryProjectByUser")
  List<Project> queryProjectByUser(@Param("userId") int userId);

  @Results(value = {@Result(property = "id", column = "id", id = true, javaType = int.class, jdbcType = JdbcType.INTEGER),
          @Result(property = "name", column = "name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
          @Result(property = "desc", column = "desc", javaType = String.class, jdbcType = JdbcType.VARCHAR),
          @Result(property = "createTime", column = "create_time", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
          @Result(property = "modifyTime", column = "modify_time", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
          @Result(property = "ownerId", column = "owner_id", javaType = int.class, jdbcType = JdbcType.INTEGER),
          @Result(property = "owner", column = "owner", javaType = String.class, jdbcType = JdbcType.VARCHAR),
  })
  @SelectProvider(type = ProjectSqlProvider.class, method = "queryAllProject")
  List<Project> queryAllProject();

  @UpdateProvider(type = ProjectSqlProvider.class, method = "updateById")
  int updateById(@Param("project") Project project);

  @DeleteProvider(type = ProjectSqlProvider.class, method = "deleteById")
  int deleteById(@Param("id") int id);

  @Results(value = {
          @Result(property = "id", column = "id", id = true, javaType = int.class, jdbcType = JdbcType.INTEGER),
          @Result(property = "name", column = "name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
          @Result(property = "desc", column = "desc", javaType = String.class, jdbcType = JdbcType.VARCHAR),
          @Result(property = "createTime", column = "create_time", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
          @Result(property = "modifyTime", column = "modify_time", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
          @Result(property = "ownerId", column = "owner_id", javaType = int.class, jdbcType = JdbcType.INTEGER),
          @Result(property = "owner", column = "owner", javaType = String.class, jdbcType = JdbcType.VARCHAR),
  })
  @SelectProvider(type = ProjectSqlProvider.class, method = "queryByName")
  Project queryByName(@Param("name") String name);



}

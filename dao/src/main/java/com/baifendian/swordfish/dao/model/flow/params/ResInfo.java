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

package com.baifendian.swordfish.dao.model.flow.params;

/**
 * 资源信息 <p>
 *
 * @author : dsfan
 * @date : 2016年10月10日
 */
public class ResInfo {
  /**
   * 资源 id
   */
  private int id;

  /**
   * 资源别名
   */
  private String alias;

  /**
   * 资源的相对路径(用于第三方接口)
   */
  private String path;

  /**
   * getter method
   *
   * @return the id
   * @see ResInfo#id
   */
  public int getId() {
    return id;
  }

  /**
   * setter method
   *
   * @param id the id to set
   * @see ResInfo#id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * getter method
   *
   * @return the alias
   * @see ResInfo#alias
   */
  public String getAlias() {
    return alias;
  }

  /**
   * setter method
   *
   * @param alias the alias to set
   * @see ResInfo#alias
   */
  public void setAlias(String alias) {
    this.alias = alias;
  }

  /**
   * getter method
   *
   * @return the path
   * @see ResInfo#path
   */
  public String getPath() {
    return path;
  }

  /**
   * setter method
   *
   * @param path the path to set
   * @see ResInfo#path
   */
  public void setPath(String path) {
    this.path = path;
  }

}

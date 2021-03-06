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
package com.baifendian.swordfish.masterserver.utils;

import com.baifendian.swordfish.rpc.RetResultInfo;

import java.util.List;

public class ResultDetailHelper {

  /**
   * 创建一个错误异常的返回包 <p>
   *
   * @param msg
   * @return {@link RetResultInfo}
   */
  public static RetResultInfo createErrorResult(String msg) {
    return new RetResultInfo(ResultHelper.createErrorResult(msg), null);
  }

  /**
   * 创建成功的返回包 <p>
   *
   * @param execIds
   * @return {@link RetResultInfo}
   */
  public static RetResultInfo createSuccessResult(List<Integer> execIds) {
    return new RetResultInfo(ResultHelper.SUCCESS, execIds);
  }
}

/*
 * Copyright 2016 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.armeria.common;

/**
 * A request. It has to be an {@link HttpRequest} or an {@link RpcRequest}.
 * ck-1
 * 아무것도 없다. 그냥 HttpRequest와 RpcRequest의 공통 상위 인터페이스를 맞추기 위한 용도.
 * 근데 여기서 추후 확인할 것은 공통 상위 인터페이스를 왜 맞춰야하는가 의문은 풀어야한다. 그냥 만든게 절대 아닐 것이다.
 */
public interface Request {}

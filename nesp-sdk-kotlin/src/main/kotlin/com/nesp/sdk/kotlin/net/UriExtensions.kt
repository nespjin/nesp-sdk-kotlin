/*
 * Copyright 2021 NESP Technology.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nesp.sdk.kotlin.net

import java.net.URI

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/11/23 上午9:54
 * Description:
 **/
val URI.params: Map<String?, String>
    get() {
        val query = this.query
        if (query.isNullOrEmpty()) return emptyMap()
        val params: MutableMap<String?, String> = HashMap()
        val paramPairs = query.split("&".toRegex()).toTypedArray()
        for (paramPair in paramPairs) {
            val paramPairArray = paramPair.split("=".toRegex()).toTypedArray()
            if (paramPairArray.size < 2) {
                continue
            }
            params[paramPairArray[0]] = paramPairArray[1]
        }
        return params
    }
/*
 * Copyright 2009 Denys Pavlov, Igor Azarnyi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.yes.cart.domain.misc.navigation.range;

import java.io.Serializable;
import java.util.List;

/**
 * Hi and lo values for filtered navigation.
 * <p/>
 * User: Igor Azarny iazarny@yahoo.com
 * Date: 07-May-2011
 * Time: 11:12:54
 */
public interface RangeNode extends Serializable {

    /**
     * @return from range
     */
    String getFrom();

    /**
     * @param string from range
     */
    void setFrom(String string);

    /**
     * @return to range
     */
    String getTo();

    /**
     * @param string to range
     */
    void setTo(String string);

    /**
     * @return from range
     */
    List<DisplayValue> getI18n();

    /**
     * @param value from range
     */
    void setI18n(List<DisplayValue> value);

}

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

package org.yes.cart.domain.i18n;

import java.io.Serializable;
import java.util.Map;

/**
 * User: denispavlov
 * Date: 12-08-08
 * Time: 7:11 PM
 */
public interface I18NModel extends Serializable {

    // Default locale code
    String DEFAULT = "xx";

    /**
     * @param locale locale
     * @return string value for that locale
     */
    String getValue(String locale);

    /**
     * @param locale locale
     * @param value string value for that locale
     */
    void putValue(String locale, String value);

    /**
     * @return all values mapped to locales
     */
    Map<String, String> getAllValues();

    /**
     * Create copy of this model.
     *
     * @return model copy
     */
    I18NModel copy();

}

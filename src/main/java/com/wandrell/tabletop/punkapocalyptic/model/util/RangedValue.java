/**
 * Copyright 2014 the original author or authors
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.wandrell.tabletop.punkapocalyptic.model.util;

/**
 * Interface representing a series of ranges. This is used mostly for ranged
 * weapons, and just to ease localizing the distances, as these can be on
 * centimeters o inches.
 * <p>
 * The three methods give each a value for each of the distances: short, medium
 * and long.
 * 
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.tabletop.punkapocalyptic.model.inventory.RangedWeapon
 *      RangedWeapon
 */
public interface RangedValue {

    /**
     * Returns the long distance value.
     * 
     * @return the long distance value
     */
    public Integer getLongValue();

    /**
     * Returns the medium distance value.
     * 
     * @return the medium distance value
     */
    public Integer getMediumValue();

    /**
     * Returns the short distance value.
     * 
     * @return the short distance value
     */
    public Integer getShortValue();

}

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
package com.wandrell.tabletop.punkapocalyptic.model.inventory;

import com.wandrell.tabletop.punkapocalyptic.model.util.RangedValue;

/**
 * Represents a ranged weapon.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface RangedWeapon extends Weapon {

    @Override
    public RangedWeapon createNewInstance();

    /**
     * Returns the distance ranges in imperial units.
     * 
     * @return the distance ranges in imperial units
     */
    public RangedValue getDistancesImperialUnits();

    /**
     * Returns the distance ranges in metric units.
     * 
     * @return the distance ranges in metric units
     */
    public RangedValue getDistancesMetricSystem();

    /**
     * Returns the penetration for long distances.
     * 
     * @return the penetration for long distances
     */
    public Integer getLongPenetration();

    /**
     * Returns the strength for long distances.
     * 
     * @return the strength for long distances
     */
    public Integer getLongStrength();

    /**
     * Returns the penetration for medium distances.
     * 
     * @return the penetration for medium distances
     */
    public Integer getMediumPenetration();

    /**
     * Returns the strength for medium distances.
     * 
     * @return the strength for medium distances
     */
    public Integer getMediumStrength();

    /**
     * Returns the penetration for short distances.
     * 
     * @return the penetration for short distances
     */
    public Integer getShortPenetration();

    /**
     * Returns the strength for short distances.
     * 
     * @return the strength for short distances
     */
    public Integer getShortStrength();

    /**
     * Indicates if the ranged weapon is a firearm.
     * 
     * @return {@code true} if the weapon is a firearm, {@code false} otherwise
     */
    public Boolean isFirearm();

}

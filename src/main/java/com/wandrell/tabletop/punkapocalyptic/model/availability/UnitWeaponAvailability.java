/**
 * Copyright 2015 the original author or authors
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
package com.wandrell.tabletop.punkapocalyptic.model.availability;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.model.availability.option.WeaponOption;
import com.wandrell.tabletop.punkapocalyptic.model.unit.UnitTemplate;

/**
 * Interface representing a unit's weapon availabilities.
 * <p>
 * This is used when setting up a unit.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface UnitWeaponAvailability {

    /**
     * Returns the maximum allowed number of weapons which can be acquired.
     * 
     * @return the maximum number of weapons
     */
    public Integer getMaxWeapons();

    /**
     * Returns the minimum amount of weapons which should be acquired.
     * 
     * @return the minimum number of weapons
     */
    public Integer getMinWeapons();

    /**
     * The unit to which the availabilities are applied.
     * 
     * @return the unit
     */
    public UnitTemplate getUnit();

    /**
     * Returns all the weapon options which can be acquired.
     * 
     * @return the weapon options
     */
    public Collection<? extends WeaponOption> getWeaponOptions();

}

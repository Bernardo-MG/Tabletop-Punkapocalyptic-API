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
package com.wandrell.tabletop.business.model.punkapocalyptic.unit;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Armor;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.constraint.GangConstraint;

/**
 * Represents a unit along it's available options.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface AvailabilityUnit extends Unit {

    @Override
    public AvailabilityUnit createNewInstance();

    /**
     * Returns the armor options.
     * 
     * @return the armor options
     */
    public Collection<Armor> getArmorOptions();

    /**
     * Returns this unit's constraints.
     * 
     * @return this unit's constraints
     */
    public Collection<GangConstraint> getConstraints();

    /**
     * Returns the maximum amount of weapons the unit can acquire.
     * 
     * @return the maximum amount of weapons the unit can acquire
     */
    public Integer getMaxWeapons();

    /**
     * Returns the minimum amount of weapons the unit should acquire.
     * 
     * @return the minimum amount of weapons the unit should acquire
     */
    public Integer getMinWeapons();

    /**
     * Returns the weapon options.
     * 
     * @return the weapon options
     */
    public Collection<Weapon> getWeaponOptions();

}

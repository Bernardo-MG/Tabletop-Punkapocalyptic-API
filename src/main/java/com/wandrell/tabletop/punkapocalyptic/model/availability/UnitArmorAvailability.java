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

import com.wandrell.tabletop.punkapocalyptic.model.inventory.Armor;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;

/**
 * Indicates a unit's armor availabilities data.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface UnitArmorAvailability {

    /**
     * Returns all the armors which can be acquired.
     * <p>
     * These are the armors which can be selected for a unit, to substitute the
     * initial armor.
     * 
     * @return the armor options
     */
    public Collection<Armor> getArmorOptions();

    /**
     * Returns the armor initially equipped by the unit.
     * 
     * @return the initial armor
     */
    public Armor getInitialArmor();

    /**
     * The unit to which the availabilities are applied.
     * 
     * @return the unit
     */
    public Unit getUnit();

}

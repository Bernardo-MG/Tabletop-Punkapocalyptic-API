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

import com.wandrell.tabletop.punkapocalyptic.model.inventory.Equipment;
import com.wandrell.tabletop.punkapocalyptic.model.unit.UnitTemplate;

/**
 * Interface representing a unit's equipment availabilities data.
 * <p>
 * This is used when setting up a unit.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface UnitEquipmentAvailability {

    /**
     * Returns all the equipment pieces which can be acquired.
     * 
     * @return the armor options
     */
    public Collection<? extends Equipment> getEquipmentOptions();

    /**
     * The unit to which the availabilities are applied.
     * 
     * @return the unit
     */
    public UnitTemplate getUnit();

}

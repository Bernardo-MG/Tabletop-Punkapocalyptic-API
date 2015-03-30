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

import com.wandrell.pattern.prototype.Prototype;

/**
 * Represents a piece of equipment which is applied to a weapon.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface WeaponEnhancement extends Prototype {

    @Override
    public WeaponEnhancement createNewInstance();

    /**
     * Returns the weapon enhancement's cost.
     * 
     * @return the weapon enhancement's cost
     */
    public Integer getCost();

    /**
     * Returns the enhacement's name.
     * 
     * @return the enhacement's name
     */
    public String getName();

    /**
     * Indicates if the weapon can receive the enhancement.
     * 
     * @param weapon
     *            the weapon to check
     * @return {@code true} if the weapon can receive the enhancement,
     */
    public Boolean isValid(final Weapon weapon);

}

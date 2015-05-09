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

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.model.event.ValorationListener;

/**
 * Represents a weapon.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface UnitWeapon extends Cloneable {

    /**
     * Adds a weapon enhancement.
     * 
     * @param enhancement
     *            the weapon enhancement to add
     */
    public void addEnhancement(final WeaponEnhancement enhancement);

    /**
     * Adds a listener for valoration events.
     * 
     * @param listener
     *            the listener for valoration events to add
     */
    public void addValorationListener(final ValorationListener listener);

    /**
     * Returns the cost of the weapon.
     * 
     * @return the cost of the weapon
     */
    public Integer getCost();

    /**
     * Returns the enhancements applied to this weapon.
     * 
     * @return the weapon's enhancements
     */
    public Collection<WeaponEnhancement> getEnhancements();

    public Weapon getTemplate();

    /**
     * Removes a weapon enhancement.
     * 
     * @param enhancement
     *            the weapon enhancement to remove
     */
    public void removeEnhancement(final WeaponEnhancement enhancement);

    /**
     * Removes a listener for valoration events.
     * 
     * @param listener
     *            the listener for status valoration to remove
     */
    public void removeValorationListener(final ValorationListener listener);

}

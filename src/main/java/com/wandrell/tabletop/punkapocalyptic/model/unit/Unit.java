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
package com.wandrell.tabletop.punkapocalyptic.model.unit;

import java.util.Collection;

import com.wandrell.pattern.prototype.Prototype;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Armor;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Equipment;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Weapon;
import com.wandrell.tabletop.punkapocalyptic.model.ruleset.SpecialRule;
import com.wandrell.tabletop.punkapocalyptic.model.unit.event.UnitListener;
import com.wandrell.tabletop.punkapocalyptic.model.unit.stats.AttributesHolder;

/**
 * Represents a unit.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface Unit extends Prototype {

    /**
     * Adds a piece of equipment.
     * 
     * @param equipment
     *            the piece of equipment to add
     */
    public void addEquipment(final Equipment equipment);

    /**
     * Adds a listener for unit events.
     * 
     * @param listener
     *            the listener for unit events to add
     */
    public void addUnitListener(final UnitListener listener);

    /**
     * Adds a weapon.
     * 
     * @param weapon
     *            the weapon to add
     */
    public void addWeapon(final Weapon weapon);

    /**
     * Removes all the pieces of equipment.
     */
    public void clearEquipment();

    /**
     * Removes all the weapons.
     */
    public void clearWeapons();

    @Override
    public Unit createNewInstance();

    /**
     * Returns the equipped armor.
     * 
     * @return the equipped armor
     */
    public Armor getArmor();

    public AttributesHolder getAttributes();

    /**
     * Returns all the pieces of equipment.
     * 
     * @return all the pieces of equipment
     */
    public Collection<Equipment> getEquipment();

    /**
     * Returns the unit's name.
     * 
     * @return the unit's name
     */
    public String getName();

    /**
     * Returns the special rules assigned to the unit.
     * 
     * @return the special rules assigned to the unit
     */
    public Collection<SpecialRule> getSpecialRules();

    public UnitTemplate getUnitTemplate();

    /**
     * Return's the unit's valoration.
     * 
     * @return the unit's valoration
     */
    public Integer getValoration();

    /**
     * Returns the weapons.
     * 
     * @return the weapons
     */
    public Collection<Weapon> getWeapons();

    /**
     * Removed a piece of equipment.
     * 
     * @param equipment
     *            the piece of equipment to remove
     */
    public void removeEquipment(final Equipment equipment);

    /**
     * Removes a listener for unit events.
     * 
     * @param listener
     *            the listener for unit events to remove
     */
    public void removeUnitListener(final UnitListener listener);

    /**
     * Removes a weapon.
     * 
     * @param weapon
     *            the weapon to remove
     */
    public void removeWeapon(final Weapon weapon);

    /**
     * Sets the armor.
     * 
     * @param armor
     *            the armor to set
     */
    public void setArmor(final Armor armor);

}

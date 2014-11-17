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

import com.wandrell.tabletop.business.model.punkapocalyptic.event.ValorationListener;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Armor;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Equipment;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.SpecialRule;
import com.wandrell.tabletop.business.model.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

/**
 * Represents a unit.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface Unit extends NewInstantiable {

    /**
     * Adds a piece of equipment.
     * 
     * @param equipment
     *            the piece of equipment to add
     */
    public void addEquipment(final Equipment equipment);

    /**
     * Adds a listener for valoration events.
     * 
     * @param listener
     *            the listener for valoration events to add
     */
    public void addValorationListener(final ValorationListener listener);

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
     * Returns the actions attribute.
     * 
     * @return the actions attribute
     */
    public Integer getActions();

    /**
     * Returns the agility attribute.
     * 
     * @return the agility attribute
     */
    public Integer getAgility();

    /**
     * Returns the armor attribute.
     * 
     * @return the armor attribute
     */
    public Armor getArmor();

    /**
     * Return's the unit's base cost.
     * 
     * @return the unit's base cost
     */
    public Integer getBaseCost();

    /**
     * Returns the combat attribute.
     * 
     * @return the combat attribute
     */
    public Integer getCombat();

    /**
     * Returns all the pieces of equipment.
     * 
     * @return all the pieces of equipment
     */
    public Collection<Equipment> getEquipment();

    /**
     * Returns the precision attribute.
     * 
     * @return the precision attribute
     */
    public Integer getPrecision();

    /**
     * Returns the special rules assigned to the unit.
     * 
     * @return the special rules assigned to the unit
     */
    public Collection<SpecialRule> getSpecialRules();

    /**
     * Returns the strength attribute.
     * 
     * @return the strength attribute
     */
    public Integer getStrength();

    /**
     * Returns the tech attribute.
     * 
     * @return the tech attribute
     */
    public Integer getTech();

    /**
     * Returns the toughness attribute.
     * 
     * @return the toughness attribute
     */
    public Integer getToughness();

    /**
     * Returns the unit's name.
     * 
     * @return the unit's name
     */
    public String getUnitName();

    /**
     * Return's the unit's valoration.
     * 
     * @return the unit's valoration
     */
    public ValueHandler getValoration();

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
     * Removes a listener for valoration events.
     * 
     * @param listener
     *            the listener for status valoration to remove
     */
    public void removeValorationListener(final ValorationListener listener);

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

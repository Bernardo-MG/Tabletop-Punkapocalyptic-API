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
package com.wandrell.tabletop.punkapocalyptic.unit;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.inventory.Armor;
import com.wandrell.tabletop.punkapocalyptic.inventory.Equipment;
import com.wandrell.tabletop.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.punkapocalyptic.rule.SpecialRule;
import com.wandrell.tabletop.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

public interface Unit extends NewInstantiable {

    public void addEquipment(final Equipment equipment);

    public void addRule(final SpecialRule rule);

    public void addWeapon(final Weapon weapon);

    public void clearEquipment();

    public void clearRules();

    public void clearWeapons();

    @Override
    public Unit createNewInstance();

    public ValueHandler getActions();

    public ValueHandler getAgility();

    public Armor getArmor();

    public ValueHandler getCombat();

    public Collection<Equipment> getEquipment();

    public ValueHandler getFreeWeaponSlots();

    public String getName();

    public ValueHandler getPrecision();

    public Collection<SpecialRule> getSpecialRules();

    public ValueHandler getStrength();

    public ValueHandler getTech();

    public ValueHandler getToughness();

    public ValueHandler getValoration();

    public Collection<Weapon> getWeapons();

    public void setArmor(final Armor armor);

}

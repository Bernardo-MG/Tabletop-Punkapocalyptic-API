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

import com.wandrell.tabletop.punkapocalyptic.model.ruleset.SpecialRule;

/**
 * Interface for a weapon.
 * <p>
 * This contains the common methods to all the weapons, no matter if they are
 * melee or ranged weapons.
 * 
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.tabletop.punkapocalyptic.model.inventory.MeleeWeapon
 *      MeleeWeapon
 * @see com.wandrell.tabletop.punkapocalyptic.model.inventory.RangedWeapon
 *      RangedWeapon
 */
public interface Weapon {

    /**
     * Returns the cost of the weapon.
     * 
     * @return the cost of the weapon
     */
    public Integer getCost();

    /**
     * Returns the token representing this weapon.
     * <p>
     * Name tokens are meant to be unique.
     * 
     * @return the weapon's name token
     */
    public String getNameToken();

    /**
     * Returns the special rules assigned to the weapon.
     * 
     * @return the special rules assigned to the weapon
     */
    public Collection<? extends SpecialRule> getSpecialRules();

    /**
     * Indicates if the weapon is a two-handed weapon.
     * 
     * @return {@code true} if it's a two-handed weapon, {@code false} otherwise
     */
    public Boolean isTwoHanded();

}

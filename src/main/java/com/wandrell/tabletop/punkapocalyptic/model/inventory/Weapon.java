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
 * Represents a weapon.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface Weapon {

    /**
     * Returns the base cost of the weapon.
     * 
     * @return the base cost of the weapon
     */
    public Integer getCost();

    /**
     * Returns the weapon's name.
     * 
     * @return the weapon's name
     */
    public String getName();

    /**
     * Returns the special rules assigned to the weapon.
     * 
     * @return the special rules assigned to the weapon
     */
    public Collection<SpecialRule> getSpecialRules();

    /**
     * Indicates if the weapon is a two-handed weapon.
     * 
     * @return {@code true} if it's a two-handed weapon, {@code false} otherwise
     */
    public Boolean isTwoHanded();

}

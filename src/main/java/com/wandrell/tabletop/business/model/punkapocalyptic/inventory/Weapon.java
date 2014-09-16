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
package com.wandrell.tabletop.business.model.punkapocalyptic.inventory;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.SpecialRule;

/**
 * Represents a weapon.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface Weapon {

    /**
     * Returns the cost of the weapon.
     * 
     * @return the cost of the weapon
     */
    public Integer getCost();

    /**
     * Returns the number of hands required to use the weapon.
     * 
     * @return the number of hands required to use the weapon
     */
    public Integer getHands();

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
     * Sets the number of hands required for the weapon.
     * 
     * @param hands
     *            the number of hands required
     */
    public void setHands(final Integer hands);

}

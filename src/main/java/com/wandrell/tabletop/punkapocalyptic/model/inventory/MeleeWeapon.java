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

/**
 * Represents a melee weapon.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface MeleeWeapon extends Weapon {

    /**
     * Returns the combat modifier.
     * 
     * @return the combat modifier
     */
    public Integer getCombat();

    /**
     * Returns the weapon's penetration value.
     * 
     * @return the weapon's penetration value
     */
    public Integer getPenetration();

    /**
     * Returns the weapon's strength.
     * 
     * @return the weapon's strength
     */
    public Integer getStrength();

}

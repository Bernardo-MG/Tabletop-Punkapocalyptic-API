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
package com.wandrell.tabletop.punkapocalyptic.model.availability.option;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.model.inventory.Weapon;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.WeaponEnhancement;

/**
 * Interface for representing a weapon available inside an availability class.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface WeaponOption {

    /**
     * Returns all the weapon enhancement options which can be acquired.
     * 
     * @return the weapon enhancement options
     */
    public Collection<? extends WeaponEnhancement> getEnhancements();

    /**
     * Returns the weapon.
     * 
     * @return the weapon
     */
    public Weapon getWeapon();

}

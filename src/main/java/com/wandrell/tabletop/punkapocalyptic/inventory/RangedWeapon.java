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
package com.wandrell.tabletop.punkapocalyptic.inventory;

/**
 * Represents a ranged weapon.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface RangedWeapon extends Weapon {

    /**
     * 
     * @author Bernardo Martínez Garrido
     * @version 0.1.0
     */
    public interface RangedDistance {

        /**
         * Returns the long distance value.
         * 
         * @return the long distance value
         */
        public Integer getLongDistance();

        /**
         * Returns the medium distance value.
         * 
         * @return the medium distance value
         */
        public Integer getMediumDistance();

        /**
         * Returns the short distance value.
         * 
         * @return the short distance value
         */
        public Integer getShortDistance();

    }

    /**
     * Returns the distance ranges in imperial units.
     * 
     * @return the distance ranges in imperial units
     */
    public RangedDistance getDistancesImperialUnits();

    /**
     * Returns the distance ranges in metric units.
     * 
     * @return the distance ranges in metric units
     */
    public RangedDistance getDistancesMetricSystem();

}

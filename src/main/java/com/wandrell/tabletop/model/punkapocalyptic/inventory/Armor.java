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
package com.wandrell.tabletop.model.punkapocalyptic.inventory;

import java.util.Collection;

import com.wandrell.tabletop.model.punkapocalyptic.ruleset.SpecialRule;

/**
 * Represents a piece of armor.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface Armor {

    /**
     * Returns the armor value.
     * 
     * @return the armor value
     */
    public Integer getArmor();

    /**
     * Returns the armor's cost;
     * 
     * @return the armor's cost
     */
    public Integer getCost();

    /**
     * Returns the armor's name.
     * 
     * @return the armor's name
     */
    public String getName();

    /**
     * Returns the special rules assigned to the armor.
     * 
     * @return the special rules assigned to the armor
     */
    public Collection<SpecialRule> getSpecialRules();

}

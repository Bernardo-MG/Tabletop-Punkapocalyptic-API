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
package com.wandrell.tabletop.punkapocalyptic.model.unit;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.model.ruleset.SpecialRule;
import com.wandrell.tabletop.punkapocalyptic.model.unit.stats.AttributesHolder;

/**
 * Interface for the basic and common template which defines a type of unit.
 * <p>
 * Templates are the basic statistics which a player picks when configuring a
 * unit.
 * 
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.tabletop.punkapocalyptic.model.unit.Unit Unit
 */
public interface UnitTemplate {

    /**
     * Returns the attributes of the template.
     * 
     * @return the template's attributes
     */
    public AttributesHolder getAttributes();

    /**
     * Returns the basic cost of the template.
     * 
     * @return the template's basic cost
     */
    public Integer getBaseCost();

    /**
     * Returns the token representing this unit.
     * <p>
     * Name tokens are meant to be unique.
     * 
     * @return the unit's name token
     */
    public String getNameToken();

    /**
     * Returns the special rules assigned to the template.
     * 
     * @return the special rules assigned to the template
     */
    public Collection<? extends SpecialRule> getSpecialRules();

}

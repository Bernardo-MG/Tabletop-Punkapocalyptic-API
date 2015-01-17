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
package com.wandrell.tabletop.business.model.punkapocalyptic.unit.mutation;

/**
 * Represents a mutation which modifies attributes.
 * <p>
 * These bonus should be applied always when the unit has that particular
 * mutation, and for as long as he has this mutation.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface AttributeBonusMutation extends Mutation {

    /**
     * The bonus to the Actions attribute.
     * 
     * @return bonus to the Actions attribute
     */
    public Integer getActionsBonus();

    /**
     * The bonus to the Agility attribute.
     * 
     * @return bonus to the Agility attribute
     */
    public Integer getAgilityBonus();

    /**
     * The bonus to the Combat attribute.
     * 
     * @return bonus to the Combat attribute
     */
    public Integer getCombatBonus();

    /**
     * The bonus to the Precision attribute.
     * 
     * @return bonus to the Precision attribute
     */
    public Integer getPrecisionBonus();

    /**
     * The bonus to the Strength attribute.
     * 
     * @return bonus to the Strength attribute
     */
    public Integer getStrengthBonus();

    /**
     * The bonus to the Tech attribute.
     * 
     * @return bonus to the Tech attribute
     */
    public Integer getTechBonus();

    /**
     * The bonus to the Toughness attribute.
     * 
     * @return bonus to the Toughness attribute
     */
    public Integer getToughnessBonus();

}

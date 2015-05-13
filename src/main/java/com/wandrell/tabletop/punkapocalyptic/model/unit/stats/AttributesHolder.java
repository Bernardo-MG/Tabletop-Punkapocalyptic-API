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
package com.wandrell.tabletop.punkapocalyptic.model.unit.stats;

import com.wandrell.tabletop.punkapocalyptic.model.unit.event.AttributesListener;

/**
 * Interface representing the existing statistics.
 * <p>
 * This stores the data related to such statistics. This may be just for
 * querying them, or maybe for storing a set of bonus to be applied somewhere
 * else.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface AttributesHolder {

    /**
     * Adds a listener for the attributes.
     * 
     * @param listener
     *            the listener to add
     */
    public void addAttributesListener(final AttributesListener listener);

    /**
     * Returns the actions attribute value.
     * 
     * @return the actions attribute value
     */
    public Integer getActions();

    /**
     * Returns the agility attribute value.
     * 
     * @return the agility attribute value
     */
    public Integer getAgility();

    /**
     * Returns the combat attribute value.
     * 
     * @return the combat attribute value
     */
    public Integer getCombat();

    /**
     * Returns the precision attribute value.
     * 
     * @return the precision attribute value
     */
    public Integer getPrecision();

    /**
     * Returns the strength attribute value.
     * 
     * @return the strength attribute value
     */
    public Integer getStrength();

    /**
     * Returns the tech attribute value.
     * 
     * @return the tech attribute value
     */
    public Integer getTech();

    /**
     * Returns the toughness attribute value.
     * 
     * @return the toughness attribute value
     */
    public Integer getToughness();

    /**
     * Removes a listener for the attributes.
     * 
     * @param listener
     *            the listener to remove
     */
    public void removeAttributesListener(final AttributesListener listener);

}

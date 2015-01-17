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
package com.wandrell.tabletop.business.model.punkapocalyptic.unit.event;

import java.util.EventObject;

import com.wandrell.tabletop.business.model.punkapocalyptic.event.ValorationListener;

/**
 * Listener for reacting to unit related events.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface UnitListener extends ValorationListener {

    /**
     * Reacts to the Actions attribute value changing.
     * 
     * @param event
     *            the event
     */
    public void actionsChanged(final EventObject event);

    /**
     * Reacts to the Agility attribute value changing.
     * 
     * @param event
     *            the event
     */
    public void agilityChanged(final EventObject event);

    /**
     * Reacts to the Combat attribute value changing.
     * 
     * @param event
     *            the event
     */
    public void combatChanged(final EventObject event);

    /**
     * Generic event to represent a change in the unit's mutations.
     * 
     * @param event
     *            the event
     */
    public void mutationChanged(final EventObject event);

    /**
     * Reacts to the Precision attribute value changing.
     * 
     * @param event
     *            the event
     */
    public void precisionChanged(final EventObject event);

    /**
     * Reacts to the Strength attribute value changing.
     * 
     * @param event
     *            the event
     */
    public void strengthChanged(final EventObject event);

    /**
     * Reacts to the Tech attribute value changing.
     * 
     * @param event
     *            the event
     */
    public void techChanged(final EventObject event);

    /**
     * Reacts to the Toughness attribute value changing.
     * 
     * @param event
     *            the event
     */
    public void toughnessChanged(final EventObject event);

}

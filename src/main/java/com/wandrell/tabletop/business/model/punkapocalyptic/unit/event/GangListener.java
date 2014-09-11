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

import java.util.EventListener;

/**
 * Listener for reacting to band related events.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface GangListener extends EventListener {

    /**
     * Reacts to a unit being added to the band.
     * 
     * @param e
     *            the event
     */
    public void unitAdded(final UnitEvent e);

    /**
     * Reacts to a unit being removed from the band.
     * 
     * @param e
     *            the event
     */
    public void unitRemoved(final UnitEvent e);

}

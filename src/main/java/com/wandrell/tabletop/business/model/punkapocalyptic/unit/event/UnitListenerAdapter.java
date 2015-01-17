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
package com.wandrell.tabletop.business.model.punkapocalyptic.unit.event;

import java.util.EventObject;

/**
 * Adapter for the Unit listener.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public class UnitListenerAdapter implements UnitListener {

    @Override
    public void actionsChanged(final EventObject event) {}

    @Override
    public void agilityChanged(final EventObject event) {}

    @Override
    public void combatChanged(final EventObject event) {}

    @Override
    public void mutationChanged(final EventObject event) {}

    @Override
    public void precisionChanged(final EventObject event) {}

    @Override
    public void strengthChanged(final EventObject event) {}

    @Override
    public void techChanged(final EventObject event) {}

    @Override
    public void toughnessChanged(final EventObject event) {}

    @Override
    public void valorationChanged(final EventObject event) {}

}

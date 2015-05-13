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
package com.wandrell.tabletop.punkapocalyptic.model.unit.event;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.EventObject;

import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;

/**
 * Event for units.
 * <p>
 * It keeps the {@link Unit} related to the event. It should not be the one who
 * caused the event, even thought in some cases it may be, but for example the
 * unit which has been removed from a {@code Gang}.
 * 
 * @author Bernardo Martínez Garrido
 */
public final class UnitEvent extends EventObject {

    /**
     * Default serialization id.
     */
    private static final long serialVersionUID = 1L;
    /**
     * {@code Unit} related to the event.
     */
    private final Unit        eventUnit;

    /**
     * Constructs a {@code UnitEvent} referring to the specified {@code Unit}.
     * 
     * @param source
     *            the source of the event
     * @param unit
     *            the event related unit
     */
    public UnitEvent(final Object source, final Unit unit) {
        super(source);

        checkNotNull(unit, "Received a null pointer as unit");

        eventUnit = unit;
    }

    /**
     * Returns the event related unit.
     * 
     * @return the event related unit
     */
    public final Unit getUnit() {
        return eventUnit;
    }

}

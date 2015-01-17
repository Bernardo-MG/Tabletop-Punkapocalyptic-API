/**
 * Copyright 2014-2015 the original author or authors
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
package com.wandrell.tabletop.business.model.punkapocalyptic.availability;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;
import com.wandrell.tabletop.business.procedure.Constraint;

/**
 * Indicates a unit's availability data during a procedure.
 * <p>
 * This is meant to be used during the Gang creation procedure.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface FactionUnitAvailability {

    /**
     * The constraints to be applied to the unit during the procedure.
     * 
     * @return unit constraints
     */
    public Collection<Constraint> getConstraints();

    /**
     * The unit.
     * 
     * @return the unit
     */
    public Unit getUnit();

}

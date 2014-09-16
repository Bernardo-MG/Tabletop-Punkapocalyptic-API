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
package com.wandrell.tabletop.business.model.punkapocalyptic.ruleset;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;

/**
 * Represents a constraint applied to a unit during the list creation.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface ArmyBuilderUnitConstraint {

    /**
     * Returns the error message for this constraint.
     * 
     * @return the constraint's error message
     */
    public String getErrorMessage();

    /**
     * Checks if the constraint validates.
     * 
     * @param gang
     *            the band containing the unit
     * @return {@code true} if it validates, {@code false} otherwise
     */
    public Boolean isValid(final Gang gang);

}

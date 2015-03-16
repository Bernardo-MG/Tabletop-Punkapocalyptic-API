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
package com.wandrell.tabletop.punkapocalyptic.model.inventory;

import com.wandrell.pattern.prototype.NewInstantiable;

/**
 * Represents a piece of equipment.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface Equipment extends NewInstantiable {

    @Override
    public Equipment createNewInstance();

    /**
     * Returns the equipment's cost.
     * 
     * @return the equipment's cost
     */
    public Integer getCost();

    /**
     * Returns the equipment's name.
     * 
     * @return the equipment's name
     */
    public String getName();

}

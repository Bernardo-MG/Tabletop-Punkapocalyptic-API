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

/**
 * Interface for equipment pieces.
 * <p>
 * These are added to units, and represent gameplay changes.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface Equipment {

    /**
     * Returns the equipment piece's cost.
     * 
     * @return the equipment piece's cost
     */
    public Integer getCost();

    /**
     * Returns the token representing this equipment piece.
     * <p>
     * Name tokens are meant to be unique.
     * 
     * @return the equipment piece's name token
     */
    public String getNameToken();

}

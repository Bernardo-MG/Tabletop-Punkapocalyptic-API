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

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;

/**
 * Represents a unit which can have mutations.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface MutantUnit extends Unit {

    /**
     * Adds a Mutation to the Unit.
     * <p>
     * If the mutation modifies the unit in any way, it is expected to apply
     * this change as soon as it is added.
     * 
     * @param mutation
     *            the Mutation to add
     */
    public void addMutation(final Mutation mutation);

    /**
     * Removes all the mutations.
     */
    public void clearMutations();

    /**
     * Returns all the mutations from the Unit.
     * 
     * @return all the mutations
     */
    public Collection<Mutation> getMutations();

    /**
     * Removes a Mutation from the Unit.
     * 
     * @param mutation
     *            the Mutation to remove
     */
    public void removeMutation(final Mutation mutation);

}

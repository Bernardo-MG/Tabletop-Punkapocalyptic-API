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
package com.wandrell.tabletop.punkapocalyptic.model.unit.mutation;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;

/**
 * Interface for units with mutation.
 * <p>
 * This is just a {@link Unit} which can keep a collection of {@link Mutation}
 * instances.
 * <p>
 * If any of these mutations is an
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.mutation.AttributeBonusMutation
 * AttributeBonusMutation} then those bonus are expected to be applied.
 * 
 * @author Bernardo Martínez Garrido
 * @see Mutation
 * @see com.wandrell.tabletop.punkapocalyptic.model.unit.mutation.AttributeBonusMutation
 *      AttributeBonusMutation
 */
public interface MutantUnit extends Unit {

    /**
     * Adds a Mutation to the Unit.
     * <p>
     * If any of the mutation is an
     * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.mutation.AttributeBonusMutation
     * AttributeBonusMutation} then those bonus are expected to be applied.
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
     * Returns all the mutations from the {@code Unit}.
     * 
     * @return all the mutations
     */
    public Collection<Mutation> getMutations();

    /**
     * Removes a Mutation from the Unit.
     * <p>
     * If any of the mutation is an
     * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.mutation.AttributeBonusMutation
     * AttributeBonusMutation} then those bonus are expected to no longer be
     * applied.
     * 
     * @param mutation
     *            the Mutation to remove
     */
    public void removeMutation(final Mutation mutation);

}

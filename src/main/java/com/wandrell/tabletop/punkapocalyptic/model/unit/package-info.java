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
/**
 * API for gangs and the units composing them.
 * <p>
 * A {@link com.wandrell.tabletop.punkapocalyptic.model.unit.Gang Gang} contains
 * a list of units, along other information required during gameplay. These are
 * configured by the player before a game.
 * <p>
 * The {@link com.wandrell.tabletop.punkapocalyptic.model.unit.Unit Unit}
 * contains the statistics and various information of the units used by the
 * player. These are configured also before a game.
 * <p>
 * Additionally, the {@code Unit} requires a
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.UnitTemplate
 * UnitTemplate}, which represents the basic statistics all the units of a type
 * share, and an
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.stats.AttributesHolder
 * AttributesHolder}, which contains the attributes for the unit.
 * <p>
 * There are also unit-related events on the
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.event event} package,
 * for reacting to attributes or status changes.
 * <p>
 * Units can also have mutations, which are handled with the classes on the
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.mutation mutation}
 * package. Which are the
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.mutation.Mutation
 * Mutation} interface, which represents a mutation, along the expanded
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.mutation.AttributeBonusMutation
 * AttributeBonusMutation}, for those mutations which affect attributes, and the
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.mutation.MutantUnit
 * MutantUnit}, representing a unit with mutations.
 * <p>
 * There is an additional variation of the {@code Unit}, the
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.GroupedUnit
 * GroupedUnit}, which allows handling those units which work as a bundle.
 */
package com.wandrell.tabletop.punkapocalyptic.model.unit;


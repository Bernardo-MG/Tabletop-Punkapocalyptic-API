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
package com.wandrell.tabletop.punkapocalyptic.model.ruleset;

/**
 * Interface for special rules.
 * <p>
 * These are applied mostly to weapons, indicating modifications to the rules.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface SpecialRule {

    /**
     * Returns the token representing this special rule.
     * <p>
     * Name tokens are meant to be unique.
     * 
     * @return the special rule's name token
     */
    public String getNameToken();

}

package com.wandrell.tabletop.business.model.punkapocalyptic;

/**
 * Interface representing a series of ranges.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface RangedValue {

    /**
     * Returns the long distance value.
     * 
     * @return the long distance value
     */
    public Integer getLongValue();

    /**
     * Returns the medium distance value.
     * 
     * @return the medium distance value
     */
    public Integer getMediumValue();

    /**
     * Returns the short distance value.
     * 
     * @return the short distance value
     */
    public Integer getShortValue();

}

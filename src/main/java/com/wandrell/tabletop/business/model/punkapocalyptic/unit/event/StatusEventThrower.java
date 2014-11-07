package com.wandrell.tabletop.business.model.punkapocalyptic.unit.event;

public interface StatusEventThrower {

    /**
     * Adds a listener for status events.
     * 
     * @param listener
     *            the listener for status events to add
     */
    public void addStatusListener(final StatusListener listener);

    /**
     * Removes a listener for status events.
     * 
     * @param listener
     *            the listener for status events to remove
     */
    public void removeStatusListener(final StatusListener listener);

}

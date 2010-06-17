/*
 * Created on Mar 15, 2005 1:22:52 PM
 */
package net.jforum.cache;

import org.apache.log4j.Logger;
import org.jboss.cache.Cache;
import org.jboss.cache.Fqn;
import org.jboss.cache.notifications.annotation.CacheListener;
import org.jboss.cache.notifications.annotation.CacheStarted;
import org.jboss.cache.notifications.annotation.CacheStopped;
import org.jboss.cache.notifications.annotation.NodeCreated;
import org.jboss.cache.notifications.annotation.NodeModified;
import org.jboss.cache.notifications.annotation.NodeMoved;
import org.jboss.cache.notifications.annotation.NodeRemoved;
import org.jboss.cache.notifications.annotation.NodeVisited;
import org.jboss.cache.notifications.event.Event;
import org.jboss.cache.notifications.event.NodeEvent;
import org.jgroups.View;

/**
 * @author Rafael Steil, Andowson Chang
 * @version $Id: JBossCacheListener.java,v 1.4 2007/08/01 22:30:06 rafaelsteil
 *          Exp $
 */
@CacheListener
public class JBossCacheListener {
	private static final Logger LOGGER = Logger.getLogger(JBossCacheListener.class);
	
	@CacheStarted
	@CacheStopped
	public void cacheStartStopEvent(Event e) {
		switch (e.getType())
		{
		case CACHE_STARTED:
			LOGGER.info("Cache has started");
			break;
		case CACHE_STOPPED:
			LOGGER.info("Cache has stopped");
			break;
		}
	}

	@NodeCreated
	@NodeRemoved
	@NodeVisited
	@NodeModified
	@NodeMoved
	public void logNodeEvent(NodeEvent ne)
	{
		LOGGER.info("An event on node " + ne.getFqn() + " has occured: " + ne.getType());
	}

	/**
	 * @see org.jboss.cache.TreeCacheListener#nodeCreated(org.jboss.cache.Fqn)
	 */
	public void nodeCreated(Fqn<?> fqn) {
	}

	/**
	 * @see org.jboss.cache.TreeCacheListener#nodeRemoved(org.jboss.cache.Fqn)
	 */
	public void nodeRemoved(Fqn<?> fqn) {
	}

	/**
	 * @see org.jboss.cache.TreeCacheListener#nodeLoaded(org.jboss.cache.Fqn)
	 */
	public void nodeLoaded(Fqn<?> fqn) {
	}

	/**
	 * @see org.jboss.cache.TreeCacheListener#nodeEvicted(org.jboss.cache.Fqn)
	 */
	public void nodeEvicted(Fqn<?> fqn) {
	}

	/**
	 * @see org.jboss.cache.TreeCacheListener#nodeModified(org.jboss.cache.Fqn)
	 */
	public void nodeModified(Fqn<?> fqn) {
		// if (CacheEngine.NOTIFICATION.startsWith((String)fqn.get(0))) {
		// }
	}

	/**
	 * @see org.jboss.cache.TreeCacheListener#nodeVisited(org.jboss.cache.Fqn)
	 */
	public void nodeVisited(Fqn<?> fqn) {
	}

	/**
	 * @see org.jboss.cache.TreeCacheListener#cacheStarted(org.jboss.cache.TreeCache)
	 */
	public void cacheStarted(Cache<?, ?> cache) {
	}

	/**
	 * @see org.jboss.cache.TreeCacheListener#cacheStopped(org.jboss.cache.TreeCache)
	 */
	public void cacheStopped(Cache<?, ?> cache) {
	}

	/**
	 * @see org.jboss.cache.TreeCacheListener#viewChange(org.jgroups.View)
	 */
	public void viewChange(View view) {
	}
}
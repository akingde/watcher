/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * qiubo@yiji.com 2015-04-28 18:43 创建
 *
 */
package com.yiji.framework.watcher.metrics.os;

import com.yiji.framework.watcher.metrics.base.AbstractCachedWatcherMetrics;

/**
 * @author qiubo@yiji.com
 */
public abstract class AbstractOSWatcherMetrics extends AbstractCachedWatcherMetrics {
	public AbstractOSWatcherMetrics() {
        //init Sigar
		SigarFactory.getSigar();
	}
}

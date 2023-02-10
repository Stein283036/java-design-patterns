package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public interface ChannelCollection {
	void addChannel(Channel channel);

	void removeChannel(Channel channel);

	ChannelIterator iterator(ChannelTypeEnum type);
}

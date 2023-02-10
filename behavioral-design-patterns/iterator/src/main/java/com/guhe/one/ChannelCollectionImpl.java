package com.guhe.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @author njl
 * @date 2023/2/10
 */
public class ChannelCollectionImpl implements ChannelCollection {

	private List<Channel> channels;

	public ChannelCollectionImpl() {
		channels = new ArrayList<>();
	}

	@Override
	public void addChannel(Channel channel) {
		channels.add(channel);
	}

	@Override
	public void removeChannel(Channel channel) {
		channels.remove(channel);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type);
	}

	private class ChannelIteratorImpl implements ChannelIterator {
		private int cursor;
		private final ChannelTypeEnum type;

		public ChannelIteratorImpl(ChannelTypeEnum type) {
			this.type = type;
		}

		@Override
		public boolean hasNext() {
			for (int i = cursor; i < channels.size(); ++i) {
				Channel channel = channels.get(i);
				if (channel.getTYPE().equals(type) || channel.getTYPE().equals(ChannelTypeEnum.ALL)) {
					return true;
				} else {
					cursor++;
				}
			}
			return false;
		}

		@Override
		public Channel next() {
			return channels.get(cursor++);
		}
	}
}

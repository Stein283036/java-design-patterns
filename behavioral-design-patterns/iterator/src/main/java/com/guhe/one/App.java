package com.guhe.one;

/**
 * @author njl
 * @date 2023/2/10
 */
public class App {
	public static void main(String[] args) {
		ChannelCollection channels = populateChannels();
		ChannelIterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
		while (englishIterator.hasNext()) {
			Channel channel = englishIterator.next();
			System.out.println("channel = " + channel);
		}

		ChannelIterator frenchIterator = channels.iterator(ChannelTypeEnum.FRENCH);
		while (frenchIterator.hasNext()) {
			Channel channel = frenchIterator.next();
			System.out.println("channel = " + channel);
		}
	}

	private static ChannelCollection populateChannels() {
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
		return channels;
	}
}

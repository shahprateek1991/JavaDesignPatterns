package com.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelColletionImpl implements ChannelColletion {
	
	private List<Channel> channels;
	
	public ChannelColletionImpl() {
		
		channels = new ArrayList<>();
	}

	@Override
	public void add(Channel channel) {
		
		channels.add(channel);
		
	}

	@Override
	public void remove(Channel channel) {
		
		channels.remove(channel);
		
	}

	@Override
	public ChannelIterator iterator(Language language) {
		
		return new ChannelIterator() {
			int position = 0;
			
			@Override
			public Channel next() {
				
				Channel channel = channels.get(position);
				position++;
				return channel;
			}
			
			@Override
			public boolean hasNext() {
				
				while(position < channels.size()) {
					if(channels.get(position).getLanguage() == language) {
						return true;
					} else {
						position++;
					}
				}
				return false;
			}
		};
	}

}

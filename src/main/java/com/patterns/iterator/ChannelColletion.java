package com.patterns.iterator;

public interface ChannelColletion {
	
	public void add(Channel channel);
	
	public void remove(Channel channel);
	
	public ChannelIterator iterator(Language language);

}

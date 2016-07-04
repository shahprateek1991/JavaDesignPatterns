package com.patterns.iterator;

public class MainApp {

	public static void main(String[] args) {
		
		ChannelColletion channelColletion = MainApp.populateChannels();
		
		ChannelIterator channelIterator = channelColletion.iterator(Language.EN);
		
		while(channelIterator.hasNext()) {
			System.out.println(channelIterator.next());
		}
		

	}
	
	 private static ChannelColletion populateChannels() {
		 	ChannelColletion channels = new ChannelColletionImpl();
	        channels.add(new Channel("98.5", Language.EN));
	        channels.add(new Channel("99.5", Language.ES));
	        channels.add(new Channel("100.5", Language.EN));
	        channels.add(new Channel("101.5", Language.EN));
	        channels.add(new Channel("102.5", Language.ES));
	        channels.add(new Channel("103.5", Language.ES));
	        channels.add(new Channel("104.5", Language.ES));
	        channels.add(new Channel("105.5", Language.EN));
	        channels.add(new Channel("106.5", Language.EN));
	        return channels;
	    }

}

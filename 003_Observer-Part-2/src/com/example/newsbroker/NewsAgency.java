package com.example.newsbroker;

import java.utils.ArrayList;
import java.utils.List;

public class NewsAgency {

    private final String name;
    private final List<NewsChannel> newsChannelList;

    public NewsAgency(String name) {

        this.name= name;

        this.channelList = new ArrayList<NewsChannel>();

    }

    public NewsAgency(String name){
        this.name = name;
        this.channels = new ArrayList<>();
    }

    public void subscribe(NewsChannel channel) {

    this.channels.add(channel);

    }

    public void subscribe(NewsChannel channel) {

        System.out.println(channel + "has subscribed to" +this)
        this.channels.remove(channel);

    }
    public void broadcast(String message) {
        System.out.println(this + "broadcasts"+ news)
        for(NewsChannel channel : channels){
            channel.notify(news);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}

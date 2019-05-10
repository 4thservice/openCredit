package org.fisco.bcos.autoconfigure;

import java.util.ArrayList;
import java.util.List;

import org.fisco.bcos.channel.client.Service;
import org.fisco.bcos.channel.handler.ChannelConnections;
import org.fisco.bcos.channel.handler.GroupChannelConnectionsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "group-channel-connections-config")
public class GroupChannelConnectionsPropertyConfig {

    List<ChannelConnections> allChannelConnections = new ArrayList<>();

    @Autowired
    Service service;

    @Bean
    public GroupChannelConnectionsConfig getGroupChannelConnections() {
        GroupChannelConnectionsConfig groupChannelConnectionsConfig = new GroupChannelConnectionsConfig();
//        ChannelConnections channelConnections = new ChannelConnections();
//        channelConnections.init();
//        allChannelConnections.add(channelConnections);
        groupChannelConnectionsConfig.setAllChannelConnections(allChannelConnections);
        return groupChannelConnectionsConfig;
    }
}

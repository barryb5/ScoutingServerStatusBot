package com.company;

import discord4j.common.util.Snowflake;
import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.channel.MessageChannel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        String clientID = "";
        String clientSecret = "";
        String token = "";

        File configFile = new File("src/main/resources/config.properties");

        try {
            FileReader reader = new FileReader(configFile);
            Properties properties = new Properties();
            properties.load(reader);
            token = properties.getProperty("token");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

        System.out.println(token);
        Snowflake generalSnowflake = Snowflake.of(861411496269709355L);

//        final DiscordClient client = DiscordClient.create(token);
//        final GatewayDiscordClient gateway = client.login().block();
    }
}

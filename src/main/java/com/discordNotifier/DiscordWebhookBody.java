package com.discordNotifier;

import lombok.Data;

/**
 * This class file was sourced from:
 * https://github.com/ATremonte/Discord-Level-Notifications/blob/8a49abe6fcc59fdebf66870e4cf3078234c13035/src/main/java/com/discordlevelnotifications/LevelNotificationsPlugin.java
 */
@Data
class DiscordWebhookBody
{
    private String content;
    private Embed embed;

    @Data
    static class Embed
    {
        final UrlEmbed image;
    }

    @Data
    static class UrlEmbed
    {
        final String url;
    }
}

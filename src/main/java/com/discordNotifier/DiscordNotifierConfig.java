package com.discordNotifier;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("idletextnotifier")
public interface DiscordNotifierConfig extends Config
{
	@ConfigItem(
			keyName = "webhook",
			name = "Discord Webhook",
			description = "The webhook used to send messages to Discord."
	)
	default String webhook() { return ""; }
}

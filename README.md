# Discord Notifier
##### Authors: [Nodeak](https://github.com/Nodeak) & [MrMedicus](https://github.com/jkufro)

Utilize Discord webhooks to get a message for every RuneLite notification.

## Webhook Setup
For this plugin to work correctly you will need to configure it with a valid Discord webhook.

1. Open the Discord channel that you would like messages to be sent to
2. Click the "Edit Channel" cog icon
3. Click the "Integrations" tab on the left side of the screen
4. Click on the "Webhooks" card
5. Click the "Create New Webhook" button
6. Name & give an image for your bot
7. Click the "Copy Webhook URL" button
8. (In RuneLite) Paste the webhook URL into the "Discord Webhook" configuration item for this plugin

## Mention Setup
Discord webhooks require that you specify the exact user ID when mentioning. 
This means that we can't just use @username in messages. Instead we have to use
an identifier that looks like this `266071502905962506`

The right way to mention with the Discord bot is to find out your user identifier by sending message 
into a Discord chat like `\@username` or `\@username#1234` and
the actual message in the chat will show your full user ID. 

It will look something like this `266071502905962506`.

**Copy ONLY the number and paste it into the plugin's "mention" field.**

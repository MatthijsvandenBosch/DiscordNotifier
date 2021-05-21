# Discord Notifier
##### Authors: [Nodeak](https://github.com/Nodeak) & [MrMedicus](https://github.com/jkufro)

Utilize Discord webhooks to get a message for every RuneLite notification.

<img width="244" alt="runelite settings" src="https://user-images.githubusercontent.com/24628687/119185528-cc1e1c80-ba44-11eb-879f-67dde890d89c.png">


## Webhook Setup
For this plugin to work correctly you will need to configure it with a valid Discord webhook.

1. Open the Discord channel that you would like messages to be sent to
2. Click the "Edit Channel" cog icon
<img width="732" alt="discord edit channel hover" src="https://user-images.githubusercontent.com/24628687/119185209-806b7300-ba44-11eb-8c1a-b6df317ac351.png">

4. Click the "Integrations" tab on the left side of the screen
5. Click on the "Webhooks" card
6. Click the "Create New Webhook" button
<img width="1161" alt="discord integrations tab" src="https://user-images.githubusercontent.com/24628687/119185236-8b260800-ba44-11eb-857b-d6c8f1ec6828.png">

8. Name & give an image for your bot
9. Click the "Copy Webhook URL" button
<img width="1161" alt="discord copy webhook url" src="https://user-images.githubusercontent.com/24628687/119185282-97aa6080-ba44-11eb-90fc-54637d6c9e0f.png">

11. (In RuneLite) Paste the webhook URL into the "Discord Webhook" configuration item for this plugin

## Mention Setup
Discord webhooks require that you specify the exact user ID when mentioning. 
This means that we can't just use @username in messages. Instead we have to use
an identifier that looks like this `266071502905962506`

The right way to mention with the Discord bot is to find out your user identifier by sending message 
into a Discord chat like `\@username` or `\@username#1234` and
the actual message in the chat will show your full user ID. 

It will look something like this `266071502905962506`.

<img width="506" alt="discord get user ID" src="https://user-images.githubusercontent.com/24628687/119185307-a0029b80-ba44-11eb-985b-be6ad17f7fa0.png">


**Copy ONLY the number and paste it into the plugin's "mention" field.**

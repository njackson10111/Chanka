import java.text.SimpleDateFormat;
import java.util.Date;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter
{
	public void onGuildMessageReceived(GuildMessageReceivedEvent event)
	{
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyy | HH:mm:ss");
		Date date = new Date();
		
		if (args[0].equalsIgnoreCase(Main.prefix + "Help"))
		{
			EmbedBuilder help = new EmbedBuilder();
			
			help.setTitle("__**Help**__");
			help.setThumbnail("https://cdn1.iconfinder.com/data/icons/bots/280/bot-9-2-512.png");
			help.setDescription("Below is a list of all avaliable commands that the bot is able to do");
			help.addField("__**Info**__", "Shows some information about the bot", false);
			help.addField("__**Games**__", "Coming soon", false);
			help.addField("__**Memes**__", "Coming soon", false);
			help.addField("__**Secret**__", "hush hush", false);
			help.setColor(0xad3e3e);
			help.setFooter("Request was made @ " + formatter.format(date));
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(help.build()).queue();

		}
		else if (args[0].equalsIgnoreCase(Main.prefix + "info"))
		{
			EmbedBuilder info = new EmbedBuilder();
			
			info.setAuthor("[ Firewalllol ]", null, "https://cdn.discordapp.com/avatars/236115114644733962/003cbec17d5c85946158750eef4551f0.png");
			info.setThumbnail("https://cdn.discordapp.com/avatars/236115114644733962/003cbec17d5c85946158750eef4551f0.png");
			info.setTitle("__**Information**__");
			info.setDescription("Completely useless information about a useless bot.");
			info.addField("__**Discord**__", "@[ Firewalllol ]#1793 ", false);
			info.addField("__**Creation**__", "10/10/2019", false);
			info.addField("__**Version**__", "0.0.2", false);
			info.setColor(0xad3e3e);
			info.setFooter("Request was made @ " + formatter.format(date));
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
		}
		else if (args[0].equalsIgnoreCase(Main.prefix + "games"))
		{
			EmbedBuilder games = new EmbedBuilder();
			
			games.setTitle("__**Games**__");
			games.setDescription("Coming soon");
			games.setColor(0xad3e3e);
			games.setFooter("Request was made @ " + formatter.format(date));
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(games.build()).queue();
		}
		else if (args[0].equalsIgnoreCase(Main.prefix + "Memes"))
		{
			EmbedBuilder memes = new EmbedBuilder();
			
			memes.setTitle("__**Memes**__");
			memes.setDescription("Coming soon");
			memes.setColor(0xad3e3e);
			memes.setFooter("Request was made @ " + formatter.format(date));
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(memes.build()).queue();
		}
		else if (args[0].equalsIgnoreCase(Main.prefix + "secret"))
		{
			EmbedBuilder secret  = new EmbedBuilder();
			
			secret .setTitle("__**secret**__");
			secret.setDescription("Hush Hush stuff going on here");
			secret.addField("???", "The first secret added", false);
			secret.setColor(0xad3e3e);
			secret.setFooter("Request was made @ " + formatter.format(date));
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(secret.build()).queue();
		}
		if (args[0].equalsIgnoreCase(Main.prefix + "beepboop"))
		{
			EmbedBuilder beep = new EmbedBuilder();
			
			beep.setThumbnail("https://media.discordapp.net/attachments/492501035504500746/633157410512568331/download.jpg");
			beep.setTitle("__**Beep Boop**__");
			beep.setDescription("__**Ching Chong your relgion is wrong...**__");
			beep.setImage("https://images3.memedroid.com/images/UPLOADED424/5d01809ae1871.jpeg");
			beep.setColor(0xad3e3e);
			beep.setFooter("Request was made @ " + formatter.format(date));
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(beep.build()).queue();
		}
	}
}

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;


public class Main 
{
	public static JDA jda;
	public static String prefix = "~";

	// Main method
	 public static void main(String[] args) throws LoginException 
	 {
	        JDABuilder builder = new JDABuilder();
	        builder.setToken(" ");
	        builder.setStatus(OnlineStatus.ONLINE);
	
	        // Register listeners
	        builder.addEventListeners(new Commands());
	        
	        builder.build();
	}
}

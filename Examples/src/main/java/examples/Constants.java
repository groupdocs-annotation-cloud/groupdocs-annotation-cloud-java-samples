package examples;
import com.groupdocs.cloud.annotation.client.Configuration;

public class Constants {

	// TODO: Get your ClientId and ClientSecret at https://dashboard.groupdocs.cloud (free
	// registration is required).

	private static String ClientId = "XXXXXXXXXXXXXXXX";
	private static String ClientSecret = "XXXXXXXXXXXXXXXX";

	public static String MYStorage = "First Storage";

	public static Configuration GetConfiguration()
	{
		Configuration cfg = new Configuration(Constants.ClientId, Constants.ClientSecret);	
		cfg.setTimeout(60000);
		cfg.setApiBaseUrl("https://api.groupdocs.cloud");
		return cfg;
	}	
}
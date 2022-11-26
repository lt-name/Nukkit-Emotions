package Creadores.ninjacr.Emotions;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.utils.TextFormat;

public class BCommand extends Command{
	Main pl;
	
	public BCommand(Main pl) {
		super("e", "Express your emotions to everyone!", "Usage: /e");
		this.pl = pl;
		
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args) {
		Player p = (Player)s;
                p.sendMessage("§cError: Usa §f/e help");
		String name = TextFormat.YELLOW + p.getName()+" ";
		String prefix = Utils.colors("§b(§eEmotions§b) ");
		
	for(Player Player  : Server.getInstance().getOnlinePlayers().values()) {
		if(args.length > 0) {
			
		if(args[0].equalsIgnoreCase("help")) {
			p.sendMessage(Utils.colors("§5-------------------§eEmotions§5------------------------"));
			p.sendMessage(Utils.colors("§e/e crazy §f> §eUse it when you're angry"));
			p.sendMessage(Utils.colors("§e/e lol §f> §eUse it when you want to laugh"));
			p.sendMessage(Utils.colors("§e/e sad §f> §eUse it when you're sad"));
			p.sendMessage(Utils.colors("§e/e joy §f> §eUse it when you are happy"));
			p.sendMessage(Utils.colors("§e/e cry §f> §eUse it when you want to cry"));
			p.sendMessage(Utils.colors("§e/e happy §f> §eUse it when you are happy"));
			p.sendMessage(Utils.colors("§e/e sorry §f> §eUse it when you want to apologize"));
			p.sendMessage(Utils.colors("§e/e muse §f> §eUse it when you are thoughtful"));
			p.sendMessage(Utils.colors("§e/e obuda §f> §eUse it when you're offending"));
			p.sendMessage(Utils.colors("§e/e love <Player> §f> §eUse it when you are in love with someone"));
			p.sendMessage(Utils.colors("§e/e kick <Player> §f> §eUse it when you want to kick someone"));
			p.sendMessage(Utils.colors("§5-------------------§eEmotions§5------------------------"));
            
		}
		
		else if(args[0].equalsIgnoreCase("crazy")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fHe is angry!.");
		}
		else if(args[0].equalsIgnoreCase("lol")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fHe's laughing!.");
		}
		else if(args[0].equalsIgnoreCase("sad")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fHe is sad!.");
		}
		else if(args[0].equalsIgnoreCase("joy")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fIs rejoicing! :D.");
			
		}
		else if(args[0].equalsIgnoreCase("cry")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fIs crying.");

		}
		else if(args[0].equalsIgnoreCase("happy")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fIs happy! BD.");

		}
		else if(args[0].equalsIgnoreCase("sorry")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fApologizes!");
		}
		else if(args[0].equalsIgnoreCase("muse")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fHe is thinking.");

		}
		else if(args[0].equalsIgnoreCase("obuda")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"&fIs offended.");

		}
		else if(args[0].equalsIgnoreCase("love")) {
            Player name2 = pl.getServer().getPlayer(args[1]);
            if(name2 !=null) {
				Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fIs in love with §b "+name2.getName()+"§f.");
			}else{
				p.sendMessage(Utils.colors(prefix+"§fThat player was not found!"));
			}
			
		}
		else if(args[0].equalsIgnoreCase("kick")) {
			Player name2 = pl.getServer().getPlayer(args[1]);
			
			if(name2 != null) {
				Server.getInstance().broadcastMessage((prefix + "§6• "+name+"§f kicked to §b "+name2.getName()+"§f."));
                
			}else{
				p.sendMessage(Utils.colors(prefix+"§fThat player was not found!"));
			}
		
			}
        else{
			p.sendMessage(Utils.colors("§cError: Use §f/e help"));
		}
		}
        }
        return false;
    }
    
}

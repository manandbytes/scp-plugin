package be.certipost.hudson.plugin;

import com.jcraft.jsch.UIKeyboardInteractive;
import com.jcraft.jsch.UserInfo;
import java.util.logging.Logger;;

 

public class SCPUserInfo implements UserInfo, UIKeyboardInteractive {

	public static final Logger LOGGER = Logger.getLogger(SCPUserInfo.class.getName());
	
	String password;
	String passphrase;
	
	public SCPUserInfo(String password){
		this.password=password;
		this.passphrase=password;
		
	}
		
	public String getPassphrase() {
		return passphrase;
	}

	public String getPassword() {
		return password;
	}

	public boolean promptPassphrase(String arg0) {
		return false;
	}

	public boolean promptPassword(String arg0) {
		return false;
	}

	public boolean promptYesNo(String arg0) {
		return false;
	}

	public void showMessage(String arg0) {
		LOGGER.info(arg0);
	}

	public String[] promptKeyboardInteractive(final String destination,
		final String name, final String instruction, final String[] prompt,
		final boolean[] echo) {
		return null;
	}

}

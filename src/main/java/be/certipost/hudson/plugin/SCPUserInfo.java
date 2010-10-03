package be.certipost.hudson.plugin;

import com.jcraft.jsch.UIKeyboardInteractive;
import com.jcraft.jsch.UserInfo;
import java.util.logging.Logger;;

 

public class SCPUserInfo implements UserInfo, UIKeyboardInteractive {

	public static final Logger LOGGER = Logger.getLogger(SCPUserInfo.class.getName());
	
	String password;
	String passphrase;

	final private boolean honorKeyboardInteractive;
	
	public SCPUserInfo(String password, final boolean isHonorKeyboardInteractive) {
		this.password=password;
		this.passphrase=password;
		this.honorKeyboardInteractive = isHonorKeyboardInteractive;
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

	/**
	 * @throws HonorKeyboardInteractiveException
	 * @see com.jcraft.jsch.UIKeyboardInteractive#promptKeyboardInteractive(java.lang.String,
	 *      java.lang.String, java.lang.String, java.lang.String[], boolean[])
	 */
	public String[] promptKeyboardInteractive(final String destination,
		final String name, final String instruction, final String[] prompt,
		final boolean[] echo) {
		if (honorKeyboardInteractive) {
			throw new HonorKeyboardInteractiveException();
		}
		return null;
	}

}

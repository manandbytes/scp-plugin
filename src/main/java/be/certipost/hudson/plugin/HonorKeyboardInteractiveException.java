package be.certipost.hudson.plugin;

public class HonorKeyboardInteractiveException extends RuntimeException {

	private static final String KEYBOARD_INTERACTIVE_REQUIRED = "Server requires 'keyboard-interactive' authentication method to be used";
	private static final long serialVersionUID = 8615315397225372396L;

	@Override
	public String getMessage() {
		return KEYBOARD_INTERACTIVE_REQUIRED;
	}
}

package be.certipost.hudson.plugin;

public class HonorKeyboardInteractiveException extends RuntimeException {

	private static final long serialVersionUID = 8615315397225372396L;

	@Override
	public String getMessage() {
		return Messages.SCPRepositoryPublisher_keyboardInteractiveRequired();
	}
}

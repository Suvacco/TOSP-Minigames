package oldschoolproject.Modules.Loaders;

import oldschoolproject.Modules.Loaders.Command.CommandLoader;
import oldschoolproject.Modules.Loaders.Listener.ListenerLoader;

public class RegistrationLoader {
	
	public RegistrationLoader() {
		ListenerLoader.loadListenersAndRegister();
		CommandLoader.loadCommandsAndRegister();
	}

}

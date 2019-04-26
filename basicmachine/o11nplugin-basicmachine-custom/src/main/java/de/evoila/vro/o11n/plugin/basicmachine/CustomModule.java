package de.evoila.vro.o11n.plugin.basicmachine;



import com.vmware.o11n.sdk.modeldrivengen.mapping.*;

import com.vmware.o11n.sdk.modeldrivengen.model.*;
import com.google.inject.*;
import java.util.*;

public class CustomModule extends AbstractModule {

    private final Plugin plugin;

    @Override
    protected void configure() {
        bind(AbstractMapping.class).toInstance(new CustomMapping());
        bind(Plugin.class).toInstance(plugin);
        
    }

    public CustomModule() {
        this.plugin = new Plugin();

        plugin.setApiPrefix("BasicMachine");
        plugin.setIcon("folder.png");
        plugin.setDescription("Representation of an generic Virtual Machine");
        plugin.setDisplayName("BasicMachine");
        plugin.setName("BasicMachine");
        plugin.setPackages(Collections.singletonList("o11nplugin-example-package-${project.version}.package"));
        plugin.setAdaptorClassName(de.evoila.vro.o11n.plugin.basicmachine.BasicMachinePluginAdaptor.class);
    }
}
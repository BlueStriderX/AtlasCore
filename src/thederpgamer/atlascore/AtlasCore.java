package thederpgamer.atlascore;

import api.mod.StarMod;
import com.sun.webpane.platform.ConfigManager;
import java.util.logging.LogManager;

/**
 * Main class for AtlasCore mod.
 *
 * @author TheDerpGamer
 * @since 06/17/2021
 */
public class AtlasCore extends StarMod {

    //Instance
    private static AtlasCore instance;
    public static AtlasCore getInstance() {
        return instance;
    }
    public AtlasCore() {

    }
    public static void main(String[] args) {

    }

    @Override
    public void onEnable() {
        instance = this;
        ConfigManager.initialize(this);
        LogManager.initialize();

        registerFastListeners();
        //registerListeners(); Todo: Fix DisplayScreen orientation
    }
}

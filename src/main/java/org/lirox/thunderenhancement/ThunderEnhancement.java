package org.lirox.thunderenhancement;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThunderEnhancement implements ModInitializer {
    public static Logger LOGGER = LoggerFactory.getLogger("thunderenhancement");
    @Override
    public void onInitialize() {
        LOGGER.info("Insert some text here");
    }
}

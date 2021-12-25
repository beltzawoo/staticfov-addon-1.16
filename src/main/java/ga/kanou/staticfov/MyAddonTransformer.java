package ga.kanou.staticfov;

import net.labymod.addon.AddonTransformer;
import net.labymod.api.TransformerType;

public class MyAddonTransformer extends AddonTransformer {

    @Override
    public void registerTransformers() {
        this.registerTransformer(TransformerType.VANILLA, "dynamicfovdisabler.mixin.json");
    }
}
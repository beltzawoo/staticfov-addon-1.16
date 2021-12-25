package ga.kanou.staticfov;

import java.util.List;
import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.BooleanElement;
import net.labymod.settings.elements.ControlElement.IconData;
import net.labymod.settings.elements.SettingsElement;
import net.labymod.utils.Material;

public class Addon extends LabyModAddon {

  public static Boolean staticEnabled = true;

  @Override
  public void onEnable() {
  }

  @Override
  public void loadConfig() {
    this.staticEnabled = !getConfig().has("staticEnabled") || getConfig().get("staticEnabled").getAsBoolean();
  }

  @Override
  protected void fillSettings(List<SettingsElement> list) {
    list.add( new BooleanElement( "Enabled", this, new IconData( Material.EYE_OF_ENDER ), "staticEnabled", this.staticEnabled));
  }
}
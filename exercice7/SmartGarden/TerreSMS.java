package SmartGarden;

import SmartGarden.TerreAnalyse;

public class TerreSMS extends TerreAnalyse {
    @Override
    public String alerter(String msg) {
        return "Terre Analyse alerte: " + msg;
    }
}

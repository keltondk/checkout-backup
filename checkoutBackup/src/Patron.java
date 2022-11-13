import java.util.ArrayList;
import java.util.List;

/**
 * class representing a patron. TODO: optional
 */
public class Patron {
    /**
     * netID: netID of patron
     * checkoutHist: checkout history of patron
     */
    private String netID;
//    private List<? extends AEquipmentSheet> checkoutHist = new ArrayList<>();

    public Patron(String netID) {
        this.netID = netID;
    }
}

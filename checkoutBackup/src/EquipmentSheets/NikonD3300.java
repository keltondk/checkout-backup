package EquipmentSheets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NikonD3300 extends AEquipmentSheet{
    private Map<String, Boolean[]> partsList = new HashMap<>();

    public NikonD3300(int copy, String patron, String loanDate, String dueDate) {
        this.copyNum = copy;
        this.patron = patron;
        this.loanDate = loanDate;
        this.dueDate = dueDate;

        partsList.put("Nikon Body", null);
        partsList.put("Kit Lens", null);
        partsList.put("2 Batteries", null);
        partsList.put("UV Filter", null);
        partsList.put("USB cable", null);
        partsList.put("Lens Cap", null);
    }

}

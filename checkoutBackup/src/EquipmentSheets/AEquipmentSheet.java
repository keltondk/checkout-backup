package EquipmentSheets;

import java.util.HashMap;
import java.util.Map;

/**
 * Abstract class representing a sheet for a particular piece
 * of equipment
 */
abstract class AEquipmentSheet {
    /**
     * copyNum: copy of equipment checked out
     * patron: name of patron
     * loanDate: date of loan
     * dueDate: date due
     * partsList: list of what was present and missing
     */
    protected int copyNum;
    protected String patron;
    protected String loanDate;
    protected String dueDate;
    protected Map<String, Boolean[]> partsList;

    /**
     * getter for copy num
     *
     * @return copy num
     */
    public int getCopyNum() {
        return this.copyNum;
    }

    /**
     * getter for name of patron
     *
     * @return copy num
     */
    public String getPatron() {
        return this.patron;
    }

    /**
     * getter for loan date
     *
     * @return copy num
     */
    public String getLoanDate() {
        return this.loanDate;
    }

    /**
     * getter for due date
     *
     * @return copy num
     */
    public String getDueDate() {
        return this.dueDate;
    }

    /**
     * updates due date.
     *
     * @param newDueDate new due date
     */
    public void changeDueDate(String newDueDate) {
        this.dueDate = newDueDate;
    }

    /**
     * maps name of part to a pair of Booleans,
     * true if present, false if missing, and
     * null if not filled in yet.
     *
     * @return partsList field
     */
    public Map<String, Boolean[]> getPartsList() {
        Map<String, Boolean[]> copyPartsList = new HashMap<>();
        for (Map.Entry<String, Boolean[]> part : this.partsList.entrySet()) {
            Boolean[] newVal = new Boolean[2];
            if (part.getValue()[0] != null) {
                newVal[0] = part.getValue()[0];
            }
            if (part.getValue()[1] != null) {
                newVal[1] = part.getValue()[1];
            }
            copyPartsList.put(new String(part.getKey()), newVal);
        }

        return copyPartsList;
    }

    /**
     * updates partsList, returns false if there was a mismatch
     * in part names, and doesn't update partsList.
     *
     * @param partsList list of parts of equipment
     * @return boolean representing success
     */
    public boolean setPartsList(Map<String, Boolean[]> partsList) {
        for (String part : partsList.keySet()) {
            if (!this.partsList.containsKey(part)) {
                return false;
            }
        }
        this.partsList.putAll(partsList);
        return true;
    }
}

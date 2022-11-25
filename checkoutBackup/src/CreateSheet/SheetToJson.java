package CreateSheet;

import EquipmentSheets.AEquipmentSheet;
import SheetCreationError;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SheetToJson {
    public static <ElemType extends AEquipmentSheet> JSONObject MakeJson(ElemType equipSheet) throws IOException {
        JSONObject jsonVer = new JSONObject(equipSheet);
        File f = new File("C:/Users/kmine/Documents/CompSci/projects/checkout-backup/output/testOutput.txt");
        f.createNewFile();
        try {
            FileWriter writer = new FileWriter(f);
        } catch (IOException e) {
            throw new SheetCreationError();
        }

        return null;
    }

}

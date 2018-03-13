import db.DBHelper;
import models.File;
import models.Folder;

public class Runner {
    public static void main(String[] args) {
        File file1 = new File("CV", "txt", 500);
        DBHelper.save(file1);

        Folder folder1 = new Folder("Documents");
        DBHelper.save(folder1);
    }
}

import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        File file1 = new File("CV", "txt", 500);
        DBHelper.save(file1);

        Folder folder1 = new Folder("Documents");
        DBHelper.save(folder1);

        file1.setExtension("pdf");
        DBHelper.update(file1);

        List<File> allFiles = DBHelper.getAll("File");
        List<File> allFolders = DBHelper.getAll("Folder");
    }
}


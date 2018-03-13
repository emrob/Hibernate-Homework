import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Folder folder1 = new Folder("Documents");
        DBHelper.save(folder1);

        File file1 = new File("CV", "txt", 500, folder1);
        DBHelper.save(file1);

        File file2 = new File("Presentation", "ppt", 900, folder1);
        DBHelper.save(file2);

        file1.setExtension("pdf");
        DBHelper.update(file1);
        DBHelper.delete(file2);



        List<File> allFiles = DBHelper.getAll("File");
        List<File> allFolders = DBHelper.getAll("Folder");
    }
}


import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Folder folder1 = new Folder("Documents");
        DBHelper.save(folder1);

        Folder folder2 = new Folder("Homework");
        DBHelper.save(folder2);

        File file1 = new File("CV", "txt", 500, folder1);
        DBHelper.save(file1);

        File file2 = new File("Presentation", "ppt", 900, folder2);
        DBHelper.save(file2);

        File file3 = new File("Personal Statement", "txt", 500, folder1);
        DBHelper.save(file3);

        File file4 = new File("Essay", "txt", 800, folder2);
        DBHelper.save(file4);

        file1.setExtension("pdf");
        DBHelper.update(file1);
        DBHelper.delete(file2);



        List<File> allFiles = DBHelper.getAll("File");
        List<File> allFolders = DBHelper.getAll("Folder");

        List<File> results = DBHelper.getFilesByFolder(folder1);
    }
}


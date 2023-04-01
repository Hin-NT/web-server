package example.Service;

import example.Model.Path;

public interface DBService {
    boolean checkDirectoryExist(String path) throws Exception;
    Path getPathByUrl(String path) throws Exception;
}

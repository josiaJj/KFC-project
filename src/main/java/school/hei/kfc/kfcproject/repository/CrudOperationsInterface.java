package school.hei.kfc.kfcproject.repository;

import java.sql.SQLException;
import java.util.List;

public interface CrudOperationsInterface<T> {
    List<T> findAll() throws SQLException;
}

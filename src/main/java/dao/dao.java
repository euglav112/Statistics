/**
 * Created by 461 on 14.04.2016.
 */

package dao;

import java.util.List;

/**
    This interface allows to access the database and obtain the required data
 */
public interface dao {
    List<Integer> getListId();

    List<String> getColumnName();

    int getColumn1(int id);
    int getColumn2(int id);
    int getColumn3(int id);
    int getColumn4(int id);
    double getColumn5(int id);
    double getColumn6(int id);
    double getColumn7(int id);
    double getColumn8(int id);
}

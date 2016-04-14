/**
 * Created by 461 on 14.04.2016.
 */

package plug;

import dao.dao;
import utils.MyMath;

import java.util.*;

public class PlugDataSource implements dao {
    List<Integer> listId;
    List<String> listColumnsName;
    Map<Integer, Columns> dataMap;

    public PlugDataSource() {
        listId = new ArrayList<>();
        listId.addAll(Arrays.asList(1, 2, 3, 4, 5));

        listColumnsName = new ArrayList<>();
        listColumnsName.addAll(Arrays.asList("Column1", "Column2", "Column3", "Column4", "Column5", "Column6", "Column7", "Column8"));

        dataMap = new HashMap<>();
        listId.forEach(id -> {
            dataMap.put(id, new Columns(listColumnsName.size(),
                    MyMath.getRandom(10, 100),
                    MyMath.getRandom(10, 100),
                    MyMath.getRandom(10, 100),
                    MyMath.getRandom(10, 100),
                    MyMath.getRandom(10, 100),
                    MyMath.getRandom(10, 100),
                    MyMath.getRandom(10, 100),
                    MyMath.getRandom(10, 100)
                    ));
        });
    }

    private class Columns {
        private int countColumns;
        private List<Object> list;

        public Columns(int countColumns, Object... values) {
            this.countColumns = countColumns;
            list = new ArrayList<>();
            Collections.addAll(list, values);
        }

        public Object getColumn(int numberColumn){
            return list.get(numberColumn - 1);
        }
    }

    public List<Integer> getListId() {
        return this.listId;
    }

    @Override
    public List<String> getColumnName() {
        return listColumnsName;
    }

    @Override
    public int getColumn1(int id) {
        return (int) dataMap.get(id).getColumn(1);
    }

    @Override
    public int getColumn2(int id) {
        return (int) dataMap.get(id).getColumn(2);
    }

    @Override
    public int getColumn3(int id) {
        return (int) dataMap.get(id).getColumn(3);
    }

    @Override
    public int getColumn4(int id) {
        return (int) dataMap.get(id).getColumn(4);
    }

    @Override
    public double getColumn5(int id) {
        return (double) dataMap.get(id).getColumn(5);
    }

    @Override
    public double getColumn6(int id) {
        return (double) dataMap.get(id).getColumn(6);
    }

    @Override
    public double getColumn7(int id) {
        return (double) dataMap.get(id).getColumn(7);
    }

    @Override
    public double getColumn8(int id) {
        return (double) dataMap.get(id).getColumn(8);
    }


}

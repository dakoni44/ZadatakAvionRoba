package zadaci;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.Avion;
import model.Roba;

import java.io.IOException;
import java.util.List;


public class Zadatak4BrisanjeVrednosti {
    static Dao<Avion,Integer> avionDao;
    static Dao<Roba,Integer> robaDao;

    public static void main(String[] args) {
        ConnectionSource connectionSource = null;
        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");
            robaDao = DaoManager.createDao(connectionSource, Roba.class);

            List<Roba> roba=robaDao.queryForAll();
            for(Roba r: roba) {
                System.out.println("Roba = "+r);
            }

            List<Roba> robaZaBrisanje = robaDao.queryForEq(Roba.POLJE_OPIS, "Voda");
            for(Roba r:robaZaBrisanje) {
                robaDao.delete(r);
            }


        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (connectionSource != null) {
                try {
                    connectionSource.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

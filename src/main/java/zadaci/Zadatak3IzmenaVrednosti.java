package zadaci;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.Avion;
import model.Roba;

import java.io.IOException;;
import java.util.List;

public class Zadatak3IzmenaVrednosti {

    static Dao<Avion,Integer> avionDao;
    static Dao<Roba,Integer> robaDao;

    public static void main(String[] args) {
        ConnectionSource connectionSource = null;
        try {

            connectionSource = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");

            robaDao = DaoManager.createDao(connectionSource, Roba.class);

            List<Roba> roba=robaDao.queryForAll();
            for(Roba r:roba) {
                System.out.println(" Roba = " +r);
                System.out.println();
            }

          //  for(int i=0;i<roba.size();i++) {
          //      System.out.println(roba.get(i));
          //  }

            List<Roba> robaZaIzmenu = robaDao.queryForEq(Roba.POLJE_NAZIV,"Plasticna stolica");
            for (Roba r : robaZaIzmenu) {
                r.setNaziv("Drvena stolica");
                robaDao.update(r);
            }

             roba=robaDao.queryForAll();
            for(Roba r:roba) {
                System.out.println(" Roba = " +r);
                System.out.println();
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

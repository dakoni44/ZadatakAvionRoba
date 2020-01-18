package zadaci;

import java.sql.ResultSet;

public class Konstante {

    public static final String DATABASE_URL="jdbc:sqlite:avionRoba.db";

    public static void prikazUniverzalan(ResultSet rs) throws Exception{
        /*MetaData pretstavlja podatke o samoj tabeli, naziv tabele,
           naziv kolona, broj kolona u tabeli
         */
        int columnCount=rs.getMetaData().getColumnCount();//Dobijemo broj kolona u tabeli
        while (rs.next())
        {
            for( int i=1; i<=columnCount;i++)
                /*Na osnovu indexa dobijamo naziv kolone sa getColumnName i
                 vrednost kolone za odgovarajuci red u tabeli sa getObject
                 */
                System.out.print(rs.getMetaData().getColumnName(i) + " " + rs.getObject(i)+ " ");
            System.out.println();
        }
    }
}

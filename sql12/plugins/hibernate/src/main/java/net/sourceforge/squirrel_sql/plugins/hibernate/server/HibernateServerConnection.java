package net.sourceforge.squirrel_sql.plugins.hibernate.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public interface HibernateServerConnection extends Remote
{
   ArrayList<String> generateSQL(String hqlQuery)
         throws RemoteException;

   void closeConnection()
         throws RemoteException;

   ArrayList<MappedClassInfoData> getMappedClassInfoData()
         throws RemoteException;


   HibernateSqlConnectionData getHibernateSqlConnectionData()
         throws RemoteException;


   HqlQueryResult createQueryList(String hqlQuery, int sqlNbrRowsToShow)
         throws RemoteException;

}

package services;

import dao.DAOException;
import dao.DaoFactory;
import dao.ServicesDao;
import ent.Service;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Славик on 31.07.2016.
 */
public class ServService {

    /**
     * Instance
     */
    private static ServService instance = new ServService();

    /**
     * This method returns Instance
     * @return
     */
    public static ServService getInstance(){return instance;}

    /**
     * Private default constructor
     */
    private ServService(){}

    /**
     * This method returns list of all services
     * @return
     * @throws SQLException
     * @throws NamingException
     */
    public List<Service> getServiceList() {
        DaoFactory df = DaoFactory.getFactory();
        ServicesDao sd = df.createServicesDao();
        try {
            return sd.findAll();
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * This method finds by id and returns Service
     * @param id is Service's id
     * @return
     */
    public Service getService(int id){

        DaoFactory df =  DaoFactory.getFactory();
        ServicesDao sd =  df.createServicesDao();
        Service service = null;
        try {
            service = sd.find(id);
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return service;
    }

    /**
     * This method create an item in DB by Service object
     * @param service is Service object
     */
    public void create(Service service) {
        DaoFactory df = DaoFactory.getFactory();
        ServicesDao sd = df.createServicesDao();
        try {
            sd.create(service);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method deletes service item from DB by id
     * @param id is id
     */
    public void delete(int id){
        DaoFactory df = DaoFactory.getFactory();
        ServicesDao sd = df.createServicesDao();
        try {
            sd.delete(id);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method updates service item in DB by service object
     * @param service is service object
     */
    public void update(Service service) {
        DaoFactory df = DaoFactory.getFactory();
        ServicesDao sd = df.createServicesDao();
        try {
            sd.update(service);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    public void editService(int id) {
        DaoFactory df = DaoFactory.getFactory();
        ServicesDao sd = df.createServicesDao();
        try {
            sd.edit(id);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    public void unEditService(int id) {
        DaoFactory df = DaoFactory.getFactory();
        ServicesDao sd = df.createServicesDao();
        try {
            sd.unEdit(id);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    public boolean nameInUse(String name) {
        DaoFactory df = DaoFactory.getFactory();
        ServicesDao sd = df.createServicesDao();
        try {
            return sd.nameInUse(name);
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
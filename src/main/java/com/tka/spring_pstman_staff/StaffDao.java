package com.tka.spring_pstman_staff;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StaffDao {

@Autowired
SessionFactory sessionFactory;

// ADD STAFF
	public String addStaff(Staff staff) {

    Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();

    session.save(staff);

    tx.commit();
    session.close();

    return "Staff added successfully";
}

// GET STAFF BY ID
public Staff getSatffById(int id) {

    Session session = sessionFactory.openSession();

    Staff staff = session.get(Staff.class, id);

    session.close();

    return staff;
}

// UPDATE STAFF
public Staff updateStaff(int id, Staff staff) {

    Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();

    Staff existingStaff = session.get(Staff.class, id);

    if (existingStaff != null) {

        existingStaff.setName(staff.getName());
        existingStaff.setRole(staff.getRole());
        existingStaff.setSalary(staff.getSalary());
        existingStaff.setAddress(staff.getAddress());

        session.update(existingStaff);
    }

    tx.commit();
    session.close();

    return existingStaff;
}

// GET ALL STAFF
public List<Staff> getAllStaff() {

    Session session = sessionFactory.openSession();

    String hql = "FROM Staff";

    List<Staff> list = session.createQuery(hql, Staff.class).list();

    session.close();

    return list;
}

// DELETE STAFF
public String deleteStaff(int id) {

    Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();

    Staff staff = session.get(Staff.class, id);

    if (staff != null) {
        session.delete(staff);
    }

    tx.commit();
    session.close();

    return "Staff deleted successfully";
}

// GET STAFF BY NAME
public List<Staff> getStaffByName(String name) {

    Session session = sessionFactory.openSession();

    String hql = "FROM Staff WHERE name = :name";

    List<Staff> list = session.createQuery(hql, Staff.class)
            .setParameter("name", name)
            .list();

    session.close();

    return list;
}

// GET STAFF BY ROLE
public List<Staff> getStaffByRole(String role) {

    Session session = sessionFactory.openSession();

    String hql = "FROM Staff WHERE role = :role";

    List<Staff> list = session.createQuery(hql, Staff.class)
            .setParameter("role", role)
            .list();

    session.close();

    return list;
}

// SORT STAFF BY SALARY ASC
public List<Staff> getStaffsalaryincr() {

    Session session = sessionFactory.openSession();

    String hql = "FROM Staff ORDER BY salary ASC";

    List<Staff> list = session.createQuery(hql, Staff.class).list();

    session.close();

    return list;
}

// SORT STAFF BY SALARY DESC
public List<Staff> getStaffsalarydecr() {

    Session session = sessionFactory.openSession();

    String hql = "FROM Staff ORDER BY salary DESC";

    List<Staff> list = session.createQuery(hql, Staff.class).list();

    session.close();

    return list;
}

// SALARY GREATER THAN
public List<Staff> getStaffBySalaryGreater(double amount) {

    Session session = sessionFactory.openSession();

    String hql = "FROM Staff WHERE salary >= :amount";

    List<Staff> list = session.createQuery(hql, Staff.class)
            .setParameter("amount", amount)
            .list();

    session.close();

    return list;
}

// SALARY LESS THAN
public List<Staff> getStaffBySalaryLess(double amount) {

    Session session = sessionFactory.openSession();

    String hql = "FROM Staff WHERE salary <= :amount";

    List<Staff> list = session.createQuery(hql, Staff.class)
            .setParameter("amount", amount)
            .list();

    session.close();

    return list;
}

// MAX SALARY STAFF
public List<Staff> getStaffBySalaryMAX() {

    Session session = sessionFactory.openSession();

    String hql = "FROM Staff WHERE salary = (SELECT MAX(salary) FROM Staff)";

    List<Staff> list = session.createQuery(hql, Staff.class).list();

    session.close();

    return list;
}

// MIN SALARY STAFF
public List<Staff> getStaffBySalaryMin() {

    Session session = sessionFactory.openSession();

    String hql = "FROM Staff WHERE salary = (SELECT MIN(salary) FROM Staff)";

    List<Staff> list = session.createQuery(hql, Staff.class).list();

    session.close();

    return list;
}

}

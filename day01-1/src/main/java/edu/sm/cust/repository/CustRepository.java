package edu.sm.cust.repository;

import edu.sm.dto.Cust;
import edu.sm.frame.SMrepository;

public class CustRepository implements SMrepository<String, Cust> {

    // insert 메서드 구현
    @Override
    public void insert(Cust cust) {
        System.out.println("insert : " + cust);
    }
    // update 메서드 구현
    @Override
    public void update(Cust cust) {
        System.out.println("update : " + cust);

    }
    // delete 메서드 구현
    @Override
    public void delete(String id) {
        System.out.println("delete : " + id);
    }
}

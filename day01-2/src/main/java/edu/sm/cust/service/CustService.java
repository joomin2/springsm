package edu.sm.cust.service;
// service는 repository 사용
import edu.sm.cust.repository.CustRepository;
import edu.sm.dto.Cust;
import edu.sm.frame.SMService;
import edu.sm.frame.SMrepository;

public class CustService implements SMService<String , Cust> {

    SMrepository<String , Cust> repository;

    @Override
    public void register(Cust cust) {
        repository.insert(cust);
    }

    @Override
    public void modify(Cust cust) {
        repository.update(cust);
    }

    @Override
    public void remove(String s) {
        repository.delete(s);
    }




}

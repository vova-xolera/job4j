package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            list.add(account);
            users.putIfAbsent(user, list);
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> list = users.get(user);
        return list.get(list.indexOf(new Account(requisite, -1)));
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        if (findByRequisite(srcPassport, srcRequisite) != null && findByRequisite(destPassport, destRequisite) != null && findByRequisite(srcPassport, srcRequisite).getBalance() >= amount) {
            double srcBalance = findByRequisite(srcPassport, srcRequisite).getBalance();
            double destBalance = findByRequisite(destPassport, destRequisite).getBalance();
            findByRequisite(srcPassport, srcRequisite).setBalance(srcBalance - amount);
            findByRequisite(destPassport, destRequisite).setBalance(destBalance + amount);
            return true;
        }
        return rsl;
    }
}
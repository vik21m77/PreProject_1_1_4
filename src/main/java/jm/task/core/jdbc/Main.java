package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Bob1", "Lipovskiy1", (byte) 28);
        userService.saveUser("Bob2", "Lipovskiy2", (byte) 12);
        userService.saveUser("Bob3", "Lipovskiy3", (byte) 67);
        userService.saveUser("Bob4", "Lipovskiy4", (byte) 36);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

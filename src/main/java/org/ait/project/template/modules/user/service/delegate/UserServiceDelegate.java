package org.ait.project.template.modules.user.service.delegate;
import org.ait.project.template.modules.user.model.entity.User;

import java.util.List;

public interface UserServiceDelegate {
   User saveUser(User user);
   List<User> getUsers();

   User getUserById(Integer id);

   User updateUser(Integer id, User user);
}

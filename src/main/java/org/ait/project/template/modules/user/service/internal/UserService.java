package org.ait.project.template.modules.user.service.internal;

import org.ait.project.template.modules.user.dto.request.UserRequest;
import org.ait.project.template.modules.user.dto.response.UserResponse;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<ResponseTemplate<ResponseDetail<UserResponse>>> addUser(UserRequest projectRequest);

    ResponseEntity<ResponseTemplate<ResponseDetail<UserResponse>>> updateUser(Integer id, UserRequest userRequest);
    ResponseEntity<ResponseTemplate<ResponseList<UserResponse>>> getAllUsers();

    ResponseEntity<ResponseTemplate<ResponseDetail<UserResponse>>> getUserById(Integer id);
}

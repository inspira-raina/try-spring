package org.ait.project.template.modules.user.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.template.modules.user.dto.request.UserRequest;
import org.ait.project.template.modules.user.dto.response.UserResponse;
import org.ait.project.template.modules.user.model.entity.User;
import org.ait.project.template.modules.user.service.delegate.UserServiceDelegate;
import org.ait.project.template.modules.user.service.internal.UserService;
import org.ait.project.template.modules.user.transform.UserMapper;
import org.ait.project.template.shared.enums.ResponseEnum;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.ait.project.template.shared.utils.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final ResponseHelper responseHelper;

    private final UserServiceDelegate userDelegate;

    private final UserMapper userMapper;

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<UserResponse>>> addUser(UserRequest userRequest) {
        User user = userDelegate.saveUser(userMapper.toUserRequest(userRequest));
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS, userMapper.toUserResponse(user));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<UserResponse>>> updateUser(Integer id, UserRequest userRequest) {
        User user = userDelegate.updateUser(id, userMapper.toUserRequest(userRequest));
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS, userMapper.toUserResponse(user));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<UserResponse>>> getUserById(Integer id) {
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS, userMapper.toUserResponse(userDelegate.getUserById(id)));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseList<UserResponse>>> getAllUsers() {
        List<User> userList = userDelegate.getUsers();
        return  responseHelper.createResponseCollection(ResponseEnum.SUCCESS, null, userMapper.toUsersResponse(userList));
    }
}

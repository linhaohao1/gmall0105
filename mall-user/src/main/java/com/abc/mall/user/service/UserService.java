package com.abc.mall.user.service;

import com.abc.mall.user.bean.UmsMember;
import com.abc.mall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser() ;

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}

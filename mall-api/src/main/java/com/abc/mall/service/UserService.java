package com.abc.mall.service;



import com.abc.mall.bean.UmsMember;
import com.abc.mall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser() ;

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}

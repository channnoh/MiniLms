package com.zerobase.fastlms.banner.service.impl;

import com.zerobase.fastlms.banner.dto.BannerDto;
import com.zerobase.fastlms.banner.model.BannerInput;
import com.zerobase.fastlms.banner.model.BannerParam;

import java.util.List;

public interface BannerService {

    List<BannerDto> list(BannerParam parameter);

    boolean add(BannerInput parameter);

    boolean set(BannerInput parameter);

    BannerDto getById(long id);

    boolean del(String idList);

    List<BannerDto> indexBannerList();


}

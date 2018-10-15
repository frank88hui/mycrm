package com.changhui.service;

import com.changhui.pojo.BaseDict;

import java.util.List;

public interface BaseService {

    List<BaseDict> findDictitemByCode(String customerSource);
}

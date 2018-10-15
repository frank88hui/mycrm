package com.changhui.service;

import com.changhui.dao.BaseDictMapper;
import com.changhui.pojo.BaseDict;
import com.changhui.pojo.BaseDictExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BaseServiceImpl implements BaseService {

    @Autowired
    private BaseDictMapper baseDictMapper;


    @Override
    public List<BaseDict> findDictitemByCode(String code) {
        BaseDictExample baseDictExample = new BaseDictExample();
        baseDictExample.createCriteria().andDict_type_codeEqualTo(code);
        List<BaseDict> baseDicts = baseDictMapper.selectByExample(baseDictExample);
        return baseDicts;
    }
}
